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

package TokoSvc.service.persistence;

import TokoSvc.exception.NoSuchTokoException;

import TokoSvc.model.Toko;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the toko service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TokoSvc.service.persistence.impl.TokoPersistenceImpl
 * @see TokoUtil
 * @generated
 */
@ProviderType
public interface TokoPersistence extends BasePersistence<Toko> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TokoUtil} to access the toko persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the tokos where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching tokos
	*/
	public java.util.List<Toko> findByUuid(String uuid);

	/**
	* Returns a range of all the tokos where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TokoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of tokos
	* @param end the upper bound of the range of tokos (not inclusive)
	* @return the range of matching tokos
	*/
	public java.util.List<Toko> findByUuid(String uuid, int start, int end);

	/**
	* Returns an ordered range of all the tokos where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TokoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of tokos
	* @param end the upper bound of the range of tokos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tokos
	*/
	public java.util.List<Toko> findByUuid(String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Toko> orderByComparator);

	/**
	* Returns an ordered range of all the tokos where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TokoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of tokos
	* @param end the upper bound of the range of tokos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching tokos
	*/
	public java.util.List<Toko> findByUuid(String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Toko> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first toko in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching toko
	* @throws NoSuchTokoException if a matching toko could not be found
	*/
	public Toko findByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Toko> orderByComparator)
		throws NoSuchTokoException;

	/**
	* Returns the first toko in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching toko, or <code>null</code> if a matching toko could not be found
	*/
	public Toko fetchByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Toko> orderByComparator);

	/**
	* Returns the last toko in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching toko
	* @throws NoSuchTokoException if a matching toko could not be found
	*/
	public Toko findByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Toko> orderByComparator)
		throws NoSuchTokoException;

	/**
	* Returns the last toko in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching toko, or <code>null</code> if a matching toko could not be found
	*/
	public Toko fetchByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Toko> orderByComparator);

	/**
	* Returns the tokos before and after the current toko in the ordered set where uuid = &#63;.
	*
	* @param id_toko the primary key of the current toko
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next toko
	* @throws NoSuchTokoException if a toko with the primary key could not be found
	*/
	public Toko[] findByUuid_PrevAndNext(String id_toko, String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Toko> orderByComparator)
		throws NoSuchTokoException;

	/**
	* Removes all the tokos where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(String uuid);

	/**
	* Returns the number of tokos where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching tokos
	*/
	public int countByUuid(String uuid);

	/**
	* Caches the toko in the entity cache if it is enabled.
	*
	* @param toko the toko
	*/
	public void cacheResult(Toko toko);

	/**
	* Caches the tokos in the entity cache if it is enabled.
	*
	* @param tokos the tokos
	*/
	public void cacheResult(java.util.List<Toko> tokos);

	/**
	* Creates a new toko with the primary key. Does not add the toko to the database.
	*
	* @param id_toko the primary key for the new toko
	* @return the new toko
	*/
	public Toko create(String id_toko);

	/**
	* Removes the toko with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id_toko the primary key of the toko
	* @return the toko that was removed
	* @throws NoSuchTokoException if a toko with the primary key could not be found
	*/
	public Toko remove(String id_toko) throws NoSuchTokoException;

	public Toko updateImpl(Toko toko);

	/**
	* Returns the toko with the primary key or throws a {@link NoSuchTokoException} if it could not be found.
	*
	* @param id_toko the primary key of the toko
	* @return the toko
	* @throws NoSuchTokoException if a toko with the primary key could not be found
	*/
	public Toko findByPrimaryKey(String id_toko) throws NoSuchTokoException;

	/**
	* Returns the toko with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id_toko the primary key of the toko
	* @return the toko, or <code>null</code> if a toko with the primary key could not be found
	*/
	public Toko fetchByPrimaryKey(String id_toko);

	@Override
	public java.util.Map<java.io.Serializable, Toko> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the tokos.
	*
	* @return the tokos
	*/
	public java.util.List<Toko> findAll();

	/**
	* Returns a range of all the tokos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TokoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tokos
	* @param end the upper bound of the range of tokos (not inclusive)
	* @return the range of tokos
	*/
	public java.util.List<Toko> findAll(int start, int end);

	/**
	* Returns an ordered range of all the tokos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TokoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tokos
	* @param end the upper bound of the range of tokos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tokos
	*/
	public java.util.List<Toko> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Toko> orderByComparator);

	/**
	* Returns an ordered range of all the tokos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TokoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tokos
	* @param end the upper bound of the range of tokos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of tokos
	*/
	public java.util.List<Toko> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Toko> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the tokos from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of tokos.
	*
	* @return the number of tokos
	*/
	public int countAll();

	@Override
	public java.util.Set<String> getBadColumnNames();
}