-- employees3 테이블 (직원 관리)
CREATE TABLE employees3 (
    emp_id          NUMBER(4)
        CONSTRAINT employee_id_pk PRIMARY KEY,
    emp_name        VARCHAR2(10)
        CONSTRAINT employee_name_nn NOT NULL,
    emp_phone       VARCHAR2(13)
        CONSTRAINT employee_tel_nn NOT NULL
        CONSTRAINT employee_tel_uk UNIQUE
        CONSTRAINT employee_tel_reg CHECK ( REGEXP_LIKE ( emp_phone,
                                                          '010-\d{4}-\d{4}' ) ),
    manager_id      NUMBER(4)
        CONSTRAINT manager_id_nn NOT NULL,
    emp_age         NUMBER(3)
        CONSTRAINT employee_age_nn NOT NULL,
    hire_date       DATE
        CONSTRAINT hire_date_nn NOT NULL,
    salary          NUMBER(8)
        CONSTRAINT employee_salary_nn NOT NULL
        CONSTRAINT employee_salary_min CHECK ( salary > 0 ),
    job_position    VARCHAR2(10)
        CONSTRAINT job_position_nn NOT NULL,
    department_id   NUMBER(4) 
        CONSTRAINT department_id_fk REFERENCES departments3 ( department_id ),
    division        VARCHAR2(9)
        CONSTRAINT employee_division_nn NOT NULL
        CONSTRAINT employee_division CHECK ( division IN (
            '정규직',
            '계약직'
        ) )
);
SELECT * FROM employees3;

-- departments3 테이블 (부서 관리)
CREATE TABLE departments3 (
    department_id     NUMBER(4)
        CONSTRAINT department_id_pk PRIMARY KEY,
    department_name   VARCHAR2(10)
        CONSTRAINT department_name_nn NOT NULL,
    manager_id        NUMBER(4)
        CONSTRAINT manager_id_nn NOT NULL
);

-- attendance 테이블 (출석 관리)
CREATE TABLE attendance (
    check_date         VARCHAR2(20)
        CONSTRAINT check_date_nn NOT NULL,
    check_in_time      VARCHAR2(15)
        CONSTRAINT check_in_time_nn NOT NULL,
    check_out_time     VARCHAR2(15),
    emp_id             NUMBER(4)
        CONSTRAINT employee_id_fk
            REFERENCES employees3 ( emp_id )
        CONSTRAINT empoyee_id_nn NOT NULL,
    emp_name           VARCHAR2(10)
        CONSTRAINT emp_id_nn NOT NULL,
    attendance_check   VARCHAR2(8)
        CONSTRAINT attendance_check_nn NOT NULL
);