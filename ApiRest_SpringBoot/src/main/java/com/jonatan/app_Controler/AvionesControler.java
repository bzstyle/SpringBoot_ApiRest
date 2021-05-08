package com.jonatan.app_Controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jonatan.app_Entity.Aviones;
import com.jonatan.app_Service.AvionesService;

@RestController
@RequestMapping("/api")
public class AvionesControler {
	
	// inyecto la clase service
	
	@Autowired
	private AvionesService aviones_service;
	
	//metodo get para traer todos los registros
	
	@GetMapping("/aviones")
	public List<Aviones>findall(){
		return aviones_service.findall();
	}
	
	// metodo get para traer registros por id 
	
	@GetMapping("aviones/{aviones id}")
	public Aviones getAviones(@PathVariable int avionesid) {
		
		Aviones aviones = aviones_service.findById(avionesid);
		
		if (aviones == null) {
			throw new RuntimeException("el id no se encuentra"+ avionesid);
		}
		return aviones;
	}
	
	//metodo para guradar
	
	@PostMapping("/aviones")
	public Aviones addAviones(@RequestBody Aviones aviones) {
		
		aviones.setId(0);
		aviones_service.save(aviones);
		return aviones;
	}
	
	@PutMapping("/aviones")
	public Aviones updateAviones(@RequestBody Aviones aviones) {
		
		aviones_service.save(aviones);
		return aviones;
	}
	
	//metodo para borrar por id
	
	@DeleteMapping("/aviones/{avionesid}")
	public String deleteAviones(@PathVariable int avionesId) {
		
		Aviones aviones = aviones_service.findById(avionesId);
		
		if (aviones == null) {
			throw new RuntimeException("el id no se encuentra" + avionesId);
		}
		
		aviones_service.deleteById(avionesId);
		return "deleted id : " + avionesId;
	}

}
