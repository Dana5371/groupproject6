package test.java.com.devxschool;

import main.java.com.devxschool.Factorial;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class FactorialTest {


    @Test
    public void calculateTest1(){
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Factorial.calculate(5);

        assertEquals( "Calculating factorial of number 5",
                out.toString().trim(), "Factorial result: 120");
    }

    @Test
    public void calculateTest2(){
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Factorial.calculate(4);

        assertEquals( "Calculating factorial of number 4",
                out.toString().trim(), "Factorial result: 24");
    }

    @Test
    public void calculateTest3(){
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Factorial.calculate(1);

        assertEquals( "Calculating factorial of number 1",
                out.toString().trim(), "Factorial result: 1");
    }
}
