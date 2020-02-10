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

package ProdukSvc.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link ProdukSvc.service.http.ProdukServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see ProdukSvc.service.http.ProdukServiceSoap
 * @generated
 */
@ProviderType
public class ProdukSoap implements Serializable {
	public static ProdukSoap toSoapModel(Produk model) {
		ProdukSoap soapModel = new ProdukSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setId_produk(model.getId_produk());
		soapModel.setCreate_date(model.getCreate_date());
		soapModel.setModified_date(model.getModified_date());
		soapModel.setNama_produk(model.getNama_produk());
		soapModel.setHarga_produk(model.getHarga_produk());
		soapModel.setKelipatan_produk(model.getKelipatan_produk());

		return soapModel;
	}

	public static ProdukSoap[] toSoapModels(Produk[] models) {
		ProdukSoap[] soapModels = new ProdukSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ProdukSoap[][] toSoapModels(Produk[][] models) {
		ProdukSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ProdukSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ProdukSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ProdukSoap[] toSoapModels(List<Produk> models) {
		List<ProdukSoap> soapModels = new ArrayList<ProdukSoap>(models.size());

		for (Produk model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ProdukSoap[soapModels.size()]);
	}

	public ProdukSoap() {
	}

	public String getPrimaryKey() {
		return _id_produk;
	}

	public void setPrimaryKey(String pk) {
		setId_produk(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public String getId_produk() {
		return _id_produk;
	}

	public void setId_produk(String id_produk) {
		_id_produk = id_produk;
	}

	public Date getCreate_date() {
		return _create_date;
	}

	public void setCreate_date(Date create_date) {
		_create_date = create_date;
	}

	public Date getModified_date() {
		return _modified_date;
	}

	public void setModified_date(Date modified_date) {
		_modified_date = modified_date;
	}

	public String getNama_produk() {
		return _nama_produk;
	}

	public void setNama_produk(String nama_produk) {
		_nama_produk = nama_produk;
	}

	public long getHarga_produk() {
		return _harga_produk;
	}

	public void setHarga_produk(long harga_produk) {
		_harga_produk = harga_produk;
	}

	public long getKelipatan_produk() {
		return _kelipatan_produk;
	}

	public void setKelipatan_produk(long kelipatan_produk) {
		_kelipatan_produk = kelipatan_produk;
	}

	private String _uuid;
	private String _id_produk;
	private Date _create_date;
	private Date _modified_date;
	private String _nama_produk;
	private long _harga_produk;
	private long _kelipatan_produk;
}