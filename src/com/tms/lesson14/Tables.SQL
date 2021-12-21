CREATE TABLE IF NOT EXISTS humans(
                                     id SERIAL PRIMARY KEY,
                                     name CHARACTER VARYING(30),
    sex BOOLEAN not null,
    dateOfBirth DATE
    );

DROP TABLE IF EXISTS humans;


CREATE TABLE IF NOT EXISTS hobbyTypes(
                                         id SERIAL PRIMARY KEY,
                                         name CHARACTER VARYING(30)
    );

DROP TABLE IF EXISTS hobbyTypes;


CREATE TABLE IF NOT EXISTS hobby(
                                    id SERIAL PRIMARY KEY,
                                    name CHARACTER VARYING(30),
    hobbyType_id SERIAL,
    FOREIGN KEY (hobbyType_id) REFERENCES hobbyTypes (id)
    );

DROP TABLE IF EXISTS hobby;


CREATE TABLE IF NOT EXISTS hobbiesOfPeople(
                                              id SERIAL PRIMARY KEY,
                                              human_id SERIAL,
                                              hobby_id SERIAL,
                                              FOREIGN KEY (human_id) REFERENCES humans (id),
    FOREIGN KEY (hobby_id) REFERENCES hobby (id)
    );

DROP TABLE IF EXISTS hobbiesOfPeople;
