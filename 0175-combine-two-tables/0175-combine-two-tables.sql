# Write your MySQL query statement below
SELECT
    firstName,
    lastName,
    city,
    state
FROM 
    Person p Left JOIN Address a
ON p.personId = a.personId;