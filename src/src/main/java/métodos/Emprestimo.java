package métodos;

public class Emprestimo {


    public double taxaDuasParcelas() {

        return 0.3;
    }

    public double taxaTresParcelas() {

        return 0.45;
    }

    public void calcular(double valor, int parcelas) {

        if (parcelas == 2) {

            double valorFinal = valor + (valor * taxaDuasParcelas());

            System.out.println("Valor final do empréstimo para 2 parcelas: R$ " + valorFinal);
        } else if (parcelas == 3) {

            double valorFinal = valor + (valor * taxaTresParcelas());

            System.out.println("Valor final do empréstimo para 3 parcelas: R$ " + valorFinal);
        } else {
            System.out.println("Quantidade de parcelas não aceita.");
        }

    }

}