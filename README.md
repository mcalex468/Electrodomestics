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

1. [Imagen1](https://github.com/mcalex468/Electrodomestics/blob/master/Screen%20Shot%2004-02-2024%20at%2019.54.png)
2. [Imagen2](https://github.com/mcalex468/Electrodomestics/blob/master/Screen%20Shot%2004-02-2024%20at%2019.55.png)
3. [Imagen3](https://github.com/mcalex468/Electrodomestics/blob/master/Screen%20Shot%2004-02-2024%20at%2019.58.png)

## Main

El punto de entrada principal del programa se encuentra en la función `main`. En este bloque, se crea un array de objetos que incluye instancias de las clases `Electrodomestic`, `Televisio` y `Rentadora`. Luego, se realiza un bucle para imprimir los detalles de cada objeto y calcular los totales para cada categoría.

Además, se calcula el precio total y se muestra al final del bucle.

---

## Clase Electrodomestic

Esta clase modela un electrodoméstico genérico con características como precio base, color, consumo energético y peso. Además, se incluyen métodos para calcular el precio final y obtener detalles específicos del electrodoméstico.

### Métodes Principals:

- `preuFinal()`: Calcula el precio final del electrodoméstico teniendo en cuenta el consumo y el peso.
- `getPreuBase()`: Obtiene el precio base del electrodoméstico.
- `getColor()`: Obtiene el color del electrodoméstico.
- `getConsum()`: Obtiene el nivel de consumo del electrodoméstico.
- `getPes()`: Obtiene el peso del electrodoméstico.

### Métodes Adicionals:

- `consum()`: Convierte la letra de consumo en un valor numérico según un rango predefinido.
- `pes()`: Ajusta el peso del electrodoméstico a un rango específico.
- `color()`: Establece el color del electrodoméstico, limitándolo a blanco o plateado.

---

## Clase Televisió

Esta clase representa un televisor con atributos como precio base y tamaño en pulgadas. Se proporcionan métodos para obtener el precio base y el tamaño, así como para calcular el precio final.

### Métodes Principals:

- `preuFinal()`: Calcula el precio final del televisor basándose en su tamaño.
- `getPreuBase()`: Obtiene el precio base del televisor.
- `getMida()`: Obtiene el tamaño del televisor en pulgadas.

## Clase Rentadora

La clase Rentadora modela una lavadora con atributos como precio base y capacidad de carga en kilogramos. Se incluyen métodos para obtener la capacidad de carga, el precio base y calcular el precio final.

### Métodes Principals:

- `preuFinal()`: Calcula el precio final de la lavadora según su capacidad de carga.
- `getCarrega()`: Obtiene la capacidad de carga de la lavadora.
- `getPreuBase()`: Obtiene el precio base de la lavadora.


## Package Controllers

- `ConsoleColors`:Fitxer on es declaren una serie de colors per utilitzar en el programa
- `Utilities`: Fitxer on es declaren funcions, per implementarles al programa 

## Author

Alex Martin Cobo
