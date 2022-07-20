package PraticaVideo;

public class Gafanhoto extends Pessoa{

    private String login;
    private int toAssistindo;



    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getToAssistindo() {
        return toAssistindo;
    }

    public void setToAssistindo(int toAssistindo) {
        this.toAssistindo = toAssistindo;
    }

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.toAssistindo = 0;
    }


    public void viuMaisUm(){

    }

    @Override
    public String toString() {
        return "Gafanhoto{" +
                "login='" + login + '\'' +
                ", toAssistindo=" + toAssistindo +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                ", experiencia=" + experiencia +
                '}';
    }
}
