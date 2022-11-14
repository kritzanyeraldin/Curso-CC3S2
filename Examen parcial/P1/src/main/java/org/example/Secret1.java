package org.example;

interface Secret{
    String magic(double d);


}



class Secret1 implements Secret{

    public String magic(double d) {
        return "poof";
    }

    public static void main(String args[]){
        Secret1 s=new Secret1();
        //System.out.print(s.magic(2));
        Secret a=(e)->{return "poof";};
        System.out.print(s.magic(12));

    }


}




