package TV;

public class controleRemoto {

    private final int aumentarVol;
    private final int diminuirVol;
    private int volume;
    private int canalDireto;
    private final int volumeMax;
    private final int volumeMin;

    public controleRemoto() {
        this.aumentarVol = 5;
        this.diminuirVol = 5;
        this.canalDireto = 0;
        this.volumeMax = 50;
        this.volumeMin = 0;
        this.volume = 10;
    }

    public void trocarCima() {
        setCanalDireto(getCanalDireto() + 1);
    }

    public void trocarBaixo() {
        setCanalDireto(getCanalDireto() - 1);
    }

    public void escolherCanal(int a) {

        setCanalDireto(a);
        System.out.println("O canal escolhido foi " + getCanalDireto());
    }

    public void canalAgora() {

        System.out.println("O canal é o " + getCanalDireto() + " e o VOLUME é " + getVolume());
    }

    public void diminuirVolume() {

        if (getVolume() > this.volumeMin) {
            System.out.println("Volume Abaixado");
            setVolume(getVolume() - getDiminuirVolume());
        } else if (getVolume() == volumeMin) {
            System.out.println("Volume já esta no Mínimo!!");
        }
    }

    public void aumentarVolume() {

        if (getVolume() < this.volumeMax) {

            System.out.println("Volume aumentado !!!");
            setVolume(getAumentarVolume() + getVolume());

        } else if (getVolume() == volumeMax) {
            System.out.println("Volume já está no Máximo !!!");
        }
    }

    public int getVolume() {

        return volume;
    }

    public void setVolume(int volume) {

        this.volume = volume;
    }

    public int getAumentarVolume() {

        return aumentarVol;
    }

    public int getDiminuirVolume() {
        return diminuirVol;
    }

    public int getCanalDireto() {
        return canalDireto;
    }

    public void setCanalDireto(int canalDireto) {
        this.canalDireto = canalDireto;
    }
}
