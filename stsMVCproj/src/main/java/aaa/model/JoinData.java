package aaa.model;

import java.util.Date;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class JoinData {
	
	@NotEmpty(message = "아이디가 없오")
	@Size(min = 3, max = 10, message = "id가 짧고 길어")
	String pid;
	@Pattern(regexp = "[가-힣]{2,10}", message = "한글만 입력해 - 2자 이상, 10자 까지")
	// @Size(min = 2, max = 5)
	String pname;
	@NotEmpty(message = "비밀번호 없어...")
	String pw1;
	String pw2;
	@Email(message = "이메일 형식에 맞춰")
	String email;
	//@Past(message = "오늘 이전만 입력")
	String birth;
	@Positive(message = "양수만 입력")
	int ban;
}
