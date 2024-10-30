# Sprint 3 - Task 1 - Patterns 1
## Nivell 1
Aquest exercici serveix per a concretar l'ús del patró Singleton. Crearem una instància "Undo" garantint que només n'existeixi una. 
Aquesta funcionalitat "Desfer" típica en la majoria de programaris justifica l´ús d'aquest patró, ja que només ha d'existir una pila d'ordres regitrats, i no vàries.

Definint el constructor d'aquesta classe Undo com a privat, impedim instanciar-la directament. Per instanciar-la, invoquem un mètode estàtic d'aquesta classe que controla si ja existeix una instància abans de crear-la.

Aquest objecte té un atribut estàtic, una llista on desarem les ordres registrades per l'usuari ("Crear registre", "Modificar registre", "Eliminar registre"), a través de 3 opcions de menú.
Una altra opció de menú permet d'eliminar l'última ordre entrada, i una altre la de llistar les ordres desades a la llista començant per les més recents.
Aquesta instància compleix també el propòsit de ser accessible des de qualsevol part de l'applicació.

## Instruccions d'instal·lació
Tecnologies Utilitzades : IDE IntelliJ Idea v 2024.2.2 (Community Edition), Java, SDK openjdk-22 Oracle OpenJDK 22.0.2
Requisits: SDK openjdk-22 Oracle OpenJDK 22.0.2.

# Instal·lació: 
1. Clonar el repositorio de Github
git clone https://github.com/g-lemoing/S3.01_Patterns1.git
2. Abrir el IDE e importar el proyecto desde el repositorio local desde File > Open.

# Ejecución:
Localizar y abrir las classes Main de cada ejercicio, y ejecutarlas con el Run.

## Contribucions:
1. Crear un fork del repositorio: 
2. Clonar el repositorio hacia el directorio local marcado por git bash
 git clone https://github.com/YOUR-USERNAME/S3.01_Patterns1
3. Crear una rama
git branch BRANCH-NAME
git checkout BRANCH-NAME
4. Realizar cambios o comentarios, y hacer un commit: git commit -m 'mensaje cambios'
5. Subir cambios a tu nueva rama: git push origin BRANCH-NAME
6. Hacer un pull request



