package aaa.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * localhost/board/notice/list
 * localhost/board/fng/list
 * localhost/board/gna/list
 * board/{cate}/list/{pNo}
 * 
*/

@Controller
@RequestMapping("path/{cate}")
public class PathController {
	@RequestMapping("aaa")
	String mmm1(@PathVariable String cate) {
		System.out.println("mm1 " + cate);
		return "path/view";
	}
	
	@RequestMapping("{ser}")
	// 하나씩 지정해서 넣는 게 좋음
	// 클래스 객체로 받으면 오류
	// String mmm2(@PathVariable String cate, @PathVariable String ser, @PathVariable PathData pd) {
	String mmm2(@PathVariable String cate, @PathVariable String ser) {
		System.out.println("mm2 " + cate + ", " + ser);
		return "path/view";
	}
	
	@RequestMapping("list/{pNo}")
	String mmm3(@PathVariable String cate, @PathVariable int pNo) {
		System.out.println("mm2 " + cate + ", " + pNo);
		return "path/view";
	}
	
	@RequestMapping("{ser}/{pNo}")
	String mmm4(@PathVariable String cate, @PathVariable String ser, @PathVariable int pNo) {
		System.out.println("mm2 " + cate + ", " + ser + ", " + pNo);
		return "path/view";
	}
}
