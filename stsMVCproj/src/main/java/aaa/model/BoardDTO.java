package aaa.model;

import java.util.Date;

import org.apache.ibatis.type.Alias;
import org.springframework.web.multipart.MultipartFile;

import lombok.Data;
import lombok.NoArgsConstructor;

@Alias("bDto")
@Data
@NoArgsConstructor
public class BoardDTO {
	int id, cnt;
	String title, pname, pw, upfile, content, grade;
	Date regDate;
	MultipartFile mpf;
	
	public void setMpf(MultipartFile mpf) {
		this.mpf = mpf;
		if(mpf != null) {
			upfile = mpf.getOriginalFilename();
		}
	}

	public BoardDTO(String title, String pname, String pw, String content) {
		super();
		this.title = title;
		this.pname = pname;
		this.pw = pw;
		this.content = content;
	}
}
