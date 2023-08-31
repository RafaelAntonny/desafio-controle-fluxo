import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {

        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parametro: ");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parametro: ");
        int parametroDois = terminal.nextInt();

        terminal.close();

        try {
            contar(parametroUm, parametroDois);
        } catch (Exception e) {
            System.out.println("O segundo numero deve ser maior que o primeiro");
        }

    }

    static void contar(int parametroUm, int parametroDois) {

        validar(parametroUm, parametroDois);

        for (int contagem = parametroDois; contagem < parametroUm; contagem++) {

            parametroDois++;
            System.out.println("Imprimindo o numero: " + parametroDois);
        }

    }

    static void validar(int parametroUm, int parametroDois) throws ParametrosInvalidoException {

        if (parametroUm < parametroDois) {

            throw new ParametrosInvalidoException();

        }

    }
}
