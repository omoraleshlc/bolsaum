package com.sshlc.org.services;

import java.util.List;

import com.sshlc.org.domain.Empresas;

public interface EmpresasService {
	public void insertarEmpresas(Empresas ofertas);
        
       
	public List<Empresas> getEmpresasList();

	public void deleteData(Integer folio);

	public Empresas getEmpresas(Integer folio);

	public void updateData(Empresas ofertas);
}
