package com.sshlc.org.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sshlc.org.domain.Egresados;

public class EgresadosRowMapper implements RowMapper<Egresados> {

	@Override
	public Egresados mapRow(ResultSet resultSet, int line) throws SQLException {
		EgresadosExtractor EgresadosExtractor = new EgresadosExtractor();
		return EgresadosExtractor.extractData(resultSet);
	}

}
