package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import entities.Calculator;
import entities.enums.TypeOperation;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the first number:: ");
            double number1 = sc.nextDouble();

            System.out.println("Enter the second number: ");
            double number2 = sc.nextDouble();

            System.out.println(
                    "Enter the type of operation you want (ADDITION, SUBTRACTION, MULTIPLICATION or DIVISION): ");
            String tipoOperacao = sc.next().toUpperCase();

            TypeOperation operacao = TypeOperation.valueOf(tipoOperacao);

            double resultado = Calculator.calcular(number1, number2, operacao);

            System.out.println("Result: " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter numbers only.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("unexpected error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
