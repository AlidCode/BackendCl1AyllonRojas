package com.delivery_2021.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.delivery_2021.entity.Sede;
import com.delivery_2021.service.SedeService;
import com.delivery_2021.util.Constantes;


@RestController
@RequestMapping("/rest/sede")
@CrossOrigin(origins = "http://localhost:4200")
public class SedeController {
	
	@Autowired
	private SedeService sedeService;

	@GetMapping
	@ResponseBody
	public ResponseEntity<List<Sede>> listaSede() {
		List<Sede> lista = sedeService.listaSede();
		return ResponseEntity.ok(lista);
	}
	
	@PostMapping
	@ResponseBody
	public ResponseEntity<Map<String, Object>> insertaSede(@RequestBody Sede obj) {
		Map<String, Object> salida = new HashMap<>();
		try {
			
			obj.setFechaRegistro(new Date());
					obj.setEstado(1);
			
			Sede objSalida = sedeService.insertaActualizaSede(obj);
			if (objSalida == null) {
				salida.put("mensaje", Constantes.MENSAJE_REG_ERROR  );
			} else {
				salida.put("mensaje", Constantes.MENSAJE_REG_EXITOSO );
			}
		} catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje", Constantes.MENSAJE_REG_ERROR);
		}
		return ResponseEntity.ok(salida);
	}
	

}







