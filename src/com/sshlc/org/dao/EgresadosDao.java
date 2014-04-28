package com.sshlc.org.dao;

import java.util.List;
import com.sshlc.org.domain.Egresados;

public interface EgresadosDao {
	public void insertarEgresados(Egresados egresados);

	public List<Egresados> getEgresadosList();

	public void updateData(Egresados egresados);
        
        public void validarEgresado(Egresados egresados,String nombre);

	public void deleteData(Integer keyEmp);

	public Egresados getEgresados(Integer keyEmp);

}
