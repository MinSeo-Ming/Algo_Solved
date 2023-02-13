-- 코드를 입력하세요
SELECT BOOK_ID, AUTHOR_NAME,date_format(published_date,"%Y-%m-%d")as PUBLISHED_DATE
from Book as b 
join author as a Using(author_id) 
where b.CATEGORY="경제"
order by b.PUBLISHED_DATE;
