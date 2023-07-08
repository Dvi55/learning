SELECT * FROM costumers WHERE name LIKE '[Aa]',
SELECT * FROM costumers WHERE country LIKE 'Ukraine',
SELECT * FROM costumers WHERE sex = 'Male',
UPDATE costumers SET country = 'USA' WHERE dateOfBirth < '2000-01-01',
DELETE FROM costumers WHERE country = 'Russia';
SELECT DISTINCT name FROM costumers;
SELECT * FROM costumers ORDER BY dateOfBirth DESC;
