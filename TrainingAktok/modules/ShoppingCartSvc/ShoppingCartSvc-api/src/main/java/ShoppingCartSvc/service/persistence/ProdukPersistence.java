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

import ShoppingCartSvc.exception.NoSuchProdukException;

import ShoppingCartSvc.model.Produk;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the produk service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ShoppingCartSvc.service.persistence.impl.ProdukPersistenceImpl
 * @see ProdukUtil
 * @generated
 */
@ProviderType
public interface ProdukPersistence extends BasePersistence<Produk> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ProdukUtil} to access the produk persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the produks where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching produks
	*/
	public java.util.List<Produk> findByUuid(String uuid);

	/**
	* Returns a range of all the produks where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProdukModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of produks
	* @param end the upper bound of the range of produks (not inclusive)
	* @return the range of matching produks
	*/
	public java.util.List<Produk> findByUuid(String uuid, int start, int end);

	/**
	* Returns an ordered range of all the produks where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProdukModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of produks
	* @param end the upper bound of the range of produks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching produks
	*/
	public java.util.List<Produk> findByUuid(String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Produk> orderByComparator);

	/**
	* Returns an ordered range of all the produks where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProdukModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of produks
	* @param end the upper bound of the range of produks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching produks
	*/
	public java.util.List<Produk> findByUuid(String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Produk> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first produk in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching produk
	* @throws NoSuchProdukException if a matching produk could not be found
	*/
	public Produk findByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Produk> orderByComparator)
		throws NoSuchProdukException;

	/**
	* Returns the first produk in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching produk, or <code>null</code> if a matching produk could not be found
	*/
	public Produk fetchByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Produk> orderByComparator);

	/**
	* Returns the last produk in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching produk
	* @throws NoSuchProdukException if a matching produk could not be found
	*/
	public Produk findByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Produk> orderByComparator)
		throws NoSuchProdukException;

	/**
	* Returns the last produk in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching produk, or <code>null</code> if a matching produk could not be found
	*/
	public Produk fetchByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Produk> orderByComparator);

	/**
	* Returns the produks before and after the current produk in the ordered set where uuid = &#63;.
	*
	* @param id_produk the primary key of the current produk
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next produk
	* @throws NoSuchProdukException if a produk with the primary key could not be found
	*/
	public Produk[] findByUuid_PrevAndNext(String id_produk, String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Produk> orderByComparator)
		throws NoSuchProdukException;

	/**
	* Removes all the produks where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(String uuid);

	/**
	* Returns the number of produks where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching produks
	*/
	public int countByUuid(String uuid);

	/**
	* Caches the produk in the entity cache if it is enabled.
	*
	* @param produk the produk
	*/
	public void cacheResult(Produk produk);

	/**
	* Caches the produks in the entity cache if it is enabled.
	*
	* @param produks the produks
	*/
	public void cacheResult(java.util.List<Produk> produks);

	/**
	* Creates a new produk with the primary key. Does not add the produk to the database.
	*
	* @param id_produk the primary key for the new produk
	* @return the new produk
	*/
	public Produk create(String id_produk);

	/**
	* Removes the produk with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id_produk the primary key of the produk
	* @return the produk that was removed
	* @throws NoSuchProdukException if a produk with the primary key could not be found
	*/
	public Produk remove(String id_produk) throws NoSuchProdukException;

	public Produk updateImpl(Produk produk);

	/**
	* Returns the produk with the primary key or throws a {@link NoSuchProdukException} if it could not be found.
	*
	* @param id_produk the primary key of the produk
	* @return the produk
	* @throws NoSuchProdukException if a produk with the primary key could not be found
	*/
	public Produk findByPrimaryKey(String id_produk)
		throws NoSuchProdukException;

	/**
	* Returns the produk with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id_produk the primary key of the produk
	* @return the produk, or <code>null</code> if a produk with the primary key could not be found
	*/
	public Produk fetchByPrimaryKey(String id_produk);

	@Override
	public java.util.Map<java.io.Serializable, Produk> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the produks.
	*
	* @return the produks
	*/
	public java.util.List<Produk> findAll();

	/**
	* Returns a range of all the produks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProdukModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of produks
	* @param end the upper bound of the range of produks (not inclusive)
	* @return the range of produks
	*/
	public java.util.List<Produk> findAll(int start, int end);

	/**
	* Returns an ordered range of all the produks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProdukModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of produks
	* @param end the upper bound of the range of produks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of produks
	*/
	public java.util.List<Produk> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Produk> orderByComparator);

	/**
	* Returns an ordered range of all the produks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ProdukModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of produks
	* @param end the upper bound of the range of produks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of produks
	*/
	public java.util.List<Produk> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Produk> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the produks from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of produks.
	*
	* @return the number of produks
	*/
	public int countAll();

	@Override
	public java.util.Set<String> getBadColumnNames();
}