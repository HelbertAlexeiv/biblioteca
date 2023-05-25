# EJERCICIO PRÁCTICO POO

Se necesita escribir las clases necesarias y una aplicación para registrar la información de los libros
pertenecientes a la biblioteca del señor Pérez. El ha informado que de cada libro desea guardar el nombre del
mismo, el nombre del autor o autores, el año de edición y si se trata de una edición de lujo o no. También ha
dicho que tiene una serie de libros que forman colecciones, en cuyo caso además de lo anterior, requiere guardar
el nombre de la colección y el número que ocupa el libro en la colección. La única aclaración adicional es que
si se trata de un libro con mas de dos autores quiere guardar el primer autor, y el nombre del segundo debe
aparecer “y otros”.


# Análisis: 
***identificación de clases, con sus respectivos atributos y métodos requeridos.***

La app debera llevar una clase ***Biblioteca***, una clase ***Libro***, y una clase ***Colecciones*** que hereda de Libro, la biblioteca se encargara de gestionar varios libros y si el libro es pertenece a una coleccion se guardara como una coleccion.

***Biblioteca***, tendra un arrayList misLbros en el que se guardaran objetos de tipo libro y metodos de acceso para ese arrayList.

***Libro***, tendra como atributos el nombre del libro, el nombre de los autores, el año de edicióny booleano para comprobar si es de lujo o no, otro booleano para saber si es una colección, el numero de colección si es una colección y atributos para el primer autor.


# Diseño: 
***implemente el diagrama de clases en Genmymodel e inclúyalo en el README del repositorio.***

# Construcción: 
***1. Cree una clase ejecutable a partir de la cual pueda hacer pruebas mediante la consola. (incluya pantallazos en el REDAME del repositorio)  2. Usando el patrón MVC, implemente una app que permita crear y gestionar libros de la biblioteca del Sr. Perez.  (incluya pantallazos en el REDAME del repositorio)***
