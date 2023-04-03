package entities;

import entities.enums.TypeOperation;

public class Calculator {
   

    public static double calcular(double getNumber1, double getNumber2, TypeOperation typeOperation) {
        switch (typeOperation) {
            case ADDITION:
                return Operation.adicao(getNumber1, getNumber2);
            case SUBTRACTION:
                return Operation.subtracao(getNumber1, getNumber2);
            case DIVISION:
                return Operation.divisao(getNumber1, getNumber2);
            case MULTIPLICATION:
                return Operation.multiplicacao(getNumber1, getNumber2);
            default:
                throw new IllegalArgumentException("Error: Invalid operation. Only operations of addition (A), subtraction (S), multiplication (M) and division (D) are allowed.");
        }
    }

}
