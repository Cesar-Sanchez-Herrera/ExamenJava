package BaseDatos;
import java.sql.Statement;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MainJDBC {

	public static List<City> ciudades = new ArrayList<>();
	public static void main(String[] args) throws SQLException, IOException{
		Connection connection = ConnectionMysql.getConnection();		
		FileWriter fw=new FileWriter("C:\\Users\\curso\\Documents\\Threads\\Threads\\src\\BaseDatos\\estados.txt");
	    BufferedWriter bw=new BufferedWriter(fw);
		String sql = "Select * from state";
		
		Statement stm = null;
		
		stm = connection.createStatement();
		
		ResultSet rs = stm.executeQuery(sql);
		int ban = 1;
		
		while(rs.next()) {
			City ct = new City();
			ct.setState_id(rs.getString("state_id"));
			ct.setDescription(rs.getString("description"));
			ct.setShipping_zone_id(rs.getString("shipping_zone_id"));

			
			System.out.println("state_id"+ban + " = "+rs.getString("state_id"));
			System.out.println("description"+ban + " = "+rs.getString("description"));
			System.out.println("shipping_zone_id"+ban + " = "+rs.getString("shipping_zone_id"));
			
			ciudades.add(ct);
			ban++;
			
		       bw.write(rs.getString("state_id") + " "+ rs.getString("description") + " " + rs.getString("shipping_zone_id"));
		       bw.newLine();
			

        }
		//System.out.println(Arrays.toString(ciudades.toArray()));
        //System.out.println(ciudades.size());       
       
		bw.flush();
       connection.close();
       
       
         
     
       
	}
}


