public class LightBoard {
    private boolean [][] lights ; 
    public LightBoard (int rows , int cols) {
        lights  = new boolean[rows][cols]; 
        for (int r = 0 ; r<lights.length ;r++) {
            for (int c = 0 ; c<lights[0].length ;c++) {
                if (Math.random () <0.4) {
                    lights[r][c]=true;
                }          
              }
        }
    }
    public void setLight (boolean [][] arr) {
        lights=arr;
    }
    public boolean evaluateLight (int row , int col ) {
        int count = 0; 
        for (int i = 0 ; i<lights.length ; i++) {
            if (lights [i][col]==true ) {
                count++;
            }
        }
        if (lights[row][col]== true ) {
        if (count % 2 ==0) {
            return false;
        } 
    }
    if  (lights[row][col]== false) {
        if (count%3==0) {
            return true;
        } 
    }
    return lights [row][col];

    
    }
}