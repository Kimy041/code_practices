-- 코드를 작성해주세요
SELECT COUNT(*) AS FISH_COUNT FROM FISH_INFO AS I
                              JOIN FISH_NAME_INFO AS N ON I.FISH_TYPE = N.FISH_TYPE
                              WHERE N.FISH_NAME IN ('BASS', 'SNAPPER');