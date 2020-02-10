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

package ProdukSvc.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the Produk service. Represents a row in the &quot;master_Produk&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see ProdukModel
 * @see ProdukSvc.model.impl.ProdukImpl
 * @see ProdukSvc.model.impl.ProdukModelImpl
 * @generated
 */
@ImplementationClassName("ProdukSvc.model.impl.ProdukImpl")
@ProviderType
public interface Produk extends ProdukModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link ProdukSvc.model.impl.ProdukImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Produk, String> ID_PRODUK_ACCESSOR = new Accessor<Produk, String>() {
			@Override
			public String get(Produk produk) {
				return produk.getId_produk();
			}

			@Override
			public Class<String> getAttributeClass() {
				return String.class;
			}

			@Override
			public Class<Produk> getTypeClass() {
				return Produk.class;
			}
		};
}