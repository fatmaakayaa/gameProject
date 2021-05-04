package gameProjectD4Hw3;

public class Player {
	
	private String firstName;
	private String lastName;
	private String yearOfBirth;
	private String nationaltyId;
	
	public Player() {
		
	}

	public Player(String firstName, String lastName, String yearOfBirth, String nationaltyId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.yearOfBirth = yearOfBirth;
		this.nationaltyId = nationaltyId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(String yearOfBÝrth) {
		this.yearOfBirth = yearOfBÝrth;
	}

	public String getNationaltyId() {
		return nationaltyId;
	}

	public void setNationaltyId(String nationaltyId) {
		this.nationaltyId = nationaltyId;
	}
	
}
