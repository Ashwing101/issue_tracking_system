CREATE DATABASE IF NOT EXISTS db_issue_tracking;

USE db_issue_tracking;

CREATE TABLE tb_issue_tracking (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    description TEXT,
    status VARCHAR(50) NOT NULL,
    assignedto VARCHAR(255),
    assignedby VARCHAR(255),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

Insert into tb_issue_tracking (title, description, status, assignedto, assignedby) VALUES ('FrontEnd Issue', 'Routing of landing page is not working correctly', 'Open', 'David', 'Sam'),('Backend Issue', 'Bug need to be resolve for product service', 'Open', 'Charles', 'Sam'), ('FrontEnd Issue', 'Loader is taking to much of time during first redirection', 'Closed', 'Ashwini', 'John');



Insert into tb_role (role_id, role_name, role_description, role_type) VALUES ('Role101', 'Admin', 'Admin Role', 'Admin'),('Role102', 'User', 'User Role', 'Developer'),('Role103', 'User', 'User Role', 'Tester');

update tb_roles set   role_name = 'Developer' where role_id = 'Role102';
update tb_roles set role_type= 'AdminRole'  and role_name = 'Admin' where role_id = 'Role101';
update tb_roles set     role_name = 'Tester' where role_id = 'Role103';


private int userId;
private String userName;
private String roleAttached;
private String password;


Insert into tb_user_details (user_name, role_attached, password) VALUES ('Sam', 'Admin', 'Sam@123'),( 'David', 'Developer', 'David@123'),('John', 'Tester', 'John@123'),( 'Ashwini', 'Developer', 'Ashwini@123'),('Charles', 'Tester', 'Charles@123');+---------+-------------+---------------+-----------+--------+

update tb_user_details set RoleId ="Role101" where role_attached = "Admin";