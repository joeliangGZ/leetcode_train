1. NOT IN 子查询 vs JOIN
NOT IN 不走索引，
LEFT JOIN 走索引
在 NOT IN 的结果集很大的时候，效率会低
JOIN 通常是高度优化的

Example:
SELECT name AS 'Customers'
FROM Customers
LEFT JOIN Orders ON Customers.Id = Orders.CustomerId
WHERE Orders.CustomerId IS NULL

SELECT name AS 'Customers'
FROM Customers
LEFT JOIN Orders ON Customers.Id = Orders.CustomerId
WHERE Orders.CustomerId IS NULL

