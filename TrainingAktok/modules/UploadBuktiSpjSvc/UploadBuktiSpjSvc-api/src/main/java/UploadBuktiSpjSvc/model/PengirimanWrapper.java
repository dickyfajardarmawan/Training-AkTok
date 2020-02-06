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
 * This class is a wrapper for {@link Pengiriman}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Pengiriman
 * @generated
 */
@ProviderType
public class PengirimanWrapper implements Pengiriman, ModelWrapper<Pengiriman> {
	public PengirimanWrapper(Pengiriman pengiriman) {
		_pengiriman = pengiriman;
	}

	@Override
	public Class<?> getModelClass() {
		return Pengiriman.class;
	}

	@Override
	public String getModelClassName() {
		return Pengiriman.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("id_pengiriman", getId_pengiriman());
		attributes.put("tanggal_pengiriman", getTanggal_pengiriman());
		attributes.put("status_pengiriman", getStatus_pengiriman());
		attributes.put("tanggal_penerimaan", getTanggal_penerimaan());
		attributes.put("bukti_pengiriman", getBukti_pengiriman());
		attributes.put("create_date", getCreate_date());
		attributes.put("modified_date", getModified_date());
		attributes.put("id_order", getId_order());
		attributes.put("id_toko", getId_toko());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		String id_pengiriman = (String)attributes.get("id_pengiriman");

		if (id_pengiriman != null) {
			setId_pengiriman(id_pengiriman);
		}

		Date tanggal_pengiriman = (Date)attributes.get("tanggal_pengiriman");

		if (tanggal_pengiriman != null) {
			setTanggal_pengiriman(tanggal_pengiriman);
		}

		String status_pengiriman = (String)attributes.get("status_pengiriman");

		if (status_pengiriman != null) {
			setStatus_pengiriman(status_pengiriman);
		}

		Date tanggal_penerimaan = (Date)attributes.get("tanggal_penerimaan");

		if (tanggal_penerimaan != null) {
			setTanggal_penerimaan(tanggal_penerimaan);
		}

		String bukti_pengiriman = (String)attributes.get("bukti_pengiriman");

		if (bukti_pengiriman != null) {
			setBukti_pengiriman(bukti_pengiriman);
		}

		Date create_date = (Date)attributes.get("create_date");

		if (create_date != null) {
			setCreate_date(create_date);
		}

		Date modified_date = (Date)attributes.get("modified_date");

		if (modified_date != null) {
			setModified_date(modified_date);
		}

		String id_order = (String)attributes.get("id_order");

		if (id_order != null) {
			setId_order(id_order);
		}

		String id_toko = (String)attributes.get("id_toko");

		if (id_toko != null) {
			setId_toko(id_toko);
		}
	}

	@Override
	public Object clone() {
		return new PengirimanWrapper((Pengiriman)_pengiriman.clone());
	}

	@Override
	public int compareTo(Pengiriman pengiriman) {
		return _pengiriman.compareTo(pengiriman);
	}

	/**
	* Returns the bukti_pengiriman of this pengiriman.
	*
	* @return the bukti_pengiriman of this pengiriman
	*/
	@Override
	public String getBukti_pengiriman() {
		return _pengiriman.getBukti_pengiriman();
	}

	/**
	* Returns the create_date of this pengiriman.
	*
	* @return the create_date of this pengiriman
	*/
	@Override
	public Date getCreate_date() {
		return _pengiriman.getCreate_date();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _pengiriman.getExpandoBridge();
	}

	/**
	* Returns the id_order of this pengiriman.
	*
	* @return the id_order of this pengiriman
	*/
	@Override
	public String getId_order() {
		return _pengiriman.getId_order();
	}

	/**
	* Returns the id_pengiriman of this pengiriman.
	*
	* @return the id_pengiriman of this pengiriman
	*/
	@Override
	public String getId_pengiriman() {
		return _pengiriman.getId_pengiriman();
	}

	/**
	* Returns the id_toko of this pengiriman.
	*
	* @return the id_toko of this pengiriman
	*/
	@Override
	public String getId_toko() {
		return _pengiriman.getId_toko();
	}

	/**
	* Returns the modified_date of this pengiriman.
	*
	* @return the modified_date of this pengiriman
	*/
	@Override
	public Date getModified_date() {
		return _pengiriman.getModified_date();
	}

	/**
	* Returns the primary key of this pengiriman.
	*
	* @return the primary key of this pengiriman
	*/
	@Override
	public String getPrimaryKey() {
		return _pengiriman.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _pengiriman.getPrimaryKeyObj();
	}

	/**
	* Returns the status_pengiriman of this pengiriman.
	*
	* @return the status_pengiriman of this pengiriman
	*/
	@Override
	public String getStatus_pengiriman() {
		return _pengiriman.getStatus_pengiriman();
	}

	/**
	* Returns the tanggal_penerimaan of this pengiriman.
	*
	* @return the tanggal_penerimaan of this pengiriman
	*/
	@Override
	public Date getTanggal_penerimaan() {
		return _pengiriman.getTanggal_penerimaan();
	}

	/**
	* Returns the tanggal_pengiriman of this pengiriman.
	*
	* @return the tanggal_pengiriman of this pengiriman
	*/
	@Override
	public Date getTanggal_pengiriman() {
		return _pengiriman.getTanggal_pengiriman();
	}

	/**
	* Returns the uuid of this pengiriman.
	*
	* @return the uuid of this pengiriman
	*/
	@Override
	public String getUuid() {
		return _pengiriman.getUuid();
	}

	@Override
	public int hashCode() {
		return _pengiriman.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _pengiriman.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _pengiriman.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _pengiriman.isNew();
	}

	@Override
	public void persist() {
		_pengiriman.persist();
	}

	/**
	* Sets the bukti_pengiriman of this pengiriman.
	*
	* @param bukti_pengiriman the bukti_pengiriman of this pengiriman
	*/
	@Override
	public void setBukti_pengiriman(String bukti_pengiriman) {
		_pengiriman.setBukti_pengiriman(bukti_pengiriman);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_pengiriman.setCachedModel(cachedModel);
	}

	/**
	* Sets the create_date of this pengiriman.
	*
	* @param create_date the create_date of this pengiriman
	*/
	@Override
	public void setCreate_date(Date create_date) {
		_pengiriman.setCreate_date(create_date);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_pengiriman.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_pengiriman.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_pengiriman.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the id_order of this pengiriman.
	*
	* @param id_order the id_order of this pengiriman
	*/
	@Override
	public void setId_order(String id_order) {
		_pengiriman.setId_order(id_order);
	}

	/**
	* Sets the id_pengiriman of this pengiriman.
	*
	* @param id_pengiriman the id_pengiriman of this pengiriman
	*/
	@Override
	public void setId_pengiriman(String id_pengiriman) {
		_pengiriman.setId_pengiriman(id_pengiriman);
	}

	/**
	* Sets the id_toko of this pengiriman.
	*
	* @param id_toko the id_toko of this pengiriman
	*/
	@Override
	public void setId_toko(String id_toko) {
		_pengiriman.setId_toko(id_toko);
	}

	/**
	* Sets the modified_date of this pengiriman.
	*
	* @param modified_date the modified_date of this pengiriman
	*/
	@Override
	public void setModified_date(Date modified_date) {
		_pengiriman.setModified_date(modified_date);
	}

	@Override
	public void setNew(boolean n) {
		_pengiriman.setNew(n);
	}

	/**
	* Sets the primary key of this pengiriman.
	*
	* @param primaryKey the primary key of this pengiriman
	*/
	@Override
	public void setPrimaryKey(String primaryKey) {
		_pengiriman.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_pengiriman.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the status_pengiriman of this pengiriman.
	*
	* @param status_pengiriman the status_pengiriman of this pengiriman
	*/
	@Override
	public void setStatus_pengiriman(String status_pengiriman) {
		_pengiriman.setStatus_pengiriman(status_pengiriman);
	}

	/**
	* Sets the tanggal_penerimaan of this pengiriman.
	*
	* @param tanggal_penerimaan the tanggal_penerimaan of this pengiriman
	*/
	@Override
	public void setTanggal_penerimaan(Date tanggal_penerimaan) {
		_pengiriman.setTanggal_penerimaan(tanggal_penerimaan);
	}

	/**
	* Sets the tanggal_pengiriman of this pengiriman.
	*
	* @param tanggal_pengiriman the tanggal_pengiriman of this pengiriman
	*/
	@Override
	public void setTanggal_pengiriman(Date tanggal_pengiriman) {
		_pengiriman.setTanggal_pengiriman(tanggal_pengiriman);
	}

	/**
	* Sets the uuid of this pengiriman.
	*
	* @param uuid the uuid of this pengiriman
	*/
	@Override
	public void setUuid(String uuid) {
		_pengiriman.setUuid(uuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Pengiriman> toCacheModel() {
		return _pengiriman.toCacheModel();
	}

	@Override
	public Pengiriman toEscapedModel() {
		return new PengirimanWrapper(_pengiriman.toEscapedModel());
	}

	@Override
	public String toString() {
		return _pengiriman.toString();
	}

	@Override
	public Pengiriman toUnescapedModel() {
		return new PengirimanWrapper(_pengiriman.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _pengiriman.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PengirimanWrapper)) {
			return false;
		}

		PengirimanWrapper pengirimanWrapper = (PengirimanWrapper)obj;

		if (Objects.equals(_pengiriman, pengirimanWrapper._pengiriman)) {
			return true;
		}

		return false;
	}

	@Override
	public Pengiriman getWrappedModel() {
		return _pengiriman;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _pengiriman.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _pengiriman.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_pengiriman.resetOriginalValues();
	}

	private final Pengiriman _pengiriman;
}