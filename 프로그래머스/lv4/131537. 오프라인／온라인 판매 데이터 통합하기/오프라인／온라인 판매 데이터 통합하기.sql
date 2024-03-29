-- 코드를 입력하세요
SELECT DATE_FORMAT(SALES_DATE,'%Y-%m-%d') as SALES_DATE, PRODUCT_ID, USER_ID, SALES_AMOUNT FROM ONLINE_SALE WHERE MONTH(SALES_DATE) = 3
UNION ALL
SELECT DATE_FORMAT(SALES_DATE,'%Y-%m-%d') as SALES_DATE,  PRODUCT_ID, null AS USER_ID, SALES_AMOUNT FROM OFFLINE_SALE WHERE MONTH(SALES_DATE) = 3
order by sales_date asc, product_id asc, user_id asc; 