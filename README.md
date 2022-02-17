# MY SQL

##### To Open My Sql in Terminal(command)
  * sudo -u root mysql 
  (sudo mean super, u mean user, super user root mysql.)


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
mysql> show * from students;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '* from students' at line 1
mysql> show tables;
+-------------------+
| Tables_in_schools |
+-------------------+
| students          |
+-------------------+
1 row in set (0.00 sec)

mysql> desc students;
+--------+-------------+------+-----+---------+-------+
| Field  | Type        | Null | Key | Default | Extra |
+--------+-------------+------+-----+---------+-------+
| Id     | int         | NO   | PRI | NULL    |       |
| Name   | varchar(50) | NO   |     | NULL    |       |
| Gender | varchar(3)  | YES  |     | NULL    |       |
+--------+-------------+------+-----+---------+-------+
3 rows in set (0.00 sec)

mysql> insert into students values('abisha','female');
ERROR 1136 (21S01): Column count doesn't match value count at row 1
mysql> insert into students values(1,'abisha','female');
ERROR 1406 (22001): Data too long for column 'Gender' at row 1
mysql> delete from students where gender;
Query OK, 0 rows affected (0.00 sec)

mysql> desc students;
+--------+-------------+------+-----+---------+-------+
| Field  | Type        | Null | Key | Default | Extra |
+--------+-------------+------+-----+---------+-------+
| Id     | int         | NO   | PRI | NULL    |       |
| Name   | varchar(50) | NO   |     | NULL    |       |
| Gender | varchar(3)  | YES  |     | NULL    |       |
+--------+-------------+------+-----+---------+-------+
3 rows in set (0.01 sec)

mysql> alter table students modify Gender varchar(15);
Query OK, 0 rows affected (0.02 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> desc students;
+--------+-------------+------+-----+---------+-------+
| Field  | Type        | Null | Key | Default | Extra |
+--------+-------------+------+-----+---------+-------+
| Id     | int         | NO   | PRI | NULL    |       |
| Name   | varchar(50) | NO   |     | NULL    |       |
| Gender | varchar(15) | YES  |     | NULL    |       |
+--------+-------------+------+-----+---------+-------+
3 rows in set (0.01 sec)

mysql> insert into students values(1, 'Abisha' ,'Female');
Query OK, 1 row affected (0.01 sec)

mysql> insert into students values(2, 'Meenu' , 'Female') (3, 'Vaishu' , 'Female');
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '(3, 'Vaishu' , 'Female')' at line 1
mysql> insert into students values(2, 'Meenu' , 'Female');
Query OK, 1 row affected (0.01 sec)

mysql> desc students;
+--------+-------------+------+-----+---------+-------+
| Field  | Type        | Null | Key | Default | Extra |
+--------+-------------+------+-----+---------+-------+
| Id     | int         | NO   | PRI | NULL    |       |
| Name   | varchar(50) | NO   |     | NULL    |       |
| Gender | varchar(15) | YES  |     | NULL    |       |
+--------+-------------+------+-----+---------+-------+
3 rows in set (0.00 sec)

mysql> select * from students;
+----+--------+--------+
| Id | Name   | Gender |
+----+--------+--------+
|  1 | Abisha | Female |
|  2 | Meenu  | Female |
+----+--------+--------+
2 rows in set (0.00 sec)

mysql> 
