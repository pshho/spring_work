package aaa.model;

import java.util.ArrayList;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("bDtos")
@Data
public class BoardDTOs {
	ArrayList<BoardDTO> arr;
	String ct = "bDtos 내용이야";
	int no = 3;
	
	public BoardDTOs() {
		arr = new ArrayList<>();
		arr.add(new BoardDTO("bDtos제목11", "bDtos이름11", "1111", "내용"));
		arr.add(new BoardDTO("bDtos제목12", "bDtos이름12", "1111", "ㄱㅁㅈㄷ험ㅈ댜ㅐㅓ"));
		arr.add(new BoardDTO("bDtos제목13", "bDtos이름13", "1111", "2348238957382"));
		arr.add(new BoardDTO("bDtos제목14", "bDtos이름14", "1111", "ㅜㅁㅈ대훋젬;ㅑㄷㅈ"));
		arr.add(new BoardDTO("bDtos제목15", "bDtos이름15", "1111", "가나다라마바사"));
	}
}
