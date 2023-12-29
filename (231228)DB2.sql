SELECT * FROM student;
-- CRUD 
-- 이름을 기준으로 오름차순 정렬(sort)하여 출력하세요. order by(정렬), 기본은 오름차순, asc(오름)
select * from student order by name asc;
-- 내림차순, desc(내림)
select * from student order by name desc;

-- Q. 나이가 30세 이상인 학생을 출력하세요. where(조건)
select * from student where age>=30;
-- count() : 내장함수
select count(*) from student where age>=30;
select count(num) from student where age>=30;