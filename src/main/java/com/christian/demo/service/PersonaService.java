package com.christian.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.christian.demo.interfaces.IPersona;
import com.christian.demo.interfacesService.IpersonaService;
import com.christian.demo.modelo.Persona;


@Service
public class PersonaService implements IpersonaService {
	
	@Autowired
	private IPersona data;
	@Override
	public List<Persona> listar() {
//muestra la lista de persona de la base de datos
		return (List<Persona>)data.findAll();
	}

	@Override
	public Optional<Persona> listaId(int id) {
		
		
		return data.findById(id);
	}

	@Override
	public int save(Persona p) {
		//esto agrega una persona a la base de datos
		int res=0;
		Persona persona=data.save(p);
		if(!persona.equals(null)) {
			res=1;
		}
		return 0;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);
		
	}

}
