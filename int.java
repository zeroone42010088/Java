sql
describe Название таблицы

SELECT * FROM Название таблицы

SELECT Memberid, Membername
FROM Название таблицы 

SELECT member_id, member_name AS Name FROM FamilyMembers

SELECT member_id, member_name Name FROM FamilyMembers

SELECT 'Строка Другая строка' as String

SELECT 'Cтрока \n Другая строка' as String

%, MOD Деление по модулю 11%5=1
DIV Целочисленное деление 10 DIV 4 = 2
SELECT (5*2-6)/2 AS Result

SELECT * FROM FamilyMembers WHERE birthday > '1970-12-30'

SELECT UPPER('Hello world') AS upper_string;


public static void main(String[] args) {
    System.out.println("Hello World!");
}