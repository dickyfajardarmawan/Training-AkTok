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

package UploadBuktiSpjSvc.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PengirimanLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PengirimanLocalService
 * @generated
 */
@ProviderType
public class PengirimanLocalServiceWrapper implements PengirimanLocalService,
	ServiceWrapper<PengirimanLocalService> {
	public PengirimanLocalServiceWrapper(
		PengirimanLocalService pengirimanLocalService) {
		_pengirimanLocalService = pengirimanLocalService;
	}

	/**
	* Adds the pengiriman to the database. Also notifies the appropriate model listeners.
	*
	* @param pengiriman the pengiriman
	* @return the pengiriman that was added
	*/
	@Override
	public UploadBuktiSpjSvc.model.Pengiriman addPengiriman(
		UploadBuktiSpjSvc.model.Pengiriman pengiriman) {
		return _pengirimanLocalService.addPengiriman(pengiriman);
	}

	/**
	* Creates a new pengiriman with the primary key. Does not add the pengiriman to the database.
	*
	* @param id_pengiriman the primary key for the new pengiriman
	* @return the new pengiriman
	*/
	@Override
	public UploadBuktiSpjSvc.model.Pengiriman createPengiriman(
		String id_pengiriman) {
		return _pengirimanLocalService.createPengiriman(id_pengiriman);
	}

	/**
	* Deletes the pengiriman from the database. Also notifies the appropriate model listeners.
	*
	* @param pengiriman the pengiriman
	* @return the pengiriman that was removed
	*/
	@Override
	public UploadBuktiSpjSvc.model.Pengiriman deletePengiriman(
		UploadBuktiSpjSvc.model.Pengiriman pengiriman) {
		return _pengirimanLocalService.deletePengiriman(pengiriman);
	}

	/**
	* Deletes the pengiriman with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id_pengiriman the primary key of the pengiriman
	* @return the pengiriman that was removed
	* @throws PortalException if a pengiriman with the primary key could not be found
	*/
	@Override
	public UploadBuktiSpjSvc.model.Pengiriman deletePengiriman(
		String id_pengiriman)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _pengirimanLocalService.deletePengiriman(id_pengiriman);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _pengirimanLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _pengirimanLocalService.dynamicQuery();
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
		return _pengirimanLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UploadBuktiSpjSvc.model.impl.PengirimanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _pengirimanLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UploadBuktiSpjSvc.model.impl.PengirimanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _pengirimanLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _pengirimanLocalService.dynamicQueryCount(dynamicQuery);
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
		return _pengirimanLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public UploadBuktiSpjSvc.model.Pengiriman fetchPengiriman(
		String id_pengiriman) {
		return _pengirimanLocalService.fetchPengiriman(id_pengiriman);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public String getOSGiServiceIdentifier() {
		return _pengirimanLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Returns the pengiriman with the primary key.
	*
	* @param id_pengiriman the primary key of the pengiriman
	* @return the pengiriman
	* @throws PortalException if a pengiriman with the primary key could not be found
	*/
	@Override
	public UploadBuktiSpjSvc.model.Pengiriman getPengiriman(
		String id_pengiriman)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _pengirimanLocalService.getPengiriman(id_pengiriman);
	}

	/**
	* Returns a range of all the pengirimans.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UploadBuktiSpjSvc.model.impl.PengirimanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of pengirimans
	* @param end the upper bound of the range of pengirimans (not inclusive)
	* @return the range of pengirimans
	*/
	@Override
	public java.util.List<UploadBuktiSpjSvc.model.Pengiriman> getPengirimans(
		int start, int end) {
		return _pengirimanLocalService.getPengirimans(start, end);
	}

	/**
	* Returns the number of pengirimans.
	*
	* @return the number of pengirimans
	*/
	@Override
	public int getPengirimansCount() {
		return _pengirimanLocalService.getPengirimansCount();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _pengirimanLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Updates the pengiriman in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param pengiriman the pengiriman
	* @return the pengiriman that was updated
	*/
	@Override
	public UploadBuktiSpjSvc.model.Pengiriman updatePengiriman(
		UploadBuktiSpjSvc.model.Pengiriman pengiriman) {
		return _pengirimanLocalService.updatePengiriman(pengiriman);
	}

	@Override
	public PengirimanLocalService getWrappedService() {
		return _pengirimanLocalService;
	}

	@Override
	public void setWrappedService(PengirimanLocalService pengirimanLocalService) {
		_pengirimanLocalService = pengirimanLocalService;
	}

	private PengirimanLocalService _pengirimanLocalService;
}