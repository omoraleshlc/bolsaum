package com.sshlc.org.services;

import java.util.List;

import com.sshlc.org.domain.Empresas;

public interface EmpresasService {
	public void insertarEmpresas(Empresas empresas);
        
       
	public List<Empresas> getEmpresasList();

	public void deleteData(Integer folio);

	public Empresas getEmpresas(String rfc_curp);

	public void updateData(Empresas empresas);
        
      
}
