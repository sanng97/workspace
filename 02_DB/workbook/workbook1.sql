--1
SELECT DEPARTMENT_NAME, CATEGORY
FROM TB_DEPARTMENT;

--2
SELECT
    department_name || '의 정원은 ' || capacity || '명 입니다.' as "학과별 정원"
FROM TB_DEPARTMENT;


--3
SELECT 
    student_name
FROM
    tb_student
WHERE
    absence_yn = 'Y'
AND
    student_ssn LIKE '_______2%'
AND
    department_no = (SELECT  department_no FROM tb_department WHERE department_name = '국어국문학과');
   

 --4
 SELECT STUDENT_NAME 
 FROM TB_STUDENT 
 WHERE STUDENT_NO IN(  'A513079'
        , 'A513090'
        , 'A513091'
        , 'A513110'
        , 'A513119'
    )
order by
    student_name DESC;


 --5 
 SELECT DEPARTMENT_NAME,CATEGORY
 FROM TB_DEPARTMENT
 WHERE CAPACITY BETWEEN 20 AND 30;
   
   
 --6 
 SELECT PROFESSOR_NAME 
 FROM TB_PROFESSOR
 WHERE DEPARTMENT_NO IS NULL;
   
 --7
   
SELECT CLASS_NO
FROM TB_CLASS
WHERE PREATTENDING_CLASS_NO IS NOT NULL;
   
   
-- 8 
SELECT  DISTINCT CATEGORY 
FROM TB_DEPARTMENT
ORDER BY CATEGORY ASC;
   
   
--9

SELECT STUDENT_NO, STUDENT_NAME, STUDENT_SSN

FROM TB_STUDENT

where
    student_no like 'A2%'
and
    student_address like '%전주%'
and
    absence_yn = 'N';

   
   
   
   
   
   
   
   
   
   
