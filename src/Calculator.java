public class Calculator {
    public static int number1 = 10;
    public static int number2 = 5;
    public static int zero = 0;

    public static void main(String[] args) {
        Calculator.calc("add", number1, number2);
        Calculator.calc("minus", number1, number2);
        Calculator.calc("div", number1, number2);
        Calculator.calc("multiply", number1, number2);
        Calculator.calc("div", number1, zero);
    }

    public static void calc(String operation, int arg1, int arg2) {
        String result = arg1 + " " + operation + " " + arg2 + " = ";

        switch(operation) {
            case "add":
                System.out.println(result + (arg1 + arg2));
                break;
            case "minus":
                System.out.println(result + (arg1 - arg2));
                break;
            case "div":
                if (arg2 == 0) {
                    System.out.println("Error, you can't divide by 0");
                } else {
                    System.out.println(result + (arg1 / arg2));
                }
                break;
            case "multiply":
                System.out.println(result + (arg1 * arg2));
                break;
        }
    }
}
