<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>결과</title>
</head>
<body>
  <h1>${param.name}님의 구매목록</h1>
  <h3>
  검은펜 ${param.blackPen}개 : ${blackPenTotal}
  빨간펜 ${param.redPen}개 : ${redPenTotal}
  파란펜 ${param.bluePen}개 : ${bluePenTotal}
  화이트 ${param.whitePen}개 : ${whitePenTotal}
  
  <hr>
  
  총합 ${total}원을 결제하셨습니다.
  
  
  
  
  
  
  </h3>
</body>
</html>