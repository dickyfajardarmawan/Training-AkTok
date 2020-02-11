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

package AlamatSvc.service.persistence;

import AlamatSvc.exception.NoSuchAlamatException;

import AlamatSvc.model.Alamat;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the alamat service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AlamatSvc.service.persistence.impl.AlamatPersistenceImpl
 * @see AlamatUtil
 * @generated
 */
@ProviderType
public interface AlamatPersistence extends BasePersistence<Alamat> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AlamatUtil} to access the alamat persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the alamats where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching alamats
	*/
	public java.util.List<Alamat> findByUuid(String uuid);

	/**
	* Returns a range of all the alamats where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AlamatModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of alamats
	* @param end the upper bound of the range of alamats (not inclusive)
	* @return the range of matching alamats
	*/
	public java.util.List<Alamat> findByUuid(String uuid, int start, int end);

	/**
	* Returns an ordered range of all the alamats where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AlamatModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of alamats
	* @param end the upper bound of the range of alamats (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching alamats
	*/
	public java.util.List<Alamat> findByUuid(String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Alamat> orderByComparator);

	/**
	* Returns an ordered range of all the alamats where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AlamatModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of alamats
	* @param end the upper bound of the range of alamats (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching alamats
	*/
	public java.util.List<Alamat> findByUuid(String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Alamat> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first alamat in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching alamat
	* @throws NoSuchAlamatException if a matching alamat could not be found
	*/
	public Alamat findByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Alamat> orderByComparator)
		throws NoSuchAlamatException;

	/**
	* Returns the first alamat in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching alamat, or <code>null</code> if a matching alamat could not be found
	*/
	public Alamat fetchByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Alamat> orderByComparator);

	/**
	* Returns the last alamat in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching alamat
	* @throws NoSuchAlamatException if a matching alamat could not be found
	*/
	public Alamat findByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Alamat> orderByComparator)
		throws NoSuchAlamatException;

	/**
	* Returns the last alamat in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching alamat, or <code>null</code> if a matching alamat could not be found
	*/
	public Alamat fetchByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Alamat> orderByComparator);

	/**
	* Returns the alamats before and after the current alamat in the ordered set where uuid = &#63;.
	*
	* @param id_alamat the primary key of the current alamat
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next alamat
	* @throws NoSuchAlamatException if a alamat with the primary key could not be found
	*/
	public Alamat[] findByUuid_PrevAndNext(String id_alamat, String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Alamat> orderByComparator)
		throws NoSuchAlamatException;

	/**
	* Removes all the alamats where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(String uuid);

	/**
	* Returns the number of alamats where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching alamats
	*/
	public int countByUuid(String uuid);

	/**
	* Caches the alamat in the entity cache if it is enabled.
	*
	* @param alamat the alamat
	*/
	public void cacheResult(Alamat alamat);

	/**
	* Caches the alamats in the entity cache if it is enabled.
	*
	* @param alamats the alamats
	*/
	public void cacheResult(java.util.List<Alamat> alamats);

	/**
	* Creates a new alamat with the primary key. Does not add the alamat to the database.
	*
	* @param id_alamat the primary key for the new alamat
	* @return the new alamat
	*/
	public Alamat create(String id_alamat);

	/**
	* Removes the alamat with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id_alamat the primary key of the alamat
	* @return the alamat that was removed
	* @throws NoSuchAlamatException if a alamat with the primary key could not be found
	*/
	public Alamat remove(String id_alamat) throws NoSuchAlamatException;

	public Alamat updateImpl(Alamat alamat);

	/**
	* Returns the alamat with the primary key or throws a {@link NoSuchAlamatException} if it could not be found.
	*
	* @param id_alamat the primary key of the alamat
	* @return the alamat
	* @throws NoSuchAlamatException if a alamat with the primary key could not be found
	*/
	public Alamat findByPrimaryKey(String id_alamat)
		throws NoSuchAlamatException;

	/**
	* Returns the alamat with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id_alamat the primary key of the alamat
	* @return the alamat, or <code>null</code> if a alamat with the primary key could not be found
	*/
	public Alamat fetchByPrimaryKey(String id_alamat);

	@Override
	public java.util.Map<java.io.Serializable, Alamat> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the alamats.
	*
	* @return the alamats
	*/
	public java.util.List<Alamat> findAll();

	/**
	* Returns a range of all the alamats.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AlamatModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of alamats
	* @param end the upper bound of the range of alamats (not inclusive)
	* @return the range of alamats
	*/
	public java.util.List<Alamat> findAll(int start, int end);

	/**
	* Returns an ordered range of all the alamats.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AlamatModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of alamats
	* @param end the upper bound of the range of alamats (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of alamats
	*/
	public java.util.List<Alamat> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Alamat> orderByComparator);

	/**
	* Returns an ordered range of all the alamats.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AlamatModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of alamats
	* @param end the upper bound of the range of alamats (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of alamats
	*/
	public java.util.List<Alamat> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Alamat> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the alamats from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of alamats.
	*
	* @return the number of alamats
	*/
	public int countAll();

	@Override
	public java.util.Set<String> getBadColumnNames();
}