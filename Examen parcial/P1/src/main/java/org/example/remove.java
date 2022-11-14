package org.example;
import java.util.ArrayList;
import java.util.List;
public class remove {
    public void remove(List<Character> chars){
        char end='z';
        chars.removeIf(c->{
            char start ='a';

            return start <= c && c<=end;

        });
        System.out.print("fin:");
        if(chars.isEmpty()) System.out.println("vacio");
    }
    public static void main(String[] args){
        List<Character> chars= new ArrayList<>();
        chars.add('k');
        chars.add('r');
        chars.add('i');
        chars.add('t');
        chars.add('z');
        chars.add('a');
        chars.add('n');
        System.out.println("inicio: "+chars);
        remove r=new remove();
        r.remove(chars);
    }
}

