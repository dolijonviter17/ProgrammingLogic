package Latihan;

public class Fpt {

    public void solve(int x, int y){
        int a, b, sisa;

        if (x > y){
            a = x;
            b = y;
        } else {
            a = y;
            b = x;
        }
        sisa = a % b;
        while (sisa != 0){
            a = b;
            b = sisa;
            sisa = a % b;
        }
        System.out.println("FTP "+b);
    }
}
