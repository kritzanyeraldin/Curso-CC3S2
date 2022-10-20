import static org.junit.jupiter.api.Assertions.*;

class Calculator1TestTest {
    Calculator1 calculator = new Calculator1();
    double result= calculator.add(10,50);
    assertEquals(60,result,0);

}