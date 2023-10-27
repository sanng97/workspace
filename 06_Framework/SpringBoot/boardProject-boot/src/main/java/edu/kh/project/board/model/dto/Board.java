package edu.kh.project.board.model.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// DTO (Date  Transfer Object) : 데이터 전달용 객체
// - 클래스간의 이동(레리어 이동 ) 시 필요한 데이터를 한 번에 담아 전달하는 용도의객체

//DTO 사용 시 많이 하는 실수
//   ->DB테이블 컬럼이랑 똑같이 하면 안됨

//-> 담아야되는 데이터 있으면 필요한 만큼, 필요한 형태로 필드작성  



@Getter
@Setter
@ToString
public class Board {
	
    private int boardNo;
    private String boardTitle;
    private String boardContent;
    private String boardWriteDate;
    private String boardUpdateDate;
    private int readCount;
    private String boardDelFl;
    private int memberNo;
    private int boardCode;
	
	
	// 목록조회, 상세조회시 매핑되는 필드
	private int commentCount;
	private int likeCount;
	private String memberNickname;
	private String thumbnauil;
	
	
	private String profileImg;
	
	// 댓글 목록을 저장할 필드
	private List<Comment> commentList;
	
	

}
