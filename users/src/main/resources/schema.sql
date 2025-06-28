CREATE TABLE  IF NOT EXISTS users
(
    id           INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY NOT NULL,
    full_name    VARCHAR(255),
    address      VARCHAR(225),
    phone_number VARCHAR(20),
    email        VARCHAR(225)
);

INSERT INTO users (full_name, address, phone_number, email) VALUES ('Иванов Иван Иванович', 'Москва', '79151112221', 'mail@mail.ru');
INSERT INTO users (full_name, address, phone_number, email) VALUES ('Петров Петр Петрович', 'Москва', '79142222222', 'email@mail.ru');