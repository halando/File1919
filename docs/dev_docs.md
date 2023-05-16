# A kontener fejlesztői dokumentáció

2023-05-16

Copyright (c) 2023, Andó Attila

## Célok

A konténer Kft fájlban tárolt dolgozók adatainak lapozása.

## Fejlesztői környezet

Átlagos irodai gépen fejleszthető, a tanteremben ennél kicsit jobb gépek voltak.

*Operációs rendszer : Windows 10
*Java SE JDK - 17.x verzió
* Visual Studio Code verzió: 1.69.2

## Adatszerkezetek

## Fájlok

A programot MVC szerint több fájlba tettük, de külön
könyvtárak nélkül.

A program belépési pontja az App.java. MVC szerint bontás:

*Controllers: MainController.java
*Models: Employee.java, LoadFile.java
*Views: Inputpanel.java, MainFrame.java

## Változók és objektumok

A MainController osztályba tőltödik az összes dolgozó
értéke egy ArrayList&lt; Employee&gt; listába.

Induláskor a program betölti az első dolgozó adatait.

Az aktuálisan betöltött dolgozó indexe a MainController osztályban 
az **actual** változóban van.

A listában tárolt dolgozók egy Employee modellben tárolhatók.Az
Employee osztálynak háromféle 
konstruktora van:

```java
 Employee()
```

```java
new Employee(String name, String city, String address, LocalDate birth, Double salary)
```

```java
new Employee( Integer id,String name, String city, String address, LocalDate birth, Double salary)
```

## Adatbázis 

![Adatbázis diagramm] (images/adatbazis_diagram.png)