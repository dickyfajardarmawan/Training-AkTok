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

package TokoSvc.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TokoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TokoLocalService
 * @generated
 */
@ProviderType
public class TokoLocalServiceWrapper implements TokoLocalService,
	ServiceWrapper<TokoLocalService> {
	public TokoLocalServiceWrapper(TokoLocalService tokoLocalService) {
		_tokoLocalService = tokoLocalService;
	}

	/**
	* Adds the toko to the database. Also notifies the appropriate model listeners.
	*
	* @param toko the toko
	* @return the toko that was added
	*/
	@Override
	public TokoSvc.model.Toko addToko(TokoSvc.model.Toko toko) {
		return _tokoLocalService.addToko(toko);
	}

	/**
	* Creates a new toko with the primary key. Does not add the toko to the database.
	*
	* @param id_toko the primary key for the new toko
	* @return the new toko
	*/
	@Override
	public TokoSvc.model.Toko createToko(String id_toko) {
		return _tokoLocalService.createToko(id_toko);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _tokoLocalService.deletePersistedModel(persistedModel);
	}

	/**
	* Deletes the toko with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id_toko the primary key of the toko
	* @return the toko that was removed
	* @throws PortalException if a toko with the primary key could not be found
	*/
	@Override
	public TokoSvc.model.Toko deleteToko(String id_toko)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _tokoLocalService.deleteToko(id_toko);
	}

	/**
	* Deletes the toko from the database. Also notifies the appropriate model listeners.
	*
	* @param toko the toko
	* @return the toko that was removed
	*/
	@Override
	public TokoSvc.model.Toko deleteToko(TokoSvc.model.Toko toko) {
		return _tokoLocalService.deleteToko(toko);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tokoLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _tokoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TokoSvc.model.impl.TokoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _tokoLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TokoSvc.model.impl.TokoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _tokoLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _tokoLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _tokoLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public TokoSvc.model.Toko fetchToko(String id_toko) {
		return _tokoLocalService.fetchToko(id_toko);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public String getOSGiServiceIdentifier() {
		return _tokoLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _tokoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the toko with the primary key.
	*
	* @param id_toko the primary key of the toko
	* @return the toko
	* @throws PortalException if a toko with the primary key could not be found
	*/
	@Override
	public TokoSvc.model.Toko getToko(String id_toko)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _tokoLocalService.getToko(id_toko);
	}

	/**
	* Returns a range of all the tokos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TokoSvc.model.impl.TokoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tokos
	* @param end the upper bound of the range of tokos (not inclusive)
	* @return the range of tokos
	*/
	@Override
	public java.util.List<TokoSvc.model.Toko> getTokos(int start, int end) {
		return _tokoLocalService.getTokos(start, end);
	}

	/**
	* Returns the number of tokos.
	*
	* @return the number of tokos
	*/
	@Override
	public int getTokosCount() {
		return _tokoLocalService.getTokosCount();
	}

	/**
	* Updates the toko in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param toko the toko
	* @return the toko that was updated
	*/
	@Override
	public TokoSvc.model.Toko updateToko(TokoSvc.model.Toko toko) {
		return _tokoLocalService.updateToko(toko);
	}

	@Override
	public TokoLocalService getWrappedService() {
		return _tokoLocalService;
	}

	@Override
	public void setWrappedService(TokoLocalService tokoLocalService) {
		_tokoLocalService = tokoLocalService;
	}

	private TokoLocalService _tokoLocalService;
}