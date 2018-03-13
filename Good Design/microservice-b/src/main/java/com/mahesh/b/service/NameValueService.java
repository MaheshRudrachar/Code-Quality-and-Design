package com.mahesh.b.service;

import com.mahesh.b.model.AllNameValueTO;
import com.mahesh.b.model.NameValueTO;

public interface NameValueService {

	NameValueTO updateNameValue(NameValueTO nameValueTO);

	AllNameValueTO getAllNameValues(String name);

	NameValueTO updateNameValue(NameValueTO nameValueTO, boolean fromRabbit);

	NameValueTO generateUUID();

	NameValueTO generateUUID(String applicationName);

}
