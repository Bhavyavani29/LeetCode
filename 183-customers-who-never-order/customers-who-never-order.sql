# Write your MySQL query statement below
select name as Customers from Customers where id Not in(Select customerId from Orders);