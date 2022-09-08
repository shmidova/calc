import java.util.function.BinaryOperator;

public class FirstProgram {
    public static void main(String[] args) {

        ifcalc(20, 6, '-');
        ifcalc(20, 6, '+');
        ifcalc(20, 6, '*');
        ifcalc(20, 6, '/');
        ifcalc(20, 6, '@');

        switchcalc(20, 6, '-');
        switchcalc(20, 6, '+');
        switchcalc(20, 6, '*');
        switchcalc(20, 6, '/');
        switchcalc(20, 6, '@');


    }


    public static void ifcalc(double paramA, double paramB, char operation) {
        if (operation == '+') {
            System.out.println(paramA + paramB);
        } else if (operation == '-') {
            System.out.println(paramA - paramB);
        } else if (operation == '*') {
            System.out.println(paramA * paramB);
        } else if (operation == '/') {
            System.out.println(paramA / paramB);

        } else {
            System.out.println("Incorrect operation");
        }
    }

    public static void switchcalc(double paramA, double paramB, char operation) {
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