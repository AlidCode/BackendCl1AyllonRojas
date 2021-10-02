package com.delivery_2021.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.delivery_2021.entity.Pais;
import com.delivery_2021.entity.Ubigeo;
import com.delivery_2021.service.PaisService;
import com.delivery_2021.service.UbigeoService;

@RestController
@RequestMapping("/rest/util")
@CrossOrigin(origins = "http://localhost:4200")
public class UtilController {

	

	@Autowired
	private UbigeoService ubigeoService;

	@Autowired
	private PaisService  paisService;

	@GetMapping("/pais")
	@ResponseBody
	public ResponseEntity<List<Pais>> listaDeporte(){
		List<Pais> lista = paisService.listaPais();
		return ResponseEntity.ok(lista);
	}
	
	
	

	@GetMapping("/listaDepartamentos")
	@ResponseBody
	public List<String> listaDepartamentos() {
		return ubigeoService.listaDepartamentos();
	}

	@GetMapping("/listaProvincias/{paramDep}")
	@ResponseBody
	public List<String> listaProvincias(@PathVariable("paramDep") String dep) {
		return ubigeoService.listaProvincias(dep);
	}

	@GetMapping("/listaDistritos/{paramDep}/{paramProv}")
	@ResponseBody
	public List<Ubigeo> listaDistritos(@PathVariable("paramDep") String dep, @PathVariable("paramProv") String prov) {
		return ubigeoService.listaDistritos(dep, prov);
	}
}
