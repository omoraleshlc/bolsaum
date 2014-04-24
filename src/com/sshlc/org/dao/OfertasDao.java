package com.sshlc.org.dao;

import java.util.List;
import com.sshlc.org.domain.Ofertas;

public interface OfertasDao {
	public void insertarOfertas(Ofertas ofertas);

	public List<Ofertas> getOfertasList();

	public void updateData(Ofertas ofertas);

	public void deleteData(Integer keyEmp);

	public Ofertas getOfertas(Integer keyEmp);

}
