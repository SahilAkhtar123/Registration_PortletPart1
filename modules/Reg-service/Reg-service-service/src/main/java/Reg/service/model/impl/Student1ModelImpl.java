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

package Reg.service.model.impl;

import Reg.service.model.Student1;
import Reg.service.model.Student1Model;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.sql.Blob;
import java.sql.Types;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * The base model implementation for the Student1 service. Represents a row in the &quot;Yash_Student1&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>Student1Model</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link Student1Impl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Student1Impl
 * @generated
 */
@JSON(strict = true)
public class Student1ModelImpl
	extends BaseModelImpl<Student1> implements Student1Model {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a student1 model instance should use the <code>Student1</code> interface instead.
	 */
	public static final String TABLE_NAME = "Yash_Student1";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"userId", Types.BIGINT},
		{"firstName", Types.VARCHAR}, {"lastName", Types.VARCHAR},
		{"emailAddress", Types.VARCHAR}, {"username", Types.VARCHAR},
		{"male", Types.BOOLEAN}, {"birthdayMonth", Types.INTEGER},
		{"birthdayDay", Types.INTEGER}, {"birthdayYear", Types.INTEGER},
		{"password1", Types.VARCHAR}, {"password2", Types.VARCHAR},
		{"securityQuestion", Types.VARCHAR}, {"securityAnswer", Types.VARCHAR},
		{"acceptedTermsOfUse", Types.BOOLEAN}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("firstName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("lastName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("emailAddress", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("username", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("male", Types.BOOLEAN);
		TABLE_COLUMNS_MAP.put("birthdayMonth", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("birthdayDay", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("birthdayYear", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("password1", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("password2", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("securityQuestion", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("securityAnswer", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("acceptedTermsOfUse", Types.BOOLEAN);
	}

	public static final String TABLE_SQL_CREATE =
		"create table Yash_Student1 (uuid_ VARCHAR(75) null,userId LONG not null primary key,firstName VARCHAR(75) null,lastName VARCHAR(75) null,emailAddress VARCHAR(75) null,username VARCHAR(75) null,male BOOLEAN,birthdayMonth INTEGER,birthdayDay INTEGER,birthdayYear INTEGER,password1 VARCHAR(75) null,password2 VARCHAR(75) null,securityQuestion VARCHAR(75) null,securityAnswer VARCHAR(75) null,acceptedTermsOfUse BOOLEAN)";

	public static final String TABLE_SQL_DROP = "drop table Yash_Student1";

	public static final String ORDER_BY_JPQL = " ORDER BY student1.userId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY Yash_Student1.userId ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long USERNAME_COLUMN_BITMASK = 1L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long UUID_COLUMN_BITMASK = 2L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *		#getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long USERID_COLUMN_BITMASK = 4L;

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setEntityCacheEnabled(boolean entityCacheEnabled) {
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setFinderCacheEnabled(boolean finderCacheEnabled) {
	}

	public Student1ModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _userId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setUserId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _userId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Student1.class;
	}

	@Override
	public String getModelClassName() {
		return Student1.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<Student1, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<Student1, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Student1, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((Student1)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<Student1, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<Student1, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(Student1)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<Student1, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<Student1, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static final Map<String, Function<Student1, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<Student1, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<Student1, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<Student1, Object>>();
		Map<String, BiConsumer<Student1, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<Student1, ?>>();

		attributeGetterFunctions.put("uuid", Student1::getUuid);
		attributeSetterBiConsumers.put(
			"uuid", (BiConsumer<Student1, String>)Student1::setUuid);
		attributeGetterFunctions.put("userId", Student1::getUserId);
		attributeSetterBiConsumers.put(
			"userId", (BiConsumer<Student1, Long>)Student1::setUserId);
		attributeGetterFunctions.put("firstName", Student1::getFirstName);
		attributeSetterBiConsumers.put(
			"firstName", (BiConsumer<Student1, String>)Student1::setFirstName);
		attributeGetterFunctions.put("lastName", Student1::getLastName);
		attributeSetterBiConsumers.put(
			"lastName", (BiConsumer<Student1, String>)Student1::setLastName);
		attributeGetterFunctions.put("emailAddress", Student1::getEmailAddress);
		attributeSetterBiConsumers.put(
			"emailAddress",
			(BiConsumer<Student1, String>)Student1::setEmailAddress);
		attributeGetterFunctions.put("username", Student1::getUsername);
		attributeSetterBiConsumers.put(
			"username", (BiConsumer<Student1, String>)Student1::setUsername);
		attributeGetterFunctions.put("male", Student1::getMale);
		attributeSetterBiConsumers.put(
			"male", (BiConsumer<Student1, Boolean>)Student1::setMale);
		attributeGetterFunctions.put(
			"birthdayMonth", Student1::getBirthdayMonth);
		attributeSetterBiConsumers.put(
			"birthdayMonth",
			(BiConsumer<Student1, Integer>)Student1::setBirthdayMonth);
		attributeGetterFunctions.put("birthdayDay", Student1::getBirthdayDay);
		attributeSetterBiConsumers.put(
			"birthdayDay",
			(BiConsumer<Student1, Integer>)Student1::setBirthdayDay);
		attributeGetterFunctions.put("birthdayYear", Student1::getBirthdayYear);
		attributeSetterBiConsumers.put(
			"birthdayYear",
			(BiConsumer<Student1, Integer>)Student1::setBirthdayYear);
		attributeGetterFunctions.put("password1", Student1::getPassword1);
		attributeSetterBiConsumers.put(
			"password1", (BiConsumer<Student1, String>)Student1::setPassword1);
		attributeGetterFunctions.put("password2", Student1::getPassword2);
		attributeSetterBiConsumers.put(
			"password2", (BiConsumer<Student1, String>)Student1::setPassword2);
		attributeGetterFunctions.put(
			"securityQuestion", Student1::getSecurityQuestion);
		attributeSetterBiConsumers.put(
			"securityQuestion",
			(BiConsumer<Student1, String>)Student1::setSecurityQuestion);
		attributeGetterFunctions.put(
			"securityAnswer", Student1::getSecurityAnswer);
		attributeSetterBiConsumers.put(
			"securityAnswer",
			(BiConsumer<Student1, String>)Student1::setSecurityAnswer);
		attributeGetterFunctions.put(
			"acceptedTermsOfUse", Student1::getAcceptedTermsOfUse);
		attributeSetterBiConsumers.put(
			"acceptedTermsOfUse",
			(BiConsumer<Student1, Boolean>)Student1::setAcceptedTermsOfUse);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return "";
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_uuid = uuid;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public String getOriginalUuid() {
		return getColumnOriginalValue("uuid_");
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException portalException) {
			return "";
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	@JSON
	@Override
	public String getFirstName() {
		if (_firstName == null) {
			return "";
		}
		else {
			return _firstName;
		}
	}

	@Override
	public void setFirstName(String firstName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_firstName = firstName;
	}

	@JSON
	@Override
	public String getLastName() {
		if (_lastName == null) {
			return "";
		}
		else {
			return _lastName;
		}
	}

	@Override
	public void setLastName(String lastName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_lastName = lastName;
	}

	@JSON
	@Override
	public String getEmailAddress() {
		if (_emailAddress == null) {
			return "";
		}
		else {
			return _emailAddress;
		}
	}

	@Override
	public void setEmailAddress(String emailAddress) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_emailAddress = emailAddress;
	}

	@JSON
	@Override
	public String getUsername() {
		if (_username == null) {
			return "";
		}
		else {
			return _username;
		}
	}

	@Override
	public void setUsername(String username) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_username = username;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public String getOriginalUsername() {
		return getColumnOriginalValue("username");
	}

	@JSON
	@Override
	public boolean getMale() {
		return _male;
	}

	@JSON
	@Override
	public boolean isMale() {
		return _male;
	}

	@Override
	public void setMale(boolean male) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_male = male;
	}

	@JSON
	@Override
	public int getBirthdayMonth() {
		return _birthdayMonth;
	}

	@Override
	public void setBirthdayMonth(int birthdayMonth) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_birthdayMonth = birthdayMonth;
	}

	@JSON
	@Override
	public int getBirthdayDay() {
		return _birthdayDay;
	}

	@Override
	public void setBirthdayDay(int birthdayDay) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_birthdayDay = birthdayDay;
	}

	@JSON
	@Override
	public int getBirthdayYear() {
		return _birthdayYear;
	}

	@Override
	public void setBirthdayYear(int birthdayYear) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_birthdayYear = birthdayYear;
	}

	@JSON
	@Override
	public String getPassword1() {
		if (_password1 == null) {
			return "";
		}
		else {
			return _password1;
		}
	}

	@Override
	public void setPassword1(String password1) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_password1 = password1;
	}

	@JSON
	@Override
	public String getPassword2() {
		if (_password2 == null) {
			return "";
		}
		else {
			return _password2;
		}
	}

	@Override
	public void setPassword2(String password2) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_password2 = password2;
	}

	@JSON
	@Override
	public String getSecurityQuestion() {
		if (_securityQuestion == null) {
			return "";
		}
		else {
			return _securityQuestion;
		}
	}

	@Override
	public void setSecurityQuestion(String securityQuestion) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_securityQuestion = securityQuestion;
	}

	@JSON
	@Override
	public String getSecurityAnswer() {
		if (_securityAnswer == null) {
			return "";
		}
		else {
			return _securityAnswer;
		}
	}

	@Override
	public void setSecurityAnswer(String securityAnswer) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_securityAnswer = securityAnswer;
	}

	@JSON
	@Override
	public boolean getAcceptedTermsOfUse() {
		return _acceptedTermsOfUse;
	}

	@JSON
	@Override
	public boolean isAcceptedTermsOfUse() {
		return _acceptedTermsOfUse;
	}

	@Override
	public void setAcceptedTermsOfUse(boolean acceptedTermsOfUse) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_acceptedTermsOfUse = acceptedTermsOfUse;
	}

	public long getColumnBitmask() {
		if (_columnBitmask > 0) {
			return _columnBitmask;
		}

		if ((_columnOriginalValues == null) ||
			(_columnOriginalValues == Collections.EMPTY_MAP)) {

			return 0;
		}

		for (Map.Entry<String, Object> entry :
				_columnOriginalValues.entrySet()) {

			if (!Objects.equals(
					entry.getValue(), getColumnValue(entry.getKey()))) {

				_columnBitmask |= _columnBitmasks.get(entry.getKey());
			}
		}

		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			0, Student1.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Student1 toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, Student1>
				escapedModelProxyProviderFunction =
					EscapedModelProxyProviderFunctionHolder.
						_escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		Student1Impl student1Impl = new Student1Impl();

		student1Impl.setUuid(getUuid());
		student1Impl.setUserId(getUserId());
		student1Impl.setFirstName(getFirstName());
		student1Impl.setLastName(getLastName());
		student1Impl.setEmailAddress(getEmailAddress());
		student1Impl.setUsername(getUsername());
		student1Impl.setMale(isMale());
		student1Impl.setBirthdayMonth(getBirthdayMonth());
		student1Impl.setBirthdayDay(getBirthdayDay());
		student1Impl.setBirthdayYear(getBirthdayYear());
		student1Impl.setPassword1(getPassword1());
		student1Impl.setPassword2(getPassword2());
		student1Impl.setSecurityQuestion(getSecurityQuestion());
		student1Impl.setSecurityAnswer(getSecurityAnswer());
		student1Impl.setAcceptedTermsOfUse(isAcceptedTermsOfUse());

		student1Impl.resetOriginalValues();

		return student1Impl;
	}

	@Override
	public Student1 cloneWithOriginalValues() {
		Student1Impl student1Impl = new Student1Impl();

		student1Impl.setUuid(this.<String>getColumnOriginalValue("uuid_"));
		student1Impl.setUserId(this.<Long>getColumnOriginalValue("userId"));
		student1Impl.setFirstName(
			this.<String>getColumnOriginalValue("firstName"));
		student1Impl.setLastName(
			this.<String>getColumnOriginalValue("lastName"));
		student1Impl.setEmailAddress(
			this.<String>getColumnOriginalValue("emailAddress"));
		student1Impl.setUsername(
			this.<String>getColumnOriginalValue("username"));
		student1Impl.setMale(this.<Boolean>getColumnOriginalValue("male"));
		student1Impl.setBirthdayMonth(
			this.<Integer>getColumnOriginalValue("birthdayMonth"));
		student1Impl.setBirthdayDay(
			this.<Integer>getColumnOriginalValue("birthdayDay"));
		student1Impl.setBirthdayYear(
			this.<Integer>getColumnOriginalValue("birthdayYear"));
		student1Impl.setPassword1(
			this.<String>getColumnOriginalValue("password1"));
		student1Impl.setPassword2(
			this.<String>getColumnOriginalValue("password2"));
		student1Impl.setSecurityQuestion(
			this.<String>getColumnOriginalValue("securityQuestion"));
		student1Impl.setSecurityAnswer(
			this.<String>getColumnOriginalValue("securityAnswer"));
		student1Impl.setAcceptedTermsOfUse(
			this.<Boolean>getColumnOriginalValue("acceptedTermsOfUse"));

		return student1Impl;
	}

	@Override
	public int compareTo(Student1 student1) {
		long primaryKey = student1.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Student1)) {
			return false;
		}

		Student1 student1 = (Student1)object;

		long primaryKey = student1.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isEntityCacheEnabled() {
		return true;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isFinderCacheEnabled() {
		return true;
	}

	@Override
	public void resetOriginalValues() {
		_columnOriginalValues = Collections.emptyMap();

		_columnBitmask = 0;
	}

	@Override
	public CacheModel<Student1> toCacheModel() {
		Student1CacheModel student1CacheModel = new Student1CacheModel();

		student1CacheModel.uuid = getUuid();

		String uuid = student1CacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			student1CacheModel.uuid = null;
		}

		student1CacheModel.userId = getUserId();

		student1CacheModel.firstName = getFirstName();

		String firstName = student1CacheModel.firstName;

		if ((firstName != null) && (firstName.length() == 0)) {
			student1CacheModel.firstName = null;
		}

		student1CacheModel.lastName = getLastName();

		String lastName = student1CacheModel.lastName;

		if ((lastName != null) && (lastName.length() == 0)) {
			student1CacheModel.lastName = null;
		}

		student1CacheModel.emailAddress = getEmailAddress();

		String emailAddress = student1CacheModel.emailAddress;

		if ((emailAddress != null) && (emailAddress.length() == 0)) {
			student1CacheModel.emailAddress = null;
		}

		student1CacheModel.username = getUsername();

		String username = student1CacheModel.username;

		if ((username != null) && (username.length() == 0)) {
			student1CacheModel.username = null;
		}

		student1CacheModel.male = isMale();

		student1CacheModel.birthdayMonth = getBirthdayMonth();

		student1CacheModel.birthdayDay = getBirthdayDay();

		student1CacheModel.birthdayYear = getBirthdayYear();

		student1CacheModel.password1 = getPassword1();

		String password1 = student1CacheModel.password1;

		if ((password1 != null) && (password1.length() == 0)) {
			student1CacheModel.password1 = null;
		}

		student1CacheModel.password2 = getPassword2();

		String password2 = student1CacheModel.password2;

		if ((password2 != null) && (password2.length() == 0)) {
			student1CacheModel.password2 = null;
		}

		student1CacheModel.securityQuestion = getSecurityQuestion();

		String securityQuestion = student1CacheModel.securityQuestion;

		if ((securityQuestion != null) && (securityQuestion.length() == 0)) {
			student1CacheModel.securityQuestion = null;
		}

		student1CacheModel.securityAnswer = getSecurityAnswer();

		String securityAnswer = student1CacheModel.securityAnswer;

		if ((securityAnswer != null) && (securityAnswer.length() == 0)) {
			student1CacheModel.securityAnswer = null;
		}

		student1CacheModel.acceptedTermsOfUse = isAcceptedTermsOfUse();

		return student1CacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<Student1, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<Student1, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Student1, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply((Student1)this);

			if (value == null) {
				sb.append("null");
			}
			else if (value instanceof Blob || value instanceof Date ||
					 value instanceof Map || value instanceof String) {

				sb.append(
					"\"" + StringUtil.replace(value.toString(), "\"", "'") +
						"\"");
			}
			else {
				sb.append(value);
			}

			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, Student1>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					Student1.class, ModelWrapper.class);

	}

	private String _uuid;
	private long _userId;
	private String _firstName;
	private String _lastName;
	private String _emailAddress;
	private String _username;
	private boolean _male;
	private int _birthdayMonth;
	private int _birthdayDay;
	private int _birthdayYear;
	private String _password1;
	private String _password2;
	private String _securityQuestion;
	private String _securityAnswer;
	private boolean _acceptedTermsOfUse;

	public <T> T getColumnValue(String columnName) {
		columnName = _attributeNames.getOrDefault(columnName, columnName);

		Function<Student1, Object> function = _attributeGetterFunctions.get(
			columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((Student1)this);
	}

	public <T> T getColumnOriginalValue(String columnName) {
		if (_columnOriginalValues == null) {
			return null;
		}

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		return (T)_columnOriginalValues.get(columnName);
	}

	private void _setColumnOriginalValues() {
		_columnOriginalValues = new HashMap<String, Object>();

		_columnOriginalValues.put("uuid_", _uuid);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("firstName", _firstName);
		_columnOriginalValues.put("lastName", _lastName);
		_columnOriginalValues.put("emailAddress", _emailAddress);
		_columnOriginalValues.put("username", _username);
		_columnOriginalValues.put("male", _male);
		_columnOriginalValues.put("birthdayMonth", _birthdayMonth);
		_columnOriginalValues.put("birthdayDay", _birthdayDay);
		_columnOriginalValues.put("birthdayYear", _birthdayYear);
		_columnOriginalValues.put("password1", _password1);
		_columnOriginalValues.put("password2", _password2);
		_columnOriginalValues.put("securityQuestion", _securityQuestion);
		_columnOriginalValues.put("securityAnswer", _securityAnswer);
		_columnOriginalValues.put("acceptedTermsOfUse", _acceptedTermsOfUse);
	}

	private static final Map<String, String> _attributeNames;

	static {
		Map<String, String> attributeNames = new HashMap<>();

		attributeNames.put("uuid_", "uuid");

		_attributeNames = Collections.unmodifiableMap(attributeNames);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("uuid_", 1L);

		columnBitmasks.put("userId", 2L);

		columnBitmasks.put("firstName", 4L);

		columnBitmasks.put("lastName", 8L);

		columnBitmasks.put("emailAddress", 16L);

		columnBitmasks.put("username", 32L);

		columnBitmasks.put("male", 64L);

		columnBitmasks.put("birthdayMonth", 128L);

		columnBitmasks.put("birthdayDay", 256L);

		columnBitmasks.put("birthdayYear", 512L);

		columnBitmasks.put("password1", 1024L);

		columnBitmasks.put("password2", 2048L);

		columnBitmasks.put("securityQuestion", 4096L);

		columnBitmasks.put("securityAnswer", 8192L);

		columnBitmasks.put("acceptedTermsOfUse", 16384L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private Student1 _escapedModel;

}