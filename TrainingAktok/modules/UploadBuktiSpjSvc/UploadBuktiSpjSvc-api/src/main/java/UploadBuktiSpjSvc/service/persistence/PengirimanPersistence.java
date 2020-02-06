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

package UploadBuktiSpjSvc.service.persistence;

import UploadBuktiSpjSvc.exception.NoSuchPengirimanException;

import UploadBuktiSpjSvc.model.Pengiriman;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the pengiriman service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UploadBuktiSpjSvc.service.persistence.impl.PengirimanPersistenceImpl
 * @see PengirimanUtil
 * @generated
 */
@ProviderType
public interface PengirimanPersistence extends BasePersistence<Pengiriman> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PengirimanUtil} to access the pengiriman persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the pengirimans where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching pengirimans
	*/
	public java.util.List<Pengiriman> findByUuid(String uuid);

	/**
	* Returns a range of all the pengirimans where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PengirimanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of pengirimans
	* @param end the upper bound of the range of pengirimans (not inclusive)
	* @return the range of matching pengirimans
	*/
	public java.util.List<Pengiriman> findByUuid(String uuid, int start, int end);

	/**
	* Returns an ordered range of all the pengirimans where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PengirimanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of pengirimans
	* @param end the upper bound of the range of pengirimans (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching pengirimans
	*/
	public java.util.List<Pengiriman> findByUuid(String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Pengiriman> orderByComparator);

	/**
	* Returns an ordered range of all the pengirimans where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PengirimanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of pengirimans
	* @param end the upper bound of the range of pengirimans (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching pengirimans
	*/
	public java.util.List<Pengiriman> findByUuid(String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Pengiriman> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first pengiriman in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching pengiriman
	* @throws NoSuchPengirimanException if a matching pengiriman could not be found
	*/
	public Pengiriman findByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Pengiriman> orderByComparator)
		throws NoSuchPengirimanException;

	/**
	* Returns the first pengiriman in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching pengiriman, or <code>null</code> if a matching pengiriman could not be found
	*/
	public Pengiriman fetchByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Pengiriman> orderByComparator);

	/**
	* Returns the last pengiriman in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching pengiriman
	* @throws NoSuchPengirimanException if a matching pengiriman could not be found
	*/
	public Pengiriman findByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Pengiriman> orderByComparator)
		throws NoSuchPengirimanException;

	/**
	* Returns the last pengiriman in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching pengiriman, or <code>null</code> if a matching pengiriman could not be found
	*/
	public Pengiriman fetchByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Pengiriman> orderByComparator);

	/**
	* Returns the pengirimans before and after the current pengiriman in the ordered set where uuid = &#63;.
	*
	* @param id_pengiriman the primary key of the current pengiriman
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next pengiriman
	* @throws NoSuchPengirimanException if a pengiriman with the primary key could not be found
	*/
	public Pengiriman[] findByUuid_PrevAndNext(String id_pengiriman,
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Pengiriman> orderByComparator)
		throws NoSuchPengirimanException;

	/**
	* Removes all the pengirimans where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(String uuid);

	/**
	* Returns the number of pengirimans where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching pengirimans
	*/
	public int countByUuid(String uuid);

	/**
	* Caches the pengiriman in the entity cache if it is enabled.
	*
	* @param pengiriman the pengiriman
	*/
	public void cacheResult(Pengiriman pengiriman);

	/**
	* Caches the pengirimans in the entity cache if it is enabled.
	*
	* @param pengirimans the pengirimans
	*/
	public void cacheResult(java.util.List<Pengiriman> pengirimans);

	/**
	* Creates a new pengiriman with the primary key. Does not add the pengiriman to the database.
	*
	* @param id_pengiriman the primary key for the new pengiriman
	* @return the new pengiriman
	*/
	public Pengiriman create(String id_pengiriman);

	/**
	* Removes the pengiriman with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id_pengiriman the primary key of the pengiriman
	* @return the pengiriman that was removed
	* @throws NoSuchPengirimanException if a pengiriman with the primary key could not be found
	*/
	public Pengiriman remove(String id_pengiriman)
		throws NoSuchPengirimanException;

	public Pengiriman updateImpl(Pengiriman pengiriman);

	/**
	* Returns the pengiriman with the primary key or throws a {@link NoSuchPengirimanException} if it could not be found.
	*
	* @param id_pengiriman the primary key of the pengiriman
	* @return the pengiriman
	* @throws NoSuchPengirimanException if a pengiriman with the primary key could not be found
	*/
	public Pengiriman findByPrimaryKey(String id_pengiriman)
		throws NoSuchPengirimanException;

	/**
	* Returns the pengiriman with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id_pengiriman the primary key of the pengiriman
	* @return the pengiriman, or <code>null</code> if a pengiriman with the primary key could not be found
	*/
	public Pengiriman fetchByPrimaryKey(String id_pengiriman);

	@Override
	public java.util.Map<java.io.Serializable, Pengiriman> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the pengirimans.
	*
	* @return the pengirimans
	*/
	public java.util.List<Pengiriman> findAll();

	/**
	* Returns a range of all the pengirimans.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PengirimanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of pengirimans
	* @param end the upper bound of the range of pengirimans (not inclusive)
	* @return the range of pengirimans
	*/
	public java.util.List<Pengiriman> findAll(int start, int end);

	/**
	* Returns an ordered range of all the pengirimans.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PengirimanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of pengirimans
	* @param end the upper bound of the range of pengirimans (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of pengirimans
	*/
	public java.util.List<Pengiriman> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Pengiriman> orderByComparator);

	/**
	* Returns an ordered range of all the pengirimans.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PengirimanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of pengirimans
	* @param end the upper bound of the range of pengirimans (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of pengirimans
	*/
	public java.util.List<Pengiriman> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Pengiriman> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the pengirimans from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of pengirimans.
	*
	* @return the number of pengirimans
	*/
	public int countAll();

	@Override
	public java.util.Set<String> getBadColumnNames();
}