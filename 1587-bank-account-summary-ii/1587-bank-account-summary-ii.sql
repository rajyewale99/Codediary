# Write your MySQL query statement below
SELECT
    name,
    sum(amount) AS balance
FROM USERS u join Transactions t
ON u.account = t.account
GROUP BY u.account
HAVING sum(amount)>10000;