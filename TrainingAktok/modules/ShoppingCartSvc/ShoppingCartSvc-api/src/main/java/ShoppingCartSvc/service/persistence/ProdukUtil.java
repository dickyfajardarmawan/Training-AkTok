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

import ShoppingCartSvc.model.Produk;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the produk service. This utility wraps {@link ShoppingCartSvc.service.persistence.impl.ProdukPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProdukPersistence
 * @see ShoppingCartSvc.service.persistence.impl.ProdukPersistenceImpl
 * @generated
 */
@ProviderType
public class ProdukUtil {
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
	public static void clearCache(Produk produk) {
		getPersistence().clearCache(produk);
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
	public static List<Produk> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Produk> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Produk> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator<Produk> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Produk update(Produk produk) {
		return getPersistence().update(produk);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Produk update(Produk produk, ServiceContext serviceContext) {
		return getPersistence().update(produk, serviceContext);
	}

	/**
	* Returns all the produks where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching produks
	*/
	public static List<Produk> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

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
	public static List<Produk> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

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
	public static List<Produk> findByUuid(String uuid, int start, int end,
		OrderByComparator<Produk> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

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
	public static List<Produk> findByUuid(String uuid, int start, int end,
		OrderByComparator<Produk> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first produk in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching produk
	* @throws NoSuchProdukException if a matching produk could not be found
	*/
	public static Produk findByUuid_First(String uuid,
		OrderByComparator<Produk> orderByComparator)
		throws ShoppingCartSvc.exception.NoSuchProdukException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first produk in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching produk, or <code>null</code> if a matching produk could not be found
	*/
	public static Produk fetchByUuid_First(String uuid,
		OrderByComparator<Produk> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last produk in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching produk
	* @throws NoSuchProdukException if a matching produk could not be found
	*/
	public static Produk findByUuid_Last(String uuid,
		OrderByComparator<Produk> orderByComparator)
		throws ShoppingCartSvc.exception.NoSuchProdukException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last produk in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching produk, or <code>null</code> if a matching produk could not be found
	*/
	public static Produk fetchByUuid_Last(String uuid,
		OrderByComparator<Produk> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the produks before and after the current produk in the ordered set where uuid = &#63;.
	*
	* @param id_produk the primary key of the current produk
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next produk
	* @throws NoSuchProdukException if a produk with the primary key could not be found
	*/
	public static Produk[] findByUuid_PrevAndNext(String id_produk,
		String uuid, OrderByComparator<Produk> orderByComparator)
		throws ShoppingCartSvc.exception.NoSuchProdukException {
		return getPersistence()
				   .findByUuid_PrevAndNext(id_produk, uuid, orderByComparator);
	}

	/**
	* Removes all the produks where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of produks where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching produks
	*/
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Caches the produk in the entity cache if it is enabled.
	*
	* @param produk the produk
	*/
	public static void cacheResult(Produk produk) {
		getPersistence().cacheResult(produk);
	}

	/**
	* Caches the produks in the entity cache if it is enabled.
	*
	* @param produks the produks
	*/
	public static void cacheResult(List<Produk> produks) {
		getPersistence().cacheResult(produks);
	}

	/**
	* Creates a new produk with the primary key. Does not add the produk to the database.
	*
	* @param id_produk the primary key for the new produk
	* @return the new produk
	*/
	public static Produk create(String id_produk) {
		return getPersistence().create(id_produk);
	}

	/**
	* Removes the produk with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id_produk the primary key of the produk
	* @return the produk that was removed
	* @throws NoSuchProdukException if a produk with the primary key could not be found
	*/
	public static Produk remove(String id_produk)
		throws ShoppingCartSvc.exception.NoSuchProdukException {
		return getPersistence().remove(id_produk);
	}

	public static Produk updateImpl(Produk produk) {
		return getPersistence().updateImpl(produk);
	}

	/**
	* Returns the produk with the primary key or throws a {@link NoSuchProdukException} if it could not be found.
	*
	* @param id_produk the primary key of the produk
	* @return the produk
	* @throws NoSuchProdukException if a produk with the primary key could not be found
	*/
	public static Produk findByPrimaryKey(String id_produk)
		throws ShoppingCartSvc.exception.NoSuchProdukException {
		return getPersistence().findByPrimaryKey(id_produk);
	}

	/**
	* Returns the produk with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id_produk the primary key of the produk
	* @return the produk, or <code>null</code> if a produk with the primary key could not be found
	*/
	public static Produk fetchByPrimaryKey(String id_produk) {
		return getPersistence().fetchByPrimaryKey(id_produk);
	}

	public static java.util.Map<java.io.Serializable, Produk> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the produks.
	*
	* @return the produks
	*/
	public static List<Produk> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<Produk> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<Produk> findAll(int start, int end,
		OrderByComparator<Produk> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<Produk> findAll(int start, int end,
		OrderByComparator<Produk> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the produks from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of produks.
	*
	* @return the number of produks
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static ProdukPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ProdukPersistence, ProdukPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(ProdukPersistence.class);

		ServiceTracker<ProdukPersistence, ProdukPersistence> serviceTracker = new ServiceTracker<ProdukPersistence, ProdukPersistence>(bundle.getBundleContext(),
				ProdukPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}