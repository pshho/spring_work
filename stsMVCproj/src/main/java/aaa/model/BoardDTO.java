package aaa.model;

import java.util.Date;

import org.apache.ibatis.type.Alias;
import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Alias("bDto")
@Data
public class BoardDTO {
	int id, cnt;
	String title, pname, pw, upfile, content;
	Date regDate;
	MultipartFile mpf;
	
	public void setMpf(MultipartFile mpf) {
		this.mpf = mpf;
		if(mpf != null) {
			upfile = mpf.getOriginalFilename();
		}
	}
}
