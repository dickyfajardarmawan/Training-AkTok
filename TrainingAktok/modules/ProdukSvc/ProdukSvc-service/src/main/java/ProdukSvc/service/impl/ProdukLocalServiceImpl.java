/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package ProdukSvc.service.impl;

import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ProdukSvc.exception.NoSuchProdukException;
import ProdukSvc.model.Produk;
import ProdukSvc.service.base.ProdukLocalServiceBaseImpl;

/**
 * The implementation of the produk local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link ProdukSvc.service.ProdukLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProdukLocalServiceBaseImpl
 * @see ProdukSvc.service.ProdukLocalServiceUtil
 */
public class ProdukLocalServiceImpl extends ProdukLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link ProdukSvc.service.ProdukLocalServiceUtil} to access the produk local service.
	 */
	public Produk addProduk(String namaProduk, long hargaProduk, long kelipatanProduk) {
		long idProdukIncrement = counterLocalService.increment(Produk.class.getName());
		String idProduk = "Prod-"+idProdukIncrement;
		Produk prod = produkPersistence.create(idProduk);
		Date today = new Date();
		prod.setCreate_date(today);
		prod.setModified_date(today);
		prod.setNama_produk(namaProduk);
		prod.setHarga_produk(hargaProduk);
		prod.setKelipatan_produk(kelipatanProduk);
		produkPersistence.update(prod);
		
		return prod;
	}
	
	public Produk updateProduk(String idProduk, String namaProduk,long hargaProduk, long kelipatanProduk ) {
		Produk prod = produkPersistence.fetchByPrimaryKey(idProduk);
		Date today = new Date();
		prod.setModified_date(today);
		prod.setNama_produk(namaProduk);
		prod.setHarga_produk(hargaProduk);
		prod.setKelipatan_produk(kelipatanProduk);
		produkPersistence.update(prod);
		
		return prod;
	}
	
	public List<JSONObject> getAllProduk(){
		Session session = produkPersistence.openSession();
		String quertyString = "select id_produk, nama_produk, harga_produk, kelipatan_produk from master_Produk";
		SQLQuery query = session.createSQLQuery(quertyString);
		List<Object[]> listObject = query.list();
		List<JSONObject> listJSON = new ArrayList<>();
		for(Object[] o : listObject) {
			JSONObject json = JSONFactoryUtil.createJSONObject();
			json.put("idProduk", o[0]);
			json.put("namaProduk", o[1]);
			json.put("hargaProduk", o[2]);
			json.put("kelipatanProduk", o[3]);
			listJSON.add(json);
		}
		session.clear();
		return listJSON;
	}
	
	public void deleteById(String idProduk) throws NoSuchProdukException {
		produkPersistence.remove(idProduk);
	}
}