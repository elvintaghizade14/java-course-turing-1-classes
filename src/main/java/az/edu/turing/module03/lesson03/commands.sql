create table students
(
    id         bigserial    primary key,
    name       varchar(255) not null check (name != ' '),
    created_at timestamp default now(),
    is_female  boolean   default true,
    pin        varchar(7) unique,
    age        int check ( age >= 16 )
);

drop table if exists students;

select * from students
where id = 2;

select nextval('students_id_seq');