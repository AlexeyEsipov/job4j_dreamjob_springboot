DROP TABLE IF EXISTS post;
DROP TABLE IF EXISTS candidate;
CREATE TABLE if not exists post (
                      id SERIAL PRIMARY KEY,
                      name TEXT,
                      description TEXT,
                      visible bool,
                      city_id int
);
CREATE TABLE IF NOT EXISTS candidate (
    id SERIAL PRIMARY KEY,
    name TEXT,
    description TEXT,
    visible bool,
    city_id int,
    photo bytea
)
