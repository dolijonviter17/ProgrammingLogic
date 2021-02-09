public class QueensProblem {

    private int[][] chessTable;
    private int numsOfQueens;

    public QueensProblem(int numsOfQueens) {
        this.chessTable = new int[numsOfQueens][numsOfQueens];
        this.numsOfQueens = numsOfQueens;
    }

    public void solve(){
        if (setQueens(0)){
            printQueens();


        }else {
            System.out.println("there is no sollution..");
        }
    }

    private boolean setQueens(int colIndex){
        if (colIndex == numsOfQueens){
            return true;
        }
        for (int rowIndex=0; rowIndex<numsOfQueens; ++rowIndex){
            if (isPlaceValid(rowIndex, colIndex)){
                chessTable[rowIndex][colIndex] = 1;
                if (setQueens(colIndex+1)){
                    return true;
                }
                chessTable[rowIndex][colIndex] = 0;
            }
        }
        return false;
    }

    private void printQueens(){
        for (int i=0; i<chessTable.length; i++){
            for (int j=0; j<chessTable.length; j++){
                if (chessTable[i][j] == 1){
                    System.out.print(" * ");
                } else {
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }
    }

    private boolean isPlaceValid(int rowIndex, int colIndex) {
        for (int i=0; i<colIndex; i++)
            if( chessTable[rowIndex][i] == 1)
                return false;
        for (int i=rowIndex, j=colIndex; i>=0 && j>=0; i--, j--){
            if (chessTable[i][j] == 1){
                return false;
            }
        }
        for (int i=rowIndex, j=colIndex;  i<chessTable.length && j>=0; i++, j--  ){
            if (chessTable[i][j] == 1) {
                return false;
            }
        }
        return true;

    }
}
