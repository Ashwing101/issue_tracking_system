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