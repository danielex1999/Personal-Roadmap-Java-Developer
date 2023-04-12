## Operadores

Los operadores son símbolos que le indican al compilador que debe realizar una tarea específica, como la suma o la
multiplicación. C# es rico en operadores y le permite realizar operaciones en variables y valores.

### Operadores aritméticos

Se utilizan para realizar operaciones aritméticas simples en tipos de datos
primitivos.

| Operador | Descripción    | Ejemplo |
|----------|----------------|---------|
| +        | Suma           | 5 + 2   |
| -        | Resta          | 5 - 2   |
| *        | Multiplicación | 5 * 2   |
| /        | División       | 5 / 2   |
| %        | Módulo         | 5 % 2   |
| ++       | Incremento     | 5++     |
| --       | Decremento     | 5--     |

### Operadores relacionales

Se utilizan para comparar dos valores. El resultado de una operación
relacional es un valor booleano.

| Operador | Descripción   | Ejemplo |
|----------|---------------|---------|
| ==       | Igual         | 5 == 2  |
| !=       | Diferente     | 5 != 2  |
| *>*      | Mayor que     | 5 > 2   |
| <        | Menor que     | 5 < 2   |
| *>*=     | Mayor o igual | 5 >= 2  |
| <=       | Menor o igual | 5 <= 2  |

### Operadores lógicos

Se utilizan para combinar expresiones booleanas.

| Operador | Descripción | Ejemplo           |
|----------|-------------|-------------------|
| &&       | AND         | 5 > 2 && 5 < 10   |
| \|\|     | OR          | 5 > 2 \|\| 5 > 10 |
| !        | NOT         | !(5 > 2)          |

### Operadores de asignación

Se utilizan para asignar valores a variables.

| Operador | Descripción    | Ejemplo   |
|----------|----------------|-----------|
| =        | Asignación     | int a = 5 |
| +=       | Suma           | a += 5    |
| -=       | Resta          | a -= 5    |
| *=       | Multiplicación | a *= 5    |
| /=       | División       | a /= 5    |
| %=       | Módulo         | a %= 5    |

### Tabla de la verdad

| A | B | A && B | A \|\| B | !A | !B |
|---|---|--------|----------|----|----|
| T | T | T      | T        | F  | F  |
| T | F | F      | T        | F  | T  |
| F | T | F      | T        | T  | F  |
| F | F | F      | F        | T  | T  |

