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

package ShoppingCartSvc.service;

import aQute.bnd.annotation.ProviderType;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for Produk. This utility wraps
 * {@link ShoppingCartSvc.service.impl.ProdukLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see ProdukLocalService
 * @see ShoppingCartSvc.service.base.ProdukLocalServiceBaseImpl
 * @see ShoppingCartSvc.service.impl.ProdukLocalServiceImpl
 * @generated
 */
@ProviderType
public class ProdukLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link ShoppingCartSvc.service.impl.ProdukLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the produk to the database. Also notifies the appropriate model listeners.
	*
	* @param produk the produk
	* @return the produk that was added
	*/
	public static ShoppingCartSvc.model.Produk addProduk(
		ShoppingCartSvc.model.Produk produk) {
		return getService().addProduk(produk);
	}

	/**
	* Creates a new produk with the primary key. Does not add the produk to the database.
	*
	* @param id_produk the primary key for the new produk
	* @return the new produk
	*/
	public static ShoppingCartSvc.model.Produk createProduk(String id_produk) {
		return getService().createProduk(id_produk);
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	/**
	* Deletes the produk from the database. Also notifies the appropriate model listeners.
	*
	* @param produk the produk
	* @return the produk that was removed
	*/
	public static ShoppingCartSvc.model.Produk deleteProduk(
		ShoppingCartSvc.model.Produk produk) {
		return getService().deleteProduk(produk);
	}

	/**
	* Deletes the produk with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id_produk the primary key of the produk
	* @return the produk that was removed
	* @throws PortalException if a produk with the primary key could not be found
	*/
	public static ShoppingCartSvc.model.Produk deleteProduk(String id_produk)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteProduk(id_produk);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ShoppingCartSvc.model.impl.ProdukModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ShoppingCartSvc.model.impl.ProdukModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static ShoppingCartSvc.model.Produk fetchProduk(String id_produk) {
		return getService().fetchProduk(id_produk);
	}

	public static java.util.List<com.liferay.portal.kernel.json.JSONObject> getAllProduk() {
		return getService().getAllProduk();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the produk with the primary key.
	*
	* @param id_produk the primary key of the produk
	* @return the produk
	* @throws PortalException if a produk with the primary key could not be found
	*/
	public static ShoppingCartSvc.model.Produk getProduk(String id_produk)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getProduk(id_produk);
	}

	/**
	* Returns a range of all the produks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ShoppingCartSvc.model.impl.ProdukModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of produks
	* @param end the upper bound of the range of produks (not inclusive)
	* @return the range of produks
	*/
	public static java.util.List<ShoppingCartSvc.model.Produk> getProduks(
		int start, int end) {
		return getService().getProduks(start, end);
	}

	/**
	* Returns the number of produks.
	*
	* @return the number of produks
	*/
	public static int getProduksCount() {
		return getService().getProduksCount();
	}

	/**
	* Updates the produk in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param produk the produk
	* @return the produk that was updated
	*/
	public static ShoppingCartSvc.model.Produk updateProduk(
		ShoppingCartSvc.model.Produk produk) {
		return getService().updateProduk(produk);
	}

	public static ProdukLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ProdukLocalService, ProdukLocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(ProdukLocalService.class);

		ServiceTracker<ProdukLocalService, ProdukLocalService> serviceTracker = new ServiceTracker<ProdukLocalService, ProdukLocalService>(bundle.getBundleContext(),
				ProdukLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}