package com.miwebapp.nutryapp.dao;

import org.springframework.data.repository.CrudRepository;

import com.miwebapp.nutryapp.model.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long> {

}
