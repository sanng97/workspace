package edu.kh.jsp.controller;

import java.io.IOException;



import jakarta.security.auth.message.callback.PrivateKeyCallback.Request;
import jakarta.servlet.DispatcherType;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/pizza/order")
public class PizzaOrderServiet extends HttpServlet {

	
	private Object size;
	// a 태그 요청 == get 방식
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		/* 별도 처리 없이 바로 JSP로 요청 위임 */
	
		//RequestDispatcher :  요청발송자
		// -> 지정된 jsp로 
		// Servlet이 받은 요청 정보 (req), 응답정버보 (resp)를
		// 전달 (발송하는 역할)을 한다.
		
		
	//	RequestDispatcher dispatcher
	//	= req.getRequestDispatcher("JSP경로");
		
		
	RequestDispatcher dispatcher
    = req.getRequestDispatcher("/WEB-INF/views/pizza_order.jsp");
		
	  /*forword (중요)*/
	
	/* 뜻 : 전송하다, 전달하다 보내다 발송하다
	 * 
	 * JSP로 요청, 응답을 보내는 기능
	 * 
	 *특징
	 *  - 브라우저 주소창은 요청 주소 (/pizza/order)로 변함
	 *  
	 *  ->   Servlet을 요청
	 *  
	 *  -  브라우저 화면은 요청 위임된 JSP로 변함
	 *  
	 *  - 실제 페이지 이동은 1회 진행
	 *  
	 *  클라이언트 요청 -> [Servlet이 요청 처리 + jsp가 응답화면만 만듦]
	 * 
	 * 
	 */
	
	dispatcher.forward(req,resp);	
		
	}
	// ---------------------------------------
	
	// form 태그 POST 방식 제출 시
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String pizza = req.getParameter("pizza"); // 치즈피자-8000
		String size = req.getParameter("size");  // R || L
		int amount = Integer.parseInt(req.getParameter("amount")); // 1 (개)
		
		// 피자 이름, 가격 나누기
		pizza.split("-"); // "-" 구분자로 쪼개어 String[] 반환
		
		// arr =={ 치즈피자,  8000}
		String[] arr = pizza.split("-"); // "-" 구분자로 쪼개어 string[]반환
		
		
		String pizzaName=arr[0]; // "치즈 피자"
		int price = Integer.parseInt(arr[1]);  //8000
		
		// L사이즈인 경우 4000원 추가
		if (size.equals("L"))  price+=4000;{
		
			
		// 수량만큼 price 곱하기	
			price = price * amount;
			
		
			/* JSP로 요청 위임 (forward)*/
			
			// JSP 경로는 webapp 폴더를 기준으로 작성
			// "/" == webapp
			RequestDispatcher dispatcher
			     = req.getRequestDispatcher("/WEB-INF/views/pizza_result.jsp");
			
			
			// JSP로 전달하는 req에는 파라미터가 담겨있다
			// ->그런데 pizzaName, price는 없다 (servlet 에서 만든 변수)
			// -> [ 해 결 방법]
			//  = req.에 속성(Attribute) 추가하면
			// JSP에서 꺼내 쓸수 있다
			// (속성 == 필드 (변수)
			
			req.setAttribute("pizzaName" ,pizzaName);
			req.setAttribute("price" ,price);
			dispatcher.forward(req, resp);
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
