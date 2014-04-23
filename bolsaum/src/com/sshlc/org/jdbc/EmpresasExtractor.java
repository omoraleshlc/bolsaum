package com.sshlc.org.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import com.sshlc.org.domain.Empresas;

public class EmpresasExtractor implements ResultSetExtractor<Empresas> {

    @Override
    public Empresas extractData(ResultSet resultSet) throws SQLException,
			DataAccessException {
		
		Empresas empresas = new Empresas();
		
		empresas.setDescripcion(resultSet.getString("descripcion"));
		empresas.setDescripcionSector(resultSet.getString("descripcionSector"));
		empresas.setKeyEmp(resultSet.getInt("keyEmp"));
                empresas.setReservado(resultSet.getString("reservado"));
                empresas.setSector(resultSet.getString("sector"));
		empresas.setStatus(resultSet.getString("status"));
		
		return empresas;
	}

}
