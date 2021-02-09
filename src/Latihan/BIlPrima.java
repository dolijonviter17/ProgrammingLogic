package Latihan;

public class BIlPrima {

    public void solve(int n){

        boolean prima = true;

        for (int bil = 2; bil<= n/2; bil++){
            if (n % bil == 0){
                prima = false;
            }
        }

        if (prima){
            System.out.println(n+ " adalah Bilangan prima");
        } else {
            System.out.println(n+ " adalah bukan  Bilangan prima");
        }

    }
}
