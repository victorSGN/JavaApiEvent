CREATE EXTENSION IF NOT EXISTS "pgcrypto";
CREATE TABLE event(
    id UUID  DEFAULT gen_random_uuid() PRIMARY KEY,
    title varchar(100) NOT NULL,
    description VARCHAR(250) NOT NULL,
    image_url VARCHAR(100) NOT NULL,
    event_url VARCHAR(100) NOT NULL,
    date TIMESTAMP NOT NULL,
    remote BOOLEAN NOT NULL
);