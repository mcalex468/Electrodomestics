# Electrodomestic Shop

Aquest projecte simula una tenda d'electrodomestics amb una capacitat de gestionar diferents productes de la mateixa categoria, electronics per dir-ho així. Podeu veure per sobre el que inclou.

## MENU
1. [UML](#uml)
2. [Main](#main)
3. [Clase Electrodomestic](#clase-electrodomestic)
4. [Clase Televisió](#clase-televisio)
5. [Clase Rentadora](#clase-rentadora)
6. [Package controllers](#package-controllers)

---

## UML

1. [Imagen1]([https://github.com/mcalex468/Electrodomestics/blob/master/src/Imagenes/Screen%20Shot%2004-02-2024%20at%2019.54.png])
2. [Imagen2](https://github.com/mcalex468/Electrodomestics/blob/master/src/Imagenes/Screen%20Shot%2004-02-2024%20at%2019.55.png)
3. [Imagen3](https://github.com/mcalex468/Electrodomestics/blob/master/src/Imagenes/Screen%20Shot%2004-02-2024%20at%2019.58.png)

## Main

El punt d'entrada principal del programa es troba a la funció `main`. En aquest bloc, es crea un array d'objectes que inclou instàncies de les classes `Electrodomèstic`, `Televisió` i `Rentadora`. Després, es realitza un bucle per imprimir els detalls de cada objecte i calcular els totals per a cada categoria.

A més a més, es calcula el preu total i es mostra al final del bucle.
---

## Clase Electrodomestic

Aquesta classe modela un electrodomèstic genèric amb característiques com ara preu base, color, consum energètic i pes. A més a més, s'inclouen mètodes per calcular el preu final i obtenir detalls específics de l'electrodomèstic.

### Métodes Principals:

- `preuFinal()`: Calcula el preu final del electrodoméstic tenint en compte el consum i pes.
- `getPreuBase()`: Obte el preu base del electrodoméstic.
- `getColor()`: Obte el color del electrodoméstic.
- `getConsum()`: Obte el nivell de consum del electrodoméstic.
- `getPes()`: Obte el pes del electrodoméstic.

### Métodes Adicionals:

- `consum()`: Converteix la lletra de consum en un valor numéric segons un rang predefinit.
- `pes()`: Ajusta el pes del electrodoméstic a un rang específic.
- `color()`: Estableix el color del electrodoméstic, limitant-lo a blanc o platejat.

---

## Clase Televisió

Aquesta classe representa un televisor amb atributs com ara el preu base i la mida en polzades. Es proporcionen mètodes per obtenir el preu base i la mida, així com per calcular el preu final.

### Métodes Principals:

- `preuFinal()`: Calcula el preu final del televisor basant-se en el seu tamany.
- `getPreuBase()`: Obte el preu base del televisor.
- `getMida()`: Obte la mida del televisor en polsades.

## Clase Rentadora

La classe Rentadora modela una rentadora amb atributs com ara el preu base i la capacitat de càrrega en quilograms. S'inclouen mètodes per obtenir la capacitat de càrrega, el preu base i calcular el preu final.

### Métodes Principals:

- `preuFinal()`: Calcula el preu final de la rentadora segons la capacitat de càrrega.
- `getCarrega()`: Obté la capacitat de càrrega de la rentadora.
- `getPreuBase()`: Obte el preu base de la rentadora.


## Package Controllers

- `ConsoleColors`:Fitxer on es declaren una serie de colors per utilitzar en el programa
- `Utilities`: Fitxer on es declaren funcions, per implementarles al programa 

## Author

Alex Martin Cobo
