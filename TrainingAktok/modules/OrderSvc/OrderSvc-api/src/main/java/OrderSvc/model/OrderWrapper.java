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

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Order}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Order
 * @generated
 */
@ProviderType
public class OrderWrapper implements Order, ModelWrapper<Order> {
	public OrderWrapper(Order order) {
		_order = order;
	}

	@Override
	public Class<?> getModelClass() {
		return Order.class;
	}

	@Override
	public String getModelClassName() {
		return Order.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("id_order", getId_order());
		attributes.put("total_harga", getTotal_harga());
		attributes.put("tanggal_pemesanan", getTanggal_pemesanan());
		attributes.put("tanggal_ekspetasi_pengiriman",
			getTanggal_ekspetasi_pengiriman());
		attributes.put("status_order", getStatus_order());
		attributes.put("status_pembayaran_keseluruhan",
			getStatus_pembayaran_keseluruhan());
		attributes.put("status_pengiriman_keseluruhan",
			getStatus_pengiriman_keseluruhan());
		attributes.put("catatan", getCatatan());
		attributes.put("create_date", getCreate_date());
		attributes.put("modified_date", getModified_date());
		attributes.put("id_metode_pembayaran", getId_metode_pembayaran());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		String id_order = (String)attributes.get("id_order");

		if (id_order != null) {
			setId_order(id_order);
		}

		Long total_harga = (Long)attributes.get("total_harga");

		if (total_harga != null) {
			setTotal_harga(total_harga);
		}

		Date tanggal_pemesanan = (Date)attributes.get("tanggal_pemesanan");

		if (tanggal_pemesanan != null) {
			setTanggal_pemesanan(tanggal_pemesanan);
		}

		Date tanggal_ekspetasi_pengiriman = (Date)attributes.get(
				"tanggal_ekspetasi_pengiriman");

		if (tanggal_ekspetasi_pengiriman != null) {
			setTanggal_ekspetasi_pengiriman(tanggal_ekspetasi_pengiriman);
		}

		String status_order = (String)attributes.get("status_order");

		if (status_order != null) {
			setStatus_order(status_order);
		}

		String status_pembayaran_keseluruhan = (String)attributes.get(
				"status_pembayaran_keseluruhan");

		if (status_pembayaran_keseluruhan != null) {
			setStatus_pembayaran_keseluruhan(status_pembayaran_keseluruhan);
		}

		String status_pengiriman_keseluruhan = (String)attributes.get(
				"status_pengiriman_keseluruhan");

		if (status_pengiriman_keseluruhan != null) {
			setStatus_pengiriman_keseluruhan(status_pengiriman_keseluruhan);
		}

		String catatan = (String)attributes.get("catatan");

		if (catatan != null) {
			setCatatan(catatan);
		}

		Date create_date = (Date)attributes.get("create_date");

		if (create_date != null) {
			setCreate_date(create_date);
		}

		Date modified_date = (Date)attributes.get("modified_date");

		if (modified_date != null) {
			setModified_date(modified_date);
		}

		String id_metode_pembayaran = (String)attributes.get(
				"id_metode_pembayaran");

		if (id_metode_pembayaran != null) {
			setId_metode_pembayaran(id_metode_pembayaran);
		}
	}

	@Override
	public Object clone() {
		return new OrderWrapper((Order)_order.clone());
	}

	@Override
	public int compareTo(Order order) {
		return _order.compareTo(order);
	}

	/**
	* Returns the catatan of this order.
	*
	* @return the catatan of this order
	*/
	@Override
	public String getCatatan() {
		return _order.getCatatan();
	}

	/**
	* Returns the create_date of this order.
	*
	* @return the create_date of this order
	*/
	@Override
	public Date getCreate_date() {
		return _order.getCreate_date();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _order.getExpandoBridge();
	}

	/**
	* Returns the id_metode_pembayaran of this order.
	*
	* @return the id_metode_pembayaran of this order
	*/
	@Override
	public String getId_metode_pembayaran() {
		return _order.getId_metode_pembayaran();
	}

	/**
	* Returns the id_order of this order.
	*
	* @return the id_order of this order
	*/
	@Override
	public String getId_order() {
		return _order.getId_order();
	}

	/**
	* Returns the modified_date of this order.
	*
	* @return the modified_date of this order
	*/
	@Override
	public Date getModified_date() {
		return _order.getModified_date();
	}

	/**
	* Returns the primary key of this order.
	*
	* @return the primary key of this order
	*/
	@Override
	public String getPrimaryKey() {
		return _order.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _order.getPrimaryKeyObj();
	}

	/**
	* Returns the status_order of this order.
	*
	* @return the status_order of this order
	*/
	@Override
	public String getStatus_order() {
		return _order.getStatus_order();
	}

	/**
	* Returns the status_pembayaran_keseluruhan of this order.
	*
	* @return the status_pembayaran_keseluruhan of this order
	*/
	@Override
	public String getStatus_pembayaran_keseluruhan() {
		return _order.getStatus_pembayaran_keseluruhan();
	}

	/**
	* Returns the status_pengiriman_keseluruhan of this order.
	*
	* @return the status_pengiriman_keseluruhan of this order
	*/
	@Override
	public String getStatus_pengiriman_keseluruhan() {
		return _order.getStatus_pengiriman_keseluruhan();
	}

	/**
	* Returns the tanggal_ekspetasi_pengiriman of this order.
	*
	* @return the tanggal_ekspetasi_pengiriman of this order
	*/
	@Override
	public Date getTanggal_ekspetasi_pengiriman() {
		return _order.getTanggal_ekspetasi_pengiriman();
	}

	/**
	* Returns the tanggal_pemesanan of this order.
	*
	* @return the tanggal_pemesanan of this order
	*/
	@Override
	public Date getTanggal_pemesanan() {
		return _order.getTanggal_pemesanan();
	}

	/**
	* Returns the total_harga of this order.
	*
	* @return the total_harga of this order
	*/
	@Override
	public long getTotal_harga() {
		return _order.getTotal_harga();
	}

	/**
	* Returns the uuid of this order.
	*
	* @return the uuid of this order
	*/
	@Override
	public String getUuid() {
		return _order.getUuid();
	}

	@Override
	public int hashCode() {
		return _order.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _order.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _order.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _order.isNew();
	}

	@Override
	public void persist() {
		_order.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_order.setCachedModel(cachedModel);
	}

	/**
	* Sets the catatan of this order.
	*
	* @param catatan the catatan of this order
	*/
	@Override
	public void setCatatan(String catatan) {
		_order.setCatatan(catatan);
	}

	/**
	* Sets the create_date of this order.
	*
	* @param create_date the create_date of this order
	*/
	@Override
	public void setCreate_date(Date create_date) {
		_order.setCreate_date(create_date);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_order.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_order.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_order.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the id_metode_pembayaran of this order.
	*
	* @param id_metode_pembayaran the id_metode_pembayaran of this order
	*/
	@Override
	public void setId_metode_pembayaran(String id_metode_pembayaran) {
		_order.setId_metode_pembayaran(id_metode_pembayaran);
	}

	/**
	* Sets the id_order of this order.
	*
	* @param id_order the id_order of this order
	*/
	@Override
	public void setId_order(String id_order) {
		_order.setId_order(id_order);
	}

	/**
	* Sets the modified_date of this order.
	*
	* @param modified_date the modified_date of this order
	*/
	@Override
	public void setModified_date(Date modified_date) {
		_order.setModified_date(modified_date);
	}

	@Override
	public void setNew(boolean n) {
		_order.setNew(n);
	}

	/**
	* Sets the primary key of this order.
	*
	* @param primaryKey the primary key of this order
	*/
	@Override
	public void setPrimaryKey(String primaryKey) {
		_order.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_order.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the status_order of this order.
	*
	* @param status_order the status_order of this order
	*/
	@Override
	public void setStatus_order(String status_order) {
		_order.setStatus_order(status_order);
	}

	/**
	* Sets the status_pembayaran_keseluruhan of this order.
	*
	* @param status_pembayaran_keseluruhan the status_pembayaran_keseluruhan of this order
	*/
	@Override
	public void setStatus_pembayaran_keseluruhan(
		String status_pembayaran_keseluruhan) {
		_order.setStatus_pembayaran_keseluruhan(status_pembayaran_keseluruhan);
	}

	/**
	* Sets the status_pengiriman_keseluruhan of this order.
	*
	* @param status_pengiriman_keseluruhan the status_pengiriman_keseluruhan of this order
	*/
	@Override
	public void setStatus_pengiriman_keseluruhan(
		String status_pengiriman_keseluruhan) {
		_order.setStatus_pengiriman_keseluruhan(status_pengiriman_keseluruhan);
	}

	/**
	* Sets the tanggal_ekspetasi_pengiriman of this order.
	*
	* @param tanggal_ekspetasi_pengiriman the tanggal_ekspetasi_pengiriman of this order
	*/
	@Override
	public void setTanggal_ekspetasi_pengiriman(
		Date tanggal_ekspetasi_pengiriman) {
		_order.setTanggal_ekspetasi_pengiriman(tanggal_ekspetasi_pengiriman);
	}

	/**
	* Sets the tanggal_pemesanan of this order.
	*
	* @param tanggal_pemesanan the tanggal_pemesanan of this order
	*/
	@Override
	public void setTanggal_pemesanan(Date tanggal_pemesanan) {
		_order.setTanggal_pemesanan(tanggal_pemesanan);
	}

	/**
	* Sets the total_harga of this order.
	*
	* @param total_harga the total_harga of this order
	*/
	@Override
	public void setTotal_harga(long total_harga) {
		_order.setTotal_harga(total_harga);
	}

	/**
	* Sets the uuid of this order.
	*
	* @param uuid the uuid of this order
	*/
	@Override
	public void setUuid(String uuid) {
		_order.setUuid(uuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Order> toCacheModel() {
		return _order.toCacheModel();
	}

	@Override
	public Order toEscapedModel() {
		return new OrderWrapper(_order.toEscapedModel());
	}

	@Override
	public String toString() {
		return _order.toString();
	}

	@Override
	public Order toUnescapedModel() {
		return new OrderWrapper(_order.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _order.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof OrderWrapper)) {
			return false;
		}

		OrderWrapper orderWrapper = (OrderWrapper)obj;

		if (Objects.equals(_order, orderWrapper._order)) {
			return true;
		}

		return false;
	}

	@Override
	public Order getWrappedModel() {
		return _order;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _order.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _order.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_order.resetOriginalValues();
	}

	private final Order _order;
}