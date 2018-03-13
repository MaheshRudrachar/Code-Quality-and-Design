package com.mahesh.a.service;

import com.mahesh.a.model.AllNameValueTO;
import com.mahesh.a.model.NameValueTO;

public interface NameValueService {

	NameValueTO updateNameValue(NameValueTO nameValueTO);
	
	NameValueTO updateNameValue(NameValueTO nameValueTO, boolean fromRabbit);

	AllNameValueTO getAllNameValues(String name);

	NameValueTO generateUUID();

	NameValueTO generateUUID(String applicationName);

}
