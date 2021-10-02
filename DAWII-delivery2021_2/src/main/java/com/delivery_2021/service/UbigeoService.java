package com.delivery_2021.service;

import java.util.List;

import com.delivery_2021.entity.Ubigeo;

public interface UbigeoService {

	public abstract List<String> listaDepartamentos();
	public abstract List<String> listaProvincias(String departamento);
	public abstract List<Ubigeo> listaDistritos(String departamento,String provincia);
	
}
