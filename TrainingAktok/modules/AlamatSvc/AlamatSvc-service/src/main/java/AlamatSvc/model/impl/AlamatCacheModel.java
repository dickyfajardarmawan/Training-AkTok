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

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Alamat in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Alamat
 * @generated
 */
@ProviderType
public class AlamatCacheModel implements CacheModel<Alamat>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AlamatCacheModel)) {
			return false;
		}

		AlamatCacheModel alamatCacheModel = (AlamatCacheModel)obj;

		if (id_alamat.equals(alamatCacheModel.id_alamat)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, id_alamat);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", id_alamat=");
		sb.append(id_alamat);
		sb.append(", id_user=");
		sb.append(id_user);
		sb.append(", nama_alamat=");
		sb.append(nama_alamat);
		sb.append(", nama_penerima=");
		sb.append(nama_penerima);
		sb.append(", nomor_handphone=");
		sb.append(nomor_handphone);
		sb.append(", alamat_lengkap=");
		sb.append(alamat_lengkap);
		sb.append(", kode_pos=");
		sb.append(kode_pos);
		sb.append(", kota=");
		sb.append(kota);
		sb.append(", provinsi=");
		sb.append(provinsi);
		sb.append(", region=");
		sb.append(region);
		sb.append(", status=");
		sb.append(status);
		sb.append(", created_date=");
		sb.append(created_date);
		sb.append(", modified_date=");
		sb.append(modified_date);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Alamat toEntityModel() {
		AlamatImpl alamatImpl = new AlamatImpl();

		if (uuid == null) {
			alamatImpl.setUuid("");
		}
		else {
			alamatImpl.setUuid(uuid);
		}

		if (id_alamat == null) {
			alamatImpl.setId_alamat("");
		}
		else {
			alamatImpl.setId_alamat(id_alamat);
		}

		alamatImpl.setId_user(id_user);

		if (nama_alamat == null) {
			alamatImpl.setNama_alamat("");
		}
		else {
			alamatImpl.setNama_alamat(nama_alamat);
		}

		if (nama_penerima == null) {
			alamatImpl.setNama_penerima("");
		}
		else {
			alamatImpl.setNama_penerima(nama_penerima);
		}

		alamatImpl.setNomor_handphone(nomor_handphone);

		if (alamat_lengkap == null) {
			alamatImpl.setAlamat_lengkap("");
		}
		else {
			alamatImpl.setAlamat_lengkap(alamat_lengkap);
		}

		alamatImpl.setKode_pos(kode_pos);

		if (kota == null) {
			alamatImpl.setKota("");
		}
		else {
			alamatImpl.setKota(kota);
		}

		if (provinsi == null) {
			alamatImpl.setProvinsi("");
		}
		else {
			alamatImpl.setProvinsi(provinsi);
		}

		if (region == null) {
			alamatImpl.setRegion("");
		}
		else {
			alamatImpl.setRegion(region);
		}

		alamatImpl.setStatus(status);

		if (created_date == Long.MIN_VALUE) {
			alamatImpl.setCreated_date(null);
		}
		else {
			alamatImpl.setCreated_date(new Date(created_date));
		}

		if (modified_date == Long.MIN_VALUE) {
			alamatImpl.setModified_date(null);
		}
		else {
			alamatImpl.setModified_date(new Date(modified_date));
		}

		alamatImpl.resetOriginalValues();

		return alamatImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();
		id_alamat = objectInput.readUTF();

		id_user = objectInput.readLong();
		nama_alamat = objectInput.readUTF();
		nama_penerima = objectInput.readUTF();

		nomor_handphone = objectInput.readLong();
		alamat_lengkap = objectInput.readUTF();

		kode_pos = objectInput.readLong();
		kota = objectInput.readUTF();
		provinsi = objectInput.readUTF();
		region = objectInput.readUTF();

		status = objectInput.readBoolean();
		created_date = objectInput.readLong();
		modified_date = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		if (id_alamat == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(id_alamat);
		}

		objectOutput.writeLong(id_user);

		if (nama_alamat == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nama_alamat);
		}

		if (nama_penerima == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nama_penerima);
		}

		objectOutput.writeLong(nomor_handphone);

		if (alamat_lengkap == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(alamat_lengkap);
		}

		objectOutput.writeLong(kode_pos);

		if (kota == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(kota);
		}

		if (provinsi == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(provinsi);
		}

		if (region == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(region);
		}

		objectOutput.writeBoolean(status);
		objectOutput.writeLong(created_date);
		objectOutput.writeLong(modified_date);
	}

	public String uuid;
	public String id_alamat;
	public long id_user;
	public String nama_alamat;
	public String nama_penerima;
	public long nomor_handphone;
	public String alamat_lengkap;
	public long kode_pos;
	public String kota;
	public String provinsi;
	public String region;
	public boolean status;
	public long created_date;
	public long modified_date;
}