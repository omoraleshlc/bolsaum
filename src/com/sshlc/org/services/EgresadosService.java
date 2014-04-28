package com.sshlc.org.services;

import java.util.List;

import com.sshlc.org.domain.Egresados;

public interface EgresadosService {
	public void insertarEgresados(Egresados egresados);
        
       
	public List<Egresados> getEgresadosList();

	public void deleteData(Integer folio);

	public Egresados getEgresados(Integer folio);

	public void updateData(Egresados egresados);
        
       // public void validarEgresado(Egresados egresados,String nombre);
}
