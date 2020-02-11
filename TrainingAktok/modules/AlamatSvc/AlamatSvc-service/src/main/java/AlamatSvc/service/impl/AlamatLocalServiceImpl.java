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

package AlamatSvc.service.impl;

import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import AlamatSvc.model.Alamat;
import AlamatSvc.service.base.AlamatLocalServiceBaseImpl;

/**
 * The implementation of the alamat local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link AlamatSvc.service.AlamatLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AlamatLocalServiceBaseImpl
 * @see AlamatSvc.service.AlamatLocalServiceUtil
 */
public class AlamatLocalServiceImpl extends AlamatLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link AlamatSvc.service.AlamatLocalServiceUtil} to access the alamat local service.
	 */
	
	public Alamat tambahAlamat(long idUser, String namaAlamat, String namaPenerima, long nomorHandphone, String alamatLengkap, long kodePos, String kota, String provinsi, String region) {
		
		System.out.println("masuk service ga bro ?" + idUser + namaAlamat + namaPenerima);
		
		long incrementIdAlamat = counterLocalService.increment(Alamat.class.getName());
		String idAlamat = "Alamat/" + incrementIdAlamat;
		Alamat alamat = alamatPersistence.create(idAlamat);
		Date now = new Date();
		alamat.setId_user(idUser);
		alamat.setNama_alamat(namaAlamat);
		alamat.setNama_penerima(namaPenerima);
		alamat.setNomor_handphone(nomorHandphone);
		alamat.setAlamat_lengkap(alamatLengkap);
		alamat.setKode_pos(kodePos);
		alamat.setKota(kota);
		alamat.setProvinsi(provinsi);
		alamat.setRegion(region);
		alamat.setStatus(true);
		alamat.setCreated_date(now);
		alamatPersistence.update(alamat);
		
		return alamat;
		
	}
	
	public Alamat gantiAlamat(String idAlamat, long idUser, String namaAlamat, String namaPenerima, long nomorHandphone, String alamatLengkap, long kodePos, String kota, String provinsi, String region, int status) {
		
		Alamat alamat = alamatPersistence.fetchByPrimaryKey(idAlamat);
		alamat.setId_user(idUser);
		alamat.setNama_alamat(namaAlamat);
		alamat.setNama_penerima(namaPenerima);
		alamat.setNomor_handphone(nomorHandphone);
		alamat.setAlamat_lengkap(alamatLengkap);
		alamat.setKode_pos(kodePos);
		alamat.setKota(kota);
		alamat.setProvinsi(provinsi);
		alamat.setRegion(region);
		if(status == 1) {
			
			alamat.setStatus(true);
			
		} else {
			alamat.setStatus(false);
		}
		alamatPersistence.update(alamat);
		System.out.println("masuk service ga cuy?" + namaAlamat + " nama penerima? " + namaPenerima );
		
		return alamat;
	}
	
	public void ubahStatusAlamatById(String idAlamat) {
		
		Alamat alamat = alamatPersistence.fetchByPrimaryKey(idAlamat);
		alamat.setStatus(false);
		alamatPersistence.update(alamat);		
	}
	
	public Alamat cariAlamatDenganIdAlamat(String idAlamat) {
		
		Alamat alamat = alamatPersistence.fetchByPrimaryKey(idAlamat);
		return alamat;
		
	}
	
	public List<JSONObject> cariAlamatDenganIdToko(long idUser){
		
		Session session = alamatPersistence.openSession();
		String queryString = "SELECT u.userid, u.screenname, u.emailaddress, a.id_alamat, a.nama_alamat, a.nama_penerima, a.nomor_handphone, a.alamat_lengkap, a.kode_pos, a.kota, a.provinsi, a.region FROM master_alamat a JOIN user_ u ON a.id_user = u.userid WHERE a.status = true AND a.id_user = " + idUser;
		SQLQuery query = session.createSQLQuery(queryString);
		List<Object[]> listObject = query.list();
		List<JSONObject> listJSON = new ArrayList<JSONObject>();
		
		for(Object[] o : listObject) {
			
			JSONObject json = JSONFactoryUtil.createJSONObject();
			json.put("user_id", o[0]);
			json.put("screen_name", o[1]);
			json.put("email_address", o[2]);
			json.put("id_alamat", o[3]);
			json.put("nama_alamat", o[4]);
			json.put("nama_penerima", o[5]);
			json.put("nomor_handphone", o[6]);
			json.put("alamat_lengkap", o[7]);
			json.put("kode_pos", o[8]);
			json.put("kota", o[9]);
			json.put("provinsi", o[10]);
			json.put("region", o[11]);
			
			listJSON.add(json);
			
		}
		
		session.clear();
		System.out.println("dapet alamat ga ya?" + listJSON.toString());
		return listJSON;
	}
	
}