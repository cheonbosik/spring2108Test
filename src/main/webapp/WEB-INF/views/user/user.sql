show tables;

create table user (
  idx  int  not null auto_increment primary key,
  name varchar(20) not null,
  pwd  varchar(100) not null,
  age  int default 20
);

desc user;

alter table user add column pwd varchar(100) not null;

select * from user;

select * from user order by idx desc;
