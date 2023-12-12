create table SmartPhone(
IdSmartPhone int primary key,
NameSmartPhone varchar(30) unique,
Capacity int not null,
Color varchar(20) not null,
Category varchar(30) not null,
Price int not null,
QuantityInventor int not null
)
drop table SmartPhone
INSERT INTO SmartPhone (IdSmartPhone, NameSmartPhone, Capacity, Color, Category, Price, QuantityInventor)
VALUES 
    (101, 'Samsung Galaxy S22 Ultra', 512, 'Phantom Black', 'Samsung', 1299, 50),
    (102, 'Samsung Galaxy A72', 128, 'Awesome White', 'Samsung', 499, 80),
    (103, 'Samsung Galaxy M52', 256, 'Sky Blue', 'Samsung', 349, 60),
    (104, 'Xiaomi 12', 256, 'Cosmic Black', 'Xiaomi', 899, 70),
    (105, 'Xiaomi Redmi Note 11T', 128, 'Chromium White', 'Xiaomi', 249, 90),
    (106, 'Xiaomi Poco F3', 256, 'Arctic Blue', 'Xiaomi', 329, 45),
    (107, 'Apple iPhone 13 Mini', 128, 'Midnight', 'Apple', 699, 30),
    (108, 'Apple iPhone SE', 64, 'Product Red', 'Apple', 399, 55),
    (109, 'Sony Xperia 5 IV', 256, 'Green', 'Sony', 1199, 40),
    (110, 'Sony Xperia 10 III', 128, 'Blue', 'Sony', 349, 70),
    (111, 'Oppo Reno7 Pro', 256, 'Starry Black', 'Oppo', 699, 25),
    (112, 'Oppo A95', 128, 'Crystal Silver', 'Oppo', 299, 60),
    (113, 'Vivo X70 Pro', 256, 'Racing Blue', 'Vivo', 899, 45),
    (114, 'Vivo V23 Pro', 128, 'Sunset Pink', 'Vivo', 499, 80),
    (115, 'Vivo Y33s', 128, 'Mirror Black', 'Vivo', 249, 65);



select * from SmartPhone