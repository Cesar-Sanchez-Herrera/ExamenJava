package javaapplication9;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
 
public class CityDaoImpl implements ICityDao {	
	
	public boolean addCity(City city) {
		boolean registrar = false;
		
		Statement stm= null;
		Connection con=null;
		
		String sql="INSERT INTO city values (NULL,'"+city.getCity_id()+"','"+city.getDescription()+"','"+city.getState_id()+"')";
		
		try {			
			con=ConnectionMysql.getConnection();
			stm= con.createStatement();
			stm.execute(sql);
			registrar=true;
			stm.close();
			con.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase CityDaoImple, método agregar");
			e.printStackTrace();
		}
		return registrar;
	}
 
	public List<City> getAllCities() {
		Connection co =null;
		Statement stm= null;
		ResultSet rs=null;
		
		String sql="SELECT * FROM city ORDER BY city_id";
		
		List<City> listaCities= new ArrayList<City>();
		
		try {			
			co= ConnectionMysql.getConnection();
			stm=co.createStatement();
			rs=stm.executeQuery(sql);
			while (rs.next()) {
				City ct = new City();
                                ct.setCity_id(rs.getString("city_id"));
                                ct.setDescription(rs.getString("description"));
                                ct.setState_id(rs.getString("state_id"));
				listaCities.add(ct);
			}
			stm.close();
			rs.close();
			co.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase CityDaoImple, método obtener");
			e.printStackTrace();
		}
		
		return listaCities;
	}
 
	public boolean updateCity(City city) {
		Connection connect= null;
		Statement stm= null;
		
		boolean actualizar=false;
				
		String sql="UPDATE city SET city_id='"+city.getCity_id()+"', description='"+city.getDescription()+"', state_id='"+city.getState_id()+"'" +" WHERE city_id="+city.getCity_id();
		try {
			connect=ConnectionMysql.getConnection();
			stm=connect.createStatement();
			stm.execute(sql);
			actualizar=true;
		} catch (SQLException e) {
			System.out.println("Error: Clase CityDaoImple, método actualizar");
			e.printStackTrace();
		}		
		return actualizar;
	}
 
	public void deleteCity(int id) {
		Connection connect= null;
		Statement stm= null;
		
		boolean eliminar=false;
				
		String sql="DELETE FROM city WHERE city_id=" + city.getCity_id();
		try {
			connect=ConnectionMysql.getConnection();
			stm=connect.createStatement();
			stm.execute(sql);
			eliminar=true;
		} catch (SQLException e) {
			System.out.println("Error: Clase CityDaoImple, método eliminar");
			e.printStackTrace();
		}		
	}

    @Override
    public City getCity(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
