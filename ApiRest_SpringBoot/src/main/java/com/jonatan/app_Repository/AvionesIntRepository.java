package com.jonatan.app_Repository;

import java.util.List;
import com.jonatan.app_Entity.Aviones;

// interfas de repository donde creo los metodos

public interface AvionesIntRepository {
	
	public List<Aviones>findall();
	
	public Aviones findByid(int id);
	
	public void save(Aviones aviones);
	
	public void deleteById(int id);
	

}
