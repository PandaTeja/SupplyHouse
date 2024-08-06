CREATE TABLE IF NOT EXISTS HOURS (
    id INT AUTO_INCREMENT PRIMARY KEY,
    date DATE,
    hours VARCHAR(255)
);

INSERT INTO hours (date, hours) VALUES ('2024-01-01', 'Closed');
INSERT INTO hours (date, hours) VALUES ('2024-01-02', '9am - 5pm');

