package aaa.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Battery {
	String name;
	int size;
	
	public Battery() {
		super();
	}
}
