CREATE TABLE IF NOT EXISTS users
(
    id       BIGINT AUTO_INCREMENT PRIMARY KEY,
    guid     VARCHAR(36),
    username VARCHAR(36),
    password VARCHAR(36)
);
insert into users (guid, username, password)
values ('111', '张三', '123456');