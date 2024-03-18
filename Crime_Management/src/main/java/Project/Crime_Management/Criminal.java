package Project.Crime_Management;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Criminal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int age;
    private String gender;
    private String address;
    private String identifyingMark;
    private String areaOfArrest;
    private String crimeAttached;
    
    
	public Criminal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getIdentifyingMark() {
		return identifyingMark;
	}
	public void setIdentifyingMark(String identifyingMark) {
		this.identifyingMark = identifyingMark;
	}
	public String getAreaOfArrest() {
		return areaOfArrest;
	}
	public void setAreaOfArrest(String areaOfArrest) {
		this.areaOfArrest = areaOfArrest;
	}
	public String getCrimeAttached() {
		return crimeAttached;
	}
	public void setCrimeAttached(String crimeAttached) {
		this.crimeAttached = crimeAttached;
	}
	public Criminal(Long id, String name, int age, String gender, String address, String identifyingMark,
			String areaOfArrest, String crimeAttached) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.identifyingMark = identifyingMark;
		this.areaOfArrest = areaOfArrest;
		this.crimeAttached = crimeAttached;
	}

    
}