[![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)](../../../README.md)

## Variables

Los String son objetos de java, del tipo de referencia, aunque también los String se pueden representar con una sintaxis
especialmente cómoda.

### Qué son los String

- El tipo String tiene una característica especial, permite crear objetos también
  en la literal entre comillas dobles.
- Para incluir el carácter comillas dobles, se debe escapar "``\"``".
- Los caracteres de un String se codifican usando Unicode.
- Son inmutables.

### Concatenación de String

- Para concatenar String se usa el operador ``+``.

    ```java
    String nombre = "Andrés";
    String apellido = "Guzmán";

    String nombreCompleto = nombre + " " + apellido;
    ```

### Comparación de String

- Para comparar String se usa el método ``equals``.

    ```java
    String str1 = "Hola Andres";
    String str2 = new String("Hola Andres");
  
    // Chequea si son el mismo objeto
    System.out.println("Son el mismo objeto? " + (str1 == str2));
  
    // Chequea si tienen el mismo valor
    System.out.println("Tienen el mismo valor? " + str1.equals(str2));
    ```

### Métodos de String

- `int length()` : número de caracteres.
- `boolean equals(String b)` : compara si ambas son iguales, por valor
- `boolean equalsIgnoreCase(String b)` compara si ambas son iguales,
  independientemente de mayúsculas o minúsculas.
- `int compareTo(String b)` Compara contra la cadena del argumento,
  devolviendo:
    - un valor negativo si la cadena es anterior a b
    - cero (0) si la cadena es igual a b
    - un valor positivo si la cadena es posterior a b
- `String trim()` Crea un nuevo objeto eliminado el espacio en blanco que pudiera
  haber al principio o al final.
- `char charAt(int posicion)` Extrae un carácter en la posición indicada.

### CLASE STRINGBUILDER

La clase StringBuilder es similar a la clase String en el sentido de que sirve para almacenar cadenas de caracteres. No
obstante, presenta algunas diferencias relevantes. Señalaremos como características de StringBuilder a tener en cuenta:

- Su tamaño y contenido pueden modificarse. Los objetos de éste tipo son mutables. Esto es una diferencia con los
  String.

- Debe crearse con alguno de sus costructores asociados. No se permite instanciar directamente a una cadena como sí
  permiten los String.

- Un StringBuilder está indexado. Cada uno de sus caracteres tiene un índice: 0 para el primero,1 para el segundo, etc.

- Los métodos de StringBuilder no están sincronizados. Esto implica que es más eficiente que StringBuffer siempre que no
  se requiera trabajar con múltiples hilos (threads), que es lo más habitual.

| Constructor                  | Descripción                                                                            | Ejemplo                                      |
|------------------------------|----------------------------------------------------------------------------------------|----------------------------------------------|
| **StringBuilder()**          | **Construye un StringBuilder vacío y con una capacidad por defecto de 16 carácteres.** | **StringBuilder s = new StringBuilder();**   |
| StringBuilder(int capacidad) | Se le pasa la capacidad (número de caracteres) como argumento.                         | StringBuilder s = new StringBuilder(55);     |
| StringBuilder(String str)    | Construye un StringBuilder en base al String que se le pasa como argumento.            | StringBuilder s = new StringBuilder("hola"); |

Los métodos principales de StringBuilder se resumen en la siguiente tabla:

| Retorno           | Método                                             | Explicación                                                                                                                                            |
|-------------------|----------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------|
| **StringBuilder** | **append(...)**                                    | **Añade al final del StringBuilder a la que se aplica, un String o la representación en forma de String de un dato asociado a una variable primitiva** |
| int               | capacity()                                         | Devuelve la capacidad del StringBuilder                                                                                                                |
| int               | length()                                           | Devuelve el número de caracteres del StringBuilder                                                                                                     |
| StringBuilder     | reverse()                                          | Invierte el orden de los caracteres del StringBuilder                                                                                                  |
| void              | setCharAt(int indice,char ch)                      | Cambia el carácter indicado en el primer argumento por el carácter que se le pasa en el segundo                                                        |
| char              | charAt(int indice)                                 | Devuelve el carácter asociado a la posición que se le indica en el argumento                                                                           |
| void              | setLength(int nuevaLongitud)                       | Modifica la longitud. La nueva longitud no puede ser menor                                                                                             |
| **String**        | **toString()**                                     | **Devuelve el contenido del StringBuilder en forma de String**                                                                                         |
| StringBuilder     | insert(int indiceIni,String cadena)                | Añade la cadena del segundo argumento a partir de la posición indicada en el primero                                                                   |
| StringBuilder     | delete(int indiceIni,int indiceFin)                | Elimina los caracteres comprendidos entre los índices indicados en los argumentos                                                                      |
| StringBuilder     | deleteCharAt(int indice)                           | Elimina el carácter que se encuentra en la posición indicada en el argumento                                                                           |
| StringBuilder     | replace(int indiceIni,int indiceFin,String cadena) | Reemplaza los caracteres comprendidos entre los índices indicados en los argumentos por la cadena que se le pasa como tercer argumento                 |
| StringBuilder     | substring(int indiceIni,int indiceFin)             | Devuelve una cadena que contiene los caracteres comprendidos entre los índices indicados en los argumentos                                             |
| int               | indexOf(String str)                                | Devuelve la posición del primer carácter de la cadena que se le pasa como argumento. Si no se encuentra, devuelve -1                                   |