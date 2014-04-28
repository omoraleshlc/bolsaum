package com.sshlc.org.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import com.sshlc.org.domain.Egresados;

public class EgresadosExtractor implements ResultSetExtractor<Egresados> {

    @Override
    public Egresados extractData(ResultSet resultSet) throws SQLException,
			DataAccessException {
		
		Egresados egresados = new Egresados();
		
		egresados.setNombre(resultSet.getString("nombre"));
		egresados.setKeyEmp(resultSet.getInt("keyEmp"));
                egresados.setEmail1(resultSet.getString("email1"));
                egresados.setEmail2(resultSet.getString("email1"));
                egresados.setPassword(resultSet.getString("password"));
	
		return egresados;
	}

}
