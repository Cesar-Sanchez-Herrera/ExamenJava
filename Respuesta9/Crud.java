package javaapplication9;

 
public class Crud {
 
	public static void main(String[] args) {
 
		City city = new City();			
		
		// controlador
		ControllerCity controller = new ControllerCity();
 
		// guarda un cliente a través del controlador
		controller.addCity(city);
 
		// ver clientes
		controller.getAllCities();
 
		// editar un cliente por medio del id
		city.setCity_id("1");
		city.setDescription("nuevo");
		controller.updateCity(city);
 
		// eliminar un cliente por medio del id
		city.setCity_id("1");
		controller.deleteCity(city);
	}
}
