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
 * This class is a wrapper for {@link Alamat}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Alamat
 * @generated
 */
@ProviderType
public class AlamatWrapper implements Alamat, ModelWrapper<Alamat> {
	public AlamatWrapper(Alamat alamat) {
		_alamat = alamat;
	}

	@Override
	public Class<?> getModelClass() {
		return Alamat.class;
	}

	@Override
	public String getModelClassName() {
		return Alamat.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("id_alamat", getId_alamat());
		attributes.put("id_user", getId_user());
		attributes.put("nama_alamat", getNama_alamat());
		attributes.put("nama_penerima", getNama_penerima());
		attributes.put("nomor_handphone", getNomor_handphone());
		attributes.put("alamat_lengkap", getAlamat_lengkap());
		attributes.put("kode_pos", getKode_pos());
		attributes.put("kota", getKota());
		attributes.put("provinsi", getProvinsi());
		attributes.put("region", getRegion());
		attributes.put("status", isStatus());
		attributes.put("created_date", getCreated_date());
		attributes.put("modified_date", getModified_date());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		String id_alamat = (String)attributes.get("id_alamat");

		if (id_alamat != null) {
			setId_alamat(id_alamat);
		}

		Long id_user = (Long)attributes.get("id_user");

		if (id_user != null) {
			setId_user(id_user);
		}

		String nama_alamat = (String)attributes.get("nama_alamat");

		if (nama_alamat != null) {
			setNama_alamat(nama_alamat);
		}

		String nama_penerima = (String)attributes.get("nama_penerima");

		if (nama_penerima != null) {
			setNama_penerima(nama_penerima);
		}

		Long nomor_handphone = (Long)attributes.get("nomor_handphone");

		if (nomor_handphone != null) {
			setNomor_handphone(nomor_handphone);
		}

		String alamat_lengkap = (String)attributes.get("alamat_lengkap");

		if (alamat_lengkap != null) {
			setAlamat_lengkap(alamat_lengkap);
		}

		Long kode_pos = (Long)attributes.get("kode_pos");

		if (kode_pos != null) {
			setKode_pos(kode_pos);
		}

		String kota = (String)attributes.get("kota");

		if (kota != null) {
			setKota(kota);
		}

		String provinsi = (String)attributes.get("provinsi");

		if (provinsi != null) {
			setProvinsi(provinsi);
		}

		String region = (String)attributes.get("region");

		if (region != null) {
			setRegion(region);
		}

		Boolean status = (Boolean)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Date created_date = (Date)attributes.get("created_date");

		if (created_date != null) {
			setCreated_date(created_date);
		}

		Date modified_date = (Date)attributes.get("modified_date");

		if (modified_date != null) {
			setModified_date(modified_date);
		}
	}

	@Override
	public Object clone() {
		return new AlamatWrapper((Alamat)_alamat.clone());
	}

	@Override
	public int compareTo(Alamat alamat) {
		return _alamat.compareTo(alamat);
	}

	/**
	* Returns the alamat_lengkap of this alamat.
	*
	* @return the alamat_lengkap of this alamat
	*/
	@Override
	public String getAlamat_lengkap() {
		return _alamat.getAlamat_lengkap();
	}

	/**
	* Returns the created_date of this alamat.
	*
	* @return the created_date of this alamat
	*/
	@Override
	public Date getCreated_date() {
		return _alamat.getCreated_date();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _alamat.getExpandoBridge();
	}

	/**
	* Returns the id_alamat of this alamat.
	*
	* @return the id_alamat of this alamat
	*/
	@Override
	public String getId_alamat() {
		return _alamat.getId_alamat();
	}

	/**
	* Returns the id_user of this alamat.
	*
	* @return the id_user of this alamat
	*/
	@Override
	public long getId_user() {
		return _alamat.getId_user();
	}

	/**
	* Returns the kode_pos of this alamat.
	*
	* @return the kode_pos of this alamat
	*/
	@Override
	public long getKode_pos() {
		return _alamat.getKode_pos();
	}

	/**
	* Returns the kota of this alamat.
	*
	* @return the kota of this alamat
	*/
	@Override
	public String getKota() {
		return _alamat.getKota();
	}

	/**
	* Returns the modified_date of this alamat.
	*
	* @return the modified_date of this alamat
	*/
	@Override
	public Date getModified_date() {
		return _alamat.getModified_date();
	}

	/**
	* Returns the nama_alamat of this alamat.
	*
	* @return the nama_alamat of this alamat
	*/
	@Override
	public String getNama_alamat() {
		return _alamat.getNama_alamat();
	}

	/**
	* Returns the nama_penerima of this alamat.
	*
	* @return the nama_penerima of this alamat
	*/
	@Override
	public String getNama_penerima() {
		return _alamat.getNama_penerima();
	}

	/**
	* Returns the nomor_handphone of this alamat.
	*
	* @return the nomor_handphone of this alamat
	*/
	@Override
	public long getNomor_handphone() {
		return _alamat.getNomor_handphone();
	}

	/**
	* Returns the primary key of this alamat.
	*
	* @return the primary key of this alamat
	*/
	@Override
	public String getPrimaryKey() {
		return _alamat.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _alamat.getPrimaryKeyObj();
	}

	/**
	* Returns the provinsi of this alamat.
	*
	* @return the provinsi of this alamat
	*/
	@Override
	public String getProvinsi() {
		return _alamat.getProvinsi();
	}

	/**
	* Returns the region of this alamat.
	*
	* @return the region of this alamat
	*/
	@Override
	public String getRegion() {
		return _alamat.getRegion();
	}

	/**
	* Returns the status of this alamat.
	*
	* @return the status of this alamat
	*/
	@Override
	public boolean getStatus() {
		return _alamat.getStatus();
	}

	/**
	* Returns the uuid of this alamat.
	*
	* @return the uuid of this alamat
	*/
	@Override
	public String getUuid() {
		return _alamat.getUuid();
	}

	@Override
	public int hashCode() {
		return _alamat.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _alamat.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _alamat.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _alamat.isNew();
	}

	/**
	* Returns <code>true</code> if this alamat is status.
	*
	* @return <code>true</code> if this alamat is status; <code>false</code> otherwise
	*/
	@Override
	public boolean isStatus() {
		return _alamat.isStatus();
	}

	@Override
	public void persist() {
		_alamat.persist();
	}

	/**
	* Sets the alamat_lengkap of this alamat.
	*
	* @param alamat_lengkap the alamat_lengkap of this alamat
	*/
	@Override
	public void setAlamat_lengkap(String alamat_lengkap) {
		_alamat.setAlamat_lengkap(alamat_lengkap);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_alamat.setCachedModel(cachedModel);
	}

	/**
	* Sets the created_date of this alamat.
	*
	* @param created_date the created_date of this alamat
	*/
	@Override
	public void setCreated_date(Date created_date) {
		_alamat.setCreated_date(created_date);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_alamat.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_alamat.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_alamat.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the id_alamat of this alamat.
	*
	* @param id_alamat the id_alamat of this alamat
	*/
	@Override
	public void setId_alamat(String id_alamat) {
		_alamat.setId_alamat(id_alamat);
	}

	/**
	* Sets the id_user of this alamat.
	*
	* @param id_user the id_user of this alamat
	*/
	@Override
	public void setId_user(long id_user) {
		_alamat.setId_user(id_user);
	}

	/**
	* Sets the kode_pos of this alamat.
	*
	* @param kode_pos the kode_pos of this alamat
	*/
	@Override
	public void setKode_pos(long kode_pos) {
		_alamat.setKode_pos(kode_pos);
	}

	/**
	* Sets the kota of this alamat.
	*
	* @param kota the kota of this alamat
	*/
	@Override
	public void setKota(String kota) {
		_alamat.setKota(kota);
	}

	/**
	* Sets the modified_date of this alamat.
	*
	* @param modified_date the modified_date of this alamat
	*/
	@Override
	public void setModified_date(Date modified_date) {
		_alamat.setModified_date(modified_date);
	}

	/**
	* Sets the nama_alamat of this alamat.
	*
	* @param nama_alamat the nama_alamat of this alamat
	*/
	@Override
	public void setNama_alamat(String nama_alamat) {
		_alamat.setNama_alamat(nama_alamat);
	}

	/**
	* Sets the nama_penerima of this alamat.
	*
	* @param nama_penerima the nama_penerima of this alamat
	*/
	@Override
	public void setNama_penerima(String nama_penerima) {
		_alamat.setNama_penerima(nama_penerima);
	}

	@Override
	public void setNew(boolean n) {
		_alamat.setNew(n);
	}

	/**
	* Sets the nomor_handphone of this alamat.
	*
	* @param nomor_handphone the nomor_handphone of this alamat
	*/
	@Override
	public void setNomor_handphone(long nomor_handphone) {
		_alamat.setNomor_handphone(nomor_handphone);
	}

	/**
	* Sets the primary key of this alamat.
	*
	* @param primaryKey the primary key of this alamat
	*/
	@Override
	public void setPrimaryKey(String primaryKey) {
		_alamat.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_alamat.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the provinsi of this alamat.
	*
	* @param provinsi the provinsi of this alamat
	*/
	@Override
	public void setProvinsi(String provinsi) {
		_alamat.setProvinsi(provinsi);
	}

	/**
	* Sets the region of this alamat.
	*
	* @param region the region of this alamat
	*/
	@Override
	public void setRegion(String region) {
		_alamat.setRegion(region);
	}

	/**
	* Sets whether this alamat is status.
	*
	* @param status the status of this alamat
	*/
	@Override
	public void setStatus(boolean status) {
		_alamat.setStatus(status);
	}

	/**
	* Sets the uuid of this alamat.
	*
	* @param uuid the uuid of this alamat
	*/
	@Override
	public void setUuid(String uuid) {
		_alamat.setUuid(uuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Alamat> toCacheModel() {
		return _alamat.toCacheModel();
	}

	@Override
	public Alamat toEscapedModel() {
		return new AlamatWrapper(_alamat.toEscapedModel());
	}

	@Override
	public String toString() {
		return _alamat.toString();
	}

	@Override
	public Alamat toUnescapedModel() {
		return new AlamatWrapper(_alamat.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _alamat.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AlamatWrapper)) {
			return false;
		}

		AlamatWrapper alamatWrapper = (AlamatWrapper)obj;

		if (Objects.equals(_alamat, alamatWrapper._alamat)) {
			return true;
		}

		return false;
	}

	@Override
	public Alamat getWrappedModel() {
		return _alamat;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _alamat.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _alamat.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_alamat.resetOriginalValues();
	}

	private final Alamat _alamat;
}