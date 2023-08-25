package aaa.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class StudentValid {
	@Pattern(regexp = "[가-힣]{2,5}", message = "한글만 해 2자에서 5자로")
	String name;
	@Positive(message = "점수 맞음?")
	@Min(value = 0, message = "0보다 커야지")
	@Max(value = 100, message = "100보다 작아야지")
	int kor;
	@Positive(message = "점수 맞음?")
	@Min(value = 0, message = "0보다 커야지")
	@Max(value = 100, message = "100보다 작아야지")
	int eng;
	@Positive(message = "점수 맞음?")
	@Min(value = 0, message = "0보다 커야지")
	@Max(value = 100, message = "100보다 작아야지")
	int math;
}
