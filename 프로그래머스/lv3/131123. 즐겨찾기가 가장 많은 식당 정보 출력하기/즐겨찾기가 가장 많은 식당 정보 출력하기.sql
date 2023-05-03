-- 코드를 입력하세요
SELECT FOOD_TYPE, REST_ID,REST_NAME,FAVORITES
from rest_info
where (food_type, favorites)in
(
select food_type, max(favorites)
from REST_INFO
group by FOOD_TYPE)

order by Food_type desc;