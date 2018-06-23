CREATE TABLE positions (
id                uuid              NOT NULL UNIQUE,
name              VARCHAR(255)      NOT NULL UNIQUE,

PRIMARY KEY (id)
);

CREATE TABLE departments (
id                uuid              NOT NULL UNIQUE,
name              VARCHAR(255)      NOT NULL UNIQUE,

PRIMARY KEY (id)
);

CREATE TABLE events (
id                uuid              NOT NULL UNIQUE,
name              VARCHAR(255)      NOT NULL UNIQUE,

PRIMARY KEY (id)
);

CREATE TABLE employers (
id                uuid              NOT NULL UNIQUE,
username          VARCHAR(60)       NOT NULL UNIQUE,
password          VARCHAR(255)      NOT NULL UNIQUE,
first_name        VARCHAR(255)      NOT NULL UNIQUE,
last_name         VARCHAR(255)      NOT NULL UNIQUE,
hourlyRate        DECIMAL(8, 2)     NOT NULL UNIQUE,
position_id       uuid              NOT NULL UNIQUE,
department_id     uuid              NOT NULL UNIQUE,

PRIMARY KEY (id),
FOREIGN KEY (position_id)   REFERENCES positions(id),
FOREIGN KEY (department_id) REFERENCES departments(id)
);