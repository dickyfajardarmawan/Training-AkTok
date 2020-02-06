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

package UploadBuktiSpjSvc.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link UploadBuktiSpjSvc.service.http.PengirimanServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see UploadBuktiSpjSvc.service.http.PengirimanServiceSoap
 * @generated
 */
@ProviderType
public class PengirimanSoap implements Serializable {
	public static PengirimanSoap toSoapModel(Pengiriman model) {
		PengirimanSoap soapModel = new PengirimanSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setId_pengiriman(model.getId_pengiriman());
		soapModel.setTanggal_pengiriman(model.getTanggal_pengiriman());
		soapModel.setStatus_pengiriman(model.getStatus_pengiriman());
		soapModel.setTanggal_penerimaan(model.getTanggal_penerimaan());
		soapModel.setBukti_pengiriman(model.getBukti_pengiriman());
		soapModel.setCreate_date(model.getCreate_date());
		soapModel.setModified_date(model.getModified_date());
		soapModel.setId_order(model.getId_order());
		soapModel.setId_toko(model.getId_toko());

		return soapModel;
	}

	public static PengirimanSoap[] toSoapModels(Pengiriman[] models) {
		PengirimanSoap[] soapModels = new PengirimanSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PengirimanSoap[][] toSoapModels(Pengiriman[][] models) {
		PengirimanSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PengirimanSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PengirimanSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PengirimanSoap[] toSoapModels(List<Pengiriman> models) {
		List<PengirimanSoap> soapModels = new ArrayList<PengirimanSoap>(models.size());

		for (Pengiriman model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PengirimanSoap[soapModels.size()]);
	}

	public PengirimanSoap() {
	}

	public String getPrimaryKey() {
		return _id_pengiriman;
	}

	public void setPrimaryKey(String pk) {
		setId_pengiriman(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public String getId_pengiriman() {
		return _id_pengiriman;
	}

	public void setId_pengiriman(String id_pengiriman) {
		_id_pengiriman = id_pengiriman;
	}

	public Date getTanggal_pengiriman() {
		return _tanggal_pengiriman;
	}

	public void setTanggal_pengiriman(Date tanggal_pengiriman) {
		_tanggal_pengiriman = tanggal_pengiriman;
	}

	public String getStatus_pengiriman() {
		return _status_pengiriman;
	}

	public void setStatus_pengiriman(String status_pengiriman) {
		_status_pengiriman = status_pengiriman;
	}

	public Date getTanggal_penerimaan() {
		return _tanggal_penerimaan;
	}

	public void setTanggal_penerimaan(Date tanggal_penerimaan) {
		_tanggal_penerimaan = tanggal_penerimaan;
	}

	public String getBukti_pengiriman() {
		return _bukti_pengiriman;
	}

	public void setBukti_pengiriman(String bukti_pengiriman) {
		_bukti_pengiriman = bukti_pengiriman;
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

	public String getId_order() {
		return _id_order;
	}

	public void setId_order(String id_order) {
		_id_order = id_order;
	}

	public String getId_toko() {
		return _id_toko;
	}

	public void setId_toko(String id_toko) {
		_id_toko = id_toko;
	}

	private String _uuid;
	private String _id_pengiriman;
	private Date _tanggal_pengiriman;
	private String _status_pengiriman;
	private Date _tanggal_penerimaan;
	private String _bukti_pengiriman;
	private Date _create_date;
	private Date _modified_date;
	private String _id_order;
	private String _id_toko;
}