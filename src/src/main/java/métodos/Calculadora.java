package métodos;

public class Calculadora {

    public void somar(double n1, double n2){
        double som = n1 + n2;
        System.out.println("A soma de: " + n1 + "+" + n2 + " = " + som);
    }

    public void subtrair(double n1, double n2){
        double sub = n1 - n2;
        System.out.println("A subtração de: " + n1 + "-" + n2 + " = " + sub);
    }

    public void multiplicar(double n1, double n2){
        double mult = n1 * n2;
        System.out.println("A multiplicação de: " + n1 + "x" + n2 + " = " + mult);
    }

    public void dividir(double n1, double n2){
        double div = n1 / n2;
        System.out.println("A divisão de: " + n1 + "/" + n2 + " = " + div);
    }
}
