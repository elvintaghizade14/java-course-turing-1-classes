CREATE TABLE cars
(
    brand VARCHAR(255),
    model VARCHAR(255),
    year  INT
);

INSERT INTO cars (brand, model, year)
VALUES ('Ford', 'Mustang', 1964);

SELECT *
FROM cars;

SELECT brand, year
FROM cars;

ALTER TABLE cars
    ADD color VARCHAR(255);

UPDATE cars
SET color = 'red'
WHERE year = 1965;

DELETE
FROM cars
WHERE color = 'gray';

INSERT INTO cars
VALUES ('VAZ', '2106', 2006, 'yash asfalt');
select count(*)
from cars
where brand = 'VAZ';

select *
from cars;

select *
from cars
where brand = 'VAZ'
limit 1;

TRUNCATE TABLE cars;

drop TaBlE cars;

CREATE TABLE cars
(
    id    serial,
    brand VARCHAR(255),
    model VARCHAR(255),
    year  INT
);

INSERT INTO cars (brand, model, year)
VALUES ('Ford', 'Mustang', 2024);

select *
from cars;

select count(*)
from cars;
select max(id)
from cars;
select min(id)
from cars;
select sum(id)
from cars;
select avg(id)
from cars;

select *
from cars
-- where year > 1899 and year < 2000;
-- where year between 1899 and 1965;
where year in (1965, 1967);

select id, brand as marka, model, year "buraxilish ili"
from cars;

select *
from cars
where brand like '_o%';
