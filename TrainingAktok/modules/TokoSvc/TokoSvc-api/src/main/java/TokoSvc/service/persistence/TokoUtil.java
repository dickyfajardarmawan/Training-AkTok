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

import TokoSvc.model.Toko;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the toko service. This utility wraps {@link TokoSvc.service.persistence.impl.TokoPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TokoPersistence
 * @see TokoSvc.service.persistence.impl.TokoPersistenceImpl
 * @generated
 */
@ProviderType
public class TokoUtil {
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
	public static void clearCache(Toko toko) {
		getPersistence().clearCache(toko);
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
	public static List<Toko> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Toko> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Toko> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator<Toko> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Toko update(Toko toko) {
		return getPersistence().update(toko);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Toko update(Toko toko, ServiceContext serviceContext) {
		return getPersistence().update(toko, serviceContext);
	}

	/**
	* Returns all the tokos where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching tokos
	*/
	public static List<Toko> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

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
	public static List<Toko> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

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
	public static List<Toko> findByUuid(String uuid, int start, int end,
		OrderByComparator<Toko> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

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
	public static List<Toko> findByUuid(String uuid, int start, int end,
		OrderByComparator<Toko> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first toko in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching toko
	* @throws NoSuchTokoException if a matching toko could not be found
	*/
	public static Toko findByUuid_First(String uuid,
		OrderByComparator<Toko> orderByComparator)
		throws TokoSvc.exception.NoSuchTokoException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first toko in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching toko, or <code>null</code> if a matching toko could not be found
	*/
	public static Toko fetchByUuid_First(String uuid,
		OrderByComparator<Toko> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last toko in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching toko
	* @throws NoSuchTokoException if a matching toko could not be found
	*/
	public static Toko findByUuid_Last(String uuid,
		OrderByComparator<Toko> orderByComparator)
		throws TokoSvc.exception.NoSuchTokoException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last toko in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching toko, or <code>null</code> if a matching toko could not be found
	*/
	public static Toko fetchByUuid_Last(String uuid,
		OrderByComparator<Toko> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the tokos before and after the current toko in the ordered set where uuid = &#63;.
	*
	* @param id_toko the primary key of the current toko
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next toko
	* @throws NoSuchTokoException if a toko with the primary key could not be found
	*/
	public static Toko[] findByUuid_PrevAndNext(String id_toko, String uuid,
		OrderByComparator<Toko> orderByComparator)
		throws TokoSvc.exception.NoSuchTokoException {
		return getPersistence()
				   .findByUuid_PrevAndNext(id_toko, uuid, orderByComparator);
	}

	/**
	* Removes all the tokos where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of tokos where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching tokos
	*/
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Caches the toko in the entity cache if it is enabled.
	*
	* @param toko the toko
	*/
	public static void cacheResult(Toko toko) {
		getPersistence().cacheResult(toko);
	}

	/**
	* Caches the tokos in the entity cache if it is enabled.
	*
	* @param tokos the tokos
	*/
	public static void cacheResult(List<Toko> tokos) {
		getPersistence().cacheResult(tokos);
	}

	/**
	* Creates a new toko with the primary key. Does not add the toko to the database.
	*
	* @param id_toko the primary key for the new toko
	* @return the new toko
	*/
	public static Toko create(String id_toko) {
		return getPersistence().create(id_toko);
	}

	/**
	* Removes the toko with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id_toko the primary key of the toko
	* @return the toko that was removed
	* @throws NoSuchTokoException if a toko with the primary key could not be found
	*/
	public static Toko remove(String id_toko)
		throws TokoSvc.exception.NoSuchTokoException {
		return getPersistence().remove(id_toko);
	}

	public static Toko updateImpl(Toko toko) {
		return getPersistence().updateImpl(toko);
	}

	/**
	* Returns the toko with the primary key or throws a {@link NoSuchTokoException} if it could not be found.
	*
	* @param id_toko the primary key of the toko
	* @return the toko
	* @throws NoSuchTokoException if a toko with the primary key could not be found
	*/
	public static Toko findByPrimaryKey(String id_toko)
		throws TokoSvc.exception.NoSuchTokoException {
		return getPersistence().findByPrimaryKey(id_toko);
	}

	/**
	* Returns the toko with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id_toko the primary key of the toko
	* @return the toko, or <code>null</code> if a toko with the primary key could not be found
	*/
	public static Toko fetchByPrimaryKey(String id_toko) {
		return getPersistence().fetchByPrimaryKey(id_toko);
	}

	public static java.util.Map<java.io.Serializable, Toko> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the tokos.
	*
	* @return the tokos
	*/
	public static List<Toko> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<Toko> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<Toko> findAll(int start, int end,
		OrderByComparator<Toko> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<Toko> findAll(int start, int end,
		OrderByComparator<Toko> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the tokos from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of tokos.
	*
	* @return the number of tokos
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static TokoPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<TokoPersistence, TokoPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(TokoPersistence.class);

		ServiceTracker<TokoPersistence, TokoPersistence> serviceTracker = new ServiceTracker<TokoPersistence, TokoPersistence>(bundle.getBundleContext(),
				TokoPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}