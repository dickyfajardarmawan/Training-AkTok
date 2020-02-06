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

package OrderSvc.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link OrderSvc.service.http.OrderServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see OrderSvc.service.http.OrderServiceSoap
 * @generated
 */
@ProviderType
public class OrderSoap implements Serializable {
	public static OrderSoap toSoapModel(Order model) {
		OrderSoap soapModel = new OrderSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setId_order(model.getId_order());
		soapModel.setTotal_harga(model.getTotal_harga());
		soapModel.setTanggal_pemesanan(model.getTanggal_pemesanan());
		soapModel.setTanggal_ekspetasi_pengiriman(model.getTanggal_ekspetasi_pengiriman());
		soapModel.setStatus_order(model.getStatus_order());
		soapModel.setStatus_pembayaran_keseluruhan(model.getStatus_pembayaran_keseluruhan());
		soapModel.setStatus_pengiriman_keseluruhan(model.getStatus_pengiriman_keseluruhan());
		soapModel.setCatatan(model.getCatatan());
		soapModel.setCreate_date(model.getCreate_date());
		soapModel.setModified_date(model.getModified_date());
		soapModel.setId_metode_pembayaran(model.getId_metode_pembayaran());

		return soapModel;
	}

	public static OrderSoap[] toSoapModels(Order[] models) {
		OrderSoap[] soapModels = new OrderSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static OrderSoap[][] toSoapModels(Order[][] models) {
		OrderSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new OrderSoap[models.length][models[0].length];
		}
		else {
			soapModels = new OrderSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static OrderSoap[] toSoapModels(List<Order> models) {
		List<OrderSoap> soapModels = new ArrayList<OrderSoap>(models.size());

		for (Order model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new OrderSoap[soapModels.size()]);
	}

	public OrderSoap() {
	}

	public String getPrimaryKey() {
		return _id_order;
	}

	public void setPrimaryKey(String pk) {
		setId_order(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public String getId_order() {
		return _id_order;
	}

	public void setId_order(String id_order) {
		_id_order = id_order;
	}

	public long getTotal_harga() {
		return _total_harga;
	}

	public void setTotal_harga(long total_harga) {
		_total_harga = total_harga;
	}

	public Date getTanggal_pemesanan() {
		return _tanggal_pemesanan;
	}

	public void setTanggal_pemesanan(Date tanggal_pemesanan) {
		_tanggal_pemesanan = tanggal_pemesanan;
	}

	public Date getTanggal_ekspetasi_pengiriman() {
		return _tanggal_ekspetasi_pengiriman;
	}

	public void setTanggal_ekspetasi_pengiriman(
		Date tanggal_ekspetasi_pengiriman) {
		_tanggal_ekspetasi_pengiriman = tanggal_ekspetasi_pengiriman;
	}

	public String getStatus_order() {
		return _status_order;
	}

	public void setStatus_order(String status_order) {
		_status_order = status_order;
	}

	public String getStatus_pembayaran_keseluruhan() {
		return _status_pembayaran_keseluruhan;
	}

	public void setStatus_pembayaran_keseluruhan(
		String status_pembayaran_keseluruhan) {
		_status_pembayaran_keseluruhan = status_pembayaran_keseluruhan;
	}

	public String getStatus_pengiriman_keseluruhan() {
		return _status_pengiriman_keseluruhan;
	}

	public void setStatus_pengiriman_keseluruhan(
		String status_pengiriman_keseluruhan) {
		_status_pengiriman_keseluruhan = status_pengiriman_keseluruhan;
	}

	public String getCatatan() {
		return _catatan;
	}

	public void setCatatan(String catatan) {
		_catatan = catatan;
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

	public String getId_metode_pembayaran() {
		return _id_metode_pembayaran;
	}

	public void setId_metode_pembayaran(String id_metode_pembayaran) {
		_id_metode_pembayaran = id_metode_pembayaran;
	}

	private String _uuid;
	private String _id_order;
	private long _total_harga;
	private Date _tanggal_pemesanan;
	private Date _tanggal_ekspetasi_pengiriman;
	private String _status_order;
	private String _status_pembayaran_keseluruhan;
	private String _status_pengiriman_keseluruhan;
	private String _catatan;
	private Date _create_date;
	private Date _modified_date;
	private String _id_metode_pembayaran;
}