package TarefasModel;

import java.util.Date;

public class Tarefa {
    private String descricao;
    private boolean concluido;


    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.concluido = false;

    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isConcluido() {
        return concluido;
    }

    public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }

}
