public class TowerHanoi {

    public void solveHanoi(int n, char rodFrom, char middleware, char rodTo){
        if (n == 1){
            System.out.println("Plate 1 from " + rodFrom + " to" + rodTo);
            return;
        }
        solveHanoi(n-1, rodFrom, rodTo, middleware);
        System.out.println("Plate " + n + " to " + rodFrom +" no "+ rodTo);
        solveHanoi(n-1, middleware, rodFrom, rodTo );
    }
}


