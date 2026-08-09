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

int x,y,z;
int a;
a = 5;
int a=7; int b=4; int c=5;

int a (2+2)*2;
int b = (6-3)/(9-6);
int c = (-2)*(-3);
int d = 3/0;
int a = 5/2;
int a=b%2;
int b=20%4;
int a=5%2; a=1
int b=20%4; b=0;
int c=9%5; с=4

(a%2)==0
a++;
a--;

SELECT * FROM animals
SELECT name FROM animals

int x = 5;
x = x+1; значение будет 6
x = x+1; значение будет 7
x = x+1; значение будет 8
(a%2)==0;

SELECT COUNT(*) AS count
FROM Student
WHERE first_name = 'Anna';

SELECT COUNT(*) As COUNT 
FROM Trip
WHERE plane = 'TU-154';

String имя1, имя2, имя3;

String name = "Аня";
String city = "New York";
String message = "Hello";

SELECT name, price
FROM products
WHERE name LIKE '%Air%'
ORDER BY price DESC

SELECT name, description
FROM products


SELECT id AS "Артикул", 
      name AS "Название"
FROM products
ORDER BY id ASC;

String text;
String a,b,c;
String city = "New York";
String name = "А" + "Б" = АБ

String message = "Hello" + city + name + city;
String quote = "Он сказал: \"Здравствуйте! \" ";
System.out.println(quote); //Он сказал: "Здравствуйте!"
String phrase = "\"Фраза в ковычках \" ";

\n - перенос стройки (newline)
\t - табуляция (отступ)
\\ - Буквально \
\" - Ковычки внутри строки

String multiline = "Строка 1 \n Строка 2";
System.out.println(multiline);

str.length() Длина строки
str.toUpperCase() В верхний регистр
str.toLowerCase() В нижний регистр
str.trim()

String name="Андрей";
int length = name.length();
System.out.println(length); 

String messy = "  hello  " 
System.out.println(messy.trim());

String product = "  iPhone 17 Pro  ";
String category = "SMARTPHONES";
String price = "120000";

String cleanProduct = product.trim();
String lowerCategory = category.toLowerCase();

int productLength = cleanProduct.length();

String wholeText =
        "Товар: " + cleanProduct + "\n" +
        "Категория: " + lowerCategory + "\n" +
        "Цена: " + price + " руб.\n" +
        "Название содержит " + productLength + " символов";

System.out.print(wholeText);
       
