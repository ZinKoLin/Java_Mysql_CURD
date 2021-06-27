create table test(
id int auto_increment not null,
name varchar(50),
primary key (id)
);

insert into test (name) values ('zin ko ');

select * from test;