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

package UploadBuktiSpjSvc.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the Pengiriman service. Represents a row in the &quot;master_Pengiriman&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see PengirimanModel
 * @see UploadBuktiSpjSvc.model.impl.PengirimanImpl
 * @see UploadBuktiSpjSvc.model.impl.PengirimanModelImpl
 * @generated
 */
@ImplementationClassName("UploadBuktiSpjSvc.model.impl.PengirimanImpl")
@ProviderType
public interface Pengiriman extends PengirimanModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link UploadBuktiSpjSvc.model.impl.PengirimanImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Pengiriman, String> ID_PENGIRIMAN_ACCESSOR = new Accessor<Pengiriman, String>() {
			@Override
			public String get(Pengiriman pengiriman) {
				return pengiriman.getId_pengiriman();
			}

			@Override
			public Class<String> getAttributeClass() {
				return String.class;
			}

			@Override
			public Class<Pengiriman> getTypeClass() {
				return Pengiriman.class;
			}
		};
}