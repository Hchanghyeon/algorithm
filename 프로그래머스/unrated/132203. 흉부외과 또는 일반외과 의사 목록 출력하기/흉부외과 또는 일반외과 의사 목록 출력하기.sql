-- 코드를 입력하세요
SELECT DR_NAME, DR_ID, MCDP_CD, DATE_FORMAT(HIRE_YMD,'%Y-%m-%d') AS HIRE_YMD from doctor where mcdp_cd in('CS','GS') order by hire_ymd desc, dr_name;