package javaapplication9;
import java.util.ArrayList;
import java.util.List;
 
public class ControllerCity {
	
	private ViewCity vista= new ViewCity();
	
	public ControllerCity() {
	}
	
	//llama al DAO para guardar un cliente
	public void addCity(City city ) {
		ICityDao dao= new  CityDaoImpl();
		dao.addCity(city);
	}
	
	//llama al DAO para actualizar un cliente
	public void updateCity(City city) {
		ICityDao dao= new  CityDaoImpl();
		dao.updateCity(city);
	}
	
	//llama al DAO para eliminar un cliente
	public void deleteCity(int id) {
		ICityDao dao= new  CityDaoImpl();
		dao.deleteCity(id);
	}
	
	//llama al DAO para obtener todos los clientes y luego los muestra en la vista
	public void getAllCities(){
		List<City> cities = new ArrayList<City>();
		ICityDao dao= new  CityDaoImpl();
		cities=dao.getAllCities();
		vista.verCities(cities);
	}
}
