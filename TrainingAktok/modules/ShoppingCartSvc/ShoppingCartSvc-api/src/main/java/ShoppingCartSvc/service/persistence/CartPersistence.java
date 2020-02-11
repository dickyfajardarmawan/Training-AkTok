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

package ShoppingCartSvc.service.persistence;

import ShoppingCartSvc.exception.NoSuchCartException;

import ShoppingCartSvc.model.Cart;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the cart service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ShoppingCartSvc.service.persistence.impl.CartPersistenceImpl
 * @see CartUtil
 * @generated
 */
@ProviderType
public interface CartPersistence extends BasePersistence<Cart> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CartUtil} to access the cart persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the carts where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching carts
	*/
	public java.util.List<Cart> findByUuid(String uuid);

	/**
	* Returns a range of all the carts where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CartModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of carts
	* @param end the upper bound of the range of carts (not inclusive)
	* @return the range of matching carts
	*/
	public java.util.List<Cart> findByUuid(String uuid, int start, int end);

	/**
	* Returns an ordered range of all the carts where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CartModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of carts
	* @param end the upper bound of the range of carts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching carts
	*/
	public java.util.List<Cart> findByUuid(String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Cart> orderByComparator);

	/**
	* Returns an ordered range of all the carts where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CartModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of carts
	* @param end the upper bound of the range of carts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching carts
	*/
	public java.util.List<Cart> findByUuid(String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Cart> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first cart in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cart
	* @throws NoSuchCartException if a matching cart could not be found
	*/
	public Cart findByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Cart> orderByComparator)
		throws NoSuchCartException;

	/**
	* Returns the first cart in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cart, or <code>null</code> if a matching cart could not be found
	*/
	public Cart fetchByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Cart> orderByComparator);

	/**
	* Returns the last cart in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cart
	* @throws NoSuchCartException if a matching cart could not be found
	*/
	public Cart findByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Cart> orderByComparator)
		throws NoSuchCartException;

	/**
	* Returns the last cart in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cart, or <code>null</code> if a matching cart could not be found
	*/
	public Cart fetchByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Cart> orderByComparator);

	/**
	* Returns the carts before and after the current cart in the ordered set where uuid = &#63;.
	*
	* @param id_cart the primary key of the current cart
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next cart
	* @throws NoSuchCartException if a cart with the primary key could not be found
	*/
	public Cart[] findByUuid_PrevAndNext(String id_cart, String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Cart> orderByComparator)
		throws NoSuchCartException;

	/**
	* Removes all the carts where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(String uuid);

	/**
	* Returns the number of carts where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching carts
	*/
	public int countByUuid(String uuid);

	/**
	* Caches the cart in the entity cache if it is enabled.
	*
	* @param cart the cart
	*/
	public void cacheResult(Cart cart);

	/**
	* Caches the carts in the entity cache if it is enabled.
	*
	* @param carts the carts
	*/
	public void cacheResult(java.util.List<Cart> carts);

	/**
	* Creates a new cart with the primary key. Does not add the cart to the database.
	*
	* @param id_cart the primary key for the new cart
	* @return the new cart
	*/
	public Cart create(String id_cart);

	/**
	* Removes the cart with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id_cart the primary key of the cart
	* @return the cart that was removed
	* @throws NoSuchCartException if a cart with the primary key could not be found
	*/
	public Cart remove(String id_cart) throws NoSuchCartException;

	public Cart updateImpl(Cart cart);

	/**
	* Returns the cart with the primary key or throws a {@link NoSuchCartException} if it could not be found.
	*
	* @param id_cart the primary key of the cart
	* @return the cart
	* @throws NoSuchCartException if a cart with the primary key could not be found
	*/
	public Cart findByPrimaryKey(String id_cart) throws NoSuchCartException;

	/**
	* Returns the cart with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id_cart the primary key of the cart
	* @return the cart, or <code>null</code> if a cart with the primary key could not be found
	*/
	public Cart fetchByPrimaryKey(String id_cart);

	@Override
	public java.util.Map<java.io.Serializable, Cart> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the carts.
	*
	* @return the carts
	*/
	public java.util.List<Cart> findAll();

	/**
	* Returns a range of all the carts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CartModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of carts
	* @param end the upper bound of the range of carts (not inclusive)
	* @return the range of carts
	*/
	public java.util.List<Cart> findAll(int start, int end);

	/**
	* Returns an ordered range of all the carts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CartModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of carts
	* @param end the upper bound of the range of carts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of carts
	*/
	public java.util.List<Cart> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Cart> orderByComparator);

	/**
	* Returns an ordered range of all the carts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CartModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of carts
	* @param end the upper bound of the range of carts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of carts
	*/
	public java.util.List<Cart> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Cart> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the carts from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of carts.
	*
	* @return the number of carts
	*/
	public int countAll();

	@Override
	public java.util.Set<String> getBadColumnNames();
}