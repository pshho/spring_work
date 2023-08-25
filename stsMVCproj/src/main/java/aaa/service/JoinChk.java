package aaa.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import aaa.model.JoinData;

@Service
public class JoinChk {
	public boolean pwDupChk(JoinData jd, BindingResult br) {
		System.out.println("JoinChk.pwDubChk() 진입");
		return true;
	}
	
	public boolean idDupChk(JoinData jd, BindingResult br) {
		
		Map<String, String> ids = new HashMap<>();
		ids.put("aaa", "aaa");
		ids.put("bbb", "bbb");
		ids.put("ccc", "ccc");
		ids.put("ddd", "ddd");
		ids.put("eee", "eee");
		
		if(ids.containsKey(jd.getPid())) {
			br.rejectValue("pid", null, "아이디가 있어 다른거 해");
			return true;
		}
		
		return false;
	}
}
