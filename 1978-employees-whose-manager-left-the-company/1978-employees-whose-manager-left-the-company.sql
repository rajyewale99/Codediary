# Write your MySQL query statement below
SELECT 
    DISTINCT employee_id
FROM 
    Employees e
WHERE e.salary<30000
AND manager_id IS NOT NULL
AND NOT EXISTS(
    SELECT 1
    FROM Employees e2
    WHERE e.manager_id = e2.employee_id
)ORDER BY e.employee_id;
