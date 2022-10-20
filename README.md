
## Prueba de entrada

#### Pregunta 1 
¿Cuál es la salida del siguiente programa?
```java
    class Canine {
    public Canine(boolean t) {
        logger.append("a");
    }

    public Canine() {
        logger.append("q");
    }

    private StringBuilder logger = new StringBuilder();

    protected void print(String v) {
        logger.append(v);
    }

    protected String view() {
        return logger.toString();
    }
}

class Fox extends Canine {
    public Fox(long x) {
        print("p");
    }

    public Fox(String name) {
        this(2);
        print("z");
    }
}

class Fennec extends Fox {
    public Fennec(int e) {
        super("tails");
        print("j");
    }

    public Fennec(short f) {
        super("eevee");
        print("m");
    }

    public static void main(String... unused) {
        System.out.println(new Fennec(1).view());
    }
}
```
<details>
  <summary>Respuesta</summary>

<ul>

```console
qpzj
```

<li>
En el main Se imprime Fennec(1).view(), la clase Fennec hereda de Fox y este de Canine, al hacer el llamado de Fennec(1).view llama al contructor de Fennec(int e) el cual inicializa el constructor de su clase padre Fox(string name) este a su vez incializa el constructor Fox(long x) y este incializa el constructor de su clase padre Canine() el cual agrega a logger "q" y se imprime usando el metodo view. Luego imprime p el cual esta dentro de constructor Fox(long x), seguido de z que se encuentra en el constructor que lo incializo Fox(long x) y finalmente imprime "j" el cual se encuentra en el contructor Fennec(int e).
</ul>
</details>

#### Pregunta 2 

¿Qué afirmación sobre el siguiente programa es correcta? Si encuentras un error (es) corrigelo y
presenta una respuesta correcta del código
```java
    class Bird {
    int feathers = 0;

    Bird(int x) {
        this.feathers = x;
    }

    Bird fly() {
        return new Bird(1);
    }
}

class Parrot extends Bird {
    protected Parrot(int y) {
        super(y);
    }

    protected Parrot fly() {
        return new Parrot(2);
    }
}

public class Macaw extends Parrot {
    public Macaw(int z) {
        super(z);
    }

    public Macaw fly() {
        return new Macaw(3);
    }

    public static void main(String... sing) {
        Bird p = new Macaw(4);
        System.out.print(((Parrot) p.fly()).feathers);
    }
}
```

<details>
  <summary>Respuesta</summary>

    El programa compila e imprime 3.
    No se realizo ningun cambio.
</details>

#### Pregunta 3 

¿Cuáles de las siguientes afirmaciones sobre la herencia son correctas?. Explica tu respuesta

a) Una clase puede extender directamente cualquier número de clases.
b) Una clase puede implementar cualquier número de interfaces.
c) Todas las variables heredan java.lang.Object.
d) Si la clase A se extiende por B, entonces B es una superclase de A.
e) Si la clase C implementa la interfaz D, entonces C es un subtipo de D.
f) La herencia múltiple es la propiedad de una clase de tener múltiples superclases directas.

<details>
  <summary>Respuesta</summary>
b) Una clase puede implementar cualquier número de interfaces.
Esta proposicion es correcta ya que en java una clase puede implementar varias interfaces pero no puede tener multiples clases padres.

e) Si la clase C implementa la interfaz D, entonces C es un subtipo de D.
Es correcta ya que C al implemetar D se convierte en un subtipo de D. 

</details>

#### Pregunta 4 

Completa los espacios en blanco que permiten que se compile el código.

```java
public class Howler {
public Howler(long shadow) {
        _________;
         }
private Howler(int moon) {
        super();
}
}
class Wolf extends Howler {
 protected Wolf(String stars) {
         super(2L);
         }
         public Wolf() {
        _________;
         }
 }
```

<details>
  <summary>Respuesta</summary>

```java
public class Howler {
public Howler(long shadow) {
        System.out.print("a");
        }
private Howler(int moon) {
        super();
}
}
class Wolf extends Howler {
 protected Wolf(String stars) {
         super(2L);
         }
         public Wolf() {
        super(3L);
         System.out.print("w");
         }
 }
```
Se agrego en el constructor Howler(long shadow) un print, tambien en el constructor Wolf() se agrego un super(3L) que inicializa el contrsutor de su clase padre Howler(long shadow) y tambien un print.
</details>

