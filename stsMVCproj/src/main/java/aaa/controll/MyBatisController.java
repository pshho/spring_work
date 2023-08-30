package aaa.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import aaa.model.BoardDTO;
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
		try {
//			Class cc = mapper.getClass();
//			Method mth = cc.getDeclaredMethod(ser);
//			res = mth.invoke(mapper);
//			System.out.println(cc);
//			System.out.println(mth);
			
			// res = mapper.getClass().getDeclaredMethod(ser, BoardDTO.class).invoke(mapper, bDto);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// String res = ser;
		return res;
	}
	
	@RequestMapping("cntSch")
	@ResponseBody
	Object sqlCnt(BoardDTO bDto) {
		Object res = mapper.cntSch(bDto);
		try {
//			Class cc = mapper.getClass();
//			Method mth = cc.getDeclaredMethod(ser);
//			res = mth.invoke(mapper);
//			System.out.println(cc);
//			System.out.println(mth);
			
			// res = mapper.getClass().getDeclaredMethod(ser, BoardDTO.class).invoke(mapper, bDto);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// String res = ser;
		return res;
	}

}
