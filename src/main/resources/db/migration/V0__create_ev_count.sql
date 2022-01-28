CREATE TABLE IF NOT EXISTS ev_count (
    id SERIAL PRIMARY KEY NOT NULL,
    country VARCHAR(50) NOT NULL,
    ev_car int NOT NULL,
    date_investigate date
);
