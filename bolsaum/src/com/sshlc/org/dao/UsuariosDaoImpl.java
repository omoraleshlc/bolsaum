package com.sshlc.org.dao;

import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import com.sshlc.org.domain.Usuarios;
import com.sshlc.org.jdbc.UsuariosRowMapper;

public class UsuariosDaoImpl implements UsuariosDao {

	@Autowired
	DataSource dataSource;

        
        @Override
	public void insertData( Usuarios usuarios) {

           List<Usuarios> usuariosList = new ArrayList<Usuarios>();
           
		String sqlC = "select * from usuarios where usuario= '"+usuarios.getUsuario()+"'";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		usuariosList = jdbcTemplate.query(sqlC, new UsuariosRowMapper());
                //System.out.println("usuario"+sqlC+usuariosList.get(1)+usuarios.getUsuario());
                //System.out.println("s"+usuariosList.get(0));
                
                //String u1 = (String) usuarios.getUsuario();
                //String u2 = () usuariosList.get(0);
                //System.out.println(u1);
                //System.out.println(usuarios.getUsuario());
                String u1="a";
                String u2="a";
                        
                //System.out.println(usuariosList.get(0));
                
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
                    
                    String sql = "INSERT INTO usuarios "
				+ "(usuario,nombre, aPaterno, aMaterno,email) VALUES (?, ?, ?, ?, ?)";
		//JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		jdbcTemplate.update(
				sql,
				new Object[] { usuarios.getUsuario(), usuarios.getNombre(),
						usuarios.getaPaterno(),
                                usuarios.getaMaterno(),usuarios.getEmail()
                                });
                }
                
        }
                
	
        
        

        @Override
	public List<Usuarios> getUsuariosList() {
		List usuariosList = new ArrayList();

		String sql = "select * from usuarios";

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		usuariosList = jdbcTemplate.query(sql, new UsuariosRowMapper());
		return usuariosList;
	}

	@Override
	public void deleteData(Integer folio) {
		String sql = "delete from usuarios where folio=" + folio;
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(sql);

	}

	@Override
	public void updateData(Usuarios usuarios) {
                //Integer folio=usuarios.getFolio();
                //List<Usuarios> usuariosList = new ArrayList<Usuarios>();
                
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		String sql = "UPDATE "
                        + "usuarios set "
                        + "nombre = ?,"
                        + "aPaterno = ?,"
                        + "aMaterno = ? ,"
                        + "email = ?"
                        + "  where folio = ? ";
    	
                //System.out.println("step"+usuarios.getNombre());
		jdbcTemplate.update(
				sql,
				new Object[] { 
                                    usuarios.getNombre(),usuarios.getaPaterno(),
                                    usuarios.getaMaterno(),
                                    usuarios.getEmail(),usuarios.getFolio()
						});

	}

	@Override
	public Usuarios getUsuarios(Integer folio) {
		List<Usuarios> usuariosList = new ArrayList<Usuarios>();
		String sql = "select * from usuarios where folio= " + folio;
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		usuariosList = jdbcTemplate.query(sql, new UsuariosRowMapper());
		return usuariosList.get(0);
	}

}
