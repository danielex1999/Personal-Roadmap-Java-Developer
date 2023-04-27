## Valor v/s referencia

### Paso de parámetros por valor

Lo primero que tenemos que ver es que para los datos primitivos en Java se realiza claramente una copia.

```java
public void metodo(int p){
        p=3;
        }

        int p1=2;
        metodo(p1);

        System.out.println(p1); //p1 = 2
```

### Paso de parámetros «por referencia»: referencia de objetos

Pero ahora pasemos a manejar un objeto como parámetro. Lo que sucede al manejar los objetos en Java es que las variables
mantienen una referencia al objeto, por lo tanto cuando pasamos un objeto como parámetro se está realizando una copia de
la referencia. Así tenemos dos variables diferentes apuntando al mismo objeto.

Creamos una clase básica llamada MiClase:

```java
public class MiClase {
    public int valor;
}
```

Y ahora un método que modifica ese valor:

```java
public static void metodo_referencia(MiClase m){
        m.valor=3;
        }
```

Veamos como se pasa por valor, aunque parece que hay una referencia:

```java
MiClase m1=new MiClase();
        m1.valor=2;
        System.out.println(m1.valor); // Devuelve 2
        metodo_referencia(m1);
        System.out.println(m1.valor); // Devuelve 3
```

Hemos instanciado con un valor de 2 el atributo de la clase y el método lo cambia a 3. Como la variable copia m en el
método sigue manteniendo la referencia al objeto original, se produce un cambio en dicho objeto. Por lo tanto es cuando
tenemos la sensación del paso por referencia de los objetos.

Es decir, que el paso por parámetros es por valor, aunque lo que se copia es una referencia. Es por ello que tenemos la
«falsa sensación» de que estamos pasando los parámetros por referencia, aunque realmente es por valor.