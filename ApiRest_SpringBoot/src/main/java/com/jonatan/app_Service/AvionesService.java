package com.jonatan.app_Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jonatan.app_Entity.Aviones;
import com.jonatan.app_Repository.AvionesRepository;


//service es el conector entre repository y controller

@Service
public class AvionesService implements AvionesIntService {
	
	@Autowired
	private AvionesRepository aviones_repository;

	@Override
	public List<Aviones> findall() {
		List<Aviones> l_aviones = aviones_repository.findall();
		return l_aviones;
		
	}

	@Override
	public Aviones findById(int id) {
		Aviones aviones = aviones_repository.findByid(id);
		return aviones;
	}

	@Override
	public void save(Aviones aviones) {
		aviones_repository.save(aviones);
		
	}

	@Override
	public void deleteById(int id) {
        aviones_repository.deleteById(id);
		
	}
	
	

}
