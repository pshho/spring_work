package aaa.controll;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import aaa.model.BoardDTO;
import aaa.model.BoardDTOs;
import aaa.service.MyBatisMapper;
import jakarta.annotation.Resource;

@Controller
@RequestMapping("mybatis")
public class MyBatisController {
	@Resource
	MyBatisMapper mapper;
	
	@RequestMapping("{ser}")
	@ResponseBody
	Object sqlGo(@PathVariable String ser) {
		System.out.println("ser : " + ser);
		Object res = null;
		try {
//			Class cc = mapper.getClass();
//			Method mth = cc.getDeclaredMethod(ser);
//			res = mth.invoke(mapper);
//			System.out.println(cc);
//			System.out.println(mth);
			
			res = mapper.getClass().getDeclaredMethod(ser).invoke(mapper);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// String res = ser;
		return res;
	}
	
	@RequestMapping("{ser}/{title}")
	@ResponseBody
	Object sqlGo(@PathVariable String ser, BoardDTO bDto) {
		System.out.println("ser : " + ser + " title : " + bDto.getTitle());
		Object res = null;
		try {
//			Class cc = mapper.getClass();
//			Method mth = cc.getDeclaredMethod(ser);
//			res = mth.invoke(mapper);
//			System.out.println(cc);
//			System.out.println(mth);
			
			res = mapper.getClass().getDeclaredMethod(ser, BoardDTO.class).invoke(mapper, bDto);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// String res = ser;
		return res;
	}
	
	@RequestMapping("listSch")
	@ResponseBody
	Object sqlGo(BoardDTO bDto) {
		Object res = mapper.listSch(bDto);
		return res;
	}
	
	@RequestMapping("cntSch")
	@ResponseBody
	Object sqlCnt(BoardDTO bDto) {
		Object res = mapper.cntSch(bDto);
		return res;
	}
	
	@RequestMapping("insertList")
	@ResponseBody
	Object sqlList(BoardDTO bDto) {
		ArrayList<BoardDTO> list = new ArrayList<>();
		list.add(new BoardDTO("제목11", "이름11", "1111", "내용"));
		list.add(new BoardDTO("제목12", "이름12", "1111", "ㄱㅁㅈㄷ험ㅈ댜ㅐㅓ"));
		list.add(new BoardDTO("제목13", "이름13", "1111", "2348238957382"));
		list.add(new BoardDTO("제목14", "이름14", "1111", "ㅜㅁㅈ대훋젬;ㅑㄷㅈ"));
		list.add(new BoardDTO("제목15", "이름15", "1111", "가나다라마바사"));
		Object res = mapper.insertList(list);
		return res;
	}
	
	@RequestMapping("insertDTOs")
	@ResponseBody
	Object sqlList() {
		System.out.println("insertDTOs");
		Object res = mapper.insertDTOs(new BoardDTOs());
		return res;
	}
	
	@RequestMapping("delete")
	@ResponseBody
	Object sqlDelte(int id, String pw) {
		System.out.println("delete");
		// 여러 개의 파라미터를 받을 때 변수 이름을 넣어줌(xml에서 변수 이름으로 알아들을 수 있게)
		Object res = mapper.delete(id, pw);
		return res;
	}
	
	@RequestMapping("modify")
	@ResponseBody
	Object sqlModify(int id, String pw, String pname, String content, String title) {
		System.out.println("modify");
		Object res = mapper.modify(id, pw, pname, content, title);
		return res;
	}
	
	@RequestMapping("insertKey")
	@ResponseBody
	Object sqlInsert(BoardDTO bDto) {
		System.out.println("insertKey");
		Object res = mapper.insert(bDto);
		
		res += ", " + bDto.getId();
		return res;
	}
}
