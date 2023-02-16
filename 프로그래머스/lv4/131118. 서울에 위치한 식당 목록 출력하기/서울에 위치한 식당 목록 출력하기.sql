-- 코드를 입력하세요
SELECT r.REST_ID,REST_NAME,FOOD_TYPE,FAVORITES,ADDRESS,SCORE
from REST_INFO as info join (select rest_id , round(avg(review_score),2) as score 
                     from REST_REVIEW re
                     group by rest_id) as r
on info.rest_id = r.rest_id
where ADDRESS like "서울%"
order by score desc, favorites desc