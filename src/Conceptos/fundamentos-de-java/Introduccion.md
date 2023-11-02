## Lenguaje Java

Java nace en 1991 con el nombre "OAK", posteriormente cambiado por Green por problemas legales, y finalmente con la
denominación actual JAVA.

El objetivo de java era crear un lenguaje de programación parecido a C++ en estructura y sintaxis, fuertemente orientado
a objetos, pero con una máquina virtual propia. Esto se hizo bajo el principio, de poder ser usado bajo cualquier
arquitectura "Write Once, Run Anywhere (escríbelo una vez, ejecútalo en cualquier sitio)".

### Versiones de Java

**a)** J2SE o simplemente Java SE: Java 2 Standard Edition o Java Standard Edition. Orientado al desarrollo de
aplicaciones
cliente / servidor. No incluye soporte a tecnologías para internet. Es la base para las otras distribuciones Java y es
la plataforma que utilizaremos nosotros en este curso por ser la más utilizada.

**b)** J2EE: Java 2 Enterprise Edition. Orientado a empresas y a la integración entre sistemas. Incluye soporte a
tecnologías para internet. Su base es J2SE.

**c)** J2ME: Java 2 Micro Edition. Orientado a pequeños dispositivos móviles (teléfonos, tabletas, etc.).

### Qué es JDK

El JDK es el Java Development Kit, que traducido al español es, Herramientas de desarrollo para Java, aquí nos
encontraremos con el compilador javac que es el encargado de convertir nuestro código fuente (.java) en bytecode (
.class), el cual posteriormente sera interpretado y ejecutado con la JVM, Java Virtual Machine por sus siglas en ingles,
que nuevamente al español es La Maquina Virtual de Java, también dentro de estas herramientas encontramos los siguientes
programas, javadoc(encargado de generar la documentación de nuestro código), el jvisualvm( muestra información a detalle
sobre las aplicaciones que están corriendo actualmente en la JVM), entre muchas otras.

### Qué es JVM

La máquina virtual de Java es un entorno de tiempo de ejecución que puede añadir en un navegador web o en cualquier
sistema operativo, como IBM. La máquina virtual Java ejecuta instrucciones generadas por un compilador Java. Consta de
un intérprete de bytecode y un entorno de tiempo de ejecución que permiten ejecutar los archivos de clase Java en
cualquier plataforma, sea cual sea la plataforma en la que se desarrollaron originariamente.

### Qué entornos de desarrollo existen para programar

1. **NetBeans**

   Inicialmente desarrollado por Sun y ahora en manos de Oracle, NetBeans es uno de los IDE para desarrollo Java más
   completos. NetBeans tiene una estructura modular fácilmente ampliable mediante complementos, existiendo
   configuraciones
   predefinidas para desarrollo Java SE, Java EE y también dirigidas a otros lenguajes de programación, como PHP o C++.

2. **Eclipse**

   Al igual que NetBeans, Eclipse también es un proyecto de código abierto y el IDE está disponible para múltiples
   sistemas
   operativos. Eclipse es un IDE no solo para Java, sino para muchos otros lenguajes y herramientas de desarrollo. Es
   considerado por muchos el IDE por excelencia, al incorporar un gran abanico de complementos que facilitan
   prácticamente
   todas las tareas relativas al desarrollo de software.

3. **IntelliJ IDEA:**

   IntelliJ IDEA es un IDE para Java desarrollado por la empresa JetBrains, estando disponible para Windows, OS X/MacOS
   y
   GNU/Linux. Como ocurre con NetBeans y Eclipse, también puede incorporar soporte para otros lenguajes de programación.
   A
   diferencia de ellos, sin embargo, no se trata de un proyecto totalmente basado en software libre, sino de un producto
   comercial. Existe, no obstante, una edición reducida denominada Community que puede obtenerse gratuitamente.

<div align="center">
<img src="../../img/java.png" height="100">
</div>