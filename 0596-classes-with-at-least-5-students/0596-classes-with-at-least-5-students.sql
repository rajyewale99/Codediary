# Write your MySQL query statement below
SELECT 
    class
From Courses
    group by class
    HAVING COUNT(class)>=5;