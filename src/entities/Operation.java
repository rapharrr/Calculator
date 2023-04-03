package entities;

public class Operation {
    private Double number1;
    private Double number2;

    public Operation() {

    }

    public Operation(Double number1, Double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public Double getNumber1() {
        return number1;
    }

    public void setNumber1(Double number1) {
        this.number1 = number1;
    }

    public Double getNumber2() {
        return number2;
    }

    public void setNumber2(Double number2) {
        this.number2 = number2;
    }

    public static double adicao(double numero1, double numero2) {
        return numero1 + numero2;
    }

    public static double subtracao(double numero1, double numero2) {
        return numero1 - numero2;
    }

    public static double multiplicacao(double numero1, double numero2) {
        return numero1 * numero2;
    }

    public static double divisao(double numero1, double numero2) {
        return numero1 / numero2;
    }

}
