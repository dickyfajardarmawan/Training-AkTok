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

import AlamatSvc.model.Alamat;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the alamat service. This utility wraps {@link AlamatSvc.service.persistence.impl.AlamatPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AlamatPersistence
 * @see AlamatSvc.service.persistence.impl.AlamatPersistenceImpl
 * @generated
 */
@ProviderType
public class AlamatUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Alamat alamat) {
		getPersistence().clearCache(alamat);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Alamat> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Alamat> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Alamat> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator<Alamat> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Alamat update(Alamat alamat) {
		return getPersistence().update(alamat);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Alamat update(Alamat alamat, ServiceContext serviceContext) {
		return getPersistence().update(alamat, serviceContext);
	}

	/**
	* Returns all the alamats where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching alamats
	*/
	public static List<Alamat> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

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
	public static List<Alamat> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

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
	public static List<Alamat> findByUuid(String uuid, int start, int end,
		OrderByComparator<Alamat> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

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
	public static List<Alamat> findByUuid(String uuid, int start, int end,
		OrderByComparator<Alamat> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first alamat in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching alamat
	* @throws NoSuchAlamatException if a matching alamat could not be found
	*/
	public static Alamat findByUuid_First(String uuid,
		OrderByComparator<Alamat> orderByComparator)
		throws AlamatSvc.exception.NoSuchAlamatException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first alamat in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching alamat, or <code>null</code> if a matching alamat could not be found
	*/
	public static Alamat fetchByUuid_First(String uuid,
		OrderByComparator<Alamat> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last alamat in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching alamat
	* @throws NoSuchAlamatException if a matching alamat could not be found
	*/
	public static Alamat findByUuid_Last(String uuid,
		OrderByComparator<Alamat> orderByComparator)
		throws AlamatSvc.exception.NoSuchAlamatException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last alamat in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching alamat, or <code>null</code> if a matching alamat could not be found
	*/
	public static Alamat fetchByUuid_Last(String uuid,
		OrderByComparator<Alamat> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the alamats before and after the current alamat in the ordered set where uuid = &#63;.
	*
	* @param id_alamat the primary key of the current alamat
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next alamat
	* @throws NoSuchAlamatException if a alamat with the primary key could not be found
	*/
	public static Alamat[] findByUuid_PrevAndNext(String id_alamat,
		String uuid, OrderByComparator<Alamat> orderByComparator)
		throws AlamatSvc.exception.NoSuchAlamatException {
		return getPersistence()
				   .findByUuid_PrevAndNext(id_alamat, uuid, orderByComparator);
	}

	/**
	* Removes all the alamats where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of alamats where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching alamats
	*/
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Caches the alamat in the entity cache if it is enabled.
	*
	* @param alamat the alamat
	*/
	public static void cacheResult(Alamat alamat) {
		getPersistence().cacheResult(alamat);
	}

	/**
	* Caches the alamats in the entity cache if it is enabled.
	*
	* @param alamats the alamats
	*/
	public static void cacheResult(List<Alamat> alamats) {
		getPersistence().cacheResult(alamats);
	}

	/**
	* Creates a new alamat with the primary key. Does not add the alamat to the database.
	*
	* @param id_alamat the primary key for the new alamat
	* @return the new alamat
	*/
	public static Alamat create(String id_alamat) {
		return getPersistence().create(id_alamat);
	}

	/**
	* Removes the alamat with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id_alamat the primary key of the alamat
	* @return the alamat that was removed
	* @throws NoSuchAlamatException if a alamat with the primary key could not be found
	*/
	public static Alamat remove(String id_alamat)
		throws AlamatSvc.exception.NoSuchAlamatException {
		return getPersistence().remove(id_alamat);
	}

	public static Alamat updateImpl(Alamat alamat) {
		return getPersistence().updateImpl(alamat);
	}

	/**
	* Returns the alamat with the primary key or throws a {@link NoSuchAlamatException} if it could not be found.
	*
	* @param id_alamat the primary key of the alamat
	* @return the alamat
	* @throws NoSuchAlamatException if a alamat with the primary key could not be found
	*/
	public static Alamat findByPrimaryKey(String id_alamat)
		throws AlamatSvc.exception.NoSuchAlamatException {
		return getPersistence().findByPrimaryKey(id_alamat);
	}

	/**
	* Returns the alamat with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id_alamat the primary key of the alamat
	* @return the alamat, or <code>null</code> if a alamat with the primary key could not be found
	*/
	public static Alamat fetchByPrimaryKey(String id_alamat) {
		return getPersistence().fetchByPrimaryKey(id_alamat);
	}

	public static java.util.Map<java.io.Serializable, Alamat> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the alamats.
	*
	* @return the alamats
	*/
	public static List<Alamat> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<Alamat> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<Alamat> findAll(int start, int end,
		OrderByComparator<Alamat> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<Alamat> findAll(int start, int end,
		OrderByComparator<Alamat> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the alamats from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of alamats.
	*
	* @return the number of alamats
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static AlamatPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AlamatPersistence, AlamatPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(AlamatPersistence.class);

		ServiceTracker<AlamatPersistence, AlamatPersistence> serviceTracker = new ServiceTracker<AlamatPersistence, AlamatPersistence>(bundle.getBundleContext(),
				AlamatPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}