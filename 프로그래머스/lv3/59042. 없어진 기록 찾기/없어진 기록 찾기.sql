-- 코드를 입력하세요
SELECT outs.animal_id ,outs.name
from animal_outs outs 	
where outs.ANIMAL_ID not in (select distinct animal_id
                           from animal_ins
                           )