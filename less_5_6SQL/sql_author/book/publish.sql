CREATE TABLE author (
	"id" BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
	"name" VARCHAR (50),
	"book_id" BIGINT,
);



INSERT INTO author("name", book_id)
VALUES ('Егор Бугаенко', 1),
	    ('Егор Бугаенко', 2),
		('Роберт Мартин', 3);


CREATE TABLE book (
	"id" BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
	"name" VARCHAR (100),
	"year" BIGINT,
	"author_id" BIGINT,

	CONSTRAINT fk_book_author FOREIGN KEY (author_id) REFERENCES author(id)
);

INSERT INTO book("name","year",author_id)
VALUES ('Наш код', 2019,1),
		('Элегантные обьекты', 2017,1),
		('Чистый код', 2008,2);


CREATE TABLE publish (
	"id" BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
	"country" VARCHAR (100),
	"name" VARCHAR (100)

);


INSERT INTO publish ("country","name")
VALUES ('Россия', 'ПИТЕР'),
		('Россия', 'ПИТЕР'),
		('Россия', 'ПИТЕР');


CREATE TABLE publish_book_id (
	"book_id" BIGINT,
	"publish_id" BIGINT,

	CONSTRAINT fk_book_publish FOREIGN KEY (book_id) REFERENCES book(id),
	CONSTRAINT fk_publish_book FOREIGN KEY (publish_id) REFERENCES publish(id)
);

INSERT INTO publish_book_id (book_id, publish_id)
VALUES (1,1),
		(2,1),
		(3,1);