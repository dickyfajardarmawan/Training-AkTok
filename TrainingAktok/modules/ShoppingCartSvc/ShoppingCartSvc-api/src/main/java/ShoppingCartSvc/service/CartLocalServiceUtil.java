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
 * Provides the local service utility for Cart. This utility wraps
 * {@link ShoppingCartSvc.service.impl.CartLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see CartLocalService
 * @see ShoppingCartSvc.service.base.CartLocalServiceBaseImpl
 * @see ShoppingCartSvc.service.impl.CartLocalServiceImpl
 * @generated
 */
@ProviderType
public class CartLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link ShoppingCartSvc.service.impl.CartLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the cart to the database. Also notifies the appropriate model listeners.
	*
	* @param cart the cart
	* @return the cart that was added
	*/
	public static ShoppingCartSvc.model.Cart addCart(
		ShoppingCartSvc.model.Cart cart) {
		return getService().addCart(cart);
	}

	public static ShoppingCartSvc.model.Cart addCart(String id_produk,
		long id_user, long jumlah_produk, long sub_total) {
		return getService().addCart(id_produk, id_user, jumlah_produk, sub_total);
	}

	/**
	* Creates a new cart with the primary key. Does not add the cart to the database.
	*
	* @param id_cart the primary key for the new cart
	* @return the new cart
	*/
	public static ShoppingCartSvc.model.Cart createCart(String id_cart) {
		return getService().createCart(id_cart);
	}

	/**
	* Deletes the cart from the database. Also notifies the appropriate model listeners.
	*
	* @param cart the cart
	* @return the cart that was removed
	*/
	public static ShoppingCartSvc.model.Cart deleteCart(
		ShoppingCartSvc.model.Cart cart) {
		return getService().deleteCart(cart);
	}

	/**
	* Deletes the cart with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id_cart the primary key of the cart
	* @return the cart that was removed
	* @throws PortalException if a cart with the primary key could not be found
	*/
	public static ShoppingCartSvc.model.Cart deleteCart(String id_cart)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteCart(id_cart);
	}

	public static void deleteCartById(String cartId) {
		getService().deleteCartById(cartId);
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ShoppingCartSvc.model.impl.CartModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ShoppingCartSvc.model.impl.CartModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static ShoppingCartSvc.model.Cart fetchCart(String id_cart) {
		return getService().fetchCart(id_cart);
	}

	/**
	* Returns the cart with the primary key.
	*
	* @param id_cart the primary key of the cart
	* @return the cart
	* @throws PortalException if a cart with the primary key could not be found
	*/
	public static ShoppingCartSvc.model.Cart getCart(String id_cart)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getCart(id_cart);
	}

	public static java.util.List<com.liferay.portal.kernel.json.JSONObject> getCartByIdUser(
		long idUser) {
		return getService().getCartByIdUser(idUser);
	}

	/**
	* Returns a range of all the carts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ShoppingCartSvc.model.impl.CartModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of carts
	* @param end the upper bound of the range of carts (not inclusive)
	* @return the range of carts
	*/
	public static java.util.List<ShoppingCartSvc.model.Cart> getCarts(
		int start, int end) {
		return getService().getCarts(start, end);
	}

	/**
	* Returns the number of carts.
	*
	* @return the number of carts
	*/
	public static int getCartsCount() {
		return getService().getCartsCount();
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
	* Updates the cart in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param cart the cart
	* @return the cart that was updated
	*/
	public static ShoppingCartSvc.model.Cart updateCart(
		ShoppingCartSvc.model.Cart cart) {
		return getService().updateCart(cart);
	}

	public static CartLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CartLocalService, CartLocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(CartLocalService.class);

		ServiceTracker<CartLocalService, CartLocalService> serviceTracker = new ServiceTracker<CartLocalService, CartLocalService>(bundle.getBundleContext(),
				CartLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}