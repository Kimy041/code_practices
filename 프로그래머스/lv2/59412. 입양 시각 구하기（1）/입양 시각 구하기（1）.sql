-- 코드를 입력하세요
SELECT HOUR(DATETIME) AS HOUR, COUNT(DATETIME) AS COUNT FROM ANIMAL_OUTS GROUP BY HOUR HAVING HOUR >= 9 AND HOUR <= 19 ORDER BY HOUR 