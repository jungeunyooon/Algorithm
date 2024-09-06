SELECT 
    COUNT(*) AS COUNT
FROM 
    ECOLI_DATA
WHERE 
    (GENOTYPE & 2 = 0)  -- 2번 형질을 보유하지 않음
    AND (GENOTYPE & 1 != 0 OR GENOTYPE & 4 != 0);  -- 1번 또는 3번 형질을 보유함
