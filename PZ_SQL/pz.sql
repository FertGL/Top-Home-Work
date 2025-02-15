CREATE TABLE pz.plane (
	"id" BIGINT GENERATED ALWAYS AS IDENTITY,
	number VARCHAR(10) PRIMARY KEY,
	brand VARCHAR(20),
	seats INT NOT NULL,
	departure_city VARCHAR(50),
	arrival_city VARCHAR(50),
	departure_date_time TIMESTAMP
);

INSERT INTO pz.plane ("number","brand", "seats", "departure_city", "arrival_city" , "departure_date_time")
VALUES ('164NZB23','Boeing 737', 50,'Moskow','Saint-Petersburg','2025-02-26 20:50:00'),
		('291AUI03','Airbus A320', 100,'Moskow','New-York','2025-03-05 16:00:00'),
		('934TMC52','Boeing 777', 100,'Moskow','Orel','2025-02-15 9:30:00');

CREATE TABLE pz.passenger (
	"id" BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
	name_surname VARCHAR(100),
	number_of_plane VARCHAR(10),

	CONSTRAINT fk_plane FOREIGN KEY (number_of_plane) REFERENCES pz.plane(number)
);

INSERT INTO pz.passenger (name_surname, number_of_plane)
VALUES ('Глеб Ферт', '164NZB23'),
		('Таблер Александр', '164NZB23'),
		('Слонская Ксения', '291AUI03'),
		('Калинина Марина', '934TMC52'),
		('Лапенко Даниил', '291AUI03');

CREATE TABLE pz.seat_boeing_737 (
 "id" BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
 number_of_plane VARCHAR(10),
 passenger_id BIGINT,
 CHECK (id <= 50),

 CONSTRAINT fk_seat_passenger FOREIGN KEY (passenger_id) REFERENCES pz.passenger(id)
);

INSERT INTO pz.seat_boeing_737 (number_of_plane, passenger_id)
VALUES
('164NZB23','1'),
('164NZB23','1'),
('164NZB23','1'),
('164NZB23','2'),
('164NZB23','3'),
('164NZB23','3'),
('164NZB23','3');

CREATE TABLE pz.seat_airbus_a320 (
 "id" BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
 number_of_plane VARCHAR(10),
 passenger_id BIGINT,
 CHECK (id <= 100),

 CONSTRAINT fk_seat_passenger FOREIGN KEY (passenger_id) REFERENCES pz.passenger(id)
);

INSERT INTO pz.seat_airbus_a320 (number_of_plane, passenger_id)
VALUES
('291AUI03','4'),
('291AUI03','4'),
('291AUI03','4'),
('291AUI03','4'),
('291AUI03','4'),
('291AUI03','4'),
('291AUI03','2');

CREATE TABLE pz.seat_boeing_777 (
 "id" BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
 number_of_plane VARCHAR(10),
 passenger_id BIGINT,
 CHECK (id <= 100),

 CONSTRAINT fk_seat_passenger FOREIGN KEY (passenger_id) REFERENCES pz.passenger(id)
);

INSERT INTO pz.seat_boeing_777 (number_of_plane, passenger_id)
VALUES
('934TMC52','4'),
('934TMC52','4'),
('934TMC52','5'),
('934TMC52','5'),
('934TMC52','5');

SELECT "Number","Brand", "Seats", "Departure_city", "Arrival_city" , "Departure_date_time" FROM pz.plane
ORDER BY "Departure_date_time" ASC;


SELECT "number" ,COUNT(*) AS NumberOfPlanes FROM pz.plane
WHERE "seats" > 50
GROUP BY "number";

CREATE VIEW pz.passenger_plane AS
(SELECT name_surname,
pl.number,
pl.brand,
(pl.departure_city, pl.arrival_city)::text AS "Рейс",
pl.departure_date_time
FROM pz.passenger p
LEFT JOIN pz.plane pl ON p.number_of_plane = pl.number)
ORDER BY pl.brand;


SELECT * FROM pz.passenger_plane;


CREATE VIEW pz.occupied_places_737 AS
SELECT pl.brand, pl.number, s.passenger_id, p.name_surname
FROM pz.plane pl
LEFT JOIN pz.seat_boeing_737 s ON pl.number = s.number_of_plane
LEFT JOIN pz.passenger p ON p.id = s.passenger_id
WHERE s.passenger_id IS NOT NULL;

SELECT * FROM pz.occupied_places_737

CREATE VIEW pz.occupied_places_777 AS
SELECT pl.brand, pl.number, s.passenger_id, p.name_surname
FROM pz.plane pl
LEFT JOIN pz.seat_boeing_777 s ON pl.number = s.number_of_plane
LEFT JOIN pz.passenger p ON p.id = s.passenger_id
WHERE s.passenger_id IS NOT NULL;

SELECT * FROM pz.occupied_places_777

CREATE VIEW pz.occupied_airbus_a320 AS
SELECT pl.brand, pl.number, s.passenger_id, p.name_surname
FROM pz.plane pl
LEFT JOIN pz.seat_airbus_a320 s ON pl.number = s.number_of_plane
LEFT JOIN pz.passenger p ON p.id = s.passenger_id
WHERE s.passenger_id IS NOT NULL;

SELECT * FROM pz.occupied_airbus_a320

UPDATE pz.passenger
SET number_of_plane = null
WHERE id = 5

SELECT * FROM pz.seat_boeing_777

SELECT
s.passenger_id,
COALESCE(p.number_of_plane, 'Вернул билет') AS number,
p.name_surname
FROM pz.seat_boeing_777 s
LEFT JOIN pz.passenger p ON p.id = s.passenger_id


SELECT
departure_date_time,
TO_CHAR(departure_date_time, 'DD Month YYYY') AS formatted_date
FROM pz.plane;

SELECT number,brand, departure_city, arrival_city,
CASE
	WHEN number = '291AUI03' THEN departure_date_time + INTERVAL '12 hours'
	ELSE departure_date_time
END
FROM pz.plane
