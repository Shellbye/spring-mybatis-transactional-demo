create table my_user
(
  id        bigint                  not null comment ' 主键 '
    primary key,
  user_name varchar(255) default '' not null comment ' 姓名 '
);