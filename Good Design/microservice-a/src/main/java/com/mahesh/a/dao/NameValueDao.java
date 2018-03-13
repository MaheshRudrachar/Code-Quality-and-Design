package com.mahesh.a.dao;

import org.springframework.data.repository.CrudRepository;

import com.mahesh.a.domain.NameValue;

public interface NameValueDao extends CrudRepository<NameValue, Long> {

}
