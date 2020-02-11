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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AlamatLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AlamatLocalService
 * @generated
 */
@ProviderType
public class AlamatLocalServiceWrapper implements AlamatLocalService,
	ServiceWrapper<AlamatLocalService> {
	public AlamatLocalServiceWrapper(AlamatLocalService alamatLocalService) {
		_alamatLocalService = alamatLocalService;
	}

	/**
	* Adds the alamat to the database. Also notifies the appropriate model listeners.
	*
	* @param alamat the alamat
	* @return the alamat that was added
	*/
	@Override
	public AlamatSvc.model.Alamat addAlamat(AlamatSvc.model.Alamat alamat) {
		return _alamatLocalService.addAlamat(alamat);
	}

	@Override
	public AlamatSvc.model.Alamat cariAlamatDenganIdAlamat(String idAlamat) {
		return _alamatLocalService.cariAlamatDenganIdAlamat(idAlamat);
	}

	@Override
	public java.util.List<com.liferay.portal.kernel.json.JSONObject> cariAlamatDenganIdToko(
		long idUser) {
		return _alamatLocalService.cariAlamatDenganIdToko(idUser);
	}

	/**
	* Creates a new alamat with the primary key. Does not add the alamat to the database.
	*
	* @param id_alamat the primary key for the new alamat
	* @return the new alamat
	*/
	@Override
	public AlamatSvc.model.Alamat createAlamat(String id_alamat) {
		return _alamatLocalService.createAlamat(id_alamat);
	}

	/**
	* Deletes the alamat from the database. Also notifies the appropriate model listeners.
	*
	* @param alamat the alamat
	* @return the alamat that was removed
	*/
	@Override
	public AlamatSvc.model.Alamat deleteAlamat(AlamatSvc.model.Alamat alamat) {
		return _alamatLocalService.deleteAlamat(alamat);
	}

	/**
	* Deletes the alamat with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id_alamat the primary key of the alamat
	* @return the alamat that was removed
	* @throws PortalException if a alamat with the primary key could not be found
	*/
	@Override
	public AlamatSvc.model.Alamat deleteAlamat(String id_alamat)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _alamatLocalService.deleteAlamat(id_alamat);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _alamatLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _alamatLocalService.dynamicQuery();
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
		return _alamatLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _alamatLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _alamatLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _alamatLocalService.dynamicQueryCount(dynamicQuery);
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
		return _alamatLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public AlamatSvc.model.Alamat fetchAlamat(String id_alamat) {
		return _alamatLocalService.fetchAlamat(id_alamat);
	}

	@Override
	public AlamatSvc.model.Alamat gantiAlamat(String idAlamat, long idUser,
		String namaAlamat, String namaPenerima, long nomorHandphone,
		String alamatLengkap, long kodePos, String kota, String provinsi,
		String region, int status) {
		return _alamatLocalService.gantiAlamat(idAlamat, idUser, namaAlamat,
			namaPenerima, nomorHandphone, alamatLengkap, kodePos, kota,
			provinsi, region, status);
	}

	/**
	* Returns the alamat with the primary key.
	*
	* @param id_alamat the primary key of the alamat
	* @return the alamat
	* @throws PortalException if a alamat with the primary key could not be found
	*/
	@Override
	public AlamatSvc.model.Alamat getAlamat(String id_alamat)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _alamatLocalService.getAlamat(id_alamat);
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
	@Override
	public java.util.List<AlamatSvc.model.Alamat> getAlamats(int start, int end) {
		return _alamatLocalService.getAlamats(start, end);
	}

	/**
	* Returns the number of alamats.
	*
	* @return the number of alamats
	*/
	@Override
	public int getAlamatsCount() {
		return _alamatLocalService.getAlamatsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public String getOSGiServiceIdentifier() {
		return _alamatLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _alamatLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public AlamatSvc.model.Alamat tambahAlamat(long idUser, String namaAlamat,
		String namaPenerima, long nomorHandphone, String alamatLengkap,
		long kodePos, String kota, String provinsi, String region) {
		return _alamatLocalService.tambahAlamat(idUser, namaAlamat,
			namaPenerima, nomorHandphone, alamatLengkap, kodePos, kota,
			provinsi, region);
	}

	@Override
	public void ubahStatusAlamatById(String idAlamat) {
		_alamatLocalService.ubahStatusAlamatById(idAlamat);
	}

	/**
	* Updates the alamat in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param alamat the alamat
	* @return the alamat that was updated
	*/
	@Override
	public AlamatSvc.model.Alamat updateAlamat(AlamatSvc.model.Alamat alamat) {
		return _alamatLocalService.updateAlamat(alamat);
	}

	@Override
	public AlamatLocalService getWrappedService() {
		return _alamatLocalService;
	}

	@Override
	public void setWrappedService(AlamatLocalService alamatLocalService) {
		_alamatLocalService = alamatLocalService;
	}

	private AlamatLocalService _alamatLocalService;
}