package Latihan;

public class CristmasTree {

    public void T1(int a, int b, int c){
        int  l = 0;
        for (int i = a; i<= b; i++){
            for (int j = c - l; j>a; j--){
                System.out.println(" ");
            }
            for (int k = 1; k <= i; k++){
                if (k == 1){
                    System.out.println(" /");
                } else if(k == i){
                    System.out.println(" \\");
                } else {
                    System.out.println(" ^");
                }
            }
            l++;
        }
    }

    public void T2(int n){
        for (int i = 0; i<=n; i++){
            System.out.println(" ");
        }
    }

    public void func_l(int n){
        for (int i = 0; i<=n; i++){
            T2(9);
            System.out.println("||||");
        }
    }

    public void solve(){
        T2(11);
        System.out.println("^");
        T1(3, 7, 11);
        T1(5, 11, 11);
        func_l(4);
    }
}
