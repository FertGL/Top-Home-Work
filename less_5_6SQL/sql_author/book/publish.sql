
--АВТОР(MTM)
CREATE TABLE author (
	"id" BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
	"name" VARCHAR (50)
);


INSERT INTO author("name")
VALUES ('Егор Бугаенко'),
		('Роберт Мартин');



--КНИГИ(MTM)
CREATE TABLE book (
	"id" BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
	"name" VARCHAR (100),
	"year" BIGINT,
	"publish_id" BIGINT,

	CONSTRAINT fk_publish FOREIGN KEY (publish_id) REFERENCES publish(id)

);



INSERT INTO book("name","year",publish_id)
VALUES ('Наш код', 2019,1),
		('Элегантные обьекты', 2017,1),
		('Чистый код', 2008,2);

--ИЗДАТЕЛЬСТВА
CREATE TABLE publish (
	"id" BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
	"country" VARCHAR (100),
	"name" VARCHAR (100)

);


INSERT INTO publish ("country","name")
VALUES ('Россия', 'ПИТЕР'),
		('Не Россия', 'Не ПИТЕР');
		

--СВЯЗУЮЩАЯ ТАБЛИЦА АВТОРОВ И КНИГ(MTM)
CREATE TABLE book_author (
	book_id BIGINT,
	author_id BIGINT,

	CONSTRAINT fk_author FOREIGN KEY (author_id) REFERENCES author(id),
	CONSTRAINT fk_book FOREIGN KEY (book_id) REFERENCES book(id)
);

INSERT INTO book_author (book_id, author_id)
VALUES (1,1),
		(2,1),
		(3,2);
