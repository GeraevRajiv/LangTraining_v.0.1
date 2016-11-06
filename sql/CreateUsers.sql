-- noinspection SqlDialectInspectionForFile
DROP TABLE users;

CREATE TABLE users (
  id SMALLSERIAL,
  username VARCHAR(36) PRIMARY KEY,
  password VARCHAR(36)
);

INSERT INTO users (username, password) VALUES ('superadmin','innopolis');
INSERT INTO users (username, password) VALUES ('inno','inno');
INSERT INTO users (username, password) VALUES ('sergey','sergey2016');
INSERT INTO users (username, password) VALUES ('alex','alex2016');

SELECT * FROM users
