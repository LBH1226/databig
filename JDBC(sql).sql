-- 데이터베이스 생성
create database JDBCTEST;

-- BIGDATAMEMBER 테이블 생성
-- COLUMN
-- ID 문자(50) PRIMARY KEY
-- PW 문자(100) NOT NULL
-- B_NAME 문자(50) NOT NULL
-- AGE 숫자
-- SCORE 숫자

create table JDBCTEST.BIGDATAMEMBER(
ID varchar(50) primary key,
PW varchar(100) not null,
B_NAME  varchar(50) not null,
AGE int,
SCORE int
);
commit;
select*from JDBCTEST.BIGDATAMEMBER;

insert into JDBCTEST.BIGDATAMEMBER VALUES ('smhrd','12345','이도연',20,0);



