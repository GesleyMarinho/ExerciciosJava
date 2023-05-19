package NumerosPrimos;

public class Numero {
    int num;

    public Numero() {

    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void calculeNumerosPrimos(int num) {
        /*//  int a = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {

            }
            System.out.printf(" Número Primo : " + num);
        }*/

        for (int i = 2; i <= num; i++) {
            boolean primo = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                System.out.print(i + " ");
            }

        }
    }
}
