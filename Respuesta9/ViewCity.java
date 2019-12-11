package javaapplication9;
import java.util.List;
 
import com.ecodeup.model.Cliente;
 
public class ViewCity {
	public void verCity(City city) {
		System.out.println("Datos de la ciudad: "+city);
	}
	
	public void verCities(List<City> cities) {
		for (City city : cities) {
			System.out.println("Datos de la ciudad: "+city);
		}		
	}
}