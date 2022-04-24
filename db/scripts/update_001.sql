DROP TABLE IF EXISTS post;
CREATE TABLE if not exists post (
                      id SERIAL PRIMARY KEY,
                      name TEXT,
                      city_id int
);