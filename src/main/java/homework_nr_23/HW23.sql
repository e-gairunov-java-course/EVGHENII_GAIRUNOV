create table students(
student_id serial primary key,
name varchar(20) not null,
surname varchar(20) not null,
age int not null,
sex varchar(10) not null
);

insert into students(name,surname,age,sex)
values('Alice','Smith',20,'Female'),
('Bob','Johnson',22,'Male'),
('Charlie','Brown',19,'Male'),
('Diana','Lee',21,'Female'),
('Emily','Davis',23,'Female');

--select * from students;

update students
set age = 24
where student_id = 5;

delete from students
where student_id = 3;

select name,age
from students
where sex = 'Female';

select name
from students
where surname like 'C%';
