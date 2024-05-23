create table people
(
    id   bigserial primary key,
    name varchar(255) not null
);

create table phones
(
    id           bigserial primary key,
    phone_number varchar(12) not null unique,
    person_id    bigint,
    foreign key (person_id) references people(id)
);

select * from people;

select * from phones;

select * from people
                  left join phones on people.id = phones.person_id;

select * from phones
                  right join people on people.id = phones.person_id;

select * from people
                  full outer join phones on people.id = phones.person_id
order by people.id;

select * from phones
                  inner join people on people.id = phones.person_id;

delete from people where id = 3;

delete from phones where person_id = 3;