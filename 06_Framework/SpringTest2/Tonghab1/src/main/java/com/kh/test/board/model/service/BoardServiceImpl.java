package com.kh.test.board.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.kh.test.board.model.dto.Board;

import com.kh.test.board.model.mapper.BoardMapper;



		// service bean 객체 불러오기
		@Service
	
			public class BoardServiceImpl implements BoardService {
		
		// boardMapper 불러오기
		@Autowired

			private BoardMapper mapper;
		
		
		// service에서 가져온거

		@Override

			public List<Board> selectBoard(String inputTtile) {

			return mapper.selectBoard(inputTtile);

}

}