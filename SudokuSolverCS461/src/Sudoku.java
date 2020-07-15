public class Sudoku {
    static int userGrid[][]=new int[][]
           {{8,0,0,0,5,0,0,0,0},
            {0,2,0,0,0,0,0,0,0},
            {0,0,0,0,4,1,0,0,0},
            {0,0,0,0,2,0,0,0,0},
            {0,0,1,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,9,0},
            {0,0,0,0,0,0,0,0,0}};//[horizontal][vertical]
        static int grid[][]=new int[9][9];//grid that will be solved at the end.
    public static void main(String[] args) 
    {
        for (int i=0;i<9;i++) 
        {
            for (int j=0;j<9;j++) 
            {
                grid[i][j]=userGrid[i][j];
            }
        }
        print(grid);
        print(loop(0, 0, grid));
       
       
    }
    public static int[][] loop(int y, int x, int[][] grid) 
    {
        while(!checker(8, 8, grid) || grid[8][8]==0)//while not solved
        {
            if (userGrid[y][x]!=0) 
            {
                int yy, xx;
                if (x==8) {yy=y+1; xx=0;} else {yy=y; xx=x+1;}
                loop(yy, xx, grid);
            } 
            else 
            {
                if (grid[y][x]<9) 
                {					//going forward
                    grid[y][x]++;
                    if (checker(y, x, grid)) 
                    {
                        int yy, xx;
                        if (x==8) {yy=y+1; xx=0;} else {yy=y; xx=x+1;}
                        loop(yy, xx, grid);
                    }
                } else {
                    grid[y][x]=0;
                    break;
                }
            }
        }
        return grid;
    }
    public static boolean checker(int x, int y, int[][] grid) { //checker to see if there are duplicate numbers in the row or column
        String temp="";
        for (int i=0;i<9;i++) {
            temp+=Integer.toString(grid[i][y]);//checks horizontally  for duplicate numbers 
            temp+=Integer.toString(grid[x][i]);//checks vertically for duplicate numbers 
            temp+=Integer.toString(grid[(x/3)*3+i/3][(y/3)*3+i%3]);//square
        }
        int count=0, idx=0;
        while ((idx=temp.indexOf(Integer.toString(grid[x][y]), idx))!=-1)
        {idx++; count++;}
        return count==3;
    }
    public static void print(int[][] grid) {
        System.out.println();
        for (int i=0;i<9;i++) {
            for (int j=0;j<9;j++) {
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
    }
}