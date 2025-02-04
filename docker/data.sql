CREATE DATABASE IF NOT EXISTS db_issue_tracking;

USE db_issue_tracking;

CREATE TABLE tb_issue_tracking (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    description TEXT,
    status VARCHAR(50) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

Insert into tb_issue_tracking (title, description, status) VALUES ('Issue 1', 'Description for Issue 1', 'Open'), ('Issue 2', 'Description for Issue 2', 'In Progress'), ('Issue 3', 'Description for Issue 3', 'Closed');