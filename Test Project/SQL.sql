create table book (
    id int primary key auto_increment,
    title varchar(255),
    author varchar(255),
    isbn int,
    price Decimal(10,2)
);