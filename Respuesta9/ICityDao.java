package javaapplication9;
import java.util.List;
 
public interface ICityDao {	
	public boolean addCity(City city);
	public City getCity(int id);
	public List<City> getAllCities();
	public boolean updateCity(City city);
        public void deleteCity(int id);
        
}