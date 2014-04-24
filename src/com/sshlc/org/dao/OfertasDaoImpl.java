package com.sshlc.org.dao;

import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import com.sshlc.org.domain.Ofertas;
import com.sshlc.org.jdbc.OfertasRowMapper;

public class OfertasDaoImpl implements OfertasDao {

	@Autowired
	DataSource dataSource;

        
        @Override
	public void insertarOfertas( Ofertas ofertas) {

           List<Ofertas> ofertasList = new ArrayList<Ofertas>();
           
		String sqlC = "select * from ofertas where keyEmp= '"+ofertas.getKeyO()+"'";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		ofertasList = jdbcTemplate.query(sqlC, new OfertasRowMapper());
                //System.out.println("usuario"+sqlC+ofertasList.get(1)+ofertas.getUsuario());
                //System.out.println("s"+ofertasList.get(0));
                
                //String u1 = (String) ofertas.getUsuario();
                //String u2 = () ofertasList.get(0);
                //System.out.println(u1);
                //System.out.println(ofertas.getUsuario());
                String u1="a";
                String u2="a";
                        
                //System.out.println(ofertasList.get(0));
                
                /*
                private JdbcTemplate jdbcTemplate;



    String sql = "select id, first_name, last_name from T_ACTOR" + 
            " where specialty = ? and age = ?";
    
    RowMapper<Actor> mapper = new RowMapper<Actor>() {
        public Actor mapRow(ResultSet rs, int rowNum) throws SQLException {
            Actor actor = new Actor();
            actor.setId(rs.getLong("id"));
            actor.setFirstName(rs.getString("first_name"));
            actor.setLastName(rs.getString("last_name"));
            return actor;
        }
    };*/

    
    // notice the wrapping up of the argumenta in an array
    //return (Actor) jdbcTemplate.queryForObject(sql, new Object[] {specialty, age}, mapper);

                if (u1.equalsIgnoreCase(u2)) {
                    System.out.println("ya existe eese usuario!");
                     
                } else {
                    
                    String sql = "INSERT INTO ofertas "
				+ "(usuario,nombre, aPaterno, aMaterno,email) VALUES (?, ?, ?, ?, ?)";
		//JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		jdbcTemplate.update(
				sql,
				new Object[] { ofertas.getDescripcion(), ofertas.getDescripcionSector(),
						ofertas.getSector(),
                                ofertas.getStatus(),ofertas.getReservado()
                                });
                }
                
                String sql = "INSERT INTO ofertas "
				+ "(descripcion,sector, status) VALUES (?, ?, ?)";
		//JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		jdbcTemplate.update(
				sql,
				new Object[] { ofertas.getDescripcion(), ofertas.getSector(),
						"activo"
                                });
                
        }
                
	
        
        

        @Override
	public List<Ofertas> getOfertasList() {
		List ofertasList = new ArrayList();

		String sql = "select * from ofertas";

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		ofertasList = jdbcTemplate.query(sql, new OfertasRowMapper());
		return ofertasList;
	}

	@Override
	public void deleteData(Integer folio) {
		String sql = "delete from ofertas where folio=" + folio;
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(sql);

	}

	@Override
	public void updateData(Ofertas ofertas) {
                //Integer folio=ofertas.getFolio();
                //List<Ofertas> ofertasList = new ArrayList<Ofertas>();
                
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		String sql = "UPDATE "
                        + "ofertas set "
                        + "nombre = ?,"
                        + "aPaterno = ?,"
                        + "aMaterno = ? ,"
                        + "email = ?"
                        + "  where folio = ? ";
    	
                //System.out.println("step"+ofertas.getNombre());
		jdbcTemplate.update(
				sql,
				new Object[] { 
                                    ofertas.getDescripcion(),ofertas.getDescripcionSector(),
                                    ofertas.getReservado(),
                                    ofertas.getSector(),ofertas.getStatus()
						});

	}

        
        
	@Override
	public Ofertas getOfertas(Integer folio) {
		List<Ofertas> ofertasList = new ArrayList<Ofertas>();
		String sql = "select * from ofertas where folio= " + folio;
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		ofertasList = jdbcTemplate.query(sql, new OfertasRowMapper());
		return ofertasList.get(0);
	}

}
