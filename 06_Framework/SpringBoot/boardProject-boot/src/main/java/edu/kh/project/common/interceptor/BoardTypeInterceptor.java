package edu.kh.project.common.interceptor;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import edu.kh.project.board.model.service.BoardService;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;

// Interceptor : 요청 / 응답을 가로채는 객체
// Client <-> Filter <-> Dispatcher Servlet <-> Interceptor <-> Controller

/* HandlerInterceptor (인터셉터 처리기) 상속 필수 */
  
@Slf4j
public class BoardTypeInterceptor implements HandlerInterceptor {
	
	@Autowired // boardSerivce bean 의존성 주입
	private BoardService service;
	
	// preHandle(전처리) : Dispatcher Servlet -> Controller 사이 (요청을 가로챈 후 동작)
	// postHandle(후처리) : Controller -> Dispatcher Servlet 사이 (응답을 가로채서 동작)
	
	// afterCompletion (뷰 완성 후 ) : DispatcherServlet -> Client 사이
	//                               forward 한 뷰 (html, jsp) 완성 후 동작
	
	// 전처리
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		
		// application scope(서버 실행시 1개만 생성 종료 시 사라짐)
	    ServletContext application = request.getServletContext();
		if(application.getAttribute("BoardTypeList") == null) {
		    	
		    
		log.info("---BoardTypeInterceptor 동작 ---");

	    
	   
		List<Map<String , Object>> boardTypeList = service.selectBoardTypeList();
		
		application.setAttribute("boardTypeList", boardTypeList);
		} 
		return HandlerInterceptor.super.preHandle(request, response, handler);
	}
	
	@Override
		public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
				ModelAndView modelAndView) throws Exception {
			
			HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
		}
	
	
	@Override
		public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
				throws Exception {
			
			HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
		}

}
