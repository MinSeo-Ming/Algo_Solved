-- 코드를 입력하세요
SELECT NAME, DATETIME 
from ANIMAL_INS as i 
where  i.ANIMAL_ID not in(select animal_id from animal_outs)
order by datetime asc
limit 3;