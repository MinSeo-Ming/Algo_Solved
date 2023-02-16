-- 코드를 입력하세요
SELECT Date_format(SALES_DATE,"%Y-%m-%d") as SALES_DATE,PRODUCT_ID,USER_ID,SALES_AMOUNT
from (select USER_ID,PRODUCT_ID,SALES_AMOUNT,SALES_DATE from online_sale
union  
select Null as user_id, PRODUCT_ID,SALES_AMOUNT,SALES_DATE from offline_sale)as result
where date_format(SALES_DATE,"%Y-%m")="2022-03"
order by sales_date, product_id,user_id asc

