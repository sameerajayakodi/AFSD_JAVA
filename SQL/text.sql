show databases;
create databases afsd_06;

use afsd_06;

create table vehicle(
id int,
brand varchar(30),
model varchar(30),
qty int,
price decimal(10,2),
primary key(id)
);

desc vehicle;

select * from vehicle; 

insert into vehicle value(1,"Toyota","Corolla",3,30000);

insert into vehicle value(2,"Toyota","Corolla",3,30000);

drop table vehicle;

insert into vehicle value(3,"BMW","Five Series",10,50000);

delete from vehicle where id=2;

select brand from vehicle;

select brand, model from vehicle;

update vehicle set brand ="Audi" , model="A5" where id=1;

create table spareparts(
id int,
name varchar(30),
PartNumber VARCHAR(50),
qty int,
price decimal(10,2),
primary key(id)
);

select * from spareparts; 

insert into spareparts value(1,"Engine Oil","1234",10,50);
insert into spareparts value(2,"Air Filter","1235",10,20);
insert into spareparts value(3,"Brake Pads","1236",10,30);

update spareparts set price=400 where id=1;
update spareparts set price=300 where id=2;
update spareparts set price=800 where id=3;

update spareparts set PartNumber="9922" where id=1;

select name,qty from spareparts;

insert into spareparts value(4,"Engine Oil","1000",10,50);

delete from spareparts where id=4;

drop table spareparts;

create table sparepart(
id int,
name varchar(30),
PartNumber VARCHAR(50),
qty int,
price decimal(10,2),
primary key(id)
);

insert into sparepart value(1,"Engine Oil","1234",10,50);
insert into sparepart value(2,"Air Filter","1235",10,20);
insert into sparepart value(3,"Brake Pads","1236",10,30);

select name,qty from sparepart;

insert into sparepart value(4,"Engine Oil","1000",10,50);
select * from sparepart; 

delete from sparepart where id=4;

update sparepart set PartNumber="9922" where id=1;

select * from sparepart;

alter table sparepart
add column weight DECIMAL(10,2);

update sparepart set weight=2.5 where id=1;
update sparepart set weight=3 where id=2;
update sparepart set weight=2.9 where id=3;

select * from sparepart limit 2;

select * FROM sparepart
where name like 'air%';

select * from sparepart
where name like '%oi%';

select * from sparepart
where name like '%n';

select * from sparepart
order by name desc;

select * from sparepart
group by name desc;

SELECT name, SUM(qty) AS total_quantity
FROM sparepart
GROUP BY name;

select count(*) from sparepart;

SELECT SUM(PartNumber) FROM sparepart;
SELECT SUM(qty) FROM sparepart;
SELECT max(price) FROM sparepart;
SELECT avg(price) FROM sparepart;