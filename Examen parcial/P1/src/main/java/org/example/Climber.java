package org.example;

interface Climb {
    boolean isTooHigh(int height, int limit);
}
/*
public class Climber{
    public static void main(String[] args){
        check((h,m)->h.append(m).isEmpty(),5);  //existe error, ya que check tiene como entrada(climb,int)
                                                      //ya que no se especifica el tipo de h
    }
    private static void check(Climb climb, int height){
        if(climb.isTooHigh(height,10)){
            System.out.println("too high");
        }
        else{
            System.out.println("ok");
        }
    }
}
*/