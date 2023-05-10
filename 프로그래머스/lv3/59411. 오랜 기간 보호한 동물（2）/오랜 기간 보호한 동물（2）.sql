-- 코드를 입력하세요
SELECT  outs.ANIMAL_ID, outs.name
from ANIMAL_OUTS as outs,  ANIMAL_INS as ins 
where  ins.ANIMAL_ID = outs.ANIMAL_ID
order by timestampdiff(second,outs.DATETIME ,ins.DATETIME)
limit 2;