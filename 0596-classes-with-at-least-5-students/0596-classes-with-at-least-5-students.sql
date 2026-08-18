# Write your MySQL query statement below
SELECT 
    class
From Courses
    GROUP BY class
    HAVING COUNT(class)>=5;