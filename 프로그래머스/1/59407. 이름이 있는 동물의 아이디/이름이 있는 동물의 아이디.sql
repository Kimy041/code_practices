-- 코드를 입력하세요
SELECT ANIMAL_ID FROM ANIMAL_INS
                 WHERE (NAME IS NOT NULL OR NAME != '')
                 ORDER BY ANIMAL_ID ASC;