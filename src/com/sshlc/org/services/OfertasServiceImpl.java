package com.sshlc.org.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.sshlc.org.dao.OfertasDao;
import com.sshlc.org.domain.Ofertas;


public class OfertasServiceImpl implements OfertasService {

	@Autowired
	OfertasDao ofertasdao;

	@Override
	public void insertarOfertas(Ofertas ofertas) {
		ofertasdao.insertarOfertas(ofertas);
	}
        
        @Override
	public List<Ofertas> getOfertasList() {
		return ofertasdao.getOfertasList();
	}

	@Override
	public void deleteData(Integer folio) {
		ofertasdao.deleteData(folio);
		
	}

	@Override
	public Ofertas getOfertas(Integer folio) {
		return ofertasdao.getOfertas(folio);
	}

        
        
	@Override
	public void updateData(Ofertas ofertas) {
		ofertasdao.updateData(ofertas);
		
	}


	
}
