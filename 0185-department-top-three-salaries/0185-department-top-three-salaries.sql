# Write your MySQL query statement below
SELECT
    Department,
    Employee,
    Salary
From
    (
        SELECT 
        d.name AS Department,
        e.name AS Employee,
        e.salary AS Salary,
        DENSE_RANK() OVER(PARTITION BY e.departmentId ORDER BY e.salary DESC) AS rn
        FROM 
        Employee e LEFT JOIN Department d
        ON e.departmentId = d.id
        
    )t
    WHERE rn<=3