package aaa.controll;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import aaa.model.JoinData;
import aaa.model.StudentValid;
import aaa.service.JoinChk;
import jakarta.annotation.Resource;
import jakarta.validation.Valid;

@Controller
@RequestMapping("form")
public class ValidationController {
	
	@Resource
	JoinChk joinChk;
	
	@GetMapping("validation")
	String validationForm(JoinData jd) {
		return "form/validation";
	}
	
	@PostMapping("validation")
	String validationReg(@Valid JoinData jd, BindingResult br) {
		System.out.println("validationReg " + br.hasErrors());
		
		if(br.hasErrors()) { // 에러가 있다면
			return "form/validation";
		}
		
		if(!jd.getPw1().equals(jd.getPw2())) { // 암호가 일치하지 않으면
			br.rejectValue("pw2", null, "암호확인이 문제있네");
			return "form/validation";
		}
		
		if(joinChk.idDupChk(jd, br)) {
			return "form/validation";
		}
		
		// 성적을 입력받아 처리하세요
		// 이름 - 한글만(2~5)
		// 국영수 - 숫자(0~100)
		
		// 에러가 없으면
		return "form/validationReg";
	}
	
	@GetMapping("students")
	String students(StudentValid sv) {
		return "form/students";
	}
	
	@PostMapping("students")
	String studentsReg(@Valid StudentValid sv, BindingResult br) {
		System.out.println("studentsReg" + br);
		
		if(!br.hasErrors()) {
			return "form/studentsReg";
		}
		
		return "form/students";
	}
}
