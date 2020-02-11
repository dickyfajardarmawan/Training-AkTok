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

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Cart}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Cart
 * @generated
 */
@ProviderType
public class CartWrapper implements Cart, ModelWrapper<Cart> {
	public CartWrapper(Cart cart) {
		_cart = cart;
	}

	@Override
	public Class<?> getModelClass() {
		return Cart.class;
	}

	@Override
	public String getModelClassName() {
		return Cart.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("id_cart", getId_cart());
		attributes.put("id_produk", getId_produk());
		attributes.put("id_user", getId_user());
		attributes.put("jumlah_produk", getJumlah_produk());
		attributes.put("sub_total", getSub_total());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		String id_cart = (String)attributes.get("id_cart");

		if (id_cart != null) {
			setId_cart(id_cart);
		}

		String id_produk = (String)attributes.get("id_produk");

		if (id_produk != null) {
			setId_produk(id_produk);
		}

		Long id_user = (Long)attributes.get("id_user");

		if (id_user != null) {
			setId_user(id_user);
		}

		Long jumlah_produk = (Long)attributes.get("jumlah_produk");

		if (jumlah_produk != null) {
			setJumlah_produk(jumlah_produk);
		}

		Long sub_total = (Long)attributes.get("sub_total");

		if (sub_total != null) {
			setSub_total(sub_total);
		}
	}

	@Override
	public Object clone() {
		return new CartWrapper((Cart)_cart.clone());
	}

	@Override
	public int compareTo(Cart cart) {
		return _cart.compareTo(cart);
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _cart.getExpandoBridge();
	}

	/**
	* Returns the id_cart of this cart.
	*
	* @return the id_cart of this cart
	*/
	@Override
	public String getId_cart() {
		return _cart.getId_cart();
	}

	/**
	* Returns the id_produk of this cart.
	*
	* @return the id_produk of this cart
	*/
	@Override
	public String getId_produk() {
		return _cart.getId_produk();
	}

	/**
	* Returns the id_user of this cart.
	*
	* @return the id_user of this cart
	*/
	@Override
	public Long getId_user() {
		return _cart.getId_user();
	}

	/**
	* Returns the jumlah_produk of this cart.
	*
	* @return the jumlah_produk of this cart
	*/
	@Override
	public long getJumlah_produk() {
		return _cart.getJumlah_produk();
	}

	/**
	* Returns the primary key of this cart.
	*
	* @return the primary key of this cart
	*/
	@Override
	public String getPrimaryKey() {
		return _cart.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _cart.getPrimaryKeyObj();
	}

	/**
	* Returns the sub_total of this cart.
	*
	* @return the sub_total of this cart
	*/
	@Override
	public long getSub_total() {
		return _cart.getSub_total();
	}

	/**
	* Returns the uuid of this cart.
	*
	* @return the uuid of this cart
	*/
	@Override
	public String getUuid() {
		return _cart.getUuid();
	}

	@Override
	public int hashCode() {
		return _cart.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _cart.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _cart.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _cart.isNew();
	}

	@Override
	public void persist() {
		_cart.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_cart.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_cart.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_cart.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_cart.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the id_cart of this cart.
	*
	* @param id_cart the id_cart of this cart
	*/
	@Override
	public void setId_cart(String id_cart) {
		_cart.setId_cart(id_cart);
	}

	/**
	* Sets the id_produk of this cart.
	*
	* @param id_produk the id_produk of this cart
	*/
	@Override
	public void setId_produk(String id_produk) {
		_cart.setId_produk(id_produk);
	}

	/**
	* Sets the id_user of this cart.
	*
	* @param id_user the id_user of this cart
	*/
	@Override
	public void setId_user(Long id_user) {
		_cart.setId_user(id_user);
	}

	/**
	* Sets the jumlah_produk of this cart.
	*
	* @param jumlah_produk the jumlah_produk of this cart
	*/
	@Override
	public void setJumlah_produk(long jumlah_produk) {
		_cart.setJumlah_produk(jumlah_produk);
	}

	@Override
	public void setNew(boolean n) {
		_cart.setNew(n);
	}

	/**
	* Sets the primary key of this cart.
	*
	* @param primaryKey the primary key of this cart
	*/
	@Override
	public void setPrimaryKey(String primaryKey) {
		_cart.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_cart.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the sub_total of this cart.
	*
	* @param sub_total the sub_total of this cart
	*/
	@Override
	public void setSub_total(long sub_total) {
		_cart.setSub_total(sub_total);
	}

	/**
	* Sets the uuid of this cart.
	*
	* @param uuid the uuid of this cart
	*/
	@Override
	public void setUuid(String uuid) {
		_cart.setUuid(uuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Cart> toCacheModel() {
		return _cart.toCacheModel();
	}

	@Override
	public Cart toEscapedModel() {
		return new CartWrapper(_cart.toEscapedModel());
	}

	@Override
	public String toString() {
		return _cart.toString();
	}

	@Override
	public Cart toUnescapedModel() {
		return new CartWrapper(_cart.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _cart.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CartWrapper)) {
			return false;
		}

		CartWrapper cartWrapper = (CartWrapper)obj;

		if (Objects.equals(_cart, cartWrapper._cart)) {
			return true;
		}

		return false;
	}

	@Override
	public Cart getWrappedModel() {
		return _cart;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _cart.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _cart.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_cart.resetOriginalValues();
	}

	private final Cart _cart;
}