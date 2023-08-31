import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {

        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parametro: ");
        int limite = terminal.nextInt();
        System.out.println("Digite o segundo parametro: ");
        int base = terminal.nextInt();

        terminal.close();

        try {
            contar(limite, base);
        } catch (Exception e) {
            System.out.println("O segundo numero deve ser maior que o primeiro");
        }

    }

    static void contar(int limite, int base) {

        validar(limite, base);

        for (int contagem = base; contagem < limite; contagem++) {

            base++;
            System.out.println("Imprimindo o numero: " + base);
        }

    }

    static void validar(int limite, int base) throws ParametrosInvalidoException {

        if (limite < base) {

            throw new ParametrosInvalidoException();

        }

    }
}
