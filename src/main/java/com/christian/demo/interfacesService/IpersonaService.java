package com.christian.demo.interfacesService;

import java.util.List;
import java.util.Optional;

import com.christian.demo.modelo.Persona;

public interface IpersonaService {
public List<Persona>listar();
public Optional<Persona>listaId(int id);
public int save(Persona p);
public void delete(int id);
}
