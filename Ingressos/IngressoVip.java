package Ingressos;

public class IngressoVip extends Ingresso {

    private double ingressoVip;

    public IngressoVip(double ingressoVip) {
        this.ingressoVip = ingressoVip;
    }

    public double getIngressoVip() {
        return ingressoVip;
    }

    public void setIngressoVip(double ingressoVip) {
        this.ingressoVip = ingressoVip;
    }

    public IngressoVip() {
        super();
    }

    public void ingressoVip(double i, double v) {

        System.out.println("Valor I "+ i);
        System.out.println("Valor V "+ v);

        setIngressoVip( i + (i * (v / 100)));
        System.out.println("O valor do Ingresso Vip é : " + getIngressoVip());
    }
}
