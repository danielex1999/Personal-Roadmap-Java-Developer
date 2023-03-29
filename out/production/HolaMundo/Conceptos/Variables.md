## Variables

Las variables en Java pueden ser uno de los siguientes tipos:


- **Tipo primitivo**: Una variable de tipo primitivo contiene un solo valor del tamaño y formato apropiado de su tipo

    - Bolean: 
      - Un boolean expresa un valor de verdad, puede ser VERDADERO o FALSO
      - Para especificar un literal boolean, se usan las palabras clave true o false.
      Ambas escritas en minúsculas
    - Char:
      - Usa el código UNICODE y ocupa cada carácter 16 bits
      
        | Secuencia de escape | Símbolo |
        |--------------------| ------------- |
        | \b                 | Retroceso  |
        | \n                 | Nueva línea  |
        | \r                 |Retorno del carro|
        | \t                 |Tabulador|
        | \\\                |Diagonal invertida|
        | \\"                 |Comillas dobles|

    - Numeros enteros:
      - Son 4 tipos byte short int y long
      - Un entero es un número del conjunto Z = {..., -2, -1, 0, 1, 2, ...}.
      - Difieren en las precisiones y pueden ser positivos o negativos

  - Numeros reales:
      - Es un tipo dato para guardar números reales en coma flotante con precisión
        simple y doble
      - Los números de punto flotante (también conocidos como "flotantes",
        "dobles" o "números reales")


- **Tipo Referencia**: Los arreglos, las clases y las interfaces son del tipo referencia. El valor de una variable del tipo referencia es una dirección de un conjunto de valores representados por una variable.

---

### Reglas para definir nombres de variables

- Por convención, los nombres de las variables empiezan con
una letra minúscula


- Debe ser un juego de caracteres comprendido en la
codificación Unicode


- No puede ser el mismo que una palabra clave (reservadas del
lenguaje) o el nombre de un valor booleano (true or false)


- No deben tener el mismo nombre que otras variables cuyas
declaraciones aparezcan en el mismo ámbito.


- Si una variable está compuesta de más de una palabra, como
'nombreDato' las palabras se ponen juntas y cada palabra
después de la primera empieza con una letra mayúscula.


- Pueden comenzar por una letra, un subrayado o un símbolo
de dólar, siendo los siguientes caracteres letras o dígitos.