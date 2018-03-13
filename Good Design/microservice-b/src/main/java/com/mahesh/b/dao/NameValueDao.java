package com.mahesh.b.dao;

import org.springframework.data.repository.CrudRepository;

import com.mahesh.b.domain.NameValue;

public interface NameValueDao extends CrudRepository<NameValue, Long> {

}
