package com.delivery_2021.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.delivery_2021.entity.Sede;
import com.delivery_2021.repository.Sederepository;

@Service
public class SedeServiceImpl implements SedeService {
		
	
	@Autowired
	private Sederepository repository;
	@Override
	public Sede insertaActualizaSede(Sede obj) {
		return repository.save(obj);
		
	}

	@Override
	public List<Sede> listaSede() {
		return repository.findAll();
		
	}
	 
	

}
