package com.ofss.daytrader.portfolios.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ofss.daytrader.entities.KeygenDataBean;

@Repository
public interface KeygenRepository extends CrudRepository<KeygenDataBean, String>{

}
