package com.delivery_2021.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.delivery_2021.entity.Pais;
import com.delivery_2021.repository.PaisRepository;


@Service
public class PaisServiceImpl implements PaisService {

	
	
	@Autowired
	private PaisRepository repositorio;

	@Override
	public List<Pais> listaPais() {
		return repositorio.findAll();
	} 
	
}
