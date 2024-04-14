public class Validacao {
    /*
    Método de validação de CPF. Em essência, são usados os 2 últimos dígitos do CPF para determinar se um CPF
    é válido ou não.

    O algoritmo respeita a seguinte lógica: Dados os primeiros 9 dígitos do CPF, é feita uma soma deles junto
    de uma combinação de cada dígito de forma que, o inteiro C que multiplica ele irá varia de 10 a 2 pro primeiro
    dígito verificador e de 11 a 2 para o segundo dígito verificador, pela fórmula:

    Para o primiero dígito: sum(digito(n) * (11 - n), n:1 --> 9);

    Para o segundo dígito: sum(dígito(n) * (12 - n), n:1 --> 10);

    Após isso, divide-se o resultado dessa soma por 11 e se faz uma comparação usando o resto
    dessa divisão para determinar um dígito verificador( Observar no código ).
    
    Além disso, ele faz verificações se todos os dígitos são iguais e se os dígitos verificadores encontrados são
    iguais aos fornecidos pelo CPF predefinido
     */
    public static boolean validarCpf(Jogador jogador) {
        String mirror_cpf = jogador.getCpf();
        mirror_cpf = mirror_cpf.replaceAll("\\D","");
        char former = '0', latter = '0'; // Servirão para verificar se só há números repetidos
        int n_chars, multiplicador = 10, int_atual, soma1 = 0, soma2 = 0; // Ver documentação do método
        int verif1 = 0, verif2 = 0; // Variáveis para os dígitos verificadores encontrados
        n_chars = mirror_cpf.length();
        if (n_chars != 11) {
            return false;
        }
        for (int i = 0; i < (n_chars - 1); i++) {
            former = mirror_cpf.charAt(i);
            latter = mirror_cpf.charAt(i + 1);
            if (former != latter) {
                break;
            } 
        }
        if (former == latter) {
            return false;
        }
        for (int j = 0; j < 9; j++) {
            int_atual = (int)mirror_cpf.charAt(j);
            soma1 += int_atual * multiplicador;
            multiplicador--;
        }

        if (soma1 % 11 < 2) {
            verif1 = 0;
        } else if (soma1 % 11 > 2) {
            verif1 = 11 - (soma1 % 11);
        }

        multiplicador = 11;
        for (int k = 0; k < 10; k++) {
            int_atual = (int)mirror_cpf.charAt(k);
            soma2 += int_atual*multiplicador;
            multiplicador--;
        }

        if (soma2 % 11 < 2) {
            verif2 = 0;
        } else if (soma2 % 11 > 2) {
            verif2 = 11 - (soma2 % 11);
        }

        if ((verif1 == (int)mirror_cpf.charAt(9)) && (verif2 == (int)mirror_cpf.charAt(10))) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean validarEmail(Jogador jogador) {
        String mirror_email = jogador.getEmail();;
        int arroba = mirror_email.indexOf(('@')), ultimo_ponto = mirror_email.lastIndexOf('.');
        int arroba_counter = 0; // Será usado para verificar se de fato só há 1 arroba no email.
        if (mirror_email.length() == 0) {
            return false;
        }

        // Verificando se não há nenhum arroba ou ponto no email.
        if (arroba == -1 || ultimo_ponto == 1) {
            return false;
        }

        // Verificando se há um ponto imediatamente depois do arroba.
        if (ultimo_ponto - arroba == 1) {
            return false;
        }

        // Verificando se não há pontos consecutivos.
        for (int i = 0; i < mirror_email.length() - 1; i++) {
            if (mirror_email.charAt(i) == '.' && mirror_email.charAt(i + 1) == '.') {
                return false;
            }
        }

        // Verificando se há apenas um arroba
        for (int i = 0; i < mirror_email.length(); i++) {
            if (mirror_email.charAt(i) == '@') {
                arroba_counter++;
            }
        }
        if (arroba_counter > 1) {
            return false;
        }
        // Verificando se o último caracter não é um ponto.
        if (mirror_email.charAt(mirror_email.length() - 1) == '.') {
            return false;
        }
        return true;
    }
}




    

