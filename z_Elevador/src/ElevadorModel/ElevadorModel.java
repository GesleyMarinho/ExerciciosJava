package ElevadorModel;

public class ElevadorModel {
    private Elevador elevador;

    public ElevadorModel() {
        this.elevador = new Elevador(0);
    }

    public Elevador getElevador() {
        return elevador;
    }

    public boolean qtPessoas() {
        return elevador.getPessoasPresentes() >= elevador.getCapacidadeMaxima();
    }

    public void entrarElevador(int pessoas) {
        if (elevador.getPessoasPresentes() + pessoas <= elevador.getCapacidadeMaxima()) {
            elevador.setPessoasPresentes(elevador.getPessoasPresentes() + pessoas);
        } else {
            System.out.println("Elevador cheio! Ninguém pode entrar.");
        }
    }

    public void sairElevador(int pessoas) {
        if (elevador.getPessoasPresentes() >= pessoas) {
            elevador.setPessoasPresentes(elevador.getPessoasPresentes() - pessoas);
        } else {
            System.out.println("Erro: Mais pessoas saindo do que presentes no elevador.");
        }
    }

    public boolean verificarAndar(int andar) {
        return andar >= 0 && andar <= elevador.getTotalAndares();
    }
}
