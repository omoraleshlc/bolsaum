package com.sshlc.org.services;

import java.util.List;

import com.sshlc.org.domain.Ofertas;

public interface OfertasService {
	public void insertarOfertas(Ofertas ofertas);
        
       
	public List<Ofertas> getOfertasList();

	public void deleteData(Integer folio);

	public Ofertas getOfertas(Integer folio);

	public void updateData(Ofertas ofertas);
}
