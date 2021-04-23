
create table board (
                       bdno     int 		 auto_increment,
                       userid   varchar(10) not null,
                       title    varchar(20) not null,
                       regdate  datetime 	 default current_timestamp,
                       contents varchar(50) not null,
                       thumbup  int		 default 0,
                       views	 int		 default 0,
                       primary key (bdno)
);

insert into board (title, userid, contents)
values (?, ?, ?);

SELECT bdno, userid, title, mid(regdate, 1, 10) regdate, thumbup, views
from board
order by bdno;

SELECT * from board where bdno = ?;

update board set views = views + 1 " +
                    " where bdno = ?;

update board set thumbup = thumbup + 1 " +
                    " where bdno = ?;

UPDATE board
set title = ?, userid = ?, contents = ?
where sjno = ?;

DELETE from board where sjno = ?;



