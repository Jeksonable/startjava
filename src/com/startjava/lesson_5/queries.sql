-- queries

SELECT * FROM Jaegers;
SELECT * FROM Jaegers WHERE status != 'Destroyed';
SELECT * FROM Jaegers WHERE mark = 'Mark-1' OR mark = 'Mark-6';
SELECT * FROM Jaegers ORDER BY mark DESC;
SELECT * FROM Jaegers WHERE launch = (SELECT MIN(launch) FROM Jaegers);
SELECT * FROM Jaegers WHERE kaijuKill = (SELECT MAX(kaijuKill) FROM Jaegers);
SELECT AVG(weight) FROM Jaegers
UPDATE Jaegers SET kaijukill = (kaijukill + 1) WHERE status != 'Destroyed';
DELETE FROM Jaegers WHERE status = 'Destroyed';