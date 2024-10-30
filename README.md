# Sprint 3 - Task 1 - Patterns 1
## Nivell 1
Aquest exercici serveix per a concretar l'ús del patró Singleton. Crearem una instància "Undo" garantint que només n'existeixi una. 
Aquesta funcionalitat "Desfer" típica en la majoria de programaris justifica l´ús d'aquest patró, ja que només ha d'existir una pila d'ordres regitrats, i no vàries.
Definint el constructor d'aquesta classe Undo com a privat, impedim instanciar-la directament. Per instanciar-la, invoquem un mètode estàtic d'aquesta classe que controla si ja existeix una instància abans de crear-la.
Aquest objecte té un atribut estàtic, una llista on desarem les ordres registrades per l'usuari ("Crear registre", "Modificar registre", "Eliminar registre"), a través de 3 opcions de menú.
Una altra opció de menú permet d'eliminar l'última ordre entrada, i una altre la de llistar les ordres desades a la llista començant per les més recents.
Aquesta instància compleix també el propòsit de ser accessible des de qualsevol part de l'applicació.
Per provar aquesta aplicació, executar el Main i interactuar amb la consola.

## Instruccions d'instal·lació


## Contribucions
