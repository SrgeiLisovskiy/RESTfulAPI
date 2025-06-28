CREATE TABLE IF NOT EXISTS orders
(
    id         INT GENERATED ALWAYS AS IDENTITY NOT NULL,
    user_id    INT ,
    amount     DOUBLE PRECISION,
    currency   VARCHAR(20),
    list_orders VARCHAR,
        FOREIGN KEY (user_id) REFERENCES users(id)
);

INSERT INTO orders(user_id, amount, currency, list_orders) VALUES(2, 100.20, 'RUB', 'Молоко, хлеб');
INSERT INTO orders(user_id, amount, currency, list_orders) VALUES(1, 173.20, 'RUB', 'Вода, сахар');