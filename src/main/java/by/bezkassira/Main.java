package by.bezkassira;


public class Main {
    public static void main(String[] args) {
        practiceMathOperators();
        System.out.println();
        practiceLogicalOperators();
        System.out.println();
        practiceOverflow();
        System.out.println();
        practiceCombination();
    }

    public static void practiceMathOperators() {
        int a = 5;
        int b = 2;

        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;

        System.out.println("Математические операции:");
        System.out.println("Сумма: " + sum);
        System.out.println("Разность: " + difference);
        System.out.println("Произведение: " + product);
        System.out.println("Частное: " + quotient);
        System.out.println("Остаток от деления: " + remainder);
    }

    public static void practiceLogicalOperators() {
        int a = 5;
        int b = 3;

        boolean equalTo = (a == b);
        boolean notEqualTo = (a != b);
        boolean greaterThan = (a > b);
        boolean lessThan = (a < b);
        boolean greaterOrEqual = (a >= b);
        boolean lessOrEqual = (a <= b);

        System.out.println("Логические операции:");
        System.out.println("Равно: " + equalTo);
        System.out.println("Не равно: " + notEqualTo);
        System.out.println("Больше: " + greaterThan);
        System.out.println("Меньше: " + lessThan);
        System.out.println("Больше или равно: " + greaterOrEqual);
        System.out.println("Меньше или равно: " + lessOrEqual);
    }

    public static void practiceOverflow() {
        int maxInt = Integer.MAX_VALUE;
        int sum = maxInt + 1;
        byte firstByte = 127;
        byte secondByte = 1;
        byte sumByte = (byte) (firstByte + secondByte);

        System.out.println("Переполнение:");
        System.out.println("Переполнение MAX_VALUE: " + sum);
        System.out.println("Переполнение Byte: " + sumByte);
    }

    public static void practiceCombination() {
        int a = 5;
        double b = 2.5;

        double sumDouble = a + b;
        double differenceDouble = a - b;
        double productDouble = a * b;
        double quotientDouble = a / b;

        int sumInt = (int) (a + b);
        int differenceInt = (int) (a - b);
        int productInt = (int) (a * b);
        int quotientInt = (int) (a / b);

        System.out.println("Выполнение операций между int и double приведенные к double");
        System.out.println("Сумма: " + sumDouble);
        System.out.println("Разность: " + differenceDouble);
        System.out.println("Произведение: " + productDouble);
        System.out.println("Частное: " + quotientDouble);
        System.out.println("Выполнение операций между int и double приведенные к int");
        System.out.println("Сумма: " + sumInt);
        System.out.println("Разность: " + differenceInt);
        System.out.println("Произведение: " + productInt);
        System.out.println("Частное: " + quotientInt);
    }
}