# Write your MySQL query statement below
SELECT 
    MAX(salary) as 'SecondHighestSalary'
FROM Employee
Where salary < (SELECT MAX(salary) from Employee ORDER BY salary);