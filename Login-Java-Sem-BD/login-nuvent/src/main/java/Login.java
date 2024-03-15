import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        LoginMetodos loginMetodos = new LoginMetodos();
        Scanner leitor = new Scanner(System.in);
        List<String> listaDeCadastro = new ArrayList<>();

        loginMetodos.adicionarNaListaDeCadastro(listaDeCadastro);

        Boolean emailResultado;
        Boolean senhaResultado;

        do {
            System.out.println("E-mail:");
            String emailDigitado = leitor.nextLine();
            System.out.println("Senha:");
            String senhaDigitada = leitor.nextLine();

            emailResultado = loginMetodos.emailExiste(listaDeCadastro, emailDigitado);
            senhaResultado = loginMetodos.senhaExiste(listaDeCadastro, senhaDigitada);

            if (emailResultado && senhaResultado) {
                System.out.println("Login realizado com sucesso!");
            } else {
                System.out.println("E-mail ou senha incorretos. Por favor, tente novamente.");
            }
        } while (!emailResultado || !senhaResultado);
    }
}
