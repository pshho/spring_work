package aaa.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import aaa.model.BoardDTO;

@Mapper
public interface MyBatisMapper {
	List<BoardDTO> list();
	List<BoardDTO> listSch(BoardDTO bDto);
	List<BoardDTO> cntSch(BoardDTO bDto);
	
	BoardDTO detail(int id);
	int insert(BoardDTO bDto);
	int delete(BoardDTO bDto);
	int modify(BoardDTO bDto);
}
