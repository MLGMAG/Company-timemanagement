CREATE EXTENSION IF NOT EXISTS "uuid-ossp";
INSERT INTO authorities VALUES (uuid_generate_v4(),'ADMIN');
INSERT INTO authorities VALUES (uuid_generate_v4(),'MODERATOR');
INSERT INTO authorities VALUES (uuid_generate_v4(),'EMPLOYER');
