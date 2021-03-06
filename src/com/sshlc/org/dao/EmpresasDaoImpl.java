package com.sshlc.org.dao;

import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import com.sshlc.org.domain.Empresas;
import com.sshlc.org.jdbc.EmpresasRowMapper;

public class EmpresasDaoImpl implements EmpresasDao {

	@Autowired
	DataSource dataSource;

        
        @Override
	public void insertarEmpresas( Empresas empresas) {

           List<Empresas> empresasList = new ArrayList<Empresas>();
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
           
           //if(empresas.getPasswd1().equals(empresas.getPasswd2())){
            String sql = "INSERT INTO empresas "
				+ "(descripcion,descripcionSector, status, reservado,rfc_curp,"
                    + "razon_social,nombre_comercial,direccion,telefono,"
                    + "fax,email,sitioWEB,password) "
                    + "VALUES "
                    + "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
            JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(
				sql,
				new Object[] { empresas.getDescripcion(), empresas.getDescripcionSector(),
						empresas.getStatus(),
                                empresas.getReservado(),empresas.getRfc_curp(),
                                empresas.getRazon_social(),empresas.getNombre_comercial(),
                                empresas.getDireccion(),empresas.getTelefono(),
                                empresas.getFax(),empresas.getEmail(),
                                empresas.getSitioWEB(),empresas.getPasswd1()
                                });
           
		//String sqlC = "select * from empresas where keyEmp= '"+empresas.getKeyEmp()+"'";
		
		//empresasList = jdbcTemplate.query(sqlC, new EmpresasRowMapper());
                //System.out.println("usuario"+sqlC+empresasList.get(1)+empresas.getUsuario());
                //System.out.println("s"+empresasList.get(0));
                
                //String u1 = (String) empresas.getUsuario();
                //String u2 = () empresasList.get(0);
                //System.out.println(u1);
                //System.out.println(empresas.getUsuario());
                String u1="a";
                String u2="a";
                        
                //System.out.println(empresasList.get(0));
                
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
                String sql = "INSERT INTO empresas "
				+ "(descripcion,sector, status) VALUES (?, ?, ?)";
		//JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		jdbcTemplate.update(
				sql,
				new Object[] { empresas.getDescripcion(), empresas.getSector(),
						"activo"
                                });*/
                
        }
                
	
        
        

        @Override
	public List<Empresas> getEmpresasList() {
		List empresasList = new ArrayList();

		String sql = "select * from empresas";
                JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		empresasList = jdbcTemplate.query(sql, new EmpresasRowMapper());
		return empresasList;
	}

	@Override
	public void deleteData(Integer folio) {
		String sql = "delete from empresas where folio=" + folio;
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(sql);

	}
        
        /*@Override
	public void validarEmpresa(Empresas empresas,String rfc_curp) {
           // JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
            List empresasList = new ArrayList();
		String sql = "select rfc_curp from empresas where rfc_curp= '" + rfc_curp+"'";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		empresasList = jdbcTemplate.query(sql, new EmpresasRowMapper());
                //return empresasList;
        }*/

	@Override
	public void updateData(Empresas empresas) {
                //Integer folio=empresas.getFolio();
                //List<Empresas> empresasList = new ArrayList<Empresas>();
                
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		String sql = "UPDATE "
                        + "empresas set "
                        + "nombre = ?,"
                        + "aPaterno = ?,"
                        + "aMaterno = ? ,"
                        + "email = ?"
                        + "where folio = ? ";
    	
                //System.out.println("step"+empresas.getNombre());
		jdbcTemplate.update(
				sql,
				new Object[] { 
                                    empresas.getDescripcion(),empresas.getDescripcionSector(),
                                    empresas.getReservado(),
                                    empresas.getSector(),empresas.getStatus()
						});

	}

        
        
	@Override
	public Empresas getEmpresas(String rfc_curp) {
		List<Empresas> empresasList = new ArrayList<Empresas>();
		String sql = "select * from empresas where rfc_curp='"+rfc_curp+"'  ";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		empresasList = jdbcTemplate.query(sql, new EmpresasRowMapper());
                
		return empresasList.get(0);
	}
        
        
     

}
