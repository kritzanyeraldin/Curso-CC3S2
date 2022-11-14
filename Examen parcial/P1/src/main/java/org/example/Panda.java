package org.example;
import java.util.function.*;
public class Panda {
    int age;    //edad
    public static void main(String[] args) {
        Panda p1 = new Panda();     //instancia p1
        p1.age = 1;                 //atributo age=1
        check(p1, p -> p.age < 5);  //se crea un expresion lambda la cual comprueba si age es menor a 5
    }
    private static void check(Panda panda,
                              Predicate<Panda> pred) {

        String result =
                pred.test(panda)?"match":"not match";//se hace uso del interfaz predicate el cual contiene un metodo test()
                                                    //retorna true si la entrada coincide con pred sno retorna false
        System.out.print(result);   //imprime el resultado
    } }