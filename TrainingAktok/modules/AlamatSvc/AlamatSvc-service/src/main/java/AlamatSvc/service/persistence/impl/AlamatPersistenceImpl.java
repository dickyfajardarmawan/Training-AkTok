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

package AlamatSvc.service.persistence.impl;

import AlamatSvc.exception.NoSuchAlamatException;

import AlamatSvc.model.Alamat;

import AlamatSvc.model.impl.AlamatImpl;
import AlamatSvc.model.impl.AlamatModelImpl;

import AlamatSvc.service.persistence.AlamatPersistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import java.io.Serializable;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the alamat service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AlamatPersistence
 * @see AlamatSvc.service.persistence.AlamatUtil
 * @generated
 */
@ProviderType
public class AlamatPersistenceImpl extends BasePersistenceImpl<Alamat>
	implements AlamatPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AlamatUtil} to access the alamat persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AlamatImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AlamatModelImpl.ENTITY_CACHE_ENABLED,
			AlamatModelImpl.FINDER_CACHE_ENABLED, AlamatImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AlamatModelImpl.ENTITY_CACHE_ENABLED,
			AlamatModelImpl.FINDER_CACHE_ENABLED, AlamatImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AlamatModelImpl.ENTITY_CACHE_ENABLED,
			AlamatModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(AlamatModelImpl.ENTITY_CACHE_ENABLED,
			AlamatModelImpl.FINDER_CACHE_ENABLED, AlamatImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(AlamatModelImpl.ENTITY_CACHE_ENABLED,
			AlamatModelImpl.FINDER_CACHE_ENABLED, AlamatImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			AlamatModelImpl.UUID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(AlamatModelImpl.ENTITY_CACHE_ENABLED,
			AlamatModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the alamats where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching alamats
	 */
	@Override
	public List<Alamat> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the alamats where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AlamatModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of alamats
	 * @param end the upper bound of the range of alamats (not inclusive)
	 * @return the range of matching alamats
	 */
	@Override
	public List<Alamat> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the alamats where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AlamatModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of alamats
	 * @param end the upper bound of the range of alamats (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching alamats
	 */
	@Override
	public List<Alamat> findByUuid(String uuid, int start, int end,
		OrderByComparator<Alamat> orderByComparator) {
		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the alamats where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AlamatModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of alamats
	 * @param end the upper bound of the range of alamats (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching alamats
	 */
	@Override
	public List<Alamat> findByUuid(String uuid, int start, int end,
		OrderByComparator<Alamat> orderByComparator, boolean retrieveFromCache) {
		uuid = Objects.toString(uuid, "");

		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid, start, end, orderByComparator };
		}

		List<Alamat> list = null;

		if (retrieveFromCache) {
			list = (List<Alamat>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (Alamat alamat : list) {
					if (!uuid.equals(alamat.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_ALAMAT_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AlamatModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				if (!pagination) {
					list = (List<Alamat>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Alamat>)QueryUtil.list(q, getDialect(), start,
							end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first alamat in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching alamat
	 * @throws NoSuchAlamatException if a matching alamat could not be found
	 */
	@Override
	public Alamat findByUuid_First(String uuid,
		OrderByComparator<Alamat> orderByComparator)
		throws NoSuchAlamatException {
		Alamat alamat = fetchByUuid_First(uuid, orderByComparator);

		if (alamat != null) {
			return alamat;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append("}");

		throw new NoSuchAlamatException(msg.toString());
	}

	/**
	 * Returns the first alamat in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching alamat, or <code>null</code> if a matching alamat could not be found
	 */
	@Override
	public Alamat fetchByUuid_First(String uuid,
		OrderByComparator<Alamat> orderByComparator) {
		List<Alamat> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last alamat in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching alamat
	 * @throws NoSuchAlamatException if a matching alamat could not be found
	 */
	@Override
	public Alamat findByUuid_Last(String uuid,
		OrderByComparator<Alamat> orderByComparator)
		throws NoSuchAlamatException {
		Alamat alamat = fetchByUuid_Last(uuid, orderByComparator);

		if (alamat != null) {
			return alamat;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append("}");

		throw new NoSuchAlamatException(msg.toString());
	}

	/**
	 * Returns the last alamat in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching alamat, or <code>null</code> if a matching alamat could not be found
	 */
	@Override
	public Alamat fetchByUuid_Last(String uuid,
		OrderByComparator<Alamat> orderByComparator) {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<Alamat> list = findByUuid(uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the alamats before and after the current alamat in the ordered set where uuid = &#63;.
	 *
	 * @param id_alamat the primary key of the current alamat
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next alamat
	 * @throws NoSuchAlamatException if a alamat with the primary key could not be found
	 */
	@Override
	public Alamat[] findByUuid_PrevAndNext(String id_alamat, String uuid,
		OrderByComparator<Alamat> orderByComparator)
		throws NoSuchAlamatException {
		uuid = Objects.toString(uuid, "");

		Alamat alamat = findByPrimaryKey(id_alamat);

		Session session = null;

		try {
			session = openSession();

			Alamat[] array = new AlamatImpl[3];

			array[0] = getByUuid_PrevAndNext(session, alamat, uuid,
					orderByComparator, true);

			array[1] = alamat;

			array[2] = getByUuid_PrevAndNext(session, alamat, uuid,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Alamat getByUuid_PrevAndNext(Session session, Alamat alamat,
		String uuid, OrderByComparator<Alamat> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ALAMAT_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			query.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(AlamatModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(alamat);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Alamat> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the alamats where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (Alamat alamat : findByUuid(uuid, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(alamat);
		}
	}

	/**
	 * Returns the number of alamats where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching alamats
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ALAMAT_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "alamat.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "alamat.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(alamat.uuid IS NULL OR alamat.uuid = '')";

	public AlamatPersistenceImpl() {
		setModelClass(Alamat.class);

		try {
			Field field = BasePersistenceImpl.class.getDeclaredField(
					"_dbColumnNames");

			field.setAccessible(true);

			Map<String, String> dbColumnNames = new HashMap<String, String>();

			dbColumnNames.put("uuid", "uuid_");

			field.set(this, dbColumnNames);
		}
		catch (Exception e) {
			if (_log.isDebugEnabled()) {
				_log.debug(e, e);
			}
		}
	}

	/**
	 * Caches the alamat in the entity cache if it is enabled.
	 *
	 * @param alamat the alamat
	 */
	@Override
	public void cacheResult(Alamat alamat) {
		entityCache.putResult(AlamatModelImpl.ENTITY_CACHE_ENABLED,
			AlamatImpl.class, alamat.getPrimaryKey(), alamat);

		alamat.resetOriginalValues();
	}

	/**
	 * Caches the alamats in the entity cache if it is enabled.
	 *
	 * @param alamats the alamats
	 */
	@Override
	public void cacheResult(List<Alamat> alamats) {
		for (Alamat alamat : alamats) {
			if (entityCache.getResult(AlamatModelImpl.ENTITY_CACHE_ENABLED,
						AlamatImpl.class, alamat.getPrimaryKey()) == null) {
				cacheResult(alamat);
			}
			else {
				alamat.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all alamats.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AlamatImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the alamat.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Alamat alamat) {
		entityCache.removeResult(AlamatModelImpl.ENTITY_CACHE_ENABLED,
			AlamatImpl.class, alamat.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Alamat> alamats) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Alamat alamat : alamats) {
			entityCache.removeResult(AlamatModelImpl.ENTITY_CACHE_ENABLED,
				AlamatImpl.class, alamat.getPrimaryKey());
		}
	}

	/**
	 * Creates a new alamat with the primary key. Does not add the alamat to the database.
	 *
	 * @param id_alamat the primary key for the new alamat
	 * @return the new alamat
	 */
	@Override
	public Alamat create(String id_alamat) {
		Alamat alamat = new AlamatImpl();

		alamat.setNew(true);
		alamat.setPrimaryKey(id_alamat);

		String uuid = PortalUUIDUtil.generate();

		alamat.setUuid(uuid);

		return alamat;
	}

	/**
	 * Removes the alamat with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id_alamat the primary key of the alamat
	 * @return the alamat that was removed
	 * @throws NoSuchAlamatException if a alamat with the primary key could not be found
	 */
	@Override
	public Alamat remove(String id_alamat) throws NoSuchAlamatException {
		return remove((Serializable)id_alamat);
	}

	/**
	 * Removes the alamat with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the alamat
	 * @return the alamat that was removed
	 * @throws NoSuchAlamatException if a alamat with the primary key could not be found
	 */
	@Override
	public Alamat remove(Serializable primaryKey) throws NoSuchAlamatException {
		Session session = null;

		try {
			session = openSession();

			Alamat alamat = (Alamat)session.get(AlamatImpl.class, primaryKey);

			if (alamat == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAlamatException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(alamat);
		}
		catch (NoSuchAlamatException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Alamat removeImpl(Alamat alamat) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(alamat)) {
				alamat = (Alamat)session.get(AlamatImpl.class,
						alamat.getPrimaryKeyObj());
			}

			if (alamat != null) {
				session.delete(alamat);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (alamat != null) {
			clearCache(alamat);
		}

		return alamat;
	}

	@Override
	public Alamat updateImpl(Alamat alamat) {
		boolean isNew = alamat.isNew();

		if (!(alamat instanceof AlamatModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(alamat.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(alamat);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in alamat proxy " +
					invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Alamat implementation " +
				alamat.getClass());
		}

		AlamatModelImpl alamatModelImpl = (AlamatModelImpl)alamat;

		if (Validator.isNull(alamat.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			alamat.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (alamat.isNew()) {
				session.save(alamat);

				alamat.setNew(false);
			}
			else {
				alamat = (Alamat)session.merge(alamat);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!AlamatModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { alamatModelImpl.getUuid() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((alamatModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { alamatModelImpl.getOriginalUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { alamatModelImpl.getUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}
		}

		entityCache.putResult(AlamatModelImpl.ENTITY_CACHE_ENABLED,
			AlamatImpl.class, alamat.getPrimaryKey(), alamat, false);

		alamat.resetOriginalValues();

		return alamat;
	}

	/**
	 * Returns the alamat with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the alamat
	 * @return the alamat
	 * @throws NoSuchAlamatException if a alamat with the primary key could not be found
	 */
	@Override
	public Alamat findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAlamatException {
		Alamat alamat = fetchByPrimaryKey(primaryKey);

		if (alamat == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAlamatException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return alamat;
	}

	/**
	 * Returns the alamat with the primary key or throws a {@link NoSuchAlamatException} if it could not be found.
	 *
	 * @param id_alamat the primary key of the alamat
	 * @return the alamat
	 * @throws NoSuchAlamatException if a alamat with the primary key could not be found
	 */
	@Override
	public Alamat findByPrimaryKey(String id_alamat)
		throws NoSuchAlamatException {
		return findByPrimaryKey((Serializable)id_alamat);
	}

	/**
	 * Returns the alamat with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the alamat
	 * @return the alamat, or <code>null</code> if a alamat with the primary key could not be found
	 */
	@Override
	public Alamat fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(AlamatModelImpl.ENTITY_CACHE_ENABLED,
				AlamatImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		Alamat alamat = (Alamat)serializable;

		if (alamat == null) {
			Session session = null;

			try {
				session = openSession();

				alamat = (Alamat)session.get(AlamatImpl.class, primaryKey);

				if (alamat != null) {
					cacheResult(alamat);
				}
				else {
					entityCache.putResult(AlamatModelImpl.ENTITY_CACHE_ENABLED,
						AlamatImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(AlamatModelImpl.ENTITY_CACHE_ENABLED,
					AlamatImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return alamat;
	}

	/**
	 * Returns the alamat with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id_alamat the primary key of the alamat
	 * @return the alamat, or <code>null</code> if a alamat with the primary key could not be found
	 */
	@Override
	public Alamat fetchByPrimaryKey(String id_alamat) {
		return fetchByPrimaryKey((Serializable)id_alamat);
	}

	@Override
	public Map<Serializable, Alamat> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, Alamat> map = new HashMap<Serializable, Alamat>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			Alamat alamat = fetchByPrimaryKey(primaryKey);

			if (alamat != null) {
				map.put(primaryKey, alamat);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(AlamatModelImpl.ENTITY_CACHE_ENABLED,
					AlamatImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (Alamat)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_ALAMAT_WHERE_PKS_IN);

		for (int i = 0; i < uncachedPrimaryKeys.size(); i++) {
			query.append("?");

			query.append(",");
		}

		query.setIndex(query.index() - 1);

		query.append(")");

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			QueryPos qPos = QueryPos.getInstance(q);

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				qPos.add((String)primaryKey);
			}

			for (Alamat alamat : (List<Alamat>)q.list()) {
				map.put(alamat.getPrimaryKeyObj(), alamat);

				cacheResult(alamat);

				uncachedPrimaryKeys.remove(alamat.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(AlamatModelImpl.ENTITY_CACHE_ENABLED,
					AlamatImpl.class, primaryKey, nullModel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the alamats.
	 *
	 * @return the alamats
	 */
	@Override
	public List<Alamat> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the alamats.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AlamatModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of alamats
	 * @param end the upper bound of the range of alamats (not inclusive)
	 * @return the range of alamats
	 */
	@Override
	public List<Alamat> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the alamats.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AlamatModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of alamats
	 * @param end the upper bound of the range of alamats (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of alamats
	 */
	@Override
	public List<Alamat> findAll(int start, int end,
		OrderByComparator<Alamat> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the alamats.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AlamatModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of alamats
	 * @param end the upper bound of the range of alamats (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of alamats
	 */
	@Override
	public List<Alamat> findAll(int start, int end,
		OrderByComparator<Alamat> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Alamat> list = null;

		if (retrieveFromCache) {
			list = (List<Alamat>)finderCache.getResult(finderPath, finderArgs,
					this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_ALAMAT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ALAMAT;

				if (pagination) {
					sql = sql.concat(AlamatModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Alamat>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Alamat>)QueryUtil.list(q, getDialect(), start,
							end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the alamats from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Alamat alamat : findAll()) {
			remove(alamat);
		}
	}

	/**
	 * Returns the number of alamats.
	 *
	 * @return the number of alamats
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ALAMAT);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AlamatModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the alamat persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(AlamatImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_ALAMAT = "SELECT alamat FROM Alamat alamat";
	private static final String _SQL_SELECT_ALAMAT_WHERE_PKS_IN = "SELECT alamat FROM Alamat alamat WHERE id_alamat IN (";
	private static final String _SQL_SELECT_ALAMAT_WHERE = "SELECT alamat FROM Alamat alamat WHERE ";
	private static final String _SQL_COUNT_ALAMAT = "SELECT COUNT(alamat) FROM Alamat alamat";
	private static final String _SQL_COUNT_ALAMAT_WHERE = "SELECT COUNT(alamat) FROM Alamat alamat WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "alamat.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Alamat exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Alamat exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(AlamatPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid"
			});
}