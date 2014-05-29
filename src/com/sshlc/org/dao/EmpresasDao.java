package com.sshlc.org.dao;

import java.util.List;
import com.sshlc.org.domain.Empresas;

public interface EmpresasDao {
	public void insertarEmpresas(Empresas empresas);

	public List<Empresas> getEmpresasList();

	public void updateData(Empresas empresas);
        
        //public void validarEmpresa(Empresas empresas,String rfc_curp);

	public void deleteData(Integer keyEmp);

	public Empresas getEmpresas(String rfc_curp);

}
