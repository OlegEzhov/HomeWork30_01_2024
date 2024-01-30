import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите значение 1: ");
        double var1 = scanner.nextDouble();
        boolean additionSumEven = Arithmetic.additionSumEven(var1);
        System.out.println("Sum Even: " + additionSumEven);
        System.out.println("..................");
        System.out.println("Введите значение 2: ");
        double var2 = scanner.nextDouble();
        boolean additionSumEven1 = Arithmetic.additionSumEven1(var2);
        System.out.println("..................................");
        System.out.println("Sum Even: " + additionSumEven1);
        Arithmetic arithmetic = new Arithmetic(var1, var2);
        System.out.println("Резульятат: " + arithmetic.addition());
        System.out.println("..................................");



        System.out.println("Введите значение 1: " );
        double subtraction1 = scanner.nextDouble();
        boolean subtractionSumEven = Arithmetic.subtractionSumEven(subtraction1);
        System.out.println("Sum Even: " + subtractionSumEven);
        System.out.println(".............................");
        System.out.println("Введите значение 2: " );
        double subtraction2 = scanner.nextDouble();
        boolean subtractionSumEven2 = Arithmetic.subtractionSumEven2(subtraction2);
        System.out.println("Sum Even: " + subtractionSumEven2);
        System.out.println("..................................");
        Arithmetic arithmetic1 = new Arithmetic(subtraction1,subtraction2);
        System.out.println("Резульятат: " + arithmetic1.subtraction());
        System.out.println("..................................");



        System.out.println("Введите значение 1: " );
        double multiplication1 = scanner.nextDouble();
        boolean multiplicationSumEven = Arithmetic.multiplicationSumEven(multiplication1);
        System.out.println("Sum Even: " + multiplicationSumEven);
        System.out.println("...............................");
        System.out.println("Введите значение 2: " );
        double multiplication2 = scanner.nextDouble();
        boolean multiplicationSumEven1 = Arithmetic.multiplicationSumEven1(multiplication2);
        System.out.println("Sum Even: " + multiplicationSumEven1);
        System.out.println("....................................");
        Arithmetic arithmetic2 = new Arithmetic(multiplication1,multiplication2);
        System.out.println(".....................................");
        System.out.println("Резульятат: " + arithmetic2.multiplication());
        System.out.println("..................................");





        System.out.println("Введите значение 1: " );
        double division1 = scanner.nextDouble();
        boolean divisionSumEven = Arithmetic.divisionSumEven(division1);
        System.out.println("Sum Even: " + divisionSumEven);
        System.out.println("...............................");
        System.out.println("Введите значение 2: " );
        double division2 = scanner.nextDouble();
        boolean divisionSumEven1 = Arithmetic.divisionSumEven1(division2);
        System.out.println("Sum Even: " + divisionSumEven1);
        System.out.println("...............................");
        Arithmetic arithmetic3 = new Arithmetic(division1,division2);
        System.out.println("Резульятат: " + arithmetic3.division());
        System.out.println("..................................");

    }


}
