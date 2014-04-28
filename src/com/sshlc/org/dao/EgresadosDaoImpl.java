package com.sshlc.org.dao;

import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import com.sshlc.org.domain.Egresados;
import com.sshlc.org.jdbc.EgresadosRowMapper;

public class EgresadosDaoImpl implements EgresadosDao {

	@Autowired
	DataSource dataSource;

        
        @Override
	public void insertarEgresados( Egresados egresados) {

           List<Egresados> egresadosList = new ArrayList<Egresados>();
/*	

descripcion
sector
descripcionSector
status
reservado
rfc_curp
razon_social
nombre_comercial
direccion
telefono
fax
email
sitioWEB 
*/           
           
           //if(egresados.getPasswd1().equals(egresados.getPasswd2())){
            String sql = "INSERT INTO egresados "
				+ "(nombre,"
                    + "email1,email2"
                    + "password) "
                    + "VALUES "
                    + "(?, ?, ?, ?, ?,)";
		
            JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(
				sql,
				new Object[] { egresados.getNombre(),
                                egresados.getEmail1(),egresados.getEmail2(),
                                egresados.getPasswd1()
                                });
           
		//String sqlC = "select * from egresados where keyEmp= '"+egresados.getKeyEmp()+"'";
		
		//egresadosList = jdbcTemplate.query(sqlC, new EgresadosRowMapper());
                //System.out.println("usuario"+sqlC+egresadosList.get(1)+egresados.getUsuario());
                //System.out.println("s"+egresadosList.get(0));
                
                //String u1 = (String) egresados.getUsuario();
                //String u2 = () egresadosList.get(0);
                //System.out.println(u1);
                //System.out.println(egresados.getUsuario());
                String u1="a";
                String u2="a";
                        
                //System.out.println(egresadosList.get(0));
                
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
    };

    
    // notice the wrapping up of the argumenta in an array
    //return (Actor) jdbcTemplate.queryForObject(sql, new Object[] {specialty, age}, mapper);

                if (u1.equalsIgnoreCase(u2)) {
                    System.out.println("ya existe eese usuario!");
                     
                } else {
                   */
                   
                
                
                /*
                String sql = "INSERT INTO egresados "
				+ "(descripcion,sector, status) VALUES (?, ?, ?)";
		//JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		jdbcTemplate.update(
				sql,
				new Object[] { egresados.getDescripcion(), egresados.getSector(),
						"activo"
                                });*/
                
        }
                
	
        
        

        @Override
	public List<Egresados> getEgresadosList() {
		List egresadosList = new ArrayList();

		String sql = "select * from egresados";
                JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		egresadosList = jdbcTemplate.query(sql, new EgresadosRowMapper());
		return egresadosList;
	}

	@Override
	public void deleteData(Integer folio) {
		String sql = "delete from egresados where folio=" + folio;
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(sql);

	}
        
        @Override
	public void validarEgresado(Egresados egresados,String nombre) {
           // JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
            List egresadosList = new ArrayList();
		String sql = "select nombre from egresados where nombre= '" + nombre+"'";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		egresadosList = jdbcTemplate.query(sql, new EgresadosRowMapper());
                //return egresadosList;
        }

	@Override
	public void updateData(Egresados egresados) {
                //Integer folio=egresados.getFolio();
                //List<Egresados> egresadosList = new ArrayList<Egresados>();
                
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		String sql = "UPDATE "
                        + "egresados set "
                        + "nombre = ?,"
                        + "aPaterno = ?,"
                        + "aMaterno = ? ,"
                        + "email = ?"
                        + "where folio = ? ";
    	
                //System.out.println("step"+egresados.getNombre());
		jdbcTemplate.update(
				sql,
				new Object[] { 
                                    egresados.getNombre(),
						});

	}

        
        
	@Override
	public Egresados getEgresados(Integer folio) {
		List<Egresados> egresadosList = new ArrayList<Egresados>();
		String sql = "select * from egresados where folio= " + folio;
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		egresadosList = jdbcTemplate.query(sql, new EgresadosRowMapper());
		return egresadosList.get(0);
	}

}
