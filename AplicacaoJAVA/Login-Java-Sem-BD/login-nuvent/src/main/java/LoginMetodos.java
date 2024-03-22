import java.util.List;

public class LoginMetodos {
    List<String> adicionarNaListaDeCadastro (List<String> listaDeCadastro) {
        listaDeCadastro.add("bruno.araujo@sptech.school");
        listaDeCadastro.add("12345");
        listaDeCadastro.add("fabricio.fagundes@sptech.school");
        listaDeCadastro.add("12345");
        listaDeCadastro.add("guilherme.siqueira@sptech.school");
        listaDeCadastro.add("12345");
        listaDeCadastro.add("lucas.mendes@sptech.school");
        listaDeCadastro.add("12345");
        listaDeCadastro.add("rafaela.scarabe@sptech.school");
        listaDeCadastro.add("12345");
        listaDeCadastro.add("thamires.campos@sptech.school");
        listaDeCadastro.add("12345");

        return listaDeCadastro;
    }

    Boolean emailExiste (List<String> listaDeCadastro, String emailDigitado) {
        Boolean resultadoEmail = false;

        for (int i = 0; i < listaDeCadastro.size(); i++) {
            if (i % 2 == 0) {
                if (listaDeCadastro.get(i).equalsIgnoreCase(emailDigitado)) {
                    resultadoEmail = true;
                }
            }
        }

        return resultadoEmail;
    }

    Boolean senhaExiste (List<String> listaDeCadastro, String senhaDigitado) {
        Boolean resultadoSenha = false;

        for (int i = 0; i < listaDeCadastro.size(); i++) {
            if (i % 2 != 0) {
                if (listaDeCadastro.get(i).equalsIgnoreCase(senhaDigitado)) {
                    resultadoSenha = true;
                }
            }
        }

        return resultadoSenha;
    }
}
