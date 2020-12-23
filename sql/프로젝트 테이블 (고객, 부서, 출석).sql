-- employees3 ���̺� (���� ����)
CREATE SEQUENCE EMP_SEQ START WITH 1 MINVALUE 1 INCREMENT BY 1;
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
    manager_id      NUMBER(4),
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
            '������',
            '�����'
        ) )
);

-- ��ȸ
SELECT * FROM employees3;

-- ���� ���̺� ����
DROP TABLE employees3 PURGE;

-- ���븸 ����
DELETE FROM employees3;

-- departments3 ���̺� (�μ� ����)
CREATE SEQUENCE DPT_SEQ START WITH 1 MINVALUE 1 INCREMENT BY 1;
CREATE TABLE departments3 (
    department_id     NUMBER(4)
        CONSTRAINT department_id_pk PRIMARY KEY,
    department_name   VARCHAR2(10)
        CONSTRAINT department_name_nn NOT NULL,
    manager_id        NUMBER(4)
        CONSTRAINT manager_id_nn NOT NULL
);

-- ��ȸ
SELECT * FROM departments3;

-- �μ� ���̺� ����
DROP TABLE departments3 PURGE;

-- ���븸 ����
DELETE FROM departments3;

-- attendance ���̺� (�⼮ ����)
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

-- ��ȸ
SELECT * FROM attendance;

-- �⼮ ���̺� ����
DROP TABLE attendance PURGE;

-- ���븸 ����
DELETE FROM attendance;