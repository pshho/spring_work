package aaa.model;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class UploadData {
	String id, ff1Name, ff2Name;
	int age;
	MultipartFile ff1, ff2;
	
	public String getFf1Name() {
		return ff1.getOriginalFilename();
	}

	public void setFf2Name(String ff2Name) {
		if(ff2Name == null) {
			this.ff2Name = ff2.getOriginalFilename();
		}else {
			this.ff2Name = ff2Name;
		}
	}
}
