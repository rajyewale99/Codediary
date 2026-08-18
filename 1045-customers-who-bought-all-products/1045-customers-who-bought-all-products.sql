# Write your MySQL query statement below
SELECT 
    customer_id
FROM 
    Customer
GROUP BY
    customer_id
HAVING
    COUNT(DISTINCT PRODUCT_KEY)=
    (SELECT 
        COUNT(*)
    FROM
        Product
    )
;