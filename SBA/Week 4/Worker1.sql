create database organisation;
show databases;
use organisation;
create table worker(WORKER_ID INT NOT NULL PRIMARY KEY,FIRST_NAME VARCHAR(50)NOT NULL,LAST_NAME VARCHAR(50) NOT NULL,
SALARY VARCHAR(50)NOT NULL,JOINING_DATE VARCHAR(50)NOT NULL,DEPARTMENT VARCHAR(50)NOT NULL);
insert into worker values ("001","Monika","Arora","100000","2014-02-20 9:00:00","HR"),
("002","Niharika","Verma","80000","2014-06-11 9:00:00","Admin"),
("003","Vishal","Singhal","300000","2014-02-20 9:00:00","HR"),
("004","Amitabh","Singh","500000","2014-02-20 9:00:00","Admin"),
("005","Vivek","Bhati","500000","2014-06-11 9:00:00","Admin"),
("006","Vipul","Diwan","200000","2014-06-11 9:00:00","Account"),
("007","Satish","Kumar","75000","2014-01-20 9:00:00","Account"),
("008","Geetika","Chauhan","90000","2014-04-11 9:00:00","Admin");
select * from worker ;
create table bonus(WORKER_REF_ID varchar(10) NOT NULL,BONUS_DATE VARCHAR(30)NOT NULL,BONUS_AMOUNT VARCHAR(30)NOT NULL);
insert into bonus values ("1","2016-02-20 00:00:00","5000"),
("2","2016-06-11 00:00:00","3000"),
("3","2014-02-20 00:00:00","4000"),
("1","2014-02-20 00:00:00","4500"),
("2","2014-06-11 00:00:00","3500");

/*----------------------Question-1-------------------------*/
select  FIRST_NAME as WORKER_NAME from worker;

/*----------------------Question-2-------------------------*/

select UPPER (FIRST_NAME) from worker;

/*----------------------Question-3------------------------*/

select distinct DEPARTMENT from worker;

/*----------------------Question-9-----------------------*/

select FIRST_NAME from worker where replace('a',FIRST_NAME,'A');

/*----------------------Question-10---------------------*/

select concat(FIRST_NAME,"",LAST_NAME) as COMPLETE_NAME from worker;

/*----------------------Question-11---------------------*/
select* from worker order by FIRST_NAME ASC;

/*----------------------Question-12---------------------*/
select* from worker order by FIRST_NAME asc,DEPARTMENT DESC;


/*----------------------Question-13---------------------*/
select* from worker order by FIRST_NAME like 'Vipul' or FIRST_NAME like 'Satish';






/*----------------------Question-17----------------------*/

select * from worker where FIRST_NAME LIKE '%a';


/*----------------------Question-19---------------------*/
select * from worker where SALARY  between 100000 AND 500000;

/*----------------------Question-21-------------------------*/

select COUNT(WORKER_ID),DEPARTMENT from worker group by DEPARTMENT having DEPARTMENT="Admin";


/*----------------------Question-22-------------------------*/
select  FIRST_NAME,LAST_NAME  from worker where SALARY>=50000 AND SALARY<=100000;

/*----------------------Question-23------------------------*/
select COUNT(WORKER_ID),DEPARTMENT from worker group by DEPARTMENT order by COUNT(DEPARTMENT)DESC;





