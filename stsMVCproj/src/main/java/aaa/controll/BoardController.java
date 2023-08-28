package aaa.controll;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import aaa.model.BoardDTO;
import aaa.model.PageData;
import aaa.service.BoardMapper;
import jakarta.annotation.Resource;

@Controller
@RequestMapping("board")
public class BoardController {
	
	@Resource
	BoardMapper mapper;
	
	@RequestMapping("list")
	String list(Model md) {
		List<BoardDTO> data = mapper.list();
		md.addAttribute("mainData", data);
		return "board/list";
	}
	
	@RequestMapping("detail/{id}")
	String detail(Model md, @PathVariable int id) {
		md.addAttribute("mainData", mapper.detail(id));
		return "board/detail";
	}
	
	@RequestMapping("insert")
	String insert(BoardDTO bDto) {
		return "board/insertForm";
	}
	
	@PostMapping("insertReg")
	String insertReg(BoardDTO bDto, PageData pd) {
		System.out.println(bDto);
		mapper.insert(bDto);
		pd.setMsg("작성되었습니다");
		pd.setUrl("list");
		return "board/alert";
	}
	
	@GetMapping("delete/{id}")
	String delete(BoardDTO bDto, @PathVariable int id) {
		return "board/deleteForm";
	}
	
	@PostMapping("delete/{id}")
	String deleteReg(BoardDTO bDto, PageData pd) {
		System.out.println(bDto);
		pd.setMsg("삭제실패");
		pd.setUrl("/board/delete/"+bDto.getId());
		
		int res = mapper.delete(bDto);
		System.out.println("deleteReg : " + res);
		
		if(res > 0) {
			pd.setMsg("삭제되었습니다"); 
			pd.setUrl("/board/list");
		}
		return "board/alert";
	}
	
	@GetMapping("modify/{id}")
	String modify(Model md, BoardDTO bDto, @PathVariable int id) {
		md.addAttribute("dto", mapper.detail(id));
		return "board/modifyForm";
	}
	
	@PostMapping("modify/{id}")
	String modifyReg(BoardDTO bDto, PageData pd) {
		System.out.println(bDto);
		pd.setMsg("수정실패");
		pd.setUrl("/board/modify/"+bDto.getId());
		
		int res = mapper.modify(bDto);
		System.out.println("deleteReg : " + res);
		
		if(res > 0) {
			pd.setMsg("수정되었습니다"); 
			pd.setUrl("/board/detail/"+bDto.getId());
		}
		return "board/alert";
	}
}
