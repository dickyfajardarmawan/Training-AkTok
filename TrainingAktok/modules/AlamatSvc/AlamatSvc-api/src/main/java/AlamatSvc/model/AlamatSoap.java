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

package AlamatSvc.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link AlamatSvc.service.http.AlamatServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see AlamatSvc.service.http.AlamatServiceSoap
 * @generated
 */
@ProviderType
public class AlamatSoap implements Serializable {
	public static AlamatSoap toSoapModel(Alamat model) {
		AlamatSoap soapModel = new AlamatSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setId_alamat(model.getId_alamat());
		soapModel.setId_user(model.getId_user());
		soapModel.setNama_alamat(model.getNama_alamat());
		soapModel.setNama_penerima(model.getNama_penerima());
		soapModel.setNomor_handphone(model.getNomor_handphone());
		soapModel.setAlamat_lengkap(model.getAlamat_lengkap());
		soapModel.setKode_pos(model.getKode_pos());
		soapModel.setKota(model.getKota());
		soapModel.setProvinsi(model.getProvinsi());
		soapModel.setRegion(model.getRegion());
		soapModel.setStatus(model.isStatus());
		soapModel.setCreated_date(model.getCreated_date());
		soapModel.setModified_date(model.getModified_date());

		return soapModel;
	}

	public static AlamatSoap[] toSoapModels(Alamat[] models) {
		AlamatSoap[] soapModels = new AlamatSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AlamatSoap[][] toSoapModels(Alamat[][] models) {
		AlamatSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AlamatSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AlamatSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AlamatSoap[] toSoapModels(List<Alamat> models) {
		List<AlamatSoap> soapModels = new ArrayList<AlamatSoap>(models.size());

		for (Alamat model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AlamatSoap[soapModels.size()]);
	}

	public AlamatSoap() {
	}

	public String getPrimaryKey() {
		return _id_alamat;
	}

	public void setPrimaryKey(String pk) {
		setId_alamat(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public String getId_alamat() {
		return _id_alamat;
	}

	public void setId_alamat(String id_alamat) {
		_id_alamat = id_alamat;
	}

	public long getId_user() {
		return _id_user;
	}

	public void setId_user(long id_user) {
		_id_user = id_user;
	}

	public String getNama_alamat() {
		return _nama_alamat;
	}

	public void setNama_alamat(String nama_alamat) {
		_nama_alamat = nama_alamat;
	}

	public String getNama_penerima() {
		return _nama_penerima;
	}

	public void setNama_penerima(String nama_penerima) {
		_nama_penerima = nama_penerima;
	}

	public long getNomor_handphone() {
		return _nomor_handphone;
	}

	public void setNomor_handphone(long nomor_handphone) {
		_nomor_handphone = nomor_handphone;
	}

	public String getAlamat_lengkap() {
		return _alamat_lengkap;
	}

	public void setAlamat_lengkap(String alamat_lengkap) {
		_alamat_lengkap = alamat_lengkap;
	}

	public long getKode_pos() {
		return _kode_pos;
	}

	public void setKode_pos(long kode_pos) {
		_kode_pos = kode_pos;
	}

	public String getKota() {
		return _kota;
	}

	public void setKota(String kota) {
		_kota = kota;
	}

	public String getProvinsi() {
		return _provinsi;
	}

	public void setProvinsi(String provinsi) {
		_provinsi = provinsi;
	}

	public String getRegion() {
		return _region;
	}

	public void setRegion(String region) {
		_region = region;
	}

	public boolean getStatus() {
		return _status;
	}

	public boolean isStatus() {
		return _status;
	}

	public void setStatus(boolean status) {
		_status = status;
	}

	public Date getCreated_date() {
		return _created_date;
	}

	public void setCreated_date(Date created_date) {
		_created_date = created_date;
	}

	public Date getModified_date() {
		return _modified_date;
	}

	public void setModified_date(Date modified_date) {
		_modified_date = modified_date;
	}

	private String _uuid;
	private String _id_alamat;
	private long _id_user;
	private String _nama_alamat;
	private String _nama_penerima;
	private long _nomor_handphone;
	private String _alamat_lengkap;
	private long _kode_pos;
	private String _kota;
	private String _provinsi;
	private String _region;
	private boolean _status;
	private Date _created_date;
	private Date _modified_date;
}