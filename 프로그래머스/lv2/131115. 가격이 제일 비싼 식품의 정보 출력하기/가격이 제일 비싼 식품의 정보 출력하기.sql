-- 코드를 입력하세요
SELECT PRODUCT_ID, PRODUCT_NAME	,PRODUCT_CD,CATEGORY,PRICE
from food_product
where product_id = (select product_id from food_product order by Price desc limit 1);