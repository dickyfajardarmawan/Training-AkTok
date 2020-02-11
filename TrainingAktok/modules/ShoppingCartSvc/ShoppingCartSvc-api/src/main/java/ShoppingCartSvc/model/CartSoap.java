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

package ShoppingCartSvc.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link ShoppingCartSvc.service.http.CartServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see ShoppingCartSvc.service.http.CartServiceSoap
 * @generated
 */
@ProviderType
public class CartSoap implements Serializable {
	public static CartSoap toSoapModel(Cart model) {
		CartSoap soapModel = new CartSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setId_cart(model.getId_cart());
		soapModel.setId_produk(model.getId_produk());
		soapModel.setId_user(model.getId_user());
		soapModel.setJumlah_produk(model.getJumlah_produk());
		soapModel.setSub_total(model.getSub_total());

		return soapModel;
	}

	public static CartSoap[] toSoapModels(Cart[] models) {
		CartSoap[] soapModels = new CartSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CartSoap[][] toSoapModels(Cart[][] models) {
		CartSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CartSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CartSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CartSoap[] toSoapModels(List<Cart> models) {
		List<CartSoap> soapModels = new ArrayList<CartSoap>(models.size());

		for (Cart model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CartSoap[soapModels.size()]);
	}

	public CartSoap() {
	}

	public String getPrimaryKey() {
		return _id_cart;
	}

	public void setPrimaryKey(String pk) {
		setId_cart(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public String getId_cart() {
		return _id_cart;
	}

	public void setId_cart(String id_cart) {
		_id_cart = id_cart;
	}

	public String getId_produk() {
		return _id_produk;
	}

	public void setId_produk(String id_produk) {
		_id_produk = id_produk;
	}

	public Long getId_user() {
		return _id_user;
	}

	public void setId_user(Long id_user) {
		_id_user = id_user;
	}

	public long getJumlah_produk() {
		return _jumlah_produk;
	}

	public void setJumlah_produk(long jumlah_produk) {
		_jumlah_produk = jumlah_produk;
	}

	public long getSub_total() {
		return _sub_total;
	}

	public void setSub_total(long sub_total) {
		_sub_total = sub_total;
	}

	private String _uuid;
	private String _id_cart;
	private String _id_produk;
	private Long _id_user;
	private long _jumlah_produk;
	private long _sub_total;
}