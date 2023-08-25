package aaa.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Camping {
	String type;
	
	public List<String> getSitesArray(){
		List<String> campArray = new ArrayList<>();
		campArray.add("사이트 1");
		campArray.add("사이트 2");
		campArray.add("사이트 3");
		
		return campArray;
	}
}
