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

import ShoppingCartSvc.model.Cart;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Cart in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Cart
 * @generated
 */
@ProviderType
public class CartCacheModel implements CacheModel<Cart>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CartCacheModel)) {
			return false;
		}

		CartCacheModel cartCacheModel = (CartCacheModel)obj;

		if (id_cart.equals(cartCacheModel.id_cart)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, id_cart);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", id_cart=");
		sb.append(id_cart);
		sb.append(", id_produk=");
		sb.append(id_produk);
		sb.append(", id_user=");
		sb.append(id_user);
		sb.append(", jumlah_produk=");
		sb.append(jumlah_produk);
		sb.append(", sub_total=");
		sb.append(sub_total);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Cart toEntityModel() {
		CartImpl cartImpl = new CartImpl();

		if (uuid == null) {
			cartImpl.setUuid("");
		}
		else {
			cartImpl.setUuid(uuid);
		}

		if (id_cart == null) {
			cartImpl.setId_cart("");
		}
		else {
			cartImpl.setId_cart(id_cart);
		}

		if (id_produk == null) {
			cartImpl.setId_produk("");
		}
		else {
			cartImpl.setId_produk(id_produk);
		}

		cartImpl.setId_user(id_user);
		cartImpl.setJumlah_produk(jumlah_produk);
		cartImpl.setSub_total(sub_total);

		cartImpl.resetOriginalValues();

		return cartImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();
		id_cart = objectInput.readUTF();
		id_produk = objectInput.readUTF();

		id_user = objectInput.readLong();

		jumlah_produk = objectInput.readLong();

		sub_total = objectInput.readLong();
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

		if (id_cart == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(id_cart);
		}

		if (id_produk == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(id_produk);
		}

		objectOutput.writeLong(id_user);

		objectOutput.writeLong(jumlah_produk);

		objectOutput.writeLong(sub_total);
	}

	public String uuid;
	public String id_cart;
	public String id_produk;
	public long id_user;
	public long jumlah_produk;
	public long sub_total;
}