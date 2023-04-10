## Flujos de control

### Sentencias de control

- **Sentencia if**: La sentencia if es una de las sentencias de control más utilizadas en Java. La sentencia if evalúa
  una condición. Si la condición es verdadera, se ejecuta el bloque de código que sigue a la sentencia if. Si la
  condición es falsa, se ejecuta el bloque de código que sigue a la sentencia else.

```java

if(condicion){
        // Código a ejecutar si la condición es verdadera
        }else{
        // Código a ejecutar si la condición es falsa
        }

```

- **Sentencia switch**: La sentencia switch es una sentencia de control que permite evaluar una expresión y ejecutar un
  bloque de código dependiendo del valor de la expresión.

```java

switch(expresion){
        case valor1:
        // Código a ejecutar si la expresión es igual a valor1
        break;
        case valor2:
        // Código a ejecutar si la expresión es igual a valor2
        break;
default:
        // Código a ejecutar si la expresión no es igual a ninguno de los valores anteriores
        }

```

### Separador de sentencias

| Separador | Descripcion                                                                                                                                                                                                                                                                                       |
|-----------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| ;         | El separador de sentencias es el punto y coma (;).                                                                                                                                                                                                                                                |
| ,         | El separador de argumentos es la coma (,).                                                                                                                                                                                                                                                        |
| .         | El separador de miembros es el punto (.)                                                                                                                                                                                                                                                          |
| ()        | Se utilizan para contener condiciones en sentencias de flujo de control.<br>Contienen listas de parámetros, tanto en la definición de un método como en la llamada al mismo.<br>También se utilizan para modificar la precedencia en una expresión.<br>También para realizar conversiones de tipo |
| []        | Se utilizan para definir bloques de código, definir ámbitos<br>También para contener los valores iniciales de los arreglos.                                                                                                                                                                       |
| {}        | Se utiliza tanto para declarar arreglos o matrices como para referenciar valores dentro de los mismos.                                                                                                                                                                                            |