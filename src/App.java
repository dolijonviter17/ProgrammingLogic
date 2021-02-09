
public class App {
    public static void main(String[] args) {
//        TowerHanoi towerHanoi = new TowerHanoi();
//        towerHanoi.solveHanoi(3, 'A', 'B', 'C');

//        int[] nums = {1, 5, 4, 8, -2};
//        QuickSelect quickSelect = new QuickSelect(nums);
//        System.out.println(quickSelect.select(4));

//        QueensProblem queensProblem = new QueensProblem(5);
//        queensProblem.solve();

//        int[][] maxtrix = {
//                {0,1,0,1,0,1},
//                {1,0,1,1,0,1},
//                {0,1,0,1,0,1},
//                {1,1,0,1,0,1},
//                {0,1,1,1,0,1},
//                {0,1,0,1,1,1}
//        };
//        HamiltonianCycle hamiltonianCycle = new HamiltonianCycle(maxtrix);
//        hamiltonianCycle.solve();
//        int n = 4;
//        int result = 1;
//        for (int bil = 1; bil<=n; bil++){
//            result *= bil;
//        }
//        System.out.println(result);

        int[][] graph = new int[][]{
                {0,1,0,1,0},
                {1,0,1,1,0},
                {0,1,0,1,0},
                {1,1,1,0,1},
                {0,0,0,1,0}
        };
        int numColor = 4;

        ColoringProbleme coloringProbleme = new ColoringProbleme(graph, numColor);
        coloringProbleme.solve();

    }
}
