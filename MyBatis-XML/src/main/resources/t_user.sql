CREATE TABLE t_user
(
    id       int          NOT NULL AUTO_INCREMENT,
    username varchar(255) NOT NULL,
    password varchar(255) NOT NULL,
    age      int UNSIGNED NULL,
    gender   int UNSIGNED NULL,
    PRIMARY KEY (id),
    UNIQUE (username)
);