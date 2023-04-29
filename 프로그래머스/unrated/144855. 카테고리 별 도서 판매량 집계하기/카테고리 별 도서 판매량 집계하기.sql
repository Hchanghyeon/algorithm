-- 코드를 입력하세요
SELECT CATEGORY, SUM(sales) AS TOTAL_SALES FROM BOOK_SALES A JOIN BOOK B ON A.book_id = B.book_id WHERE MONTH(A.SALES_DATE) = 1 group by CATEGORY order by category;