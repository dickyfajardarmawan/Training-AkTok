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

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for Pengiriman. This utility wraps
 * {@link UploadBuktiSpjSvc.service.impl.PengirimanLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see PengirimanLocalService
 * @see UploadBuktiSpjSvc.service.base.PengirimanLocalServiceBaseImpl
 * @see UploadBuktiSpjSvc.service.impl.PengirimanLocalServiceImpl
 * @generated
 */
@ProviderType
public class PengirimanLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link UploadBuktiSpjSvc.service.impl.PengirimanLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the pengiriman to the database. Also notifies the appropriate model listeners.
	*
	* @param pengiriman the pengiriman
	* @return the pengiriman that was added
	*/
	public static UploadBuktiSpjSvc.model.Pengiriman addPengiriman(
		UploadBuktiSpjSvc.model.Pengiriman pengiriman) {
		return getService().addPengiriman(pengiriman);
	}

	/**
	* Creates a new pengiriman with the primary key. Does not add the pengiriman to the database.
	*
	* @param id_pengiriman the primary key for the new pengiriman
	* @return the new pengiriman
	*/
	public static UploadBuktiSpjSvc.model.Pengiriman createPengiriman(
		String id_pengiriman) {
		return getService().createPengiriman(id_pengiriman);
	}

	/**
	* Deletes the pengiriman from the database. Also notifies the appropriate model listeners.
	*
	* @param pengiriman the pengiriman
	* @return the pengiriman that was removed
	*/
	public static UploadBuktiSpjSvc.model.Pengiriman deletePengiriman(
		UploadBuktiSpjSvc.model.Pengiriman pengiriman) {
		return getService().deletePengiriman(pengiriman);
	}

	/**
	* Deletes the pengiriman with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id_pengiriman the primary key of the pengiriman
	* @return the pengiriman that was removed
	* @throws PortalException if a pengiriman with the primary key could not be found
	*/
	public static UploadBuktiSpjSvc.model.Pengiriman deletePengiriman(
		String id_pengiriman)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePengiriman(id_pengiriman);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UploadBuktiSpjSvc.model.impl.PengirimanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UploadBuktiSpjSvc.model.impl.PengirimanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static UploadBuktiSpjSvc.model.Pengiriman fetchPengiriman(
		String id_pengiriman) {
		return getService().fetchPengiriman(id_pengiriman);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	* Returns the pengiriman with the primary key.
	*
	* @param id_pengiriman the primary key of the pengiriman
	* @return the pengiriman
	* @throws PortalException if a pengiriman with the primary key could not be found
	*/
	public static UploadBuktiSpjSvc.model.Pengiriman getPengiriman(
		String id_pengiriman)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPengiriman(id_pengiriman);
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
	public static java.util.List<UploadBuktiSpjSvc.model.Pengiriman> getPengirimans(
		int start, int end) {
		return getService().getPengirimans(start, end);
	}

	/**
	* Returns the number of pengirimans.
	*
	* @return the number of pengirimans
	*/
	public static int getPengirimansCount() {
		return getService().getPengirimansCount();
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Updates the pengiriman in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param pengiriman the pengiriman
	* @return the pengiriman that was updated
	*/
	public static UploadBuktiSpjSvc.model.Pengiriman updatePengiriman(
		UploadBuktiSpjSvc.model.Pengiriman pengiriman) {
		return getService().updatePengiriman(pengiriman);
	}

	public static PengirimanLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<PengirimanLocalService, PengirimanLocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(PengirimanLocalService.class);

		ServiceTracker<PengirimanLocalService, PengirimanLocalService> serviceTracker =
			new ServiceTracker<PengirimanLocalService, PengirimanLocalService>(bundle.getBundleContext(),
				PengirimanLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}