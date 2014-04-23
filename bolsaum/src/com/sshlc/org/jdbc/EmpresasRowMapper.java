package com.sshlc.org.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sshlc.org.domain.Empresas;

public class EmpresasRowMapper implements RowMapper<Empresas> {

	@Override
	public Empresas mapRow(ResultSet resultSet, int line) throws SQLException {
		EmpresasExtractor EmpresasExtractor = new EmpresasExtractor();
		return EmpresasExtractor.extractData(resultSet);
	}

}
