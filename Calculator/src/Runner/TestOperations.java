package Runner;

import Data.OperationsCalculator;

import java.util.Scanner;

public class TestOperations {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        OperationsCalculator operationsCalculator = new OperationsCalculator();
        System.out.println("Digite el primer número");
        operationsCalculator.num1 = scan.nextFloat();
        System.out.println("Digite el segundo número");
        operationsCalculator.num2 = scan.nextFloat();

        Boolean options = true;
        while(options) {
            System.out.println("Elija la operación que desea realizar: ");
            System.out.println("Opción 1: sumar");
            System.out.println("Opción 2: restar");
            System.out.println("Opción 3: multiplicar");
            System.out.println("Opción 4: dividir");
            System.out.println("Opción 5: salir");
            int optionChoose = scan.nextInt();

            if(optionChoose == 1) {
                System.out.println(operationsCalculator.addOperation());
            } else if(optionChoose == 2){
                System.out.println(operationsCalculator.substractOperation());
            } else if(optionChoose == 3) {
                System.out.println(operationsCalculator.multiplyOperation());
            } else if(optionChoose == 4) {
                System.out.println(operationsCalculator.divideOperation());
            } else {
                options = false;
            }
        }
    }
}
