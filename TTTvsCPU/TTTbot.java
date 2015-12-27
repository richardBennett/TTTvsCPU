package TTTvsCPU;

import java.util.Random;

public class TTTbot 
{
    int difficulty;
    Random random = new Random();
    boolean firstMove = true;
    
    public TTTbot() {}
    
    public void setDifficulty(int diff) {
        difficulty = diff;
        firstMove = true;
        System.out.println("Difficulty set to " + diff);
    }
    
    public int[] makeMove(int[][] board) {
        switch(difficulty){
            case 0: return easyMove(board);
            case 1: return medMove(board);
            case 2: return hardMove(board);
            case 3: return impMove(board);
            default: return hardMove(board);
        }
    }
    
    private boolean viableMove(int[] move, int[][] board) {
        boolean goodMove = false;
        if(move[0] == -1) return goodMove;
        int row = move[0];
        int col = move[1];
        if(board[row][col] == 0) goodMove = true;
        return goodMove;
    }
    
    public int[] randomMove(int[][] board) {
        System.out.println("Choosing Random Move");
        int[] randomMove = new int[2];
        boolean foundMove = false;
        while(!foundMove) {
            randomMove[0] = random.nextInt(3);
            randomMove[1] = random.nextInt(3);
            foundMove = viableMove(randomMove, board);
        }    
        return randomMove;
    }
    
    public int[] rowWin(int[][] board) {
        int[] rowWin = new int[2];
        rowWin[0] = -1;
        
        for(int i = 0; i < 3; i++) {
            if(board[i][0] + board[i][1] + board[i][2] == -2) {
                for(int j = 0; j < 3; j++) {
                    if(board[i][j] == 0) {
                        rowWin[0] = i;
                        rowWin[1] = j;
                        System.out.println("A row win acquired");
                        return rowWin;
                    }
                }
            }
        }
        return rowWin;
    }
    
    public int[] colWin(int[][] board) {
        int[] colWin = new int[2];
        colWin[0] = -1;
       
        for(int i = 0; i < 3; i++) {
            if(board[0][i] + board[1][i] + board[2][i] == -2) {
                for(int j = 0; j < 3; j++) {
                    if(board[j][i] == 0) {
                        colWin[0] = j;
                        colWin[1] = i;
                        System.out.println("A col win acquired");
                        return colWin;
                    }
                }
            }
        }
        return colWin;
    }
    
    public int[] rowBlock(int[][] board) {
        int[] rowBlock = new int[2];
        rowBlock[0] = -1;
        
        for(int i = 0; i < 3; i++) {
            if(board[i][0] + board[i][1] + board[i][2] == 2) {
                for(int j = 0; j < 3; j++) {
                    if(board[i][j] == 0) {
                        rowBlock[0] = i;
                        rowBlock[1] = j;
                        System.out.println("A row block acquired");
                        return rowBlock;
                    }
                }
            }
        }
        return rowBlock;           
    }
    
    public int[] colBlock(int[][] board) {
        int[] colBlock = new int[2];
        colBlock[0] = -1;
        
        for(int i = 0; i < 3; i++) {
            if(board[0][i] + board[1][i] + board[2][i] == 2) {
                for(int j = 0; j < 3; j++) {
                    if(board[j][i] == 0) {
                        colBlock[0] = j;
                        colBlock[1] = i;
                        System.out.println("A col block acquired");
                        return colBlock;
                    }
                }
            }
        }
        return colBlock;           
    }
    
    public int[] udWin(int[][] board) {
        int[] udWin = new int[2];
        udWin[0] = -1;
        
        int a = board[2][0];
        int b = board[1][1];
        int c = board[0][2];
        
        if(a + b + c == -2) {
            System.out.println(" Up Diagonal Win acquired.");
            if(a == 0) {
                udWin[0] = 2;
                udWin[1] = 0;
            } else if (b == 0) {
                udWin[0] = 1;
                udWin[1] = 1;
            } else {
                udWin[0] = 0;
                udWin[1] = 2;
            }
            return udWin;
        }     
        return udWin;
    }
    
    public int[] ddWin(int[][] board) {
        int[] ddWin = new int[2];
        ddWin[0] = -1;
        
        int a = board[0][0];
        int b = board[1][1];
        int c = board[2][2];
        
        if(a + b + c == -2) {
            System.out.println(" Down Diagonal Win acquired.");
            if(a == 0) {
                ddWin[0] = 0;
                ddWin[1] = 0;
            } else if (b == 0) {
                ddWin[0] = 1;
                ddWin[1] = 1;
            } else {
                ddWin[0] = 2;
                ddWin[1] = 2;
            }
            return ddWin;
        }     
        return ddWin;
    }
    
    public int[] udBlock(int[][] board) {
        int[] udBlock = new int[2];
        udBlock[0] = -1;
        
        int a = board[2][0];
        int b = board[1][1];
        int c = board[0][2];
        
        if(a + b + c == 2) {
            System.out.println(" Up Diagonal Block acquired.");
            if(a == 0) {
                udBlock[0] = 2;
                udBlock[1] = 0;
            } else if (b == 0) {
                udBlock[0] = 1;
                udBlock[1] = 1;
            } else {
                udBlock[0] = 0;
                udBlock[1] = 2;
            }
            return udBlock;
        }     
        return udBlock;
    }
    
    public int[] ddBlock(int[][] board) {
        int[] ddBlock = new int[2];
        ddBlock[0] = -1;
        
        int a = board[0][0];
        int b = board[1][1];
        int c = board[2][2];
        
        if(a + b + c == 2) {
            System.out.println(" Down Diagonal Block acquired.");
            if(a == 0) {
                ddBlock[0] = 0;
                ddBlock[1] = 0;
            } else if (b == 0) {
                ddBlock[0] = 1;
                ddBlock[1] = 1;
            } else {
                ddBlock[0] = 2;
                ddBlock[1] = 2;
            }
            return ddBlock;
        }     
        return ddBlock;
    }
    
    public int[] centerBlock(int[][] board) {
        int[]centerBlock = new int[2];
        centerBlock[0] = -1;
        
        int a = board[0][0];
        int b = board[2][0];
        int c = board[0][2];
        int d = board[2][2];
        if(a + b + c + d > 0) {
            System.out.println("A center block was needed.");
            centerBlock[0] = 1;
            centerBlock[1] = 1;
            return centerBlock;
        }
        return centerBlock;
    }
    
    public int[] ifCenterFirst(int[][] board) {
        int[] centerMove = new int[2];
        centerMove[0] = -1;
        if(firstMove && board[1][1] == 1) {
            System.out.println("Center move detected.");
            centerMove[0] = random.nextInt(2);
            if(centerMove[0] == 1) centerMove[0] = 2;
            centerMove[1] = random.nextInt(2);
            if(centerMove[1] == 1) centerMove[1] = 2;
            return centerMove;
        }
        firstMove = false;
        return centerMove;
    }
   
    public int[] easyMove(int[][] board) {
        System.out.println("making easy move");
        return randomMove(board);
    }
    
    public int[] medMove(int[][] board) {
        System.out.println("making medium move");
        int[] medMove;
        
        medMove = rowWin(board);
        if(viableMove(medMove, board)) return medMove;
        
        medMove = colWin(board);
        if(viableMove(medMove, board)) return medMove;
        
        medMove = rowBlock(board);
        if(viableMove(medMove, board)) return medMove;
        
        medMove = colBlock(board);
        if(viableMove(medMove, board)) return medMove;
        
        medMove = randomMove(board);
        return medMove;
    }    
    
    public int[] hardMove(int[][] board) {
        System.out.println("making medium move");
        int[] hardMove;
        
        hardMove = rowWin(board);
        if(viableMove(hardMove, board)) return hardMove;
        
        hardMove = colWin(board);
        if(viableMove(hardMove, board)) return hardMove;
        
        hardMove = udWin(board);
        if(viableMove(hardMove, board)) return hardMove;
        
        hardMove = ddWin(board);
        if(viableMove(hardMove, board)) return hardMove;
        
        hardMove = rowBlock(board);
        if(viableMove(hardMove, board)) return hardMove;
        
        hardMove = colBlock(board);
        if(viableMove(hardMove, board)) return hardMove;
        
        hardMove = udBlock(board);
        if(viableMove(hardMove, board)) return hardMove;
        
        hardMove = ddBlock(board);
        if(viableMove(hardMove, board)) return hardMove;
        
        hardMove = centerBlock(board);
        if(viableMove(hardMove, board)) return hardMove;
               
        hardMove = randomMove(board);
        return hardMove;
    }
    
    public int[] impMove(int[][] board) {
        System.out.println("making Impossible move");
        int[] impMove;
        impMove = ifCenterFirst(board);
        if(viableMove(impMove, board)) return impMove;
        
        impMove = hardMove(board);
        return impMove;
    }
}
