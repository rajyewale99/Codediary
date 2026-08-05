# Write your MySQL query statement below
SELECT 
    e1.employee_id,
    e1.name,
    count(e2.reports_to) AS reports_count,
    ROUND(AVG(e2.age)) AS average_age
FROM Employees e1 LEFT JOIN Employees e2
ON e1.employee_id = e2.reports_to
GROUP BY employee_id
HAVING reports_count > 0
ORDER BY e1.employee_id;