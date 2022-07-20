package TV;

public class controleRemoto {

    private int aumentarVol;
    private int diminuirVol;
    private int volume;
    private int trocarCanalCima;
    private int trocarCanalBaixo;
    private int canalDireto;
    private final int volumeMax;
    private final int volumeMin;

    public controleRemoto() {
        this.aumentarVol = 5;
        this.diminuirVol = 5;
        this.trocarCanalCima = trocarCanalCima;
        this.trocarCanalBaixo = trocarCanalBaixo;
        this.canalDireto = canalDireto;
        this.volumeMax = 50;
        this.volumeMin = 0;
        this.volume = 10;
    }

    public void escolherCanal(int a){

        setCanalDireto(a);
        System.out.println("O canal escolhido foi " + getCanalDireto());
    }

    public void canalAgora(){
        System.out.println("O canal é o " + getCanalDireto());
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

    public void consultaVolume() {
        System.out.println("O volume está no " + getVolume());
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

    public void setAumentarVolume(int aumentarVolume) {
        this.aumentarVol = aumentarVolume;
    }

    public int getDiminuirVolume() {
        return diminuirVol;
    }

    public void setDiminuirVolume(int diminuirVolume) {
        this.diminuirVol = diminuirVolume;
    }

    public int getTrocarCanalCima() {
        return trocarCanalCima;
    }

    public void setTrocarCanalCima(int trocarCanalCima) {
        this.trocarCanalCima = trocarCanalCima;
    }

    public int getTrocarCanalBaixo() {
        return trocarCanalBaixo;
    }

    public void setTrocarCanalBaixo(int trocarCanalBaixo) {
        this.trocarCanalBaixo = trocarCanalBaixo;
    }

    public int getCanalDireto() {
        return canalDireto;
    }

    public void setCanalDireto(int canalDireto) {
        this.canalDireto = canalDireto;
    }
}
