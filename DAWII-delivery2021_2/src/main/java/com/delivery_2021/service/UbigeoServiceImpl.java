package com.delivery_2021.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.delivery_2021.entity.Ubigeo;
import com.delivery_2021.repository.UbigeoRepository;

@Service
public class UbigeoServiceImpl implements UbigeoService {

	@Autowired
	private UbigeoRepository repository;
	
	@Override
	public List<String> listaDepartamentos() {
		return repository.listaDepartamentos();
	}

	@Override
	public List<String> listaProvincias(String departamento) {
		return repository.listaProvincias(departamento);
	}

	@Override
	public List<Ubigeo> listaDistritos(String departamento, String provincia) {
		return repository.listaDistritos(departamento, provincia);
	}

}