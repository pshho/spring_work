package aaa.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {
	String id, pname, gender;
	int age;
	boolean marriage, mil;
	
	public Person(String pname, String gender, boolean mil) {
		super();
		this.pname = pname;
		this.gender = gender;
		this.mil = mil;
	}

	public Person() {
		super();
	}
}
