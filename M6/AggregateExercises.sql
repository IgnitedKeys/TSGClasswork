use PersonalTrainer;

-- Use an aggregate to count the number of Clients.
-- 500 rows
--------------------
SELECT COUNT(ClientId) FROM Client;


-- Use an aggregate to count Client.BirthDate.
-- The number is different than total Clients. Why?
-- 463 rows
--------------------
SELECT COUNT(BirthDate) FROM Client;
--Some of the birthdates are NULL, and they are not counted.

-- Group Clients by City and count them.
-- Order by the number of Clients desc.
-- 20 rows
--------------------
SELECT City, COUNT(*) FROM Client GROUP BY City ORDER BY Count(*);


-- Calculate a total per invoice using only the InvoiceLineItem table.
-- Group by InvoiceId.
-- You'll need an expression for the line item total: Price * Quantity.
-- Aggregate per group using SUM().
-- 1000 rows
--------------------
SELECT InvoiceId, SUM(Price * Quantity) Total FROM InvoiceLineItem GROUP BY InvoiceId;

-- Calculate a total per invoice using only the InvoiceLineItem table.
-- (See above.)
-- Only include totals greater than $500.00.
-- Order from lowest total to highest.
-- 234 rows
--------------------
SELECT InvoiceId, SUM(Price * Quantity) Total FROM InvoiceLineItem GROUP BY InvoiceId HAVING SUM(Price * Quantity) > 500 ORDER BY Total;

-- Calculate the average line item total
-- grouped by InvoiceLineItem.Description.
-- 3 rows
--------------------
SELECT Description, AVG(Price * Quantity) avg FROM InvoiceLineItem GROUP BY Description;

-- Select ClientId, FirstName, and LastName from Client
-- for clients who have *paid* over $1000 total.
-- Paid is Invoice.InvoiceStatus = 2.
-- Order by LastName, then FirstName.
-- 146 rows
--------------------
SELECT c.ClientId, c.FirstName, c.LastName, SUM(l.Price * l.Quantity) total  
FROM Client c 
INNER JOIN Invoice i ON c.ClientId = i.ClientId 
INNER JOIN InvoiceLineItem l ON i.InvoiceId = l.InvoiceId 
WHERE i.InvoiceStatus = 2 
GROUP BY c.ClientId, c.FirstName, c.LastName 
HAVING SUM(l.Price * l.Quantity) > 1000 
ORDER BY c.LastName, c.FirstName;


-- Count exercises by category.
-- Group by ExerciseCategory.Name.
-- Order by exercise count descending.
-- 13 rows
--------------------
SELECT c.Name Category, COUNT(e.ExerciseId) Count 
FROM ExerciseCategory c 
INNER JOIN Exercise e ON e.ExerciseCategoryId = c.ExerciseCategoryId 
GROUP BY c.Name 
ORDER BY COUNT(e.ExerciseId) DESC;


-- Select Exercise.Name along with the minimum, maximum,
-- and average ExerciseInstance.Sets.
-- Order by Exercise.Name.
-- 64 rows
--------------------
SELECT e.Name ExerciseName, MIN(ei.Sets), MAX(ei.Sets), AVG(ei.Sets) 
FROM Exercise e 
INNER JOIN ExerciseInstance ei ON ei.ExerciseId = e.ExerciseId 
GROUP BY e.Name, e.ExerciseId  
ORDER BY e.Name;


-- Find the minimum and maximum Client.BirthDate
-- per Workout.
-- 26 rows
-- Sample: 
-- WorkoutName, EarliestBirthDate, LatestBirthDate
-- '3, 2, 1... Yoga!', '1928-04-28', '1993-02-07'
--------------------
SELECT w.Name WorkoutName, MIN(c.BirthDate) EarliestBirthDate, MAX(c.BirthDate) LatestBirthDate 
FROM Client c 
INNER JOIN ClientWorkout cw ON c.ClientId = cw.ClientId 
INNER JOIN Workout w ON w.WorkoutId = cw.WorkoutId 
GROUP BY w.Name, w.WorkoutId;


-- Count client goals.
-- Be careful not to exclude rows for clients without goals.
-- 500 rows total
-- 50 rows with no goals
--------------------
SELECT c.ClientId, COUNT(cg.GoalId) ClientGoal 
FROM Client c 
LEFT OUTER JOIN ClientGoal cg ON cg.ClientId = c.ClientId 
GROUP BY c.ClientId;


-- Select Exercise.Name, Unit.Name, 
-- and minimum and maximum ExerciseInstanceUnitValue.Value
-- for all exercises with a configured ExerciseInstanceUnitValue.
-- Order by Exercise.Name, then Unit.Name.
-- 82 rows
--------------------

-- Modify the query above to include ExerciseCategory.Name.
-- Order by ExerciseCategory.Name, then Exercise.Name, then Unit.Name.
-- 82 rows
--------------------
SELECT e.Name ExerciseName, u.Name UnitName, MIN(eu.Value) minValue, MAX(eu.Value) `maxValue` 
FROM Exercise e 
INNER JOIN ExerciseInstance ei ON e.ExerciseId = ei.ExerciseId 
INNER JOIN ExerciseInstanceUnitValue eu ON ei.ExerciseInstanceId = eu.ExerciseInstanceId 
INNER JOIN Unit u ON u.UnitId = eu.UnitId 
GROUP BY e.Name, u.Name, e.ExerciseId, u.UnitId 
ORDER BY e.Name, u.Name;
--notice the `maxValue`

-- Select the minimum and maximum age in years for
-- each Level.
-- To calculate age in years, use the MySQL function DATEDIFF.
-- 4 rows
--------------------
SELECT l.Name, MIN(DATEDIFF(CURDATE(), c.BirthDate) /365) MinAge, MAX(DATEDIFF(CURDATE(), c.BirthDate) / 365) MaxAge 
FROM Level l 
INNER JOIN Workout w ON l.LevelId = w.LevelId 
INNER JOIN ClientWorkout cw ON cw.WorkoutId = w.WorkoutId 
INNER JOIN Client c ON c.ClientId = cw.ClientId 
GROUP BY l.Name, l.LevelId;

-- Stretch Goal!
-- Count logins by email extension (.com, .net, .org, etc...).
-- Research SQL functions to isolate a very specific part of a string value.
-- 27 rows (27 unique email extensions)
--------------------
SELECT SUBSTRING_INDEX(EmailAddress, '.', -1) Extension, COUNT(EmailAddress) 
FROM Login 
GROUP BY SUBSTRING_INDEX(EmailAddress, '.', -1);

--SUBSTRING_INDEX(string, delimiter,# of delimiters before);

-- Stretch Goal!
-- Match client goals to workout goals.
-- Select Client FirstName and LastName and Workout.Name for
-- all workouts that match at least 2 of a client's goals.
-- Order by the client's last name, then first name.
-- 139 rows
--------------------
SELECT c.FirstName, c.LastName, w.Name WorkoutName, COUNT(cg.GoalId)
FROM Client c
INNER JOIN ClientGoal cg ON cg.ClientId = c.ClientId
INNER JOIN WorkoutGoal wg ON wg.GoalId = cg.GoalId
INNER JOIN Workout w ON w.WorkoutId = wg.WorkoutId
GROUP BY w.Name, c.FirstName, c.LastName, c.ClientId, w.WorkoutId
HAVING COUNT(cg.GoalId) >= 2
ORDER BY c.LastName, c.FirstName;