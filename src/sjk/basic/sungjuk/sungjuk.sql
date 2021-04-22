
create table sungjuk (
    sjno int 			auto_increment,
    name varchar(10)    not null,
    kor  int 			default 0,
    eng  int 			default 0,
    mat  int 			default 0,
    tot  int,
    mean decimal(5,1),
    grd  char(2),
    regdate datetime default current_timestamp,
    primary key (sjno)
);

insert into sungjuk (name, kor, eng, mat, tot, mean, grd)
values ('지현', 98,97,87,234,93,'수');

SELECT sjno, name, kor, eng, mat, mid(regdate,1,10) regdate
from sungjuk
order by sjno;

SELECT * from sungjuk where sjno = 1;

UPDATE sungjuk
set name = '파이썬', kor = 99, eng = 99, mat = 99
where sjno = 1;

DELETE from sungjuk where sjno = 1;