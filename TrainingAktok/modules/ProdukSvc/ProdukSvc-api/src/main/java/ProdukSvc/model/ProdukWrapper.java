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
 * This class is a wrapper for {@link Produk}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Produk
 * @generated
 */
@ProviderType
public class ProdukWrapper implements Produk, ModelWrapper<Produk> {
	public ProdukWrapper(Produk produk) {
		_produk = produk;
	}

	@Override
	public Class<?> getModelClass() {
		return Produk.class;
	}

	@Override
	public String getModelClassName() {
		return Produk.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("id_produk", getId_produk());
		attributes.put("create_date", getCreate_date());
		attributes.put("modified_date", getModified_date());
		attributes.put("nama_produk", getNama_produk());
		attributes.put("harga_produk", getHarga_produk());
		attributes.put("kelipatan_produk", getKelipatan_produk());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		String id_produk = (String)attributes.get("id_produk");

		if (id_produk != null) {
			setId_produk(id_produk);
		}

		Date create_date = (Date)attributes.get("create_date");

		if (create_date != null) {
			setCreate_date(create_date);
		}

		Date modified_date = (Date)attributes.get("modified_date");

		if (modified_date != null) {
			setModified_date(modified_date);
		}

		String nama_produk = (String)attributes.get("nama_produk");

		if (nama_produk != null) {
			setNama_produk(nama_produk);
		}

		Long harga_produk = (Long)attributes.get("harga_produk");

		if (harga_produk != null) {
			setHarga_produk(harga_produk);
		}

		Long kelipatan_produk = (Long)attributes.get("kelipatan_produk");

		if (kelipatan_produk != null) {
			setKelipatan_produk(kelipatan_produk);
		}
	}

	@Override
	public Object clone() {
		return new ProdukWrapper((Produk)_produk.clone());
	}

	@Override
	public int compareTo(Produk produk) {
		return _produk.compareTo(produk);
	}

	/**
	* Returns the create_date of this produk.
	*
	* @return the create_date of this produk
	*/
	@Override
	public Date getCreate_date() {
		return _produk.getCreate_date();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _produk.getExpandoBridge();
	}

	/**
	* Returns the harga_produk of this produk.
	*
	* @return the harga_produk of this produk
	*/
	@Override
	public long getHarga_produk() {
		return _produk.getHarga_produk();
	}

	/**
	* Returns the id_produk of this produk.
	*
	* @return the id_produk of this produk
	*/
	@Override
	public String getId_produk() {
		return _produk.getId_produk();
	}

	/**
	* Returns the kelipatan_produk of this produk.
	*
	* @return the kelipatan_produk of this produk
	*/
	@Override
	public long getKelipatan_produk() {
		return _produk.getKelipatan_produk();
	}

	/**
	* Returns the modified_date of this produk.
	*
	* @return the modified_date of this produk
	*/
	@Override
	public Date getModified_date() {
		return _produk.getModified_date();
	}

	/**
	* Returns the nama_produk of this produk.
	*
	* @return the nama_produk of this produk
	*/
	@Override
	public String getNama_produk() {
		return _produk.getNama_produk();
	}

	/**
	* Returns the primary key of this produk.
	*
	* @return the primary key of this produk
	*/
	@Override
	public String getPrimaryKey() {
		return _produk.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _produk.getPrimaryKeyObj();
	}

	/**
	* Returns the uuid of this produk.
	*
	* @return the uuid of this produk
	*/
	@Override
	public String getUuid() {
		return _produk.getUuid();
	}

	@Override
	public int hashCode() {
		return _produk.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _produk.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _produk.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _produk.isNew();
	}

	@Override
	public void persist() {
		_produk.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_produk.setCachedModel(cachedModel);
	}

	/**
	* Sets the create_date of this produk.
	*
	* @param create_date the create_date of this produk
	*/
	@Override
	public void setCreate_date(Date create_date) {
		_produk.setCreate_date(create_date);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_produk.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_produk.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_produk.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the harga_produk of this produk.
	*
	* @param harga_produk the harga_produk of this produk
	*/
	@Override
	public void setHarga_produk(long harga_produk) {
		_produk.setHarga_produk(harga_produk);
	}

	/**
	* Sets the id_produk of this produk.
	*
	* @param id_produk the id_produk of this produk
	*/
	@Override
	public void setId_produk(String id_produk) {
		_produk.setId_produk(id_produk);
	}

	/**
	* Sets the kelipatan_produk of this produk.
	*
	* @param kelipatan_produk the kelipatan_produk of this produk
	*/
	@Override
	public void setKelipatan_produk(long kelipatan_produk) {
		_produk.setKelipatan_produk(kelipatan_produk);
	}

	/**
	* Sets the modified_date of this produk.
	*
	* @param modified_date the modified_date of this produk
	*/
	@Override
	public void setModified_date(Date modified_date) {
		_produk.setModified_date(modified_date);
	}

	/**
	* Sets the nama_produk of this produk.
	*
	* @param nama_produk the nama_produk of this produk
	*/
	@Override
	public void setNama_produk(String nama_produk) {
		_produk.setNama_produk(nama_produk);
	}

	@Override
	public void setNew(boolean n) {
		_produk.setNew(n);
	}

	/**
	* Sets the primary key of this produk.
	*
	* @param primaryKey the primary key of this produk
	*/
	@Override
	public void setPrimaryKey(String primaryKey) {
		_produk.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_produk.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the uuid of this produk.
	*
	* @param uuid the uuid of this produk
	*/
	@Override
	public void setUuid(String uuid) {
		_produk.setUuid(uuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Produk> toCacheModel() {
		return _produk.toCacheModel();
	}

	@Override
	public Produk toEscapedModel() {
		return new ProdukWrapper(_produk.toEscapedModel());
	}

	@Override
	public String toString() {
		return _produk.toString();
	}

	@Override
	public Produk toUnescapedModel() {
		return new ProdukWrapper(_produk.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _produk.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ProdukWrapper)) {
			return false;
		}

		ProdukWrapper produkWrapper = (ProdukWrapper)obj;

		if (Objects.equals(_produk, produkWrapper._produk)) {
			return true;
		}

		return false;
	}

	@Override
	public Produk getWrappedModel() {
		return _produk;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _produk.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _produk.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_produk.resetOriginalValues();
	}

	private final Produk _produk;
}