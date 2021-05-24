CREATE TABLE USERS (
  id int(11) NOT NULL,
  Name varchar(50) NOT NULL,
  Type varchar(50) NOT NULL,
  Is_active tinyint(1) NOT NULL DEFAULT '1',
  Registration_date timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
);