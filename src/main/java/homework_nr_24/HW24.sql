create table departments (
    department_id serial primary key,
    department_name varchar(50)
);

create table employees (
    employee_id serial primary key,
    employee_name varchar(50),
    department_id int,
    foreign key (department_id) references departments(department_id)
);

create table projects (
    project_id serial primary key,
    project_name varchar(50)
);

create table employee_projects (
    emp_prj_id serial primary key,
    employee_id int,
    project_id int,
    foreign key (employee_id) references employees(employee_id),
    foreign key (project_id) references projects(project_id)
);

select * from departments d ;
select * from employees;
select * from projects;
select * from employee_projects;

insert into departments (department_name)
values ('hr'),('it'),('management'),('logistics'),('accounting'),('cleaning');

insert into employees (employee_name,department_id)
values ('Кузя',1),('Вася',1),('Жора',2),('Гоша',2),('Изя',3),('Яша',3),('Саша',4),('Вова',4),('Соня',5),('Сара',5),('Маша',6),('Галя',6),('Витя',2);

insert into projects (project_name)
values ('Project_1'),('Project_2'),('Project_3'),('Project_4'),('Project_5'),('Project_6');

insert into employee_projects (employee_id,project_id)
values (1,1),(3,1),(5,1),(7,1),(9,1),(11,1),
(2,2),(4,2),(6,2),(8,2),(10,2),(12,2),
(1,3),(13,3),(5,3),(7,3),(9,3),(11,3),
(2,4),(3,4),(6,4),(8,4),(10,4),(12,4),
(1,5),(4,5),(5,5),(7,5),(9,5),(11,5),
(2,6),(13,6),(6,6),(8,6),(10,6),(12,6);

--a
select employee_name as name, department_name as department
from employees e
join departments d
on e.department_id  = d.department_id

--b
select employee_name as name
from employees
where department_id = null;

--c
select project_name as project, employee_name as name
from employees e
join employee_projects ep
on e.employee_id = ep.employee_id
join projects p
on ep.project_id = p.project_id
order by project;

--d
select employee_name as name, department_name as department
from employees e
left join departments d
on e.department_id  = d.department_id

--e
select department_name as department, count(employee_id)
from departments d
join employees e
on d.department_id = e.department_id
group by department
