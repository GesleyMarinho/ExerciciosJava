package ValidadorCPF;

import java.util.ArrayList;
import java.util.List;

public class CPF {

    String cpf;
    String novoCPF;
    int primeiroDIV;
    int segundoDIV;


    public CPF() {
    }

    public String getNovoCPF() {
        return novoCPF;
    }

    public void setNovoCPF(String novoCPF) {
        this.novoCPF = novoCPF;
    }

    public int getPrimeiroDIV() {
        return primeiroDIV;
    }

    public void setPrimeiroDIV(int primeiroDIV) {
        this.primeiroDIV = primeiroDIV;
    }

    public int getSegundoDIV() {
        return segundoDIV;
    }

    public void setSegundoDIV(int segundoDIV) {
        this.segundoDIV = segundoDIV;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public static String removeUltimos2Digitos(String cpf) {
        String novoCPF;
        novoCPF = cpf.substring(0, cpf.length() - 2);
        return novoCPF;
    }

    public boolean contadorDigitos(String cpf) {
        int cont = cpf.length();

        if (cont < 11) {
            return false;
        } else {
            return true;
        }
    }

    public int multiplicadoresCPF(String cpf) {
        int cont1 = 0;

        for (int i = 0; i < cpf.length(); i++) {
            int multiplicador = 10 - i;
            int digito = Character.getNumericValue(cpf.charAt(i));
            int resultado = digito * multiplicador;
            cont1 += resultado;
        }

        return cont1;
    }

    public int calcularPrimeiroDigito(int soma) {

        int resto = soma % 11;

        if (resto == 0 || resto == 1) {
            setPrimeiroDIV(0);
        } else {
            setPrimeiroDIV((11 - resto) % 10);
        }
        System.out.printf("\nPrimeiro digito verificador " + getPrimeiroDIV());

        return getPrimeiroDIV();

    }

    public int calcularSegundoDiv(String cpf) {
        int cont2 = 0;
        for (int i = 0; i < cpf.length(); i++) {
            int multiplicador = 11 - i;
            int digito = Character.getNumericValue(cpf.charAt(i));
            cont2 += multiplicador * digito;
        }

        cont2 += getPrimeiroDIV() * 2; // Levar em consideração o primeiro dígito verificador

        int resto = cont2 % 11;

        if (resto == 0 || resto == 1) {
            setSegundoDIV(0);
        } else {
            setSegundoDIV((11 - resto) % 10);
        }

        System.out.printf("\nO segundo digito verificador é " + getSegundoDIV());

        return getSegundoDIV();
    }

    public boolean validadorDeCPF(int primeiroDIV, int segundoDIV,String cpf){

       int[] digitosCPF = new int[2];

       digitosCPF[0]= Character.getNumericValue(cpf.charAt(cpf.length()-2));
       digitosCPF[1] = Character.getNumericValue(cpf.charAt(cpf.length()-1));


       if(getPrimeiroDIV() == digitosCPF[0] && getSegundoDIV() == digitosCPF[1]){
           System.out.printf("\nCPF Válido ");
           return true;
       }else {
           System.out.printf("\nCPF Inválido ");
           return false;
       }



    }
}
