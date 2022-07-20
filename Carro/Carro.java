public class Carro {
    String marca ; // Marca do carro
    double velocidadeMax ; // velocidade máxima em que o carro pode chegar
    boolean ligado ; // saber se o carro está ligado;
    double velocidade ; // qual é a velocidade do carro

    void status(){
        System.out.println("============================================================================");
        System.out.println("Meu carro é da Marca " + this.marca ) ;
        System.out.println("Este carro pode atingir a velocidade de " + this.velocidadeMax + " KM/H no Máximo" );
        System.out.println("Este CARRO está ligado ? : " + this.ligado);
        System.out.println("A velocidade do CARRO nesse momento é de : " + this.velocidade);
        System.out.println("============================================================================");
    }

    void carroDesligado (){
        if(this.velocidade > 0){
            System.out.println("Você não pode desligar um CARRO em Movimento !!!!");
        }else {
            this.ligado = false;
            System.out.println("ATENÇÃO !!! Seu carro está DESLIGADO, favor ligar antes para poder andar ");
        }
    }
    void carroLigado (){
        this.ligado = true ;
        System.out.println("OK ! você pode andar com o carro ");
    }

    void acelerarCarro2 (int valor2 ) {

        if (this.ligado) {
            if (this.velocidade < 160){
                this.velocidade += valor2;
                System.out.println("A velocidade do seu carro é de : " + this.velocidade + " KM/H.");
            }
            else if(this.velocidade == this.velocidadeMax) {
                System.out.println("ALERTA !!! você está na velocidade máxima do seu carro" + this.velocidadeMax + " KM/H");
            }

        }else {
            System.out.println("ATENÇÃO !!! seu carro está DESLIGADO !!! ");
        }
    }

    void carroDesacelerar (int valor2){
        if(this.ligado == false){

            System.out.println("O seu CARRO está DESLIGADO!!! você não pode desacelerar ele. ");
        }
        else if (this.velocidade == 0){
            System.out.println("A velocidade do seu CARRO é : "+ this.velocidade + " KM/H.");
        }else{
            this.velocidade -= valor2;
            System.out.println("A velocidade do seu CARRO foi reduzido, sua velocidade agora é de : "+ this.velocidade + " KM/H.");
        }
    }
    public String acelerarCarro (int valor ) {

        if (this.ligado) {
            this.velocidade += valor;
            return  "A velocidade do seu carro é de : " + this.velocidade + " KM/H." ;
        }
        return this.marca + "Atenção seu carro está desligado !!! " ;
    }

}
