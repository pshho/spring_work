package aaa.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import aaa.model.BoardDTO;
import aaa.model.BoardDTOs;

@Mapper
public interface MyBatisMapper {
	List<BoardDTO> list();
	List<BoardDTO> listSch(BoardDTO bDto);
	List<BoardDTO> cntSch(BoardDTO bDto);
	int insertList(ArrayList<BoardDTO> bDto);
	int insertDTOs(BoardDTOs bDtos);
	int delete(int id, String pw);
	int modify(int id, String pw, String pname, String content, String title);
	int insert(BoardDTO bDto);
}
