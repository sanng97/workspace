package edu.kh.project.board.model.service;

import java.util.Map;

import edu.kh.project.board.model.dto.Board;

public interface BoardService {
	
	/**
	 * 게시글 목록 조회
	 * @param boardCode
	 * @param i
	 * @return
	 */

	Map<String, Object> selectBoardList(int boardCode, int cp);

	Board boardDetail(Map<String, Object> map);
	
	
	
	/**
	 * 검색 목록 조회
	 * @param paramMap
	 * @param cp
	 * @return
	 */
	Map<String, Object> searchBoardList(Map<String, Object> paramMap, int cp);
	
	/**
	 * 게시글 상세 조회
	 * @param map
	 * @return
	 */

	int likeCheck(Map<String, Object> map);
	
	/**
	 * 좋아요 처리
	 * @param paramMap
	 * @return
	 */

	int like(Map<String, Object> paramMap);
	
	
	/**
	 * 조회수 증가
	 * @param boardNo
	 * @return result
	 */ 
	int updateReadCount(int boardNo);


	
	


	


}
