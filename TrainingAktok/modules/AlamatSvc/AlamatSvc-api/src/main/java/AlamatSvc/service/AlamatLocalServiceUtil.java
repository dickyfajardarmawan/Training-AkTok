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

package AlamatSvc.service;

import aQute.bnd.annotation.ProviderType;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for Alamat. This utility wraps
 * {@link AlamatSvc.service.impl.AlamatLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see AlamatLocalService
 * @see AlamatSvc.service.base.AlamatLocalServiceBaseImpl
 * @see AlamatSvc.service.impl.AlamatLocalServiceImpl
 * @generated
 */
@ProviderType
public class AlamatLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link AlamatSvc.service.impl.AlamatLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the alamat to the database. Also notifies the appropriate model listeners.
	*
	* @param alamat the alamat
	* @return the alamat that was added
	*/
	public static AlamatSvc.model.Alamat addAlamat(
		AlamatSvc.model.Alamat alamat) {
		return getService().addAlamat(alamat);
	}

	public static AlamatSvc.model.Alamat cariAlamatDenganIdAlamat(
		String idAlamat) {
		return getService().cariAlamatDenganIdAlamat(idAlamat);
	}

	public static java.util.List<com.liferay.portal.kernel.json.JSONObject> cariAlamatDenganIdToko(
		long idUser) {
		return getService().cariAlamatDenganIdToko(idUser);
	}

	/**
	* Creates a new alamat with the primary key. Does not add the alamat to the database.
	*
	* @param id_alamat the primary key for the new alamat
	* @return the new alamat
	*/
	public static AlamatSvc.model.Alamat createAlamat(String id_alamat) {
		return getService().createAlamat(id_alamat);
	}

	/**
	* Deletes the alamat from the database. Also notifies the appropriate model listeners.
	*
	* @param alamat the alamat
	* @return the alamat that was removed
	*/
	public static AlamatSvc.model.Alamat deleteAlamat(
		AlamatSvc.model.Alamat alamat) {
		return getService().deleteAlamat(alamat);
	}

	/**
	* Deletes the alamat with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id_alamat the primary key of the alamat
	* @return the alamat that was removed
	* @throws PortalException if a alamat with the primary key could not be found
	*/
	public static AlamatSvc.model.Alamat deleteAlamat(String id_alamat)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteAlamat(id_alamat);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AlamatSvc.model.impl.AlamatModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AlamatSvc.model.impl.AlamatModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static AlamatSvc.model.Alamat fetchAlamat(String id_alamat) {
		return getService().fetchAlamat(id_alamat);
	}

	public static AlamatSvc.model.Alamat gantiAlamat(String idAlamat,
		long idUser, String namaAlamat, String namaPenerima,
		long nomorHandphone, String alamatLengkap, long kodePos, String kota,
		String provinsi, String region, int status) {
		return getService()
				   .gantiAlamat(idAlamat, idUser, namaAlamat, namaPenerima,
			nomorHandphone, alamatLengkap, kodePos, kota, provinsi, region,
			status);
	}

	/**
	* Returns the alamat with the primary key.
	*
	* @param id_alamat the primary key of the alamat
	* @return the alamat
	* @throws PortalException if a alamat with the primary key could not be found
	*/
	public static AlamatSvc.model.Alamat getAlamat(String id_alamat)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getAlamat(id_alamat);
	}

	/**
	* Returns a range of all the alamats.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AlamatSvc.model.impl.AlamatModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of alamats
	* @param end the upper bound of the range of alamats (not inclusive)
	* @return the range of alamats
	*/
	public static java.util.List<AlamatSvc.model.Alamat> getAlamats(int start,
		int end) {
		return getService().getAlamats(start, end);
	}

	/**
	* Returns the number of alamats.
	*
	* @return the number of alamats
	*/
	public static int getAlamatsCount() {
		return getService().getAlamatsCount();
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

	public static AlamatSvc.model.Alamat tambahAlamat(long idUser,
		String namaAlamat, String namaPenerima, long nomorHandphone,
		String alamatLengkap, long kodePos, String kota, String provinsi,
		String region) {
		return getService()
				   .tambahAlamat(idUser, namaAlamat, namaPenerima,
			nomorHandphone, alamatLengkap, kodePos, kota, provinsi, region);
	}

	public static void ubahStatusAlamatById(String idAlamat) {
		getService().ubahStatusAlamatById(idAlamat);
	}

	/**
	* Updates the alamat in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param alamat the alamat
	* @return the alamat that was updated
	*/
	public static AlamatSvc.model.Alamat updateAlamat(
		AlamatSvc.model.Alamat alamat) {
		return getService().updateAlamat(alamat);
	}

	public static AlamatLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AlamatLocalService, AlamatLocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(AlamatLocalService.class);

		ServiceTracker<AlamatLocalService, AlamatLocalService> serviceTracker = new ServiceTracker<AlamatLocalService, AlamatLocalService>(bundle.getBundleContext(),
				AlamatLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}