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

package ShoppingCartSvc.service.base;

import ShoppingCartSvc.model.Cart;

import ShoppingCartSvc.service.CartService;

import ShoppingCartSvc.service.persistence.CartPersistence;
import ShoppingCartSvc.service.persistence.ProdukPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.service.BaseServiceImpl;
import com.liferay.portal.kernel.service.persistence.ClassNamePersistence;
import com.liferay.portal.kernel.service.persistence.UserPersistence;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the cart remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link ShoppingCartSvc.service.impl.CartServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ShoppingCartSvc.service.impl.CartServiceImpl
 * @see ShoppingCartSvc.service.CartServiceUtil
 * @generated
 */
public abstract class CartServiceBaseImpl extends BaseServiceImpl
	implements CartService, IdentifiableOSGiService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ShoppingCartSvc.service.CartServiceUtil} to access the cart remote service.
	 */

	/**
	 * Returns the cart local service.
	 *
	 * @return the cart local service
	 */
	public ShoppingCartSvc.service.CartLocalService getCartLocalService() {
		return cartLocalService;
	}

	/**
	 * Sets the cart local service.
	 *
	 * @param cartLocalService the cart local service
	 */
	public void setCartLocalService(
		ShoppingCartSvc.service.CartLocalService cartLocalService) {
		this.cartLocalService = cartLocalService;
	}

	/**
	 * Returns the cart remote service.
	 *
	 * @return the cart remote service
	 */
	public CartService getCartService() {
		return cartService;
	}

	/**
	 * Sets the cart remote service.
	 *
	 * @param cartService the cart remote service
	 */
	public void setCartService(CartService cartService) {
		this.cartService = cartService;
	}

	/**
	 * Returns the cart persistence.
	 *
	 * @return the cart persistence
	 */
	public CartPersistence getCartPersistence() {
		return cartPersistence;
	}

	/**
	 * Sets the cart persistence.
	 *
	 * @param cartPersistence the cart persistence
	 */
	public void setCartPersistence(CartPersistence cartPersistence) {
		this.cartPersistence = cartPersistence;
	}

	/**
	 * Returns the produk local service.
	 *
	 * @return the produk local service
	 */
	public ShoppingCartSvc.service.ProdukLocalService getProdukLocalService() {
		return produkLocalService;
	}

	/**
	 * Sets the produk local service.
	 *
	 * @param produkLocalService the produk local service
	 */
	public void setProdukLocalService(
		ShoppingCartSvc.service.ProdukLocalService produkLocalService) {
		this.produkLocalService = produkLocalService;
	}

	/**
	 * Returns the produk remote service.
	 *
	 * @return the produk remote service
	 */
	public ShoppingCartSvc.service.ProdukService getProdukService() {
		return produkService;
	}

	/**
	 * Sets the produk remote service.
	 *
	 * @param produkService the produk remote service
	 */
	public void setProdukService(
		ShoppingCartSvc.service.ProdukService produkService) {
		this.produkService = produkService;
	}

	/**
	 * Returns the produk persistence.
	 *
	 * @return the produk persistence
	 */
	public ProdukPersistence getProdukPersistence() {
		return produkPersistence;
	}

	/**
	 * Sets the produk persistence.
	 *
	 * @param produkPersistence the produk persistence
	 */
	public void setProdukPersistence(ProdukPersistence produkPersistence) {
		this.produkPersistence = produkPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.kernel.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.kernel.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the class name local service.
	 *
	 * @return the class name local service
	 */
	public com.liferay.portal.kernel.service.ClassNameLocalService getClassNameLocalService() {
		return classNameLocalService;
	}

	/**
	 * Sets the class name local service.
	 *
	 * @param classNameLocalService the class name local service
	 */
	public void setClassNameLocalService(
		com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService) {
		this.classNameLocalService = classNameLocalService;
	}

	/**
	 * Returns the class name remote service.
	 *
	 * @return the class name remote service
	 */
	public com.liferay.portal.kernel.service.ClassNameService getClassNameService() {
		return classNameService;
	}

	/**
	 * Sets the class name remote service.
	 *
	 * @param classNameService the class name remote service
	 */
	public void setClassNameService(
		com.liferay.portal.kernel.service.ClassNameService classNameService) {
		this.classNameService = classNameService;
	}

	/**
	 * Returns the class name persistence.
	 *
	 * @return the class name persistence
	 */
	public ClassNamePersistence getClassNamePersistence() {
		return classNamePersistence;
	}

	/**
	 * Sets the class name persistence.
	 *
	 * @param classNamePersistence the class name persistence
	 */
	public void setClassNamePersistence(
		ClassNamePersistence classNamePersistence) {
		this.classNamePersistence = classNamePersistence;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.kernel.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.kernel.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.kernel.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.kernel.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.kernel.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
	}

	public void destroy() {
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return CartService.class.getName();
	}

	protected Class<?> getModelClass() {
		return Cart.class;
	}

	protected String getModelClassName() {
		return Cart.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = cartPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = ShoppingCartSvc.service.CartLocalService.class)
	protected ShoppingCartSvc.service.CartLocalService cartLocalService;
	@BeanReference(type = CartService.class)
	protected CartService cartService;
	@BeanReference(type = CartPersistence.class)
	protected CartPersistence cartPersistence;
	@BeanReference(type = ShoppingCartSvc.service.ProdukLocalService.class)
	protected ShoppingCartSvc.service.ProdukLocalService produkLocalService;
	@BeanReference(type = ShoppingCartSvc.service.ProdukService.class)
	protected ShoppingCartSvc.service.ProdukService produkService;
	@BeanReference(type = ProdukPersistence.class)
	protected ProdukPersistence produkPersistence;
	@ServiceReference(type = com.liferay.counter.kernel.service.CounterLocalService.class)
	protected com.liferay.counter.kernel.service.CounterLocalService counterLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.ClassNameLocalService.class)
	protected com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.ClassNameService.class)
	protected com.liferay.portal.kernel.service.ClassNameService classNameService;
	@ServiceReference(type = ClassNamePersistence.class)
	protected ClassNamePersistence classNamePersistence;
	@ServiceReference(type = com.liferay.portal.kernel.service.ResourceLocalService.class)
	protected com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.UserLocalService.class)
	protected com.liferay.portal.kernel.service.UserLocalService userLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.UserService.class)
	protected com.liferay.portal.kernel.service.UserService userService;
	@ServiceReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
}