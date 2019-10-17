package co.edu.unilibre.rest.UserDto;

public class UserDto {

	private Integer Id;
	private String name;
	private Integer country_id;
	
	public UserDto(Integer Id, String name, Integer country_id ) {
		super();
		this.Id = Id;	
		this.name = name;
		this.country_id = country_id;
			
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer Id) {
		this.Id =Id;
	}
	public String getName() {
		return name;		
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getCountry_id() {
		return country_id;
	}
	public void setCountry_Id(Integer country_id) {
		this.country_id = country_id;
	}
	
	
}
