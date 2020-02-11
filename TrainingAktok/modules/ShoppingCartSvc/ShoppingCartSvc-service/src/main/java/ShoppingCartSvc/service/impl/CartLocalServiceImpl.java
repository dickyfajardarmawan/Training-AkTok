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

package ShoppingCartSvc.service.impl;

import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import ShoppingCartSvc.model.Cart;
import ShoppingCartSvc.service.base.CartLocalServiceBaseImpl;

/**
 * The implementation of the cart local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link ShoppingCartSvc.service.CartLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CartLocalServiceBaseImpl
 * @see ShoppingCartSvc.service.CartLocalServiceUtil
 */
public class CartLocalServiceImpl extends CartLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link ShoppingCartSvc.service.CartLocalServiceUtil} to access the cart local service.
	 */
	public Cart addCart(String id_produk, String id_toko, long jumlah_produk, long sub_total) {
		String cart_id = "CART-" + counterLocalService.increment(Cart.class.getName());
		Cart cart = cartPersistence.create(cart_id);
		cart.setId_produk(id_produk);
		cart.setId_toko(id_toko);
		cart.setJumlah_produk(jumlah_produk);
		cart.setSub_total(sub_total);
		cartPersistence.update(cart);
		return cart;
	}
	
	public List<JSONObject> getAllCart(){
		Session session = cartPersistence.openSession();
		String quertyString = "select c.id_cart, p.nama_produk, c.sub_total, c.jumlah_produk from master_Produk p JOIN master_cart c ON p.id_produk = c.id_produk";
		SQLQuery query = session.createSQLQuery(quertyString);
		List<Object[]> listObject = query.list();
		List<JSONObject> listJSON = new ArrayList<>();
		for(Object[] o : listObject) {
			JSONObject json = JSONFactoryUtil.createJSONObject();
			json.put("idCart", o[0]);
			json.put("namaProduk", o[1]);
			json.put("subTotal", o[2]);
			json.put("jumlahProduk", o[3]);
			listJSON.add(json);
		}
		session.clear();
		return listJSON;
	}
	
	public void deleteCartById(String cartId) {
		try {
			cartPersistence.remove(cartId);
		} catch(Exception e) {
			System.out.println("cart id tidak ditemukan");
		}
	}
}