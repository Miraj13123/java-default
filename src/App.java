
package src;
import lib.*;


public class App {
    
    public static void printer()
    {
        System.out.println("This is printed from the function named \"printer\"");
    }

    public static void main(String[] args)
    {
        printer();
        try {
            Thread.sleep(5000); // Wait for 10 seconds (10000 milliseconds)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        console.clear();
        System.out.println("The line is cleared by calling a function from console class that was in lib folder. we imported the Whole lib by:\nimport lib.*;\nbut you could only import console class from lib:\nimport lib.console;");
    }

    
}


