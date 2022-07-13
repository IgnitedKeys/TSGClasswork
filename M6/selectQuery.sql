USE PersonalTrainer;

-- activity 1:
SELECT * FROM Exercise;

-- activity 2:
SELECT * FROM Client;

-- activity 3:
SELECT * FROM Client WHERE city= 'Metairie';

-- activity 4:
SELECT ClientId FROM Client WHERE ClientId = '818u7faf-7b4b-48a2-bf12-7a26c92de20c';

-- activity 5:
SELECT * FROM Goal;

-- activity 6:
SELECT Name, LevelId FROM Workout;

-- activity 7:
SELECT Name, LevelId, Notes FROM Workout WHERE LevelId = '2';

-- activity 8:
SELECT FirstName, LastName, City FROM Client WHERE City = 'Metairie' OR City = 'Kenner' OR City = 'Gretna';

-- activity 9:
SELECT FirstName, LastName, BirthDate FROM Client WHERE BirthDate BETWEEN '1980-01-01' AND '1989-12-31';

-- activity 10:
SELECT FirstName, LastName, BirthDate FROM Client WHERE BirthDate>= '1980-01-01' AND BirthDate <= '1989-12-31';

-- activity 11:
SELECT * FROM Login WHERE EmailAddress LIKE '%.gov';

-- activity 12:
SELECT * FROM Login WHERE EmailAddress NOT LIKE '%.com';

-- activity 13:
SELECT FirstName, LastName FROM Clients WHERE BirthDate IS NULL;

-- activity 14:
SELECT Name FROM ExerciseCategory WHERE ParentCategoryId IS NOT NULL;

-- activity 15:
SELECT Name, Notes FROM Workout WHERE LevelId = '3' AND Notes LIKE '%you%';

-- activity 16:
SELECT FirstName, LastName, City FROM Client WHERE City = 'LaPlace' AND (LastName LIKE 'L%' OR LastName LIKE 'M%' OR LastName = 'N%');

-- activity 17:
ALTER TABLE InvoiceLineItem ADD line_item_total FLOAT AS (Price * Quantity);
SELECT InvoiceId, Description, Price, Quantity, ServiceDate, line_item_total FROM InvoiceLineItem WHERE (line_item_total >= 15) AND (line_item_total * quantity <=25);

-- activity 18:
SELECT * FROM Client WHERE FirstName = 'Estrella' AND LastName = 'Bazely';
SELECT * FROM Login WHERE ClientId = '87976c42-9226-4bc6-8b32-23a8cd7869a5';

-- activity 19:
SELECT WorkoutId FROM Workout WHERE Name = 'This is Parkour';
SELECT GoalId FROM WorkoutGoal WHERE WorkoutId = '12';
SELECT Name FROM Goal WHERE GoalId = '3' OR GoalId = '8' Or GoalId = '15';