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

package TokoSvc.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link TokoSvc.service.http.TokoServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see TokoSvc.service.http.TokoServiceSoap
 * @generated
 */
@ProviderType
public class TokoSoap implements Serializable {
	public static TokoSoap toSoapModel(Toko model) {
		TokoSoap soapModel = new TokoSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setId_toko(model.getId_toko());
		soapModel.setNama_toko(model.getNama_toko());
		soapModel.setNama_depan_pemilik(model.getNama_depan_pemilik());
		soapModel.setNama_belakang_pemilik(model.getNama_belakang_pemilik());
		soapModel.setNomor_hp(model.getNomor_hp());
		soapModel.setStatus_toko(model.getStatus_toko());
		soapModel.setTanggal_pendaftaran(model.getTanggal_pendaftaran());
		soapModel.setPassword(model.getPassword());
		soapModel.setPin(model.getPin());
		soapModel.setId_distributor(model.getId_distributor());

		return soapModel;
	}

	public static TokoSoap[] toSoapModels(Toko[] models) {
		TokoSoap[] soapModels = new TokoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TokoSoap[][] toSoapModels(Toko[][] models) {
		TokoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TokoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TokoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TokoSoap[] toSoapModels(List<Toko> models) {
		List<TokoSoap> soapModels = new ArrayList<TokoSoap>(models.size());

		for (Toko model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TokoSoap[soapModels.size()]);
	}

	public TokoSoap() {
	}

	public String getPrimaryKey() {
		return _id_toko;
	}

	public void setPrimaryKey(String pk) {
		setId_toko(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public String getId_toko() {
		return _id_toko;
	}

	public void setId_toko(String id_toko) {
		_id_toko = id_toko;
	}

	public String getNama_toko() {
		return _nama_toko;
	}

	public void setNama_toko(String nama_toko) {
		_nama_toko = nama_toko;
	}

	public String getNama_depan_pemilik() {
		return _nama_depan_pemilik;
	}

	public void setNama_depan_pemilik(String nama_depan_pemilik) {
		_nama_depan_pemilik = nama_depan_pemilik;
	}

	public String getNama_belakang_pemilik() {
		return _nama_belakang_pemilik;
	}

	public void setNama_belakang_pemilik(String nama_belakang_pemilik) {
		_nama_belakang_pemilik = nama_belakang_pemilik;
	}

	public long getNomor_hp() {
		return _nomor_hp;
	}

	public void setNomor_hp(long nomor_hp) {
		_nomor_hp = nomor_hp;
	}

	public long getStatus_toko() {
		return _status_toko;
	}

	public void setStatus_toko(long status_toko) {
		_status_toko = status_toko;
	}

	public Date getTanggal_pendaftaran() {
		return _tanggal_pendaftaran;
	}

	public void setTanggal_pendaftaran(Date tanggal_pendaftaran) {
		_tanggal_pendaftaran = tanggal_pendaftaran;
	}

	public String getPassword() {
		return _password;
	}

	public void setPassword(String password) {
		_password = password;
	}

	public long getPin() {
		return _pin;
	}

	public void setPin(long pin) {
		_pin = pin;
	}

	public String getId_distributor() {
		return _id_distributor;
	}

	public void setId_distributor(String id_distributor) {
		_id_distributor = id_distributor;
	}

	private String _uuid;
	private String _id_toko;
	private String _nama_toko;
	private String _nama_depan_pemilik;
	private String _nama_belakang_pemilik;
	private long _nomor_hp;
	private long _status_toko;
	private Date _tanggal_pendaftaran;
	private String _password;
	private long _pin;
	private String _id_distributor;
}