
Spring Security
----------------------

1) Формуємо SQL-запити
INFO/SQLs.sql

2) Переходимо до Spring Initializr
https://start.spring.io/

3) Конфігурація проекту
(цифрові позначення версій можуть
змінюватись з розвитком фреймворку):
a) Project: Maven
b) Spring Boot: (остання стабільна версія, без позначок у дужках)
c) Project Metadata:
    Group: com.example
    Artifact: Spring-Boot-Security
    Name: залишаємо так
    Description: залишаємо так
    Packaging name: com.example.App
    Packaging: Jar
    Java: 21
d) Dependencies:
    Spring Boot DevTools
    Lombok
    Spring Web
    Thymeleaf
    Spring Security
    Spring Data JPA
    MySQL Driver
    Validation


4) Перевіряємо. Клікаємо GENERATE.

5) Зформований zip-файл розпакуємо,
переміщуємо в папку проектів.

6) Відкриваємо проект в IDE. Досліджуємо
    src/main/
    pom.xml

7) Модифікуємо application.properties

8) В main.resources.templates формуємо необхідний контент.

9) В com.example.App формуємо необхідний контент.



Тестуємо проект через браузер
-------------------------------
(1) Стартуємо програму в IDE через Class SpringBootSecurityApplication.

(2) В браузері запускаємо http://localhost:8080/

(3) Реєструємо користувачів

First Name: Tom
Last Name: Forest
Email: tom@mail.com
Password: 12345

First Name: Alice
Last Name: Moon
Email: moon@mail.com
Password: abcde

(4) Перевіремо через Workbench. Паролі мають бути хешованими.
SELECT * FROM users

(5) Входимо в систему через Login here та в формі входу вводимо дані
Email: tom@mail.com
Password: 12345

При правильних даних для входу, отримаємо сторінку зареєстрованих
користувачів.

(6) Вийдемо з системи, клікнувши Logout вверху.
Отримаємо сторінку з формою входу та повідомленням про вихід.

(7) Спробуємо увійти за неправильним паролем
Email: moon@mail.com
Password: abcd1 <- Пароль неправильний

Отримаємо повідомлення про помилку

(8) Спробуємо увійти за правильним паролем
Email: moon@mail.com
Password: abcde <- Пароль правильний

При правильних даних для входу, отримаємо сторінку зареєстрованих
користувачів.


