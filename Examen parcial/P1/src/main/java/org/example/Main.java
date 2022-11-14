package org.example;
import java.util.function.Supplier;
public class Main{
    public void main(String[] args){
        int length=3;
        for(int i=0;i<3;i++){
            if(i%2==0){
                Supplier<Integer> supplier=()->length;  //escribe sobre el metodo get que retorne length
                System.out.println(supplier.get());     //imprime length
            }else{
                //int j=i;
                int finalI = i;
                Supplier<Integer>supplier=()-> finalI;        //escribe sobre el metodo get que retorne j
                System.out.println((supplier.get()));   //imprime j
            }
        };
    }
}