package com.sshlc.org.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.sshlc.org.dao.EmpresasDao;
import com.sshlc.org.domain.Empresas;


public class EmpresasServiceImpl implements EmpresasService {

	@Autowired
	EmpresasDao empresasdao;

	@Override
	public void insertarEmpresas(Empresas empresas) {
		empresasdao.insertarEmpresas(empresas);
	}

	public List<Empresas> getEmpresasList() {
		return empresasdao.getEmpresasList();
	}

	@Override
	public void deleteData(Integer folio) {
		empresasdao.deleteData(folio);
		
	}

	@Override
	public Empresas getEmpresas(String rfc_curp) {
		return empresasdao.getEmpresas(rfc_curp);
	}

        
        
	@Override
	public void updateData(Empresas empresas) {
		empresasdao.updateData(empresas);
		
	}

        
	
	
}
