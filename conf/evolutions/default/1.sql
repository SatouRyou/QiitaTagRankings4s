create table qiitatagu (
  date                      DATE not null,
  json                      varchar not null,
  constraint pk_todo primary key (date)
);
create sequence todo_seq start with 1000;