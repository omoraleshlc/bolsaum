package com.sshlc.org.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.sshlc.org.dao.EgresadosDao;
import com.sshlc.org.domain.Egresados;


public class EgresadosServiceImpl implements EgresadosService {

	@Autowired
	EgresadosDao egresadosdao;

	@Override
	public void insertarEgresados(Egresados egresados) {
		egresadosdao.insertarEgresados(egresados);
	}

        @Override
	public List<Egresados> getEgresadosList() {
		return egresadosdao.getEgresadosList();
	}

	@Override
	public void deleteData(Integer folio) {
		egresadosdao.deleteData(folio);
		
	}

	@Override
	public Egresados getEgresados(Integer folio) {
		return egresadosdao.getEgresados(folio);
	}

        
        
	@Override
	public void updateData(Egresados egresados) {
		egresadosdao.updateData(egresados);
		
	}

        
	
}
