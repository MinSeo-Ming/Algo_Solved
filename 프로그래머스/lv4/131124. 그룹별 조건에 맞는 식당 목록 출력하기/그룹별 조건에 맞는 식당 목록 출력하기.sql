-- 코드를 입력하세요
-- SELECT 
-- from rest_info r;
select MEMBER_NAME,REVIEW_TEXT,date_format(REVIEW_DATE,"%Y-%m-%d") as REVIEW_DATE
from member_profile m 
join ( select member_id from rest_review
    group by member_id
    having count(*) = (
        select max(mycount) from 
                (select count(*) as mycount 
                        from rest_review group by member_id)as result))
as r
on r.member_id = m.member_id
join rest_review rr
on m.member_id= rr.member_id
order by review_date asc , REVIEW_TEXT asc;