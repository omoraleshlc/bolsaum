package com.sshlc.org.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sshlc.org.domain.Ofertas;

public class OfertasRowMapper implements RowMapper<Ofertas> {

	@Override
	public Ofertas mapRow(ResultSet resultSet, int line) throws SQLException {
		OfertasExtractor OfertasExtractor = new OfertasExtractor();
		return OfertasExtractor.extractData(resultSet);
	}

}
