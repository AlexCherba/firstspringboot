/*CREATE EXTENSION IF NOT EXISTS "uuid-ossp";*/

CREATE TABLE request_table (
  request_id UUID NOT NULL,
  request_number INT,
  real_number INT,
  CONSTRAINT person_pkey PRIMARY KEY (request_id)
);
