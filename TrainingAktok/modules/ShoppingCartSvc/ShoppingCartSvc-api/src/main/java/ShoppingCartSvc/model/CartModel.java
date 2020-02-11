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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

/**
 * The base model interface for the Cart service. Represents a row in the &quot;master_Cart&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link ShoppingCartSvc.model.impl.CartModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ShoppingCartSvc.model.impl.CartImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Cart
 * @see ShoppingCartSvc.model.impl.CartImpl
 * @see ShoppingCartSvc.model.impl.CartModelImpl
 * @generated
 */
@ProviderType
public interface CartModel extends BaseModel<Cart> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a cart model instance should use the {@link Cart} interface instead.
	 */

	/**
	 * Returns the primary key of this cart.
	 *
	 * @return the primary key of this cart
	 */
	public String getPrimaryKey();

	/**
	 * Sets the primary key of this cart.
	 *
	 * @param primaryKey the primary key of this cart
	 */
	public void setPrimaryKey(String primaryKey);

	/**
	 * Returns the uuid of this cart.
	 *
	 * @return the uuid of this cart
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this cart.
	 *
	 * @param uuid the uuid of this cart
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the id_cart of this cart.
	 *
	 * @return the id_cart of this cart
	 */
	@AutoEscape
	public String getId_cart();

	/**
	 * Sets the id_cart of this cart.
	 *
	 * @param id_cart the id_cart of this cart
	 */
	public void setId_cart(String id_cart);

	/**
	 * Returns the id_produk of this cart.
	 *
	 * @return the id_produk of this cart
	 */
	@AutoEscape
	public String getId_produk();

	/**
	 * Sets the id_produk of this cart.
	 *
	 * @param id_produk the id_produk of this cart
	 */
	public void setId_produk(String id_produk);

	/**
	 * Returns the id_user of this cart.
	 *
	 * @return the id_user of this cart
	 */
	public Long getId_user();

	/**
	 * Sets the id_user of this cart.
	 *
	 * @param id_user the id_user of this cart
	 */
	public void setId_user(Long id_user);

	/**
	 * Returns the jumlah_produk of this cart.
	 *
	 * @return the jumlah_produk of this cart
	 */
	public long getJumlah_produk();

	/**
	 * Sets the jumlah_produk of this cart.
	 *
	 * @param jumlah_produk the jumlah_produk of this cart
	 */
	public void setJumlah_produk(long jumlah_produk);

	/**
	 * Returns the sub_total of this cart.
	 *
	 * @return the sub_total of this cart
	 */
	public long getSub_total();

	/**
	 * Sets the sub_total of this cart.
	 *
	 * @param sub_total the sub_total of this cart
	 */
	public void setSub_total(long sub_total);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(Cart cart);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Cart> toCacheModel();

	@Override
	public Cart toEscapedModel();

	@Override
	public Cart toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}