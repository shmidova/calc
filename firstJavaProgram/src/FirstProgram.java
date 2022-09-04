import java.util.function.BinaryOperator;

public class FirstProgram {
    public static void main(String[] args) {

        calc(20, 6,'-');
        calc(20, 6,'+');
        calc(20, 6,'*');
        calc(20, 6,'/');
        calc(20, 6,'@');
    }


    public static void calc(double paramA, double paramB, char operation) {
        if (operation =='+') {
            System.out.println(paramA + paramB);
        }
        else if (operation =='-') {
          System.out.println(paramA - paramB);
        }
        else if (operation == '*') {
            System.out.println(paramA * paramB);
        }
        else if (operation =='/'){
            System.out.println(paramA / paramB);

        }
        else  {
            System.out.println("Incorrect operation");
        }
    }


}
