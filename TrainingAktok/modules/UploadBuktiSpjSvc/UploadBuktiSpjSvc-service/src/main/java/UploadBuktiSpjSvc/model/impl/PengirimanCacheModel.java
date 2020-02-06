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

package UploadBuktiSpjSvc.model.impl;

import UploadBuktiSpjSvc.model.Pengiriman;

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
 * The cache model class for representing Pengiriman in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Pengiriman
 * @generated
 */
@ProviderType
public class PengirimanCacheModel implements CacheModel<Pengiriman>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PengirimanCacheModel)) {
			return false;
		}

		PengirimanCacheModel pengirimanCacheModel = (PengirimanCacheModel)obj;

		if (id_pengiriman.equals(pengirimanCacheModel.id_pengiriman)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, id_pengiriman);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", id_pengiriman=");
		sb.append(id_pengiriman);
		sb.append(", tanggal_pengiriman=");
		sb.append(tanggal_pengiriman);
		sb.append(", status_pengiriman=");
		sb.append(status_pengiriman);
		sb.append(", tanggal_penerimaan=");
		sb.append(tanggal_penerimaan);
		sb.append(", bukti_pengiriman=");
		sb.append(bukti_pengiriman);
		sb.append(", create_date=");
		sb.append(create_date);
		sb.append(", modified_date=");
		sb.append(modified_date);
		sb.append(", id_order=");
		sb.append(id_order);
		sb.append(", id_toko=");
		sb.append(id_toko);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Pengiriman toEntityModel() {
		PengirimanImpl pengirimanImpl = new PengirimanImpl();

		if (uuid == null) {
			pengirimanImpl.setUuid("");
		}
		else {
			pengirimanImpl.setUuid(uuid);
		}

		if (id_pengiriman == null) {
			pengirimanImpl.setId_pengiriman("");
		}
		else {
			pengirimanImpl.setId_pengiriman(id_pengiriman);
		}

		if (tanggal_pengiriman == Long.MIN_VALUE) {
			pengirimanImpl.setTanggal_pengiriman(null);
		}
		else {
			pengirimanImpl.setTanggal_pengiriman(new Date(tanggal_pengiriman));
		}

		if (status_pengiriman == null) {
			pengirimanImpl.setStatus_pengiriman("");
		}
		else {
			pengirimanImpl.setStatus_pengiriman(status_pengiriman);
		}

		if (tanggal_penerimaan == Long.MIN_VALUE) {
			pengirimanImpl.setTanggal_penerimaan(null);
		}
		else {
			pengirimanImpl.setTanggal_penerimaan(new Date(tanggal_penerimaan));
		}

		if (bukti_pengiriman == null) {
			pengirimanImpl.setBukti_pengiriman("");
		}
		else {
			pengirimanImpl.setBukti_pengiriman(bukti_pengiriman);
		}

		if (create_date == Long.MIN_VALUE) {
			pengirimanImpl.setCreate_date(null);
		}
		else {
			pengirimanImpl.setCreate_date(new Date(create_date));
		}

		if (modified_date == Long.MIN_VALUE) {
			pengirimanImpl.setModified_date(null);
		}
		else {
			pengirimanImpl.setModified_date(new Date(modified_date));
		}

		if (id_order == null) {
			pengirimanImpl.setId_order("");
		}
		else {
			pengirimanImpl.setId_order(id_order);
		}

		if (id_toko == null) {
			pengirimanImpl.setId_toko("");
		}
		else {
			pengirimanImpl.setId_toko(id_toko);
		}

		pengirimanImpl.resetOriginalValues();

		return pengirimanImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();
		id_pengiriman = objectInput.readUTF();
		tanggal_pengiriman = objectInput.readLong();
		status_pengiriman = objectInput.readUTF();
		tanggal_penerimaan = objectInput.readLong();
		bukti_pengiriman = objectInput.readUTF();
		create_date = objectInput.readLong();
		modified_date = objectInput.readLong();
		id_order = objectInput.readUTF();
		id_toko = objectInput.readUTF();
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

		if (id_pengiriman == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(id_pengiriman);
		}

		objectOutput.writeLong(tanggal_pengiriman);

		if (status_pengiriman == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(status_pengiriman);
		}

		objectOutput.writeLong(tanggal_penerimaan);

		if (bukti_pengiriman == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bukti_pengiriman);
		}

		objectOutput.writeLong(create_date);
		objectOutput.writeLong(modified_date);

		if (id_order == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(id_order);
		}

		if (id_toko == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(id_toko);
		}
	}

	public String uuid;
	public String id_pengiriman;
	public long tanggal_pengiriman;
	public String status_pengiriman;
	public long tanggal_penerimaan;
	public String bukti_pengiriman;
	public long create_date;
	public long modified_date;
	public String id_order;
	public String id_toko;
}