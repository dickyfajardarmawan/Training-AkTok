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

package AlamatSvc.model.impl;

import AlamatSvc.model.Alamat;
import AlamatSvc.model.AlamatModel;
import AlamatSvc.model.AlamatSoap;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Alamat service. Represents a row in the &quot;master_Alamat&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link AlamatModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AlamatImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AlamatImpl
 * @see Alamat
 * @see AlamatModel
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class AlamatModelImpl extends BaseModelImpl<Alamat>
	implements AlamatModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a alamat model instance should use the {@link Alamat} interface instead.
	 */
	public static final String TABLE_NAME = "master_Alamat";
	public static final Object[][] TABLE_COLUMNS = {
			{ "uuid_", Types.VARCHAR },
			{ "id_alamat", Types.VARCHAR },
			{ "id_user", Types.BIGINT },
			{ "nama_alamat", Types.VARCHAR },
			{ "nama_penerima", Types.VARCHAR },
			{ "nomor_handphone", Types.BIGINT },
			{ "alamat_lengkap", Types.VARCHAR },
			{ "kode_pos", Types.BIGINT },
			{ "kota", Types.VARCHAR },
			{ "provinsi", Types.VARCHAR },
			{ "region", Types.VARCHAR },
			{ "status", Types.BOOLEAN },
			{ "created_date", Types.TIMESTAMP },
			{ "modified_date", Types.TIMESTAMP }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("id_alamat", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("id_user", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("nama_alamat", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("nama_penerima", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("nomor_handphone", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("alamat_lengkap", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("kode_pos", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("kota", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("provinsi", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("region", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("status", Types.BOOLEAN);
		TABLE_COLUMNS_MAP.put("created_date", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modified_date", Types.TIMESTAMP);
	}

	public static final String TABLE_SQL_CREATE = "create table master_Alamat (uuid_ VARCHAR(75) null,id_alamat VARCHAR(75) not null primary key,id_user LONG,nama_alamat VARCHAR(75) null,nama_penerima VARCHAR(75) null,nomor_handphone LONG,alamat_lengkap VARCHAR(75) null,kode_pos LONG,kota VARCHAR(75) null,provinsi VARCHAR(75) null,region VARCHAR(75) null,status BOOLEAN,created_date DATE null,modified_date DATE null)";
	public static final String TABLE_SQL_DROP = "drop table master_Alamat";
	public static final String ORDER_BY_JPQL = " ORDER BY alamat.id_alamat ASC";
	public static final String ORDER_BY_SQL = " ORDER BY master_Alamat.id_alamat ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(AlamatSvc.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.AlamatSvc.model.Alamat"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(AlamatSvc.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.AlamatSvc.model.Alamat"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(AlamatSvc.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.AlamatSvc.model.Alamat"),
			true);
	public static final long UUID_COLUMN_BITMASK = 1L;
	public static final long ID_ALAMAT_COLUMN_BITMASK = 2L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Alamat toModel(AlamatSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Alamat model = new AlamatImpl();

		model.setUuid(soapModel.getUuid());
		model.setId_alamat(soapModel.getId_alamat());
		model.setId_user(soapModel.getId_user());
		model.setNama_alamat(soapModel.getNama_alamat());
		model.setNama_penerima(soapModel.getNama_penerima());
		model.setNomor_handphone(soapModel.getNomor_handphone());
		model.setAlamat_lengkap(soapModel.getAlamat_lengkap());
		model.setKode_pos(soapModel.getKode_pos());
		model.setKota(soapModel.getKota());
		model.setProvinsi(soapModel.getProvinsi());
		model.setRegion(soapModel.getRegion());
		model.setStatus(soapModel.isStatus());
		model.setCreated_date(soapModel.getCreated_date());
		model.setModified_date(soapModel.getModified_date());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Alamat> toModels(AlamatSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Alamat> models = new ArrayList<Alamat>(soapModels.length);

		for (AlamatSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(AlamatSvc.service.util.ServiceProps.get(
				"lock.expiration.time.AlamatSvc.model.Alamat"));

	public AlamatModelImpl() {
	}

	@Override
	public String getPrimaryKey() {
		return _id_alamat;
	}

	@Override
	public void setPrimaryKey(String primaryKey) {
		setId_alamat(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id_alamat;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((String)primaryKeyObj);
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

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

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

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return "";
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	@JSON
	@Override
	public String getId_alamat() {
		if (_id_alamat == null) {
			return "";
		}
		else {
			return _id_alamat;
		}
	}

	@Override
	public void setId_alamat(String id_alamat) {
		_id_alamat = id_alamat;
	}

	@JSON
	@Override
	public long getId_user() {
		return _id_user;
	}

	@Override
	public void setId_user(long id_user) {
		_id_user = id_user;
	}

	@JSON
	@Override
	public String getNama_alamat() {
		if (_nama_alamat == null) {
			return "";
		}
		else {
			return _nama_alamat;
		}
	}

	@Override
	public void setNama_alamat(String nama_alamat) {
		_nama_alamat = nama_alamat;
	}

	@JSON
	@Override
	public String getNama_penerima() {
		if (_nama_penerima == null) {
			return "";
		}
		else {
			return _nama_penerima;
		}
	}

	@Override
	public void setNama_penerima(String nama_penerima) {
		_nama_penerima = nama_penerima;
	}

	@JSON
	@Override
	public long getNomor_handphone() {
		return _nomor_handphone;
	}

	@Override
	public void setNomor_handphone(long nomor_handphone) {
		_nomor_handphone = nomor_handphone;
	}

	@JSON
	@Override
	public String getAlamat_lengkap() {
		if (_alamat_lengkap == null) {
			return "";
		}
		else {
			return _alamat_lengkap;
		}
	}

	@Override
	public void setAlamat_lengkap(String alamat_lengkap) {
		_alamat_lengkap = alamat_lengkap;
	}

	@JSON
	@Override
	public long getKode_pos() {
		return _kode_pos;
	}

	@Override
	public void setKode_pos(long kode_pos) {
		_kode_pos = kode_pos;
	}

	@JSON
	@Override
	public String getKota() {
		if (_kota == null) {
			return "";
		}
		else {
			return _kota;
		}
	}

	@Override
	public void setKota(String kota) {
		_kota = kota;
	}

	@JSON
	@Override
	public String getProvinsi() {
		if (_provinsi == null) {
			return "";
		}
		else {
			return _provinsi;
		}
	}

	@Override
	public void setProvinsi(String provinsi) {
		_provinsi = provinsi;
	}

	@JSON
	@Override
	public String getRegion() {
		if (_region == null) {
			return "";
		}
		else {
			return _region;
		}
	}

	@Override
	public void setRegion(String region) {
		_region = region;
	}

	@JSON
	@Override
	public boolean getStatus() {
		return _status;
	}

	@JSON
	@Override
	public boolean isStatus() {
		return _status;
	}

	@Override
	public void setStatus(boolean status) {
		_status = status;
	}

	@JSON
	@Override
	public Date getCreated_date() {
		return _created_date;
	}

	@Override
	public void setCreated_date(Date created_date) {
		_created_date = created_date;
	}

	@JSON
	@Override
	public Date getModified_date() {
		return _modified_date;
	}

	@Override
	public void setModified_date(Date modified_date) {
		_modified_date = modified_date;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public Alamat toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Alamat)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		AlamatImpl alamatImpl = new AlamatImpl();

		alamatImpl.setUuid(getUuid());
		alamatImpl.setId_alamat(getId_alamat());
		alamatImpl.setId_user(getId_user());
		alamatImpl.setNama_alamat(getNama_alamat());
		alamatImpl.setNama_penerima(getNama_penerima());
		alamatImpl.setNomor_handphone(getNomor_handphone());
		alamatImpl.setAlamat_lengkap(getAlamat_lengkap());
		alamatImpl.setKode_pos(getKode_pos());
		alamatImpl.setKota(getKota());
		alamatImpl.setProvinsi(getProvinsi());
		alamatImpl.setRegion(getRegion());
		alamatImpl.setStatus(isStatus());
		alamatImpl.setCreated_date(getCreated_date());
		alamatImpl.setModified_date(getModified_date());

		alamatImpl.resetOriginalValues();

		return alamatImpl;
	}

	@Override
	public int compareTo(Alamat alamat) {
		String primaryKey = alamat.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Alamat)) {
			return false;
		}

		Alamat alamat = (Alamat)obj;

		String primaryKey = alamat.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey().hashCode();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		AlamatModelImpl alamatModelImpl = this;

		alamatModelImpl._originalUuid = alamatModelImpl._uuid;

		alamatModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Alamat> toCacheModel() {
		AlamatCacheModel alamatCacheModel = new AlamatCacheModel();

		alamatCacheModel.uuid = getUuid();

		String uuid = alamatCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			alamatCacheModel.uuid = null;
		}

		alamatCacheModel.id_alamat = getId_alamat();

		String id_alamat = alamatCacheModel.id_alamat;

		if ((id_alamat != null) && (id_alamat.length() == 0)) {
			alamatCacheModel.id_alamat = null;
		}

		alamatCacheModel.id_user = getId_user();

		alamatCacheModel.nama_alamat = getNama_alamat();

		String nama_alamat = alamatCacheModel.nama_alamat;

		if ((nama_alamat != null) && (nama_alamat.length() == 0)) {
			alamatCacheModel.nama_alamat = null;
		}

		alamatCacheModel.nama_penerima = getNama_penerima();

		String nama_penerima = alamatCacheModel.nama_penerima;

		if ((nama_penerima != null) && (nama_penerima.length() == 0)) {
			alamatCacheModel.nama_penerima = null;
		}

		alamatCacheModel.nomor_handphone = getNomor_handphone();

		alamatCacheModel.alamat_lengkap = getAlamat_lengkap();

		String alamat_lengkap = alamatCacheModel.alamat_lengkap;

		if ((alamat_lengkap != null) && (alamat_lengkap.length() == 0)) {
			alamatCacheModel.alamat_lengkap = null;
		}

		alamatCacheModel.kode_pos = getKode_pos();

		alamatCacheModel.kota = getKota();

		String kota = alamatCacheModel.kota;

		if ((kota != null) && (kota.length() == 0)) {
			alamatCacheModel.kota = null;
		}

		alamatCacheModel.provinsi = getProvinsi();

		String provinsi = alamatCacheModel.provinsi;

		if ((provinsi != null) && (provinsi.length() == 0)) {
			alamatCacheModel.provinsi = null;
		}

		alamatCacheModel.region = getRegion();

		String region = alamatCacheModel.region;

		if ((region != null) && (region.length() == 0)) {
			alamatCacheModel.region = null;
		}

		alamatCacheModel.status = isStatus();

		Date created_date = getCreated_date();

		if (created_date != null) {
			alamatCacheModel.created_date = created_date.getTime();
		}
		else {
			alamatCacheModel.created_date = Long.MIN_VALUE;
		}

		Date modified_date = getModified_date();

		if (modified_date != null) {
			alamatCacheModel.modified_date = modified_date.getTime();
		}
		else {
			alamatCacheModel.modified_date = Long.MIN_VALUE;
		}

		return alamatCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", id_alamat=");
		sb.append(getId_alamat());
		sb.append(", id_user=");
		sb.append(getId_user());
		sb.append(", nama_alamat=");
		sb.append(getNama_alamat());
		sb.append(", nama_penerima=");
		sb.append(getNama_penerima());
		sb.append(", nomor_handphone=");
		sb.append(getNomor_handphone());
		sb.append(", alamat_lengkap=");
		sb.append(getAlamat_lengkap());
		sb.append(", kode_pos=");
		sb.append(getKode_pos());
		sb.append(", kota=");
		sb.append(getKota());
		sb.append(", provinsi=");
		sb.append(getProvinsi());
		sb.append(", region=");
		sb.append(getRegion());
		sb.append(", status=");
		sb.append(isStatus());
		sb.append(", created_date=");
		sb.append(getCreated_date());
		sb.append(", modified_date=");
		sb.append(getModified_date());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(46);

		sb.append("<model><model-name>");
		sb.append("AlamatSvc.model.Alamat");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>id_alamat</column-name><column-value><![CDATA[");
		sb.append(getId_alamat());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>id_user</column-name><column-value><![CDATA[");
		sb.append(getId_user());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nama_alamat</column-name><column-value><![CDATA[");
		sb.append(getNama_alamat());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nama_penerima</column-name><column-value><![CDATA[");
		sb.append(getNama_penerima());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nomor_handphone</column-name><column-value><![CDATA[");
		sb.append(getNomor_handphone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>alamat_lengkap</column-name><column-value><![CDATA[");
		sb.append(getAlamat_lengkap());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>kode_pos</column-name><column-value><![CDATA[");
		sb.append(getKode_pos());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>kota</column-name><column-value><![CDATA[");
		sb.append(getKota());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>provinsi</column-name><column-value><![CDATA[");
		sb.append(getProvinsi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>region</column-name><column-value><![CDATA[");
		sb.append(getRegion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(isStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>created_date</column-name><column-value><![CDATA[");
		sb.append(getCreated_date());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modified_date</column-name><column-value><![CDATA[");
		sb.append(getModified_date());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = Alamat.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			Alamat.class, ModelWrapper.class
		};
	private String _uuid;
	private String _originalUuid;
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
	private long _columnBitmask;
	private Alamat _escapedModel;
}