package com.sshlc.org.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import com.sshlc.org.domain.Ofertas;

public class OfertasExtractor implements ResultSetExtractor<Ofertas> {

    @Override
    public Ofertas extractData(ResultSet resultSet) throws SQLException,
			DataAccessException {
		
		Ofertas ofertas = new Ofertas();
                
                //ofertas.setKeyO(resultSet.getInteger("keyO"));
		ofertas.setId_empresa(resultSet.getString("id_empresa"));
                ofertas.setDescripcionEmpresa(resultSet.getString("descripcionEmpresa"));
                ofertas.setTipo(resultSet.getString("Tipo"));
                ofertas.setDescripcion(resultSet.getString("descripcion"));
                ofertas.setDireccion(resultSet.getString("direccion"));
                ofertas.setPaginaWeb(resultSet.getString("paginaWeb"));
                ofertas.setNombrePuesto(resultSet.getString("nombrePuesto"));
                ofertas.setSueldo(resultSet.getString("sueldo"));
                ofertas.setPrestaciones(resultSet.getString("prestaciones"));
                ofertas.setHorarioJornada(resultSet.getString("horarioJornada"));
              
                /*
        	ofertas.setDescripcionSector(resultSet.getString("descripcionSector"));
		ofertas.setKeyEmp(resultSet.getInt("keyEmp"));
                ofertas.setReservado(resultSet.getString("reservado"));
                ofertas.setSector(resultSet.getString("sector"));
		ofertas.setStatus(resultSet.getString("status"));
		*/
		return ofertas;
	}

}
