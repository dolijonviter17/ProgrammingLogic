package DataSturcturesAndAlgorithms;

public class App {
    public static void main(String[] args){
//        ArraySolution arrs = new ArraySolution(3);
//        arrs.insert(10);
//        arrs.insert(20);
//        arrs.insert(30);
//        arrs.insert(40);
//        System.out.println(arrs.indexOf(10));
//        arrs.print();

        int x = 5;
        int y = 5;
        int[] indexA = {1,2,3,4,5};
        for (int i = 0; i<indexA.length; i++){
            int countData = 1;
            for (int j = 0; j<indexA.length; j++){
                if (indexA[i] == indexA[j] && i != j){
                    countData += 1;
                }
                System.out.println(countData);

            }

        }





    }
}
