package com.kh.test.board.model.service;

import java.util.List;

import com.kh.test.board.model.dto.Board;


	// sevice 호출
	public interface BoardService {
		
		List<Board> selectBoard(String inputTtile);

	}