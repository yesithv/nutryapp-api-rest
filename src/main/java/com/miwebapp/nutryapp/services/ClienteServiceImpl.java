package com.miwebapp.nutryapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.miwebapp.nutryapp.dao.IClienteDao;
import com.miwebapp.nutryapp.model.Cliente;

@Service
public class ClienteServiceImpl implements IClienteService {

	@Autowired // Inyecta el cliente DAO
	private IClienteDao clienteDao;

	@Override
	@Transactional(readOnly = true)
	public List<Cliente> findAll() {
		return (List<Cliente>) clienteDao.findAll();
	}

}
