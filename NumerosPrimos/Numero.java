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

    public boolean Eprimo(int num) {

        int result = 0;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                result++;
                break;
            }
        }

        if (result == 0) {
            return true;
        } else {
            return false;
        }

    }
}
