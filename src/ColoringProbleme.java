public class ColoringProbleme {

    private int numOfVertex;
    private int numOfColor;
    private int[] color;
    private int[][] adjancencyMatrix;

    public ColoringProbleme(int[][] adjancencyMatrix, int numOfColor) {
        this.numOfColor = numOfColor;
        this.adjancencyMatrix = adjancencyMatrix;
        this.numOfVertex = adjancencyMatrix.length;
        this.color = new int[numOfVertex];
    }

    public void solve(){
        if (solveProblem(0)){
            showResults();
        }else {
            System.out.println("No sollution...");
        }
    }

    private boolean solveProblem(int nodeIndex) {
        if (nodeIndex == numOfVertex) {
            return true;
        }
        for (int colorIndex=1; colorIndex<=numOfColor; colorIndex++){
            if (isColorValid(nodeIndex,colorIndex)){
                color[nodeIndex] = colorIndex;
                if (solveProblem(nodeIndex+1)){
                    return true;
                }

            }
        }
        return false;
    }

    private boolean isColorValid(int nodeIndex, int colorIndex) {
        for (int i=0; i<numOfVertex; i++){
            if (adjancencyMatrix[nodeIndex][i] == 1 && colorIndex == color[i] ){
                return false;
            }
        }
        return true;
    }

    private void showResults() {
        for (int i=0; i<numOfVertex; i++){
            System.out.println("Node "+(i+1)+" has color index: "+color[i]);
        }
    }
}
