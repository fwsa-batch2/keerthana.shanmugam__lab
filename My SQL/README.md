# MY SQL -  PROJECT

## BTS FanPage

### Creating Database BTS_FanPage
``` 
CREATE DATABASE BTS_FanPage; 
```

``` 
USE BTS_FanPage; 
```
### Creating Table users
``` 
CREATE TABLE users(id int primary key auto_increment, email_id varchar(50) unique not null, roles varchar(10) not null); 
```
``` 
DESC users; 
```

| Field    | Type        | Null | Key | Default | Extra          |
|----------|-------------|------|-----|---------|----------------|
| id       | int         | NO   | PRI | NULL    | auto_increment |
| email_id | varchar(50) | NO   | UNI | NULL    |                |
| roles    | varchar(10) | NO   |     | NULL    |                |

``` 
INSERT INTO users VALUES(1, 'max05@bts.com', 'admin'),(2, 'selen14@bts.com', 'admin'), (3, 'sid03@bts.com', 'admin'); 
```
``` 
INSERT INTO users (email_id, roles) VALUES('vannila@ggmail.com', 'fan'),('somi@nike.com', 'fan'), ('yuri03@kore.com', 'fan'); 
```
``` 
INSERT INTO users (email_id, roles) VALUES('bam@bts.com', 'admin'),('leo@ggmail.com', 'fan'), ('jess33@kore.com', 'fan'); 
```

``` 
SELECT * FROM users; 
```

| id | email_id           | roles |
|----|--------------------|-------|
|  1 | max05@bts.com      | admin |
|  2 | selen14@bts.com    | admin |
|  3 | sid03@bts.com      | admin |
|  4 | vannila@ggmail.com | fan   |
|  5 | somi@nike.com      | fan   |
|  6 | yuri03@kore.com    | fan   |
|  7 | bam@bts.com        | admin |
|  8 | leo@ggmail.com     | fan   |
|  9 | jess33@kore.com    | fan   |

### Creating Table fans_details
``` 
CREATE TABLE fans_details(user_id int not null, email_id varchar(50) not null, password varchar(15) not null, DOB date not null, gender varchar(15) not null check (gender in ('Male','Female','Transgender')), country varchar(20) not null check (country in ('USA', 'UK', 'Brasil', 'India', 'South Korea', 'Japan', 'China', 'Philippines', 'Nepal', 'Russia', 'Malaysia', 'Sri Lanka', 'Canada')), foreign key (user_id) references users(id), foreign key (email_id) references users(email_id)); 
```

``` 
DESC fans_details; 
```

| Field    | Type        | Null | Key | Default | Extra |
|----------|-------------|------|-----|---------|-------|
| user_id  | int         | NO   | MUL | NULL    |       |
| email_id | varchar(50) | NO   | MUL | NULL    |       |
| password | varchar(15) | NO   |     | NULL    |       |
| DOB      | date        | NO   |     | NULL    |       |
| gender   | varchar(15) | NO   |     | NULL    |       |
| country  | varchar(20) | NO   |     | NULL    |       |

``` 
ALTER TABLE fans_details ADD CONSTRAINT unique (user_id); 
```
```
DESC fans_details;
```

| Field    | Type        | Null | Key | Default | Extra |
|----------|-------------|------|-----|---------|-------|
| user_id  | int         | NO   | PRI | NULL    |       |
| email_id | varchar(50) | NO   | MUL | NULL    |       |
| password | varchar(15) | NO   |     | NULL    |       |
| DOB      | date        | NO   |     | NULL    |       |
| gender   | varchar(15) | NO   |     | NULL    |       |
| country  | varchar(20) | NO   |     | NULL    |       |

```
INSERT INTO fans_details VALUES(4, 'vannila@ggmail.com', 'vannila01', '1997-09-01', 'Female', 'India');
```
``` 
INSERT INTO fans_details VALUES(5, 'somi@nike.com', 'somisolo01', '1995-10-13', 'Female', 'USA'),(6, 'yuri03@kore.com', 'yurising03', '1998-12-04', 'Female', 'South Korea'); 
```
``` 
INSERT INTO fans_details VALUES(8, 'leo@ggmail.com', 'leo@uk12', '2001-02-18', 'Male', 'UK'),(9, 'jess33@kore.com', 'jess@033', '2000-03-08', 'Female', 'Brasil'); 
```

``` 
SELECT * FROM fans_details; 
```

| user_id | email_id           | password   | DOB        | gender | country     |
|---------|--------------------|------------|------------|--------|-------------|
|       4 | vannila@ggmail.com | vannila01  | 1997-09-01 | Female | India       |
|       5 | somi@nike.com      | somisolo01 | 1995-10-13 | Female | USA         |
|       6 | yuri03@kore.com    | yurising03 | 1998-12-04 | Female | South Korea |
|       8 | leo@ggmail.com     | leo@uk12   | 2001-02-18 | Male   | UK          |
|       9 | jess33@kore.com    | jess@033   | 2000-03-08 | Female | Brasil      |

### Creating Table admin
```
CREATE TABLE admin(admin_id int unique not null, email_id varchar(50) not null, password varchar(15) not null check (password in ('admin@2022')), foreig key (admin_id) references users(id), foreign key (email_id) references users(email_id));
```
``` 
DESC admin; 
```

| Field    | Type        | Null | Key | Default | Extra |
|----------|-------------|------|-----|---------|-------|
| admin_id | int         | NO   | PRI | NULL    |       |
| email_id | varchar(50) | NO   | MUL | NULL    |       |
| password | varchar(15) | NO   |     | NULL    |       |

```
INSERT INTO admin VALUES (1, 'max05@bts.com', 'admin@2022'),(2, 'selen14@bts.com', 'admin@2022');
```
```
INSERT INTO admin VALUES (3, 'sid03@bts.com', 'admin@2022'),(7, 'bam@bts.com', 'admin@2022');
```
```
SELECT * FROM admin;
```

| admin_id | email_id        | password   |
|----------|-----------------|------------|
|        1 | max05@bts.com   | admin@2022 |
|        2 | selen14@bts.com | admin@2022 |
|        3 | sid03@bts.com   | admin@2022 |
|        7 | bam@bts.com     | admin@2022 |

### Creating Table venue
``` 
CREATE TABLE venue(admin_id int not null, venue_id int primary key, name varchar(30) not null, city varchar(30) not null, country varchar(30) not null, foreign key (admin_id) references admin(admin_id)); 
```

``` 
DESC venue; 
```

| Field    | Type        | Null | Key | Default | Extra |
|----------|-------------|------|-----|---------|-------|
| admin_id | int         | NO   | MUL | NULL    |       |
| venue_id | int         | NO   | PRI | NULL    |       |
| name     | varchar(30) | NO   |     | NULL    |       |
| city     | varchar(30) | NO   |     | NULL    |       |
| country  | varchar(30) | NO   |     | NULL    |       |

``` 
INSERT INTO venue VALUES(1, 1, 'Allegiant Stadium', 'Las Vagas', 'USA'),(1, 2, 'Olympic Stadium', 'Seoul', 'South Korea'); 
```
``` 
INSERT INTO venue VALUES(1, 3, 'The Forem Stadium', 'California', 'USA'),(1, 4, 'Sofi Stadium', 'California', 'USA'); 
```

``` 
SELECT * FROM venue; 
```

| admin_id | venue_id | name              | city       | country     |
|----------|----------|-------------------|------------|-------------|
|        1 |        1 | Allegiant Stadium | Las Vagas  | USA         |
|        1 |        2 | Olympic Stadium   | Seoul      | South Korea |
|        1 |        3 | The Forem Stadium | California | USA         |
|        1 |        4 | Sofi Stadium      | California | USA         |

### Creating Table concert_list
``` 
CREATE TABLE concert_list(admin_id int not null, venue_id int not null, date date not null, time time not null, artists varchar(20) not null, foreign key (admin_id) references admin(admin_id), foreign key (venue_id) references venue(venue_id)); 
```

``` 
DESC concert_list; 
```

| Field    | Type        | Null | Key | Default | Extra |
|----------|-------------|------|-----|---------|-------|
| admin_id | int         | NO   | MUL | NULL    |       |
| venue_id | int         | NO   | MUL | NULL    |       |
| date     | date        | NO   |     | NULL    |       |
| time     | time        | NO   |     | NULL    |       |
| artists  | varchar(20) | NO   |     | NULL    |       |

``` 
INSERT INTO concert_list VALUES(2, 1, '2021-12-04', '17:30:00', 'BTS'); 
```
``` 
INSERT INTO concert_list VALUES(2, 2, '2022-01-11', '16:00:00', 'BTS'),(2, 2, '2022-01-12', '16:00:00', 'BTS'); 
```
``` 
INSERT INTO concert_list VALUES(3, 3, '2022-04-15', '18:10:00', 'BTS'),(3, 3, '2022-04-16', '18:00:00', 'BTS'); 
```

``` 
SELECT * FROM concert_list; 
```

| admin_id | venue_id | date       | time     | artists |
|----------|----------|------------|----------|---------|
|        2 |        1 | 2021-12-04 | 17:30:00 | BTS     |
|        2 |        2 | 2022-01-11 | 16:00:00 | BTS     |
|        2 |        2 | 2022-01-12 | 16:00:00 | BTS     |
|        3 |        3 | 2022-04-15 | 18:10:00 | BTS     |
|        3 |        3 | 2022-04-16 | 18:00:00 | BTS     |

### Creating Table ticket_booking
``` 
CREATE TABLE ticket_booking(user_id int not null, ticket_no int primary key, no_of_tickets_booked int not null check (no_of_tickets_booked <= 10), date date not null, time time not null, venue_id int not null, foreign key (user_id) references fans_details(user_id), foreign key(venue_id) references venue(venue_id)); 
```

``` 
DESC ticket_booking; 
```

| Field                | Type | Null | Key | Default | Extra |
|----------------------|------|------|-----|---------|-------|
| user_id              | int  | NO   | MUL | NULL    |       |
| ticket_no            | int  | NO   | PRI | NULL    |       |
| no_of_tickets_booked | int  | NO   |     | NULL    |       |
| date                 | date | NO   |     | NULL    |       |
| time                 | time | NO   |     | NULL    |       |
| venue_id             | int  | NO   | MUL | NULL    |       |

``` 
INSERT INTO ticket_booking VALUES(4, 43, 4, '2022-04-15', '18:10:00', 3),(5, 73, 2, '2022-01-12', '16:00:00', 2); 
```

``` 
SELECT * FROM ticket_booking; 
```

| user_id | ticket_no | no_of_tickets_booked | date       | time     | venue_id |
|---------|-----------|----------------------|------------|----------|----------|
|       4 |        43 |                    4 | 2022-04-15 | 18:10:00 |        3 |
|       5 |        73 |                    2 | 2022-01-12 | 16:00:00 |        2 |

### Creating Table product_list
``` 
CREATE TABLE product_list(admin_id int not null, product_id int primary key, name varchar(30) not null, price int not null check(price BETWEEN 1 AND 100000), image_url varchar(512) unique not null, foreign key (admin_id) references admin(admin_id)); 
```
``` 
DESC product_list; 
```

| Field      | Type         | Null | Key | Default | Extra |
|------------|--------------|------|-----|---------|-------|
| admin_id   | int          | NO   | MUL | NULL    |       |
| product_id | int          | NO   | PRI | NULL    |       |
| name       | varchar(30)  | NO   |     | NULL    |       |
| price      | int          | NO   |     | NULL    |       |
| image_url  | varchar(512) | NO   | UNI | NULL    |       |

``` 
ALTER TABLE product_list DROP CONSTRAINT image_url; 
```
``` 
ALTER TABLE product_list change image_url image_url blob; 
```

``` 
DESC product_list; 
```

| Field      | Type        | Null | Key | Default | Extra |
|------------|-------------|------|-----|---------|-------|
| admin_id   | int         | NO   | MUL | NULL    |       |
| product_id | int         | NO   | PRI | NULL    |       |
| name       | varchar(30) | NO   |     | NULL    |       |
| price      | int         | NO   |     | NULL    |       |
| image_url  | blob        | YES  |     | NULL    |       |

``` 
INSERT INTO product_list VALUES(7, 1, 'BTS Backpack', '890', 'https://www.google.com/imgres?imgurl=https%3A%2F%2Fi.pinimg.com%2F550x%2Fa8%2F38%2F35%2Fa838353019abe47d5a8e0727e97dc085.jpg&imgrefurl=https%3A%2F%2Fwww.pinterest.com%2FNichan1465%2Fbts-bags%2F&tbnid=y9JvuVYkkMxjgM&vet=12ahUKEwjtu4aqz9n2AhW4z6ACHe9MA3wQMygKegUIARC9Ag..i&docid=RFeSx2QC0UNi0M&w=550&h=550&q=bts%20backpack&ved=2ahUKEwjtu4aqz9n2AhW4z6ACHe9MA3wQMygKegUIARC9Ag'); 
```
``` 
INSERT INTO product_list VALUES(7, 2, 'water bottle', '312', 'https://www.google.com/imgres?imgurl=https%3A%2F%2Fimages.meesho.com%2Fimages%2Fproducts%2F54076092%2Favitm_512.jpg&imgrefurl=https%3A%2F%2Fmeesho.com%2Ftrendoprint-bts-printed-sports-sipperwater-bottle-600ml-for-gym-yoga-kids-boys-girls-brother-sister-babies-baby-workout-adults--b3-13%2Fp%2Fw71do&tbnid=4V_HGrR0QYbStM&vet=12ahUKEwiDr6TG2dn2AhWUKrcAHXgHB74QMygVegUIARCaAg..i&docid=0Qctd2ivo6Y2eM&w=512&h=703&q=bts%20waterbottol&ved=2ahUKEwiDr6TG2dn2AhWUKrcAHXgHB74QMygVegUIARCaAg'),(7, 3, 'bt21 soft toys', '790', 'https://www.google.com/url?sa=i&url=https%3A%2F%2Fonshopdeals.com%2F20cm-kpop-bangtan-boys-bts-bt21-plush-toys-doll-tata-van-cooky-chimmy-shooky-koya-mang-plush-stuffed-toys-for-children-kids-gift%2F&psig=AOvVaw1H9mW9h_iR933G2d_buHB5&ust=1648038000275000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCMi8rY_a2fYCFQAAAAAdAAAAABAG'); 
```

``` 
SELECT * FROM product_list;
```

| admin_id | product_id | name           | price | image_url                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          |
|----------|------------|----------------|-------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
|        7 |          1 | BTS Backpack   |   890 | 0x68747470733A2F2F7777772E676F6F676C652E636F6D2F696D677265733F696D6775726C3D6874747073253341253246253246692E70696E696D672E636F6D2532463535307825324661382532463338253246333525324661383338333533303139616265343764356138653037323765393764633038352E6A706726696D6772656675726C3D68747470732533412532462532467777772E70696E7465726573742E636F6D2532464E696368616E313436352532466274732D626167732532462674626E69643D79394A767556596B6B4D786A674D267665743D31326168554B45776A74753461717A396E32416857347A3641434865394D413377514D79674B656755494152433941672E2E6926646F6369643D524665537832514330554E69304D26773D35353026683D35353026713D6274732532306261636B7061636B267665643D326168554B45776A74753461717A396E32416857347A3641434865394D413377514D79674B65675549415243394167                                                                                                                                                                                                                         |
|        7 |          2 | water bottle   |   312 | 0x68747470733A2F2F7777772E676F6F676C652E636F6D2F696D677265733F696D6775726C3D6874747073253341253246253246696D616765732E6D656573686F2E636F6D253246696D6167657325324670726F64756374732532463534303736303932253246617669746D5F3531322E6A706726696D6772656675726C3D68747470732533412532462532466D656573686F2E636F6D2532467472656E646F7072696E742D6274732D7072696E7465642D73706F7274732D73697070657277617465722D626F74746C652D3630306D6C2D666F722D67796D2D796F67612D6B6964732D626F79732D6769726C732D62726F746865722D7369737465722D6261626965732D626162792D776F726B6F75742D6164756C74732D2D62332D313325324670253246773731646F2674626E69643D34565F484772523051596253744D267665743D31326168554B457769447236544732646E32416857554B72634148586748423734514D796756656755494152436141672E2E6926646F6369643D30516374643269766F365932654D26773D35313226683D37303326713D6274732532307761746572626F74746F6C267665643D326168554B457769447236544732646E32416857554B72634148586748423734514D79675665675549415243614167 |
|        7 |          3 | bt21 soft toys |   790 | 0x68747470733A2F2F7777772E676F6F676C652E636F6D2F75726C3F73613D692675726C3D68747470732533412532462532466F6E73686F706465616C732E636F6D2532463230636D2D6B706F702D62616E6774616E2D626F79732D6274732D627432312D706C7573682D746F79732D646F6C6C2D746174612D76616E2D636F6F6B792D6368696D6D792D73686F6F6B792D6B6F79612D6D616E672D706C7573682D737475666665642D746F79732D666F722D6368696C6472656E2D6B6964732D6769667425324626707369673D414F765661773148396D5739685F69523933334732645F6275484235267573743D3136343830333830303032373530303026736F757263653D696D616765732663643D766665267665643D30434173516A52787146776F54434D693872595F613266594346514141414141644141414141424147                                                                                                                                                                                                                                                                                   ### Creating Table album                                            |
``` 
CREATE TABLE album_list(admin_id int not null, album_id int primary key, name varchar(20) unique not null, price int not null check(price BETWEEN 100 AND 10000), artist_name varchar(20) not null, image_url varchar(512) unique not null, foreign key (admin_id) references admin(admin_id)); 
```

``` 
DESC album_list; 
```

| Field       | Type         | Null | Key | Default | Extra |
|-------------|--------------|------|-----|---------|-------|
| admin_id    | int          | NO   | MUL | NULL    |       |
| album_id    | int          | NO   | PRI | NULL    |       |
| name        | varchar(20)  | NO   | UNI | NULL    |       |
| price       | int          | NO   |     | NULL    |       |
| artist_name | varchar(20)  | NO   |     | NULL    |       |
| image_url   | varchar(512) | NO   | UNI | NULL    |       |

``` 
ALTER TABLE album_list DROP CONSTRAINT image_url; 
```
``` 
ALTER TABLE album_list change image_url image_url blob; 
```

``` 
DESC album_list; 
```

| Field       | Type        | Null | Key | Default | Extra |
|-------------|-------------|------|-----|---------|-------|
| admin_id    | int         | NO   | MUL | NULL    |       |
| album_id    | int         | NO   | PRI | NULL    |       |
| name        | varchar(20) | NO   | UNI | NULL    |       |
| price       | int         | NO   |     | NULL    |       |
| artist_name | varchar(20) | NO   |     | NULL    |       |
| image_url   | blob        | YES  |     | NULL    |       |

``` 
INSERT INTO album_list VALUES(3, 1, 'Wings', 3279, 'BTS', 'https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.insider.com%2Fbts-albums-ranked-best-worst&psig=AOvVaw16DYNm1H9wX5c5xhvxM-J2&ust=1648044513207000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCNCb6bjy2fYCFQAAAAAdAAAAABAD'),(3, 2, 'BE', 2980, 'BTS', 'https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.amazon.in%2FBTS-Deluxe-Limited-Weverse-Included%2Fdp%2FB08K8HBPKC&psig=AOvVaw16DYNm1H9wX5c5xhvxM-J2&ust=1648044513207000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCNCb6bjy2fYCFQAAAAAdAAAAABAP'); 
```

``` 
SELECT * FROM album_list; 
```

| admin_id | album_id | name  | price | artist_name | image_url                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |
|----------|----------|-------|-------|-------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
|        3 |        1 | Wings |  3279 | BTS         | 0x68747470733A2F2F7777772E676F6F676C652E636F6D2F75726C3F73613D692675726C3D68747470732533412532462532467777772E696E73696465722E636F6D2532466274732D616C62756D732D72616E6B65642D626573742D776F72737426707369673D414F76566177313644594E6D3148397758356335786876784D2D4A32267573743D3136343830343435313332303730303026736F757263653D696D616765732663643D766665267665643D30434173516A52787146776F54434E436236626A793266594346514141414141644141414141424144                                               |
|        3 |        2 | BE    |  2980 | BTS         | 0x68747470733A2F2F7777772E676F6F676C652E636F6D2F75726C3F73613D692675726C3D68747470732533412532462532467777772E616D617A6F6E2E696E2532464254532D44656C7578652D4C696D697465642D576576657273652D496E636C7564656425324664702532464230384B384842504B4326707369673D414F76566177313644594E6D3148397758356335786876784D2D4A32267573743D3136343830343435313332303730303026736F757263653D696D616765732663643D766665267665643D30434173516A52787146776F54434E436236626A793266594346514141414141644141414141424150 |

### Creating Table cart
``` 
CREATE TABLE cart (user_id int not null, product_id int not null, album_id int, foreign key (user_id) references fans_details(user_id), foreign key (product_id) references product_list(product_id), foreign key (album_id) references album_list(album_id)); 
```

``` 
DESC cart; 
```

| Field      | Type | Null | Key | Default | Extra |
|------------|------|------|-----|---------|-------|
| user_id    | int  | NO   | MUL | NULL    |       |
| product_id | int  | NO   | MUL | NULL    |       |
| album_id   | int  | YES  | MUL | NULL    |       |

``` 
INSERT INTO cart VALUES(4, 1, 1),(4, 2,NULL ),(5, 1, 2),(6, 3,NULL ); 
```
``` 
SELECT * FROM cart; 
```

| user_id | product_id | album_id |
|---------|------------|----------|
|       4 |          1 |        1 |
|       4 |          2 |     NULL |
|       5 |          1 |        2 |
|       6 |          3 |     NULL |

### Creating Table premium_list 
``` 
CREATE TABLE premium_list(admin_id int not null, show_id int primary key, name varchar(20) not null, amount int not null check (amount BETWEEN 50 AND 2000), foreign key (admin_id) references admin(admin_id)); 
```

``` 
DESC premium_list; 
```

| Field    | Type        | Null | Key | Default | Extra |
|----------|-------------|------|-----|---------|-------|
| admin_id | int         | NO   | MUL | NULL    |       |
| show_id  | int         | NO   | PRI | NULL    |       |
| name     | varchar(20) | NO   |     | NULL    |       |
| amount   | int         | NO   |     | NULL    |       |

``` 
INSERT INTO premium_list VALUES(2, 1, 'BTS Hustle Life', 250),(2, 2, 'Rookie King', 450),(2, 3, 'BTS Bon Voyage', 1550); 
```

``` 
SELECT * FROM premium_list; 
```

| admin_id | show_id | name            | amount |
|----------|---------|-----------------|--------|
|        2 |       1 | BTS Hustle Life |    250 |
|        2 |       2 | Rookie King     |    450 |
|        2 |       3 | BTS Bon Voyage  |   1550 |

### Creating Table paid_shows
``` 
CREATE TABLE paid_shows(user_id int not null, show_id int not null, date timestamp not null default current_timestamp, no_of_shows int not null, foreign key (user_id) references fans_details(user_id), foreign key (show_id) references premium_list(show_id)); 
```

``` 
DESC paid_shows; 
```

| Field       | Type      | Null | Key | Default           | Extra             |
|-------------|-----------|------|-----|-------------------|-------------------|
| user_id     | int       | NO   | MUL | NULL              |                   |
| show_id     | int       | NO   | MUL | NULL              |                   |
| date        | timestamp | NO   |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED |
| no_of_shows | int       | NO   |     | NULL              |                   |

``` 
ALTER TABLE paid_shows DROP COLUMN no_of_shows; 
```

``` 
DESC paid_shows; 
```

| Field   | Type      | Null | Key | Default           | Extra             |
|---------|-----------|------|-----|-------------------|-------------------|
| user_id | int       | NO   | MUL | NULL              |                   |
| show_id | int       | NO   | MUL | NULL              |                   |
| date    | timestamp | NO   |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED |

``` 
INSERT INTO paid_shows VALUES(8, 3, now()), (9, 1, now()); 
```

``` 
SELECT * FROM paid_shows; 
```

| user_id | show_id | date                |
|---------|---------|---------------------|
|       8 |       3 | 2022-03-22 20:59:06 |
|       9 |       1 | 2022-03-22 20:59:06 |

### Creating Table payment

``` 
CREATE TABLE payment(user_id int not null, order_id int primary key, product_id int, album_id int, amount int not null, date timestamp not null default current_timestamp, mode_of_payment varchar(10) not null check (mode_of_payment in ('cash','credit')), foreign key (user_id) references fans_details(user_id), foreign key (product_id) references product_list(product_id), foreign key (album_id) references album_list(album_id)); 
```

```
DESC payment; 
```

| Field           | Type        | Null | Key | Default           | Extra             |
|-----------------|-------------|------|-----|-------------------|-------------------|
| user_id         | int         | NO   | MUL | NULL              |                   |
| order_id        | int         | NO   | PRI | NULL              |                   |
| product_id      | int         | YES  | MUL | NULL              |                   |
| album_id        | int         | YES  | MUL | NULL              |                   |
| amount          | int         | NO   |     | NULL              |                   |
| date            | timestamp   | NO   |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED |
| mode_of_payment | varchar(10) | NO   |     | NULL              |                   |

```
INSERT INTO payment VALUES(4, 1, 1, 1, 4159, now(), 'credit'),(4, 2, 2, NULL, 312, now(), 'cash'),(5, 3, 1, 2, 3870, now(), 'cash'),(6, 4, 3, NULL, 790, now(), 'credit'); 
```

``` 
SELECT * FROM payment; 
```

| user_id | order_id | product_id | album_id | amount | date                | mode_of_payment |
|---------|----------|------------|----------|--------|---------------------|-----------------|
|       4 |        1 |          1 |        1 |   4159 | 2022-03-22 21:48:20 | credit          |
|       4 |        2 |          2 |     NULL |    312 | 2022-03-22 21:48:20 | cash            |
|       5 |        3 |          1 |        2 |   3870 | 2022-03-22 21:48:20 | cash            |
|       6 |        4 |          3 |     NULL |    790 | 2022-03-22 21:48:20 | credit          |


### ER Model:
![Drawing (1)](https://user-images.githubusercontent.com/93571067/159711569-669903ce-43d7-4e21-8124-208f8946adfa.png)




### EER Model:

![eer](https://user-images.githubusercontent.com/93571067/159668233-81b6f267-5005-4638-9cf7-29de768d5131.png)



