CREATE TABLE IF NOT EXISTS humans(
                                     Id SERIAL PRIMARY KEY,
                                     Name CHARACTER VARYING(30),
    Sex BOOLEAN not null,
    DateOfBirth DATE
    );

DROP TABLE IF EXISTS humans;


CREATE TABLE IF NOT EXISTS hobbyTypes(
                                         Id SERIAL PRIMARY KEY,
                                         Name CHARACTER VARYING(30)
    );

DROP TABLE IF EXISTS hobbyTypes;


CREATE TABLE IF NOT EXISTS hobby(
                                    Id SERIAL PRIMARY KEY,
                                    Name CHARACTER VARYING(30),
    HobbyType_id SERIAL,
    FOREIGN KEY (HobbyType_id) REFERENCES hobbyTypes (Id)
    );

DROP TABLE IF EXISTS hobby;


CREATE TABLE IF NOT EXISTS hobbiesOfPeople(
                                              Id SERIAL PRIMARY KEY,
                                              Human_id SERIAL,
                                              hobby_id SERIAL,
                                              FOREIGN KEY (Human_id) REFERENCES humans (Id),
    FOREIGN KEY (hobby_id) REFERENCES hobby (Id)
    );

DROP TABLE IF EXISTS hobbiesOfPeople;