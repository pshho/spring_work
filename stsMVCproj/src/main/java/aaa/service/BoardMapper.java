package aaa.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import aaa.model.BoardDTO;

@Mapper
public interface BoardMapper {
	List<BoardDTO> list();
	BoardDTO detail(int id);
	int insert(BoardDTO bDto);
	int delete(BoardDTO bDto);
	int modify(BoardDTO bDto);
}
