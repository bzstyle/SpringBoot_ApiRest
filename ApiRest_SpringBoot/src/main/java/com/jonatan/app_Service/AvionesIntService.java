package com.jonatan.app_Service;

import java.util.List;

import com.jonatan.app_Entity.Aviones;

public interface AvionesIntService {
	
	public List<Aviones>findall();
	
	public Aviones findById(int id); 
	
	public void save(Aviones aviones);
	
	public void deleteById(int id);

}
