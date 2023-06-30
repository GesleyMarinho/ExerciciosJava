package ValidadorCPF;

import java.util.Scanner;

/*
Desafio: Validador de CPF

Crie um programa que solicite ao usuário um CPF (Cadastro de Pessoa Física) e verifique se ele é válido.
O CPF é um número composto por 11 dígitos, sendo os dois últimos dígitos os dígitos verificadores.

Para validar o CPF, siga os seguintes passos:

Remova os dois últimos dígitos do CPF (dígitos verificadores).
Calcule o primeiro dígito verificador através do seguinte algoritmo:
Multiplique cada um dos nove primeiros dígitos do CPF pela sequência de multiplicadores 10, 9, 8, 7, 6, 5, 4, 3, 2.
Some os resultados obtidos.
Divida a soma por 11 e obtenha o resto.
Se o resto for igual a 0 ou 1, o primeiro dígito verificador deve ser 0. Caso contrário, subtraia o resto de 11 para obter o primeiro dígito verificador.
Calcule o segundo dígito verificador da mesma forma, porém considerando os dez primeiros dígitos do CPF (incluindo o primeiro dígito verificador calculado no passo anterior).
Verifique se os dígitos verificadores calculados são iguais aos dois últimos dígitos do CPF informado pelo usuário. Se forem iguais, o CPF é válido. Caso contrário, o CPF é inválido.
Exemplo:
Se o usuário informar o CPF 123.456.789-09, o programa deve verificar se ele é válido de acordo com os passos descritos acima.

Seu desafio é implementar o programa que valida um CPF informado pelo usuário.
Tente utilizar estruturas de controle de fluxo (como if/else) para verificar a validade do CPF e exibir o resultado na tela.

 */

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        CPF cpf = new CPF();

        boolean validaDigitos = false;

        while (!validaDigitos) {

            System.out.printf("Digite seu CPF: ");
            String inputCPF = (ler.next());

            if (!cpf.contadorDigitos(inputCPF)) {
                System.out.printf("CPF Inválido Digite novamente ");
            } else {
                cpf.setCpf(inputCPF);
                validaDigitos = true;
            }
        }

        System.out.printf("Remova os 2 últimos Digitos \n");
        cpf.setNovoCPF(CPF.removeUltimos2Digitos(cpf.getCpf()));

        System.out.printf("CPF com 9 Digitos:  " + cpf.getNovoCPF());

        int soma = cpf.multiplicadoresCPF(cpf.getNovoCPF());

        cpf.setPrimeiroDIV(cpf.calcularPrimeiroDigito(soma));
        cpf.setSegundoDIV(cpf.calcularSegundoDiv(cpf.getNovoCPF()));
        cpf.validadorDeCPF(cpf.getPrimeiroDIV(), cpf.getSegundoDIV(), cpf.getCpf());

    }
}
