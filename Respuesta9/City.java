package javaapplication9;

public class City {

	private String city_id;
	private String description;
	private String state_id;
        
	
	public String getCity_id() {
		return city_id;
	}
	public void setCity_id(String city_id) {
		this.city_id = city_id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getState_id() {
		return state_id;
	}
	public void setState_id(String state_id) {
		this.state_id = state_id;
	}
	
	@Override
	public String toString() {
		return this.city_id+", "+this.description+", "+this.state_id;
	}
}
