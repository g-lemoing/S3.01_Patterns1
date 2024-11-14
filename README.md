# Sprint 3 - Task 1 - Patterns 1
## Nivell 1
Aquest exercici serveix per a concretar l'ús del patró Singleton. Crearem una instància "Undo" garantint que només n'existeixi una. 
Aquesta funcionalitat "Desfer" típica en la majoria de programaris justifica l´ús d'aquest patró, ja que només ha d'existir una pila d'ordres regitrats, i no vàries.

Definint el constructor d'aquesta classe Undo com a privat, impedim instanciar-la directament. Per instanciar-la, invoquem un mètode estàtic d'aquesta classe que controla si ja existeix una instància abans de crear-la.

Aquest objecte té un atribut estàtic, una llista on desarem les ordres registrades per l'usuari ("Crear registre", "Modificar registre", "Eliminar registre"), a través de 3 opcions de menú.
Una altra opció de menú permet d'eliminar l'última ordre entrada, i una altre la de llistar les ordres desades a la llista començant per les més recents.
Aquesta instància compleix també el propòsit de ser accessible des de qualsevol part de l'applicació.

## Nivell 2


## Nivell 3 - Patró command
En aquest exercici, es tracta de fer servir el patró Command per implementar els mètodes d'arrencar, accelerar i frenar per a 4 tipus de vehicles: cotxe, bici, avió i vaixell. Identifiquem els components d'aquest patró:
#### La interfície Command
Aquest public interface declara un sol mètode genèric execute()
#### Els comandaments concrets
Creem 3 classes que implementen el mètode execute() de la interfície, per a les accions d'arrencar, accelerar i frenar el vehicle.
#### Les classes receptores
Hem creat una classe Vehicle amb la declaració dels 3 mètodes arrencar, accelerar i frenar, que implementem en cada una de les subclasses Car, Bicycle, Plane and Boat, amb la personalització corresponent.
#### L'invocador
Creem un invocador Operation que té com a attribut de classe Command, i dos mètodes: un SetCommand(command), i un executeCommand, que invocarà el mètode execute()
#### Aplicació client
Finalment, la aplicació client, a través d'un menú interactiu, proposarà a l'usuari posar-se al comandament d'un d'aquests vehicles i exercir qualsevol operació de les tres possibles. Cada una de elles es durà a terme a través de l'invocador, passant per paràmetre el vehicle i l'operació.


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



