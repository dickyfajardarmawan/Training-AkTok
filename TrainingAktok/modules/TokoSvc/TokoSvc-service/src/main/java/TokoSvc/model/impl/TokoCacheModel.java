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

package TokoSvc.model.impl;

import TokoSvc.model.Toko;

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
 * The cache model class for representing Toko in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Toko
 * @generated
 */
@ProviderType
public class TokoCacheModel implements CacheModel<Toko>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TokoCacheModel)) {
			return false;
		}

		TokoCacheModel tokoCacheModel = (TokoCacheModel)obj;

		if (id_toko.equals(tokoCacheModel.id_toko)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, id_toko);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", id_toko=");
		sb.append(id_toko);
		sb.append(", nama_toko=");
		sb.append(nama_toko);
		sb.append(", nama_depan_pemilik=");
		sb.append(nama_depan_pemilik);
		sb.append(", nama_belakang_pemilik=");
		sb.append(nama_belakang_pemilik);
		sb.append(", nomor_hp=");
		sb.append(nomor_hp);
		sb.append(", status_toko=");
		sb.append(status_toko);
		sb.append(", tanggal_pendaftaran=");
		sb.append(tanggal_pendaftaran);
		sb.append(", password=");
		sb.append(password);
		sb.append(", pin=");
		sb.append(pin);
		sb.append(", id_distributor=");
		sb.append(id_distributor);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Toko toEntityModel() {
		TokoImpl tokoImpl = new TokoImpl();

		if (uuid == null) {
			tokoImpl.setUuid("");
		}
		else {
			tokoImpl.setUuid(uuid);
		}

		if (id_toko == null) {
			tokoImpl.setId_toko("");
		}
		else {
			tokoImpl.setId_toko(id_toko);
		}

		if (nama_toko == null) {
			tokoImpl.setNama_toko("");
		}
		else {
			tokoImpl.setNama_toko(nama_toko);
		}

		if (nama_depan_pemilik == null) {
			tokoImpl.setNama_depan_pemilik("");
		}
		else {
			tokoImpl.setNama_depan_pemilik(nama_depan_pemilik);
		}

		if (nama_belakang_pemilik == null) {
			tokoImpl.setNama_belakang_pemilik("");
		}
		else {
			tokoImpl.setNama_belakang_pemilik(nama_belakang_pemilik);
		}

		tokoImpl.setNomor_hp(nomor_hp);
		tokoImpl.setStatus_toko(status_toko);

		if (tanggal_pendaftaran == Long.MIN_VALUE) {
			tokoImpl.setTanggal_pendaftaran(null);
		}
		else {
			tokoImpl.setTanggal_pendaftaran(new Date(tanggal_pendaftaran));
		}

		if (password == null) {
			tokoImpl.setPassword("");
		}
		else {
			tokoImpl.setPassword(password);
		}

		tokoImpl.setPin(pin);

		if (id_distributor == null) {
			tokoImpl.setId_distributor("");
		}
		else {
			tokoImpl.setId_distributor(id_distributor);
		}

		tokoImpl.resetOriginalValues();

		return tokoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();
		id_toko = objectInput.readUTF();
		nama_toko = objectInput.readUTF();
		nama_depan_pemilik = objectInput.readUTF();
		nama_belakang_pemilik = objectInput.readUTF();

		nomor_hp = objectInput.readLong();

		status_toko = objectInput.readLong();
		tanggal_pendaftaran = objectInput.readLong();
		password = objectInput.readUTF();

		pin = objectInput.readLong();
		id_distributor = objectInput.readUTF();
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

		if (id_toko == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(id_toko);
		}

		if (nama_toko == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nama_toko);
		}

		if (nama_depan_pemilik == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nama_depan_pemilik);
		}

		if (nama_belakang_pemilik == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nama_belakang_pemilik);
		}

		objectOutput.writeLong(nomor_hp);

		objectOutput.writeLong(status_toko);
		objectOutput.writeLong(tanggal_pendaftaran);

		if (password == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(password);
		}

		objectOutput.writeLong(pin);

		if (id_distributor == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(id_distributor);
		}
	}

	public String uuid;
	public String id_toko;
	public String nama_toko;
	public String nama_depan_pemilik;
	public String nama_belakang_pemilik;
	public long nomor_hp;
	public long status_toko;
	public long tanggal_pendaftaran;
	public String password;
	public long pin;
	public String id_distributor;
}