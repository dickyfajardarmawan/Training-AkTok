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

import UploadBuktiSpjSvc.model.Pengiriman;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the pengiriman service. This utility wraps {@link UploadBuktiSpjSvc.service.persistence.impl.PengirimanPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PengirimanPersistence
 * @see UploadBuktiSpjSvc.service.persistence.impl.PengirimanPersistenceImpl
 * @generated
 */
@ProviderType
public class PengirimanUtil {
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
	public static void clearCache(Pengiriman pengiriman) {
		getPersistence().clearCache(pengiriman);
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
	public static List<Pengiriman> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Pengiriman> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Pengiriman> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Pengiriman> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Pengiriman update(Pengiriman pengiriman) {
		return getPersistence().update(pengiriman);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Pengiriman update(Pengiriman pengiriman,
		ServiceContext serviceContext) {
		return getPersistence().update(pengiriman, serviceContext);
	}

	/**
	* Returns all the pengirimans where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching pengirimans
	*/
	public static List<Pengiriman> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

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
	public static List<Pengiriman> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

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
	public static List<Pengiriman> findByUuid(String uuid, int start, int end,
		OrderByComparator<Pengiriman> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

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
	public static List<Pengiriman> findByUuid(String uuid, int start, int end,
		OrderByComparator<Pengiriman> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first pengiriman in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching pengiriman
	* @throws NoSuchPengirimanException if a matching pengiriman could not be found
	*/
	public static Pengiriman findByUuid_First(String uuid,
		OrderByComparator<Pengiriman> orderByComparator)
		throws UploadBuktiSpjSvc.exception.NoSuchPengirimanException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first pengiriman in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching pengiriman, or <code>null</code> if a matching pengiriman could not be found
	*/
	public static Pengiriman fetchByUuid_First(String uuid,
		OrderByComparator<Pengiriman> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last pengiriman in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching pengiriman
	* @throws NoSuchPengirimanException if a matching pengiriman could not be found
	*/
	public static Pengiriman findByUuid_Last(String uuid,
		OrderByComparator<Pengiriman> orderByComparator)
		throws UploadBuktiSpjSvc.exception.NoSuchPengirimanException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last pengiriman in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching pengiriman, or <code>null</code> if a matching pengiriman could not be found
	*/
	public static Pengiriman fetchByUuid_Last(String uuid,
		OrderByComparator<Pengiriman> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the pengirimans before and after the current pengiriman in the ordered set where uuid = &#63;.
	*
	* @param id_pengiriman the primary key of the current pengiriman
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next pengiriman
	* @throws NoSuchPengirimanException if a pengiriman with the primary key could not be found
	*/
	public static Pengiriman[] findByUuid_PrevAndNext(String id_pengiriman,
		String uuid, OrderByComparator<Pengiriman> orderByComparator)
		throws UploadBuktiSpjSvc.exception.NoSuchPengirimanException {
		return getPersistence()
				   .findByUuid_PrevAndNext(id_pengiriman, uuid,
			orderByComparator);
	}

	/**
	* Removes all the pengirimans where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of pengirimans where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching pengirimans
	*/
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Caches the pengiriman in the entity cache if it is enabled.
	*
	* @param pengiriman the pengiriman
	*/
	public static void cacheResult(Pengiriman pengiriman) {
		getPersistence().cacheResult(pengiriman);
	}

	/**
	* Caches the pengirimans in the entity cache if it is enabled.
	*
	* @param pengirimans the pengirimans
	*/
	public static void cacheResult(List<Pengiriman> pengirimans) {
		getPersistence().cacheResult(pengirimans);
	}

	/**
	* Creates a new pengiriman with the primary key. Does not add the pengiriman to the database.
	*
	* @param id_pengiriman the primary key for the new pengiriman
	* @return the new pengiriman
	*/
	public static Pengiriman create(String id_pengiriman) {
		return getPersistence().create(id_pengiriman);
	}

	/**
	* Removes the pengiriman with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id_pengiriman the primary key of the pengiriman
	* @return the pengiriman that was removed
	* @throws NoSuchPengirimanException if a pengiriman with the primary key could not be found
	*/
	public static Pengiriman remove(String id_pengiriman)
		throws UploadBuktiSpjSvc.exception.NoSuchPengirimanException {
		return getPersistence().remove(id_pengiriman);
	}

	public static Pengiriman updateImpl(Pengiriman pengiriman) {
		return getPersistence().updateImpl(pengiriman);
	}

	/**
	* Returns the pengiriman with the primary key or throws a {@link NoSuchPengirimanException} if it could not be found.
	*
	* @param id_pengiriman the primary key of the pengiriman
	* @return the pengiriman
	* @throws NoSuchPengirimanException if a pengiriman with the primary key could not be found
	*/
	public static Pengiriman findByPrimaryKey(String id_pengiriman)
		throws UploadBuktiSpjSvc.exception.NoSuchPengirimanException {
		return getPersistence().findByPrimaryKey(id_pengiriman);
	}

	/**
	* Returns the pengiriman with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id_pengiriman the primary key of the pengiriman
	* @return the pengiriman, or <code>null</code> if a pengiriman with the primary key could not be found
	*/
	public static Pengiriman fetchByPrimaryKey(String id_pengiriman) {
		return getPersistence().fetchByPrimaryKey(id_pengiriman);
	}

	public static java.util.Map<java.io.Serializable, Pengiriman> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the pengirimans.
	*
	* @return the pengirimans
	*/
	public static List<Pengiriman> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<Pengiriman> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<Pengiriman> findAll(int start, int end,
		OrderByComparator<Pengiriman> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<Pengiriman> findAll(int start, int end,
		OrderByComparator<Pengiriman> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the pengirimans from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of pengirimans.
	*
	* @return the number of pengirimans
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static PengirimanPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<PengirimanPersistence, PengirimanPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(PengirimanPersistence.class);

		ServiceTracker<PengirimanPersistence, PengirimanPersistence> serviceTracker =
			new ServiceTracker<PengirimanPersistence, PengirimanPersistence>(bundle.getBundleContext(),
				PengirimanPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}