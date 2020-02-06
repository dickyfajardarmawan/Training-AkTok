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

package OrderSvc.model.impl;

import OrderSvc.model.Order;

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
 * The cache model class for representing Order in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Order
 * @generated
 */
@ProviderType
public class OrderCacheModel implements CacheModel<Order>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof OrderCacheModel)) {
			return false;
		}

		OrderCacheModel orderCacheModel = (OrderCacheModel)obj;

		if (id_order.equals(orderCacheModel.id_order)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, id_order);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", id_order=");
		sb.append(id_order);
		sb.append(", total_harga=");
		sb.append(total_harga);
		sb.append(", tanggal_pemesanan=");
		sb.append(tanggal_pemesanan);
		sb.append(", tanggal_ekspetasi_pengiriman=");
		sb.append(tanggal_ekspetasi_pengiriman);
		sb.append(", status_order=");
		sb.append(status_order);
		sb.append(", status_pembayaran_keseluruhan=");
		sb.append(status_pembayaran_keseluruhan);
		sb.append(", status_pengiriman_keseluruhan=");
		sb.append(status_pengiriman_keseluruhan);
		sb.append(", catatan=");
		sb.append(catatan);
		sb.append(", create_date=");
		sb.append(create_date);
		sb.append(", modified_date=");
		sb.append(modified_date);
		sb.append(", id_metode_pembayaran=");
		sb.append(id_metode_pembayaran);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Order toEntityModel() {
		OrderImpl orderImpl = new OrderImpl();

		if (uuid == null) {
			orderImpl.setUuid("");
		}
		else {
			orderImpl.setUuid(uuid);
		}

		if (id_order == null) {
			orderImpl.setId_order("");
		}
		else {
			orderImpl.setId_order(id_order);
		}

		orderImpl.setTotal_harga(total_harga);

		if (tanggal_pemesanan == Long.MIN_VALUE) {
			orderImpl.setTanggal_pemesanan(null);
		}
		else {
			orderImpl.setTanggal_pemesanan(new Date(tanggal_pemesanan));
		}

		if (tanggal_ekspetasi_pengiriman == Long.MIN_VALUE) {
			orderImpl.setTanggal_ekspetasi_pengiriman(null);
		}
		else {
			orderImpl.setTanggal_ekspetasi_pengiriman(new Date(
					tanggal_ekspetasi_pengiriman));
		}

		if (status_order == null) {
			orderImpl.setStatus_order("");
		}
		else {
			orderImpl.setStatus_order(status_order);
		}

		if (status_pembayaran_keseluruhan == null) {
			orderImpl.setStatus_pembayaran_keseluruhan("");
		}
		else {
			orderImpl.setStatus_pembayaran_keseluruhan(status_pembayaran_keseluruhan);
		}

		if (status_pengiriman_keseluruhan == null) {
			orderImpl.setStatus_pengiriman_keseluruhan("");
		}
		else {
			orderImpl.setStatus_pengiriman_keseluruhan(status_pengiriman_keseluruhan);
		}

		if (catatan == null) {
			orderImpl.setCatatan("");
		}
		else {
			orderImpl.setCatatan(catatan);
		}

		if (create_date == Long.MIN_VALUE) {
			orderImpl.setCreate_date(null);
		}
		else {
			orderImpl.setCreate_date(new Date(create_date));
		}

		if (modified_date == Long.MIN_VALUE) {
			orderImpl.setModified_date(null);
		}
		else {
			orderImpl.setModified_date(new Date(modified_date));
		}

		if (id_metode_pembayaran == null) {
			orderImpl.setId_metode_pembayaran("");
		}
		else {
			orderImpl.setId_metode_pembayaran(id_metode_pembayaran);
		}

		orderImpl.resetOriginalValues();

		return orderImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();
		id_order = objectInput.readUTF();

		total_harga = objectInput.readLong();
		tanggal_pemesanan = objectInput.readLong();
		tanggal_ekspetasi_pengiriman = objectInput.readLong();
		status_order = objectInput.readUTF();
		status_pembayaran_keseluruhan = objectInput.readUTF();
		status_pengiriman_keseluruhan = objectInput.readUTF();
		catatan = objectInput.readUTF();
		create_date = objectInput.readLong();
		modified_date = objectInput.readLong();
		id_metode_pembayaran = objectInput.readUTF();
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

		if (id_order == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(id_order);
		}

		objectOutput.writeLong(total_harga);
		objectOutput.writeLong(tanggal_pemesanan);
		objectOutput.writeLong(tanggal_ekspetasi_pengiriman);

		if (status_order == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(status_order);
		}

		if (status_pembayaran_keseluruhan == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(status_pembayaran_keseluruhan);
		}

		if (status_pengiriman_keseluruhan == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(status_pengiriman_keseluruhan);
		}

		if (catatan == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(catatan);
		}

		objectOutput.writeLong(create_date);
		objectOutput.writeLong(modified_date);

		if (id_metode_pembayaran == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(id_metode_pembayaran);
		}
	}

	public String uuid;
	public String id_order;
	public long total_harga;
	public long tanggal_pemesanan;
	public long tanggal_ekspetasi_pengiriman;
	public String status_order;
	public String status_pembayaran_keseluruhan;
	public String status_pengiriman_keseluruhan;
	public String catatan;
	public long create_date;
	public long modified_date;
	public String id_metode_pembayaran;
}