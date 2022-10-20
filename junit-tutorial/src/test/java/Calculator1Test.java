import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Calculator1Test {
    private int nbErrors=0;
    public void testAdd(){
        Calculator1 calculator= new Calculator1();
        double result = calculator.add(10,50);
        if(result!=60){
            throw new IllegalStateException("Mal resultado: "+result);
        }
    }

    public static void main(String[] args){
        Calculator1Test test= new Calculator1Test();
        try{
            test.testAdd();
        }
        catch (Throwable e){
            test.nbErrors++;
            e.printStackTrace();
        }
        if (test.nbErrors>0){
            throw new IllegalStateException("Hay"+test.nbErrors+"error(s)");
        }
    }
}