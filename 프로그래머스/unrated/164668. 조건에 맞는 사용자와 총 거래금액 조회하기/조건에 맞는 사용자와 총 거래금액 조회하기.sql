-- 코드를 입력하세요
SELECT USER_ID,NICKNAME, SUM(g.price) as TOTAL_SALES
from USED_GOODS_BOARD as g join USED_GOODS_USER as u
on u.user_id=g.WRITER_ID
where status ='DONE'
group by user_id 
having TOTAL_SALES>=700000
order by total_sales;