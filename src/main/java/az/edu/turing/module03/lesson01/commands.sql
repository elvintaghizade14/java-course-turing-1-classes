CREATE
DATABASE console;

-- DROP DATABASE "booking-ui";

CREATE TABLE people
(
    person_id int,
    lastname  varchar(255),
    firstname varchar(255),
    address   varchar(255),
    city      varchar(255)
);

SELECT *
FROM people;

-- DROP TABLE people;

ALTER TABLE people ALTER COLUMN person_id TYPE bigint;

INSERT INTO people
VALUES (5, 'Taghizade', 'Elvin2', 'Nowhere', 'ISMAYILLI');

INSERT INTO people(lastname, firstname)
VALUES ('Taghizade2', 'Elvin2');

SELECT DISTINCT(lastname)
from people;

SELECT *
FROM people
WHERE city IS NOT NULL
  AND person_id = 1;

SELECT *
FROM people
ORDER BY firstname DESC
--                          person_id DESC;