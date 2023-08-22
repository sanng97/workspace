-- 함수 : 컬럼 값 | 지정된값을 읽어 연산한 결과를 반환하는것


-- 단일행 함수 : N개의 행의 컬럼값을 전달하여 N개의 결과가 반환

-- 그룹함수 :N개의 행의 컬럼값을 전달하여 1개의 결과가 반환
          -- (그룹의 수가 늘어나면 그룹의 수 만큼 결과를 반환)


-- 함수는 SELECT절, WHERE절, ORDER BY 절
--        GROUP BY절 HAVING 절에서 사용가능

/******* 단일행 함수 ***************/
--< 문자열 관련 함수>
-- LENGTH (문자열 | 컬럼명) :문자열의 길이 반환
SELECT 'HELLO WORLD', LENGTH ('HELLO WORLD') FROM DUAL;


-- EMPLOYEE 테이블에서
-- 사원명 이메일 이메일 길이 조회
-- 단 ,이메일 길이가 12 이하인 행만 조회
-- 이메일 길이 오름차순 조회
SELECT  EMP_NAME " 사원명 ", EMAIL:"이메일",LENGTH(EMAIL)"이메일 길이"
FROM EMPLOVEE;
WHRER LENGTH(EMAIL) <- 12 
ORDER BY " 이메일 길이";

----------------------------
-- INSTR (문자열 |컬러명 ,'찾을 문자열'[,찾을시작위치[, 순번]]
--  찾을 시작 위치부터 지정된 순번째 찾은 문자열의 시작 위치를 반환

-- 문자열 검색을 5번부터 시작해서 2번째처음나오는 'B'의 위치를 조회

SELECT 'AABAACAABBAA' , INSTR('AABAACAABBAA','8',5)
FROM DUAL;

------------------------------------

--SUBSTR (문자열 | 컬럼명 , 시작위치 [, 길이])
-- 문자열을 시작위치 부터 지정된 길이 만큼 잘라내서반환
-- 길이 미작성 시 시작 위치부터  끝까지 잘라내서 반환

SELECT SUBSTR('ABCDEFG',3,3) FROM DUAL;
SELECT SUBSTR('ABCDEFG',3) FROM DUAL;

-- EMPLOYEE 테이블에서
-- 사원명, 이메일 아이디(@앞에까지 문자열)을
-- 이메일아이디 오름차순으로 조회

SELECT EMP_NAME, SUBSTR( EMAIL, 1, INSTR(EMAIL,'@'))
FROM EMPLOYEE 
ORDER BY "아이디";

-------------------------------------

-- 문자열 공백 제거 

SELECT '###K   H###',
          TRIM(LEADING '#' FROM '    ###K   H###'),
          
           TRIM(TRAILING '#' FROM ' ###K   H###'),
            TRIM(BOTH '#' FROM '    ###K   H###')
FROM DUAL;
------------------------------------------------

--REPLACE (문자열 | 컬럼명 , 찾을 문자열 ,바꿀 문자열)
SELECT REPLACE (NATIONAL_NAME,'한국', '대한민국')
FROM NATIONAL;

-- < 숫자 관련 함수 >

-- MOD(숫자 | 컬럼명, 나눌 값) : 나머지

SELECT MOD(105 ,100) FROM DUAL;

-- ABS (숫자 | 컬럼명) : 절대값

SELECT ABS(10), ABS(-10) FROM DUAL;


-- CEIL (숫자 |칼럼명)  :올림
-- FLOOR(숫자 | 컬럼명) : 내림

SELECT 1.1, CEIL (1.1), FLOOR(1.1) FROM DUAL;

-- ROUND (숫자 | 컬럼명 [, 소수점 위치])
-- 소수점 위치 지정 X : 소수점 첫째 자리에서 반올림 -> 정수 표현
-- 소수점 위치 지정 O
-- 1 ) 양수 : 지정된 위치의 소수점 자리까지 표현
-- 2 ) 음수 : 지정된 위치의 정수 자리까지 표현

SELECT 123.456,
	ROUND(123.456),
	ROUND(123.456,1),
	ROUND(123.456,2),
	ROUND(123.456,-1),
	ROUND(123.456,-2)
	
FROM DUAL;

---------------------------

-- TRUNC(숫자 | 컬럼명 [, 소수점위치] : 버림 (잘라내기) )

SELECT -123.5,

TRUNC (-123.5),
FLOOR (-123.5),
TRUNC(2.5) ,FLOOR(2.5)
FROM DUAL;

----------------------------------

-- <날짜 관련된 함수>

-- SYSDATE : 현재시간
-- SYSTIMESTEMP :현재시간

SELECT SYSDATE , SYSTIMESTAMP FROM DUAL;

-- MONTHS_BETWEEN(날짜, 날짜) : 두 날짜 사이의 개월 수을 반환

SELECT MONTHS_BETWEEN ('2023-12-26', SYSDATE ) FROM DUAL;

-- EMPLOYEE 테이블에서
-- 모든 사원의 사번, 이름, 입사일 , N년차

SELECT EMP_ID,EMP_NAME, HIRE_DATE,
	CEIL(MONTHS_BETWEEN(SYSDATE, HIRE_DATE) /12 ) " N년차"
FROM EMPLOYEE ;

-- 날짜 + 숫자 :  일 단위로 연산

-- MONTHS_BETWEEN() : 윤년 계산이 알아서 포함되어 있음

-- ADD MONTHS( 날짜, 숫자 ) :날짜를 숫자만큼의 개월수를 더하여 반환
SELECT ADD_MONTHS(SYSDATE , -1), SYSDATE , ADD_MONTHS ( SYSDATE ,12)
FROM DUAL;

--LAST_DAY(날짜) : 해당 월의 마지막 날짜를 반환
SELECT LAST_DAY(SYSDATE) FROM DUAL; 


SELECT LAST_DAY(ADD_MONTHS(SYSDATE,-1)) +1 "시작일",
	LAST_DAY(SYSDATE) "종료일" 
FROM DUAL;

-- EXTRACT (YEAR | MONTH | DAY FROM 날짜)
-- 지정된 날짜의 년 | 월 | 일을  추출하여 정수로 변환

SELECT EXTRACT (YEAR FROM SYSDATE) || '년',
	EXTRACT (MONTH FROM SYSDATE) || '월', 
	EXTRACT (DAY FROM SYSDATE) || '일' 
FROM DUAL;

-- EMPLOYEE 테이블에서 2000년도에 입사한 사원의
-- 사번, 이름, 입사일을 이름 오름차순으로 조회

SELECT EMP_ID, EMP_NAME , HIRE_DATE 
FROM EMPLOYEE 
WHERE EXTRACT (YEAR FROM HIRE_DATE ) =2000
ORDER BY EMP_NAME; 

--------------------------

-- <형변환 (Parsing) 함수 > 

---문자열 < CHAR, VARCHAR2) < - > 숫자(NUMBER)
-- 문자열 < CHAR, VARCHAR2) <- > 날짜 (DATE)
-- 숫자 <NUMBER> --> 날짜 <DATE>

/* TO_CHAR(날짜 | 숫자 [, 포맷]) : 문자열로 변환
 * 
 * 숫자 -> 문자열
 * 포맷 
 * 1) 9 : 숫자 한 칸을 의미, 오른쪽 정렬
 * 2) 0 : 숫자 한 칸을 의미, 오른쪽 정렬, 빈 칸에 0을 추가
 * 3) L : 현재 시스템이나 DB에 설정된 나라의 화폐 기호
 * 4) , : 숫자의 자릿수 구분
 * */

SELECT 1234, TO_CHAR(1234) FROM DUAL;


-- 9 : 숫자 한 칸을 의미, 오른쪽정렬(빈칸은 띄어쓰기)
SELECT 1234, TO_CHAR(1234, '999999999')FROM DUAL;

SELECT 1234, TO_CHAR(1234, '000000000')FROM ALL_PROCEDURES AL; 

--> 값이 제대로 표현될 수 없어서 ####이 반환됨
SELECT 123456789, TO_CHAR(123456789, '000')FROM DUAL;

-- > 화페기호 + 자릿수 구분
SELECT TO_CHAR(1234567),
       TO_CHAR(1234567, 'L9999999'),
       TO_CHAR(1234567, 'L9,999,999'),
       TO_CHAR(1234567, '$9,999,999')
FROM DUAL;
       
-- EMPLOYEE 테이블에서
-- 사번, 이름, 연봉조회 (\100,000,000 형식)

SELECT EMP_ID , EMP_NAME,TO_CHAR(SALARY *12,'L999,999,999')
FROM EMPLOVEE;

------------------------------------------------------
/* 날짜 -> 문자열
 * YY    : 년도(짧게) EX) 23
 * YYYY  : 년도(길게) EX) 2023
 * 
 * RR    : 년도(짧게) EX) 23
 * RRRR  : 년도(길게) EX) 2023
 * 
 * MM : 월
 * DD : 일
 * 
 * AM/PM : 오전/오후
 * 
 * HH   : 시간 (12시간)
 * HH24 : 시간 (24시간)
 * MI   : 분
 * SS   : 초
 * 
 * DAY : 요일(전체) EX) 월요일, MONDAY
 * DY  : 요일(짧게) EX) 월, MON
 * */

-- 2023/08/22
SELECT TO_CHAR(SYSDATE,'YYYY/MM/DD')  FROM DUAL;

--2023-08-22 화요일
SELECT TO_CHAR(SYSDATE, 'YYYY-MM-DD DAY')FROM DUAL;

--20230822 14:32:27 화
SELECT TO_CHAR(SYSDATE, 'YYYYMMDD HH24:MI:SS ( DY)')FROM DUAL;


--2023년 08월 22일 화요일 오후 02시 35분 45초
SELECT  TO_CHAR(SYSDATE, 'YYYY"년" MM"월" DD"일" PM HH"시" MI"분" SS"초"')

FROM DUAL;


--> ORA - 01821 : 날짜 형식이 부적합합니다.

--> 년,월,일,시,분,초는 오라클에서 지정한 시간관련 패턴이다.

--> 패턴인식이 아닌 그대로를 나타내는 쌍따옴표를 사용한다
------------------------------------------------

-- TO_DATE( 문자열 | 숫자 [,포맷])
-- 문자열 또는 숫자를 날짜 형식으로 변환
-- 포맷의 역할 : 문자열 또는 숫자의 패턴이
--            날짜의 어떤 부분을 가리키고 있는지를 지정

SELECT TO_DATE('22-08-2023','DD-MM-YYYY')FROM DUAL;

SELECT TO_DATE('22일 화요일 15:07:30','DD"일"DAY HH24 :MI:SS"' ) 
FROM DUAL;

-- 숫자 -> 날짜
SELECT TO_DATE(20230822,'YYYYMMDD')FROM DUAL; 

/*** 연도 패턴 Y,R의 차이점***/

-- 연도가 두자리만 두자리만 작성되어있는 경우
-- 50미만 :  Y,R 둘 다 누락된 연도 앞부분에 현재 세기 (2000년대= 21세기)추가
-- 50이상 :   Y: 현재세기(2000년대)추가
--           R :이전세기(1900년대)추가


SELECT TO_DATE('49-11-25', 'YY-MM-DD') "YY",
       TO_DATE('49-11-25', 'RR-MM-DD') "RR"
       FROM DUAL;
		
SELECT TO_DATE('50-11-25', 'YY-MM-DD') "YY",
       TO_DATE('50-11-25', 'RR-MM-DD') "RR"
       FROM DUAL;
		
----------------------------

-- TO_NUMBER(문자열 [,패턴]) : 문자열 ->숫자변환
      
 SELECT TO_NUMBER('$1,500', '$9,999')FROM DUAL;

---------------------------------------------------

-- <NULL 처리 함수>
-- (NULL 처리 연산 : IS NULL, IS NOT NULL)
-- NVL( 컬럼명, 컬럼 값이 NULL일 경우 변경할 값)


-- EMPLOYEE 테이블에서
-- 사번, 이름, 전화번호 조회
-- 단, 전화번호가 없으면 (NULL)'없음'으로 조회
SELECT EMP_ID, EMP_NAME ,NVL(PHONE,'없음') 
FROM EMPLOYEE; 

-- EMPLOYEE 테이블에서
-- 이름, 급여, 보너스 조회
-- 보너스가 없으면 0으로 조회

SELECT EMP_NAME, SALARY , NVL(BONUS,'0')
FROM EMPLOYEE ;

-- EMPLOYEE 테이블에서
-- 이름, 연봉, 인센티브 (연봉 *보너스)를 조회
-- 단, 인센티브가 없으면 (NULL) 0으로 표시
-- 연봉 내림차순으로 조회

-- SELECT NULL FROM DUAL; --> NULL 산술 연산 결과는 항상 NULL

SELECT EMP_NAME,  SALARY*12 "연봉",NVL(SALARY * 12 *BONUS,0)"인센티브"
FROM EMPLOYEE;
ORDER BY 2 DESC;

--------------------

-- NVL2 (컬럼명, NULL이 아닌 경우 변경할 값   , NULL인 경우 변경할 값)

-- 사번, 이름, 전화번호조회
-- 전화번호가 없으면 '없음'
-- 전화번호가 있으면 '010 ********'변경해서 조회

SELECT EMP_ID, EMP_NAME, 
   NVL2(PHONE,
   RPAD(SUBSTR(PHONE,1,3), LENGTH(PHONE), '*') ,
   '없음')
FROM EMPLOYEE;

---------------------------------------

-- < 선택 함수>
-- 여러가지 경우에 따라 알맞은 결과를 선택하는 함수
-- (IF ,SWITCH문과 비슷)

-- DECODE(컬럼명 | 계산식 , 조건1, 결과1, 조건2, 결과2...[아무것도 만족X])

-- 컬럼명 | 계산식의 값이 일치하는 조건이 있으면
-- 해당 조건 오른쪽에 작성된 결과가 반환된다

-- 모든 조건 불만족 시 [, 아무것 만족X] 가 반환됨.
-- EMPLOYEE 테이블에서 모든 사원의 이름,주민등록번호, 성별조회

SELECT EMP_NAME, EMP_NO, 
DECODE(SUBSTR(EMP_NO 8,1 ),1,'남자',2,'여자') "성별"
FROM EMPLOYEE;



-- EMPLOYEE 테이블에서
-- 직급코드가 'J7'인 직원은 급여 + 급여의 10%
-- 직급코드가 'J6'인 직원은 급여 + 급여의 15%
-- 직급코드가 'J5'인 직원은 급여 + 급여의 20%
-- 나머지 직급코드의 직원은 급여 + 급여의 5%  지급
-- 사원명, 직급코드, 기존급여, 지급급여 조회

SELECT EMP_NAME, JOB_CODE, SALARY 기존급여,

	DECODE(JOB_CODE,'J7',SALARY * 1.1,
			'J6', SALARY * 1.15,
			'J5',SALARY*1.2,
			SALARY * 1.05) 지급급여

FROM EMPLOYEE ;

--------------------------------------
-- CASE 
--     WHEN 조건1 THEN 결과1
--     WHEN 조건2 THEN 결과2
--     WHEN 조건3 THEN 결과3
--     ELSE 결과
-- END

-- DECODE는 계산식|컬럼 값이 딱 떨어지는 경우에만 사용 가능.
-- CASE는 계산식|컬럼 값을 범위로 지정할 수 있다. 

SELECT EMP_ID, EMP_NAME,SALARY,
CASE 
	WHEN SALARY  >= 5000000 THEN '고급'
	WHEN SALARY  >= 3000000 THEN '중급'
	ELSE '초급'
END 구분

FROM EMPLOYEE 
WHERE DEPT_CODE IN  ('D6','D9')
ORDER BY JOB_CODE /* ASC생략가능 */;







