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
        double result = 0;
        switch (operation) {
            case '+':
                result = paramA + paramB;
                break;
            case '-':
                result = paramA - paramB;
                break;
            case '*':
                result = paramA * paramB;
                break;
            case '/':
                result = paramA / paramB;
                break;
            default:
                System.out.println("Incorrect result");
        }

        System.out.println(result);

    }


}
