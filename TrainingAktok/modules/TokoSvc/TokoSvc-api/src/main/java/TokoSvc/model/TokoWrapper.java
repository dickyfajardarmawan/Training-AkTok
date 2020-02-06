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
 * This class is a wrapper for {@link Toko}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Toko
 * @generated
 */
@ProviderType
public class TokoWrapper implements Toko, ModelWrapper<Toko> {
	public TokoWrapper(Toko toko) {
		_toko = toko;
	}

	@Override
	public Class<?> getModelClass() {
		return Toko.class;
	}

	@Override
	public String getModelClassName() {
		return Toko.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("id_toko", getId_toko());
		attributes.put("nama_toko", getNama_toko());
		attributes.put("nama_depan_pemilik", getNama_depan_pemilik());
		attributes.put("nama_belakang_pemilik", getNama_belakang_pemilik());
		attributes.put("nomor_hp", getNomor_hp());
		attributes.put("status_toko", getStatus_toko());
		attributes.put("tanggal_pendaftaran", getTanggal_pendaftaran());
		attributes.put("password", getPassword());
		attributes.put("pin", getPin());
		attributes.put("id_distributor", getId_distributor());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		String id_toko = (String)attributes.get("id_toko");

		if (id_toko != null) {
			setId_toko(id_toko);
		}

		String nama_toko = (String)attributes.get("nama_toko");

		if (nama_toko != null) {
			setNama_toko(nama_toko);
		}

		String nama_depan_pemilik = (String)attributes.get("nama_depan_pemilik");

		if (nama_depan_pemilik != null) {
			setNama_depan_pemilik(nama_depan_pemilik);
		}

		String nama_belakang_pemilik = (String)attributes.get(
				"nama_belakang_pemilik");

		if (nama_belakang_pemilik != null) {
			setNama_belakang_pemilik(nama_belakang_pemilik);
		}

		Long nomor_hp = (Long)attributes.get("nomor_hp");

		if (nomor_hp != null) {
			setNomor_hp(nomor_hp);
		}

		Long status_toko = (Long)attributes.get("status_toko");

		if (status_toko != null) {
			setStatus_toko(status_toko);
		}

		Date tanggal_pendaftaran = (Date)attributes.get("tanggal_pendaftaran");

		if (tanggal_pendaftaran != null) {
			setTanggal_pendaftaran(tanggal_pendaftaran);
		}

		String password = (String)attributes.get("password");

		if (password != null) {
			setPassword(password);
		}

		Long pin = (Long)attributes.get("pin");

		if (pin != null) {
			setPin(pin);
		}

		String id_distributor = (String)attributes.get("id_distributor");

		if (id_distributor != null) {
			setId_distributor(id_distributor);
		}
	}

	@Override
	public Object clone() {
		return new TokoWrapper((Toko)_toko.clone());
	}

	@Override
	public int compareTo(Toko toko) {
		return _toko.compareTo(toko);
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _toko.getExpandoBridge();
	}

	/**
	* Returns the id_distributor of this toko.
	*
	* @return the id_distributor of this toko
	*/
	@Override
	public String getId_distributor() {
		return _toko.getId_distributor();
	}

	/**
	* Returns the id_toko of this toko.
	*
	* @return the id_toko of this toko
	*/
	@Override
	public String getId_toko() {
		return _toko.getId_toko();
	}

	/**
	* Returns the nama_belakang_pemilik of this toko.
	*
	* @return the nama_belakang_pemilik of this toko
	*/
	@Override
	public String getNama_belakang_pemilik() {
		return _toko.getNama_belakang_pemilik();
	}

	/**
	* Returns the nama_depan_pemilik of this toko.
	*
	* @return the nama_depan_pemilik of this toko
	*/
	@Override
	public String getNama_depan_pemilik() {
		return _toko.getNama_depan_pemilik();
	}

	/**
	* Returns the nama_toko of this toko.
	*
	* @return the nama_toko of this toko
	*/
	@Override
	public String getNama_toko() {
		return _toko.getNama_toko();
	}

	/**
	* Returns the nomor_hp of this toko.
	*
	* @return the nomor_hp of this toko
	*/
	@Override
	public long getNomor_hp() {
		return _toko.getNomor_hp();
	}

	/**
	* Returns the password of this toko.
	*
	* @return the password of this toko
	*/
	@Override
	public String getPassword() {
		return _toko.getPassword();
	}

	/**
	* Returns the pin of this toko.
	*
	* @return the pin of this toko
	*/
	@Override
	public long getPin() {
		return _toko.getPin();
	}

	/**
	* Returns the primary key of this toko.
	*
	* @return the primary key of this toko
	*/
	@Override
	public String getPrimaryKey() {
		return _toko.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _toko.getPrimaryKeyObj();
	}

	/**
	* Returns the status_toko of this toko.
	*
	* @return the status_toko of this toko
	*/
	@Override
	public long getStatus_toko() {
		return _toko.getStatus_toko();
	}

	/**
	* Returns the tanggal_pendaftaran of this toko.
	*
	* @return the tanggal_pendaftaran of this toko
	*/
	@Override
	public Date getTanggal_pendaftaran() {
		return _toko.getTanggal_pendaftaran();
	}

	/**
	* Returns the uuid of this toko.
	*
	* @return the uuid of this toko
	*/
	@Override
	public String getUuid() {
		return _toko.getUuid();
	}

	@Override
	public int hashCode() {
		return _toko.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _toko.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _toko.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _toko.isNew();
	}

	@Override
	public void persist() {
		_toko.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_toko.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_toko.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_toko.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_toko.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the id_distributor of this toko.
	*
	* @param id_distributor the id_distributor of this toko
	*/
	@Override
	public void setId_distributor(String id_distributor) {
		_toko.setId_distributor(id_distributor);
	}

	/**
	* Sets the id_toko of this toko.
	*
	* @param id_toko the id_toko of this toko
	*/
	@Override
	public void setId_toko(String id_toko) {
		_toko.setId_toko(id_toko);
	}

	/**
	* Sets the nama_belakang_pemilik of this toko.
	*
	* @param nama_belakang_pemilik the nama_belakang_pemilik of this toko
	*/
	@Override
	public void setNama_belakang_pemilik(String nama_belakang_pemilik) {
		_toko.setNama_belakang_pemilik(nama_belakang_pemilik);
	}

	/**
	* Sets the nama_depan_pemilik of this toko.
	*
	* @param nama_depan_pemilik the nama_depan_pemilik of this toko
	*/
	@Override
	public void setNama_depan_pemilik(String nama_depan_pemilik) {
		_toko.setNama_depan_pemilik(nama_depan_pemilik);
	}

	/**
	* Sets the nama_toko of this toko.
	*
	* @param nama_toko the nama_toko of this toko
	*/
	@Override
	public void setNama_toko(String nama_toko) {
		_toko.setNama_toko(nama_toko);
	}

	@Override
	public void setNew(boolean n) {
		_toko.setNew(n);
	}

	/**
	* Sets the nomor_hp of this toko.
	*
	* @param nomor_hp the nomor_hp of this toko
	*/
	@Override
	public void setNomor_hp(long nomor_hp) {
		_toko.setNomor_hp(nomor_hp);
	}

	/**
	* Sets the password of this toko.
	*
	* @param password the password of this toko
	*/
	@Override
	public void setPassword(String password) {
		_toko.setPassword(password);
	}

	/**
	* Sets the pin of this toko.
	*
	* @param pin the pin of this toko
	*/
	@Override
	public void setPin(long pin) {
		_toko.setPin(pin);
	}

	/**
	* Sets the primary key of this toko.
	*
	* @param primaryKey the primary key of this toko
	*/
	@Override
	public void setPrimaryKey(String primaryKey) {
		_toko.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_toko.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the status_toko of this toko.
	*
	* @param status_toko the status_toko of this toko
	*/
	@Override
	public void setStatus_toko(long status_toko) {
		_toko.setStatus_toko(status_toko);
	}

	/**
	* Sets the tanggal_pendaftaran of this toko.
	*
	* @param tanggal_pendaftaran the tanggal_pendaftaran of this toko
	*/
	@Override
	public void setTanggal_pendaftaran(Date tanggal_pendaftaran) {
		_toko.setTanggal_pendaftaran(tanggal_pendaftaran);
	}

	/**
	* Sets the uuid of this toko.
	*
	* @param uuid the uuid of this toko
	*/
	@Override
	public void setUuid(String uuid) {
		_toko.setUuid(uuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Toko> toCacheModel() {
		return _toko.toCacheModel();
	}

	@Override
	public Toko toEscapedModel() {
		return new TokoWrapper(_toko.toEscapedModel());
	}

	@Override
	public String toString() {
		return _toko.toString();
	}

	@Override
	public Toko toUnescapedModel() {
		return new TokoWrapper(_toko.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _toko.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TokoWrapper)) {
			return false;
		}

		TokoWrapper tokoWrapper = (TokoWrapper)obj;

		if (Objects.equals(_toko, tokoWrapper._toko)) {
			return true;
		}

		return false;
	}

	@Override
	public Toko getWrappedModel() {
		return _toko;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _toko.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _toko.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_toko.resetOriginalValues();
	}

	private final Toko _toko;
}