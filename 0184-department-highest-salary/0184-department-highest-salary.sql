select Department,Employee,Salary 
from(
    select
    d.name as Department,e.name as Employee,e.salary as Salary,
    rank() over(partition by e.departmentId 
                order by e.salary desc)as rnk
    from employee e join department d on e.departmentID=d.id
    )x
    where rnk=1
;