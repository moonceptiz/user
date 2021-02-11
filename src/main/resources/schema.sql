CREATE TABLE groups
(
    id INTEGER PRIMARY KEY,
    name   VARCHAR(250) NOT NULL

);


CREAT TABLE student
(
    id  INTEGER AUTO_INCREMENT PRIMARY KEY,
    group_id      INTEGER NOT NULL,
    name          VARCHAR(250) NOT NULL,
    surname       VARCHAR(250) NOT NULL,
    FOREIGN KEY (group_id) references groups (id)
);




CREATE TABLE teacher
(
    id      INTEGER AUTO_INCREMENT PRIMARY KEY,
    name    VARCHAR(250) not null,
    surname VARCHAR(250) not null
);
