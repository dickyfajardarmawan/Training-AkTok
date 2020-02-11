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

package ShoppingCartSvc.model.impl;

import ShoppingCartSvc.model.Produk;

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
 * The cache model class for representing Produk in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Produk
 * @generated
 */
@ProviderType
public class ProdukCacheModel implements CacheModel<Produk>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ProdukCacheModel)) {
			return false;
		}

		ProdukCacheModel produkCacheModel = (ProdukCacheModel)obj;

		if (id_produk.equals(produkCacheModel.id_produk)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, id_produk);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", id_produk=");
		sb.append(id_produk);
		sb.append(", create_date=");
		sb.append(create_date);
		sb.append(", modified_date=");
		sb.append(modified_date);
		sb.append(", nama_produk=");
		sb.append(nama_produk);
		sb.append(", harga_produk=");
		sb.append(harga_produk);
		sb.append(", kelipatan_produk=");
		sb.append(kelipatan_produk);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Produk toEntityModel() {
		ProdukImpl produkImpl = new ProdukImpl();

		if (uuid == null) {
			produkImpl.setUuid("");
		}
		else {
			produkImpl.setUuid(uuid);
		}

		if (id_produk == null) {
			produkImpl.setId_produk("");
		}
		else {
			produkImpl.setId_produk(id_produk);
		}

		if (create_date == Long.MIN_VALUE) {
			produkImpl.setCreate_date(null);
		}
		else {
			produkImpl.setCreate_date(new Date(create_date));
		}

		if (modified_date == Long.MIN_VALUE) {
			produkImpl.setModified_date(null);
		}
		else {
			produkImpl.setModified_date(new Date(modified_date));
		}

		if (nama_produk == null) {
			produkImpl.setNama_produk("");
		}
		else {
			produkImpl.setNama_produk(nama_produk);
		}

		produkImpl.setHarga_produk(harga_produk);
		produkImpl.setKelipatan_produk(kelipatan_produk);

		produkImpl.resetOriginalValues();

		return produkImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();
		id_produk = objectInput.readUTF();
		create_date = objectInput.readLong();
		modified_date = objectInput.readLong();
		nama_produk = objectInput.readUTF();

		harga_produk = objectInput.readLong();

		kelipatan_produk = objectInput.readLong();
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

		if (id_produk == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(id_produk);
		}

		objectOutput.writeLong(create_date);
		objectOutput.writeLong(modified_date);

		if (nama_produk == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nama_produk);
		}

		objectOutput.writeLong(harga_produk);

		objectOutput.writeLong(kelipatan_produk);
	}

	public String uuid;
	public String id_produk;
	public long create_date;
	public long modified_date;
	public String nama_produk;
	public long harga_produk;
	public long kelipatan_produk;
}