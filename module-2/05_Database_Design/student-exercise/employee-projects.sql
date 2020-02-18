--drop table project
--drop table department;
--drop table employee;

CREATE TABLE project
(
        projectNumber serial NOT NULL,
        name varChar (50) NOT NULL,
        startDate varChar (50) NOT NULL,
        CONSTRAINT pk_project_projectNumber PRIMARY KEY (projectNumber)
);
        INSERT INTO project(name, startDate)
        VALUES('Audio Wall', '03/03/18');
        INSERT INTO project(name, startDate)
        VALUES('Community Development', '03/03/18');
        INSERT INTO project(name, startDate)
        VALUES('Team Building', '07/03/19');
        INSERT INTO project(name, startDate)
        VALUES('New Startup', '10/03/19');
        
CREATE TABLE department
(
        departmentNumber serial NOT NULL,
        name varChar (50) NOT NULL,
        
        CONSTRAINT pk_department_departmentNumber PRIMARY KEY (departmentNumber)
);


        INSERT INTO department(name)
        VALUES('Electronics');
        INSERT INTO department(name)
        VALUES('Outdoors');
        INSERT INTO department(name)
        VALUES('Customer Service');
       
        
        

CREATE TABLE employee
(
        employeeNumber serial NOT NULL,
        jobTitle varChar(100) NOT NULL,
        lastName varChar(100) NOT NULL,
        firstName varChar(100)NOT NULL,
        gender varChar (50) NOT NULL,
        dateOfBirth varChar (50) NOT NULL,
        dateOFHire varChar (50) NOT NULL,
        departmentNumber int NOT NULL,
        projectNumber int NOT NULL,
         
        CONSTRAINT pk_employee PRIMARY KEY(employeeNumber),
        CONSTRAINT fk_employee_department FOREIGN KEY (departmentNumber) references department (departmentNumber),
        CONSTRAINT fk_employee_project FOREIGN KEY (projectNumber) references project (projectNumber)
        
);
        INSERT INTO employee(jobTitle, lastName, firstName, gender, dateOfBirth, dateOfHire, departmentNumber, projectNumber)
        VALUES('Salesman', 'Johnson', 'Tom', 'male', '07/29/1996',  '01/01/2017', 1, 1 );
        INSERT INTO employee(jobTitle, lastName, firstName, gender, dateOfBirth, dateOfHire, departmentNumber, projectNumber)
        VALUES('Geek Squad', 'Jones', 'Ray', 'male', '07/20/1994',  '01/01/2018', 3, 1 );
        INSERT INTO employee(jobTitle, lastName, firstName, gender, dateOfBirth, dateOfHire, departmentNumber, projectNumber)
        VALUES('Cashier', 'Hall', 'Ken', 'male', '07/29/1986',  '01/01/2015', 2, 2 );
        INSERT INTO employee(jobTitle, lastName, firstName, gender, dateOfBirth, dateOfHire, departmentNumber, projectNumber)
        VALUES('Fishing Expert', 'Brown', 'Jessica', 'female', '07/29/1990',  '01/01/2014', 2, 2 );
        INSERT INTO employee(jobTitle, lastName, firstName, gender, dateOfBirth, dateOfHire, departmentNumber, projectNumber)
        VALUES('Cashier', 'Davis', 'Nikki', 'female', '11/13/1989',  '12/01/2015', 3, 3 );
        INSERT INTO employee(jobTitle, lastName, firstName, gender, dateOfBirth, dateOfHire, departmentNumber, projectNumber)
        VALUES('Manager', 'Downing', 'James', 'male', '11/13/1979',  '12/01/2010', 3, 4);
        INSERT INTO employee(jobTitle, lastName, firstName, gender, dateOfBirth, dateOfHire, departmentNumber, projectNumber)
        VALUES('Warehouse', 'Smith', 'Will', 'male', '11/13/1987',  '04/01/2015', 1, 3 );

