package métodos;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        Mensagem mens = new Mensagem();
        Emprestimo emp = new Emprestimo();

        calc.somar(1, 2);
        calc.subtrair(2, 1);
        calc.multiplicar(2, 2);
        calc.dividir(10, 2);

        System.out.println();

        emp.calcular(1000, 3);

        System.out.println();

        mens.mensagem();

    }
}
