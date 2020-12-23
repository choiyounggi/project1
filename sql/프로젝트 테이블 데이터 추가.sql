-- 직원 데이터 추가
INSERT INTO employees3 (emp_id, emp_name, emp_phone, manager_id, emp_age, hire_date, salary, job_position, division) VALUES (1, '김길동', '010-1234-5678', 1, 30, sysdate, 10000000, '사장', '정규직');
INSERT INTO employees3 VALUES (2, '홍길동', '010-2345-6789', 1, 29, sysdate, 3000000, '부장', 1, '정규직');
INSERT INTO employees3 VALUES (3, '최길동', '010-3456-7890', 2, 28, sysdate, 2000000, '사원', 1, '정규직');
INSERT INTO employees3 VALUES (4, '박길동', '010-4567-8901', 1, 27, sysdate, 3000000, '부장', 2, '정규직');
INSERT INTO employees3 VALUES (5, '민길동', '010-5678-9012', 4, 26, sysdate, 2000000, '사원', 2, '정규직');
INSERT INTO employees3 VALUES (6, '전길동', '010-6789-0123', 1, 25, sysdate, 3000000, '부장', 3, '정규직');
INSERT INTO employees3 VALUES (7, '장길동', '010-7890-1234', 6, 24, sysdate, 2000000, '사원', 3, '정규직');

-- 부서 데이터 추가
INSERT INTO departments3 VALUES (1, '판매부', 2);
INSERT INTO departments3 VALUES (2, '청소부', 4);
INSERT INTO departments3 VALUES (3, '정리부', 6);

-- 출석은 출석 기능에서 사원번호 입력하고 출근, 퇴근 찍으면 데이터 추가됩니다.

SELECT * FROM employees3;
SELECT * FROM departments3;
SELECT * FROM attendance;