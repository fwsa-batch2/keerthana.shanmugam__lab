# MY SQL

#### To Open My Sql in Terminal(command)
  * sudo -u root mysql 
  (sudo mean super, u mean user, super user root mysql.)

##### SQL Bascis commands:
* create database database_name; => To create database
* show databases; => To list database
* use database_name; => To use the database
* create table table_name; => To create table
* desc table_name; (or) describe table_name; => To list the table 
* insert into table_name values(column_name); => To insert values inside the table
* alter table table_name add column_name; => To add new column in the table
* alter table table_name modify column_name datatype; => To modify datatypes in the table
* alter table table_name change old_column_name new_column_name datatype constraint; => To change column_name datatypes and constraints in table
* update table_name set column_name1 = "value" where column_name2 = "value"; => To update the values in the table
* select * from table_name; => To show (or) list all the values inside the table
* drop database_name (or) table_name; => To delete the whole table or database
* delete from table_name where column_name = "value"; => To delete a particular column from a table

mysql> show databases;

| Database           |
|:------------------:|
| information_schema |
| mysql              |
| performance_schema |
| projects           |
| schools            |
| sys                |

mysql> use schools;
Reading table information for completion of table and column names
You can turn off this feature to get a quicker startup with -A

Database changed

mysql> show tables;

| Tables_in_schools |
|:-----------------:|
| students          |

1 row in set (0.00 sec)

mysql> desc students;

| Field  | Type        | Null | Key | Default | Extra |
|:------:|:-----------:|:----:|:---:|:-------:|:-----:|
| Id     | int         | NO   | PRI | NULL    |       |
| Name   | varchar(50) | NO   |     | NULL    |       |
| Gender | varchar(3)  | YES  |     | NULL    |       |

3 rows in set (0.00 sec)

mysql> alter table students modify Gender varchar(15);
Query OK, 0 rows affected (0.02 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> desc students;

| Field  | Type        | Null | Key | Default | Extra |
|:------:|:-----------:|:----:|:---:|:-------:|:-----:|
| Id     | int         | NO   | PRI | NULL    |       |
| Name   | varchar(50) | NO   |     | NULL    |       |
| Gender | varchar(15) | YES  |     | NULL    |       |

3 rows in set (0.01 sec)

mysql> insert into students values(1, 'Abisha' ,'Female');
Query OK, 1 row affected (0.01 sec)

mysql> insert into students values(2, 'Meenu' , 'Female');
Query OK, 1 row affected (0.01 sec)

mysql> select * from students;

| Id | Name   | Gender |
|:--:|:------:|:------:|
|  1 | Abisha | Female |
|  2 | Meenu  | Female |

2 rows in set (0.00 sec)
