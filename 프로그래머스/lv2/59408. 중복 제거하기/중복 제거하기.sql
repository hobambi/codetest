-- 코드를 입력하세요
SELECT count(distinct name)
FROM ANIMAL_INS 
# WHERE name = (SELECT distinct name 
#               FROM ANIMAL_INS)