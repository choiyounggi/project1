-- ���� ������ �߰�
INSERT INTO employees3 (emp_id, emp_name, emp_phone, manager_id, emp_age, hire_date, salary, job_position, division) VALUES (1, '��浿', '010-1234-5678', 1, 30, sysdate, 10000000, '����', '������');
INSERT INTO employees3 VALUES (2, 'ȫ�浿', '010-2345-6789', 1, 29, sysdate, 3000000, '����', 1, '������');
INSERT INTO employees3 VALUES (3, '�ֱ浿', '010-3456-7890', 2, 28, sysdate, 2000000, '���', 1, '������');
INSERT INTO employees3 VALUES (4, '�ڱ浿', '010-4567-8901', 1, 27, sysdate, 3000000, '����', 2, '������');
INSERT INTO employees3 VALUES (5, '�α浿', '010-5678-9012', 4, 26, sysdate, 2000000, '���', 2, '������');
INSERT INTO employees3 VALUES (6, '���浿', '010-6789-0123', 1, 25, sysdate, 3000000, '����', 3, '������');
INSERT INTO employees3 VALUES (7, '��浿', '010-7890-1234', 6, 24, sysdate, 2000000, '���', 3, '������');

-- �μ� ������ �߰�
INSERT INTO departments3 VALUES (1, '�Ǹź�', 2);
INSERT INTO departments3 VALUES (2, 'û�Һ�', 4);
INSERT INTO departments3 VALUES (3, '������', 6);

-- �⼮�� �⼮ ��ɿ��� �����ȣ �Է��ϰ� ���, ��� ������ ������ �߰��˴ϴ�.

SELECT * FROM employees3;
SELECT * FROM departments3;
SELECT * FROM attendance;