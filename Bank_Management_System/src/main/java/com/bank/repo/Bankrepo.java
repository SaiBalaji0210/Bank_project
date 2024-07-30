package com.bank.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bank.entity.Peoplesbank;
@Repository
public interface Bankrepo extends CrudRepository<Peoplesbank, Long> {

}
