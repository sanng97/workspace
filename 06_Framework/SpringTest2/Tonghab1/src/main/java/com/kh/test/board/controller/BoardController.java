package com.kh.test.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;

import com.kh.test.board.model.dto.Board;

import com.kh.test.board.model.service.BoardService;

	// controller bean 추가
	@Controller

		public class BoardController {
	
	// 서비스 인터페이스와 연결
	@Autowired

		private BoardService service;
	
	// get방식으로 mapping하기
	@GetMapping("selectBoard")

	
		
		public String selectBoard(String inputTitle, Model model) {
			
			// board가 여러개라 List사용
			List<Board> boardList = service.selectBoard(inputTitle);
			
			// 조회하는 board가 없을때 searchfail
			if(boardList.isEmpty()) return "searchFail";
			
			// 조회하는 board가 있을때 searchSuccess로 보낸다.
			model.addAttribute("boardList", boardList);

			return "searchSuccess";

		}

}