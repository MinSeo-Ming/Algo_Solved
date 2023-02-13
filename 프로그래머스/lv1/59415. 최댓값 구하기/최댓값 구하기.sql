-- 코드를 입력하세요
SELECT datetime
from animal_ins
where animal_id = (select animal_id from animal_ins order by (datetime) desc limit 1);