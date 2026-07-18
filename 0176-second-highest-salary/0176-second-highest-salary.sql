# Write your MySQL query statement below
SELECT
    (CASE
    WHEN (SELECT Count(*) FROM employee)<2 
        THEN NULL
    ELSE (SELECT DISTINCT salary FROM employee ORDER BY salary DESC LIMIT 1 OFFSET 1)
    END)
as SecondHighestSalary;