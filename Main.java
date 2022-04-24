import java.util.Scanner;
class Main {
  public static void main(String[] args) {
        Scanner lmaohaha = new Scanner(System.in);
        String[][] board= new String[3][3];
            for(int y = 0; y < board.length; y++){
        for(int x = 0; x < board.length; x++){
            
            board[x][y] = " _ ";
        }
        }
        System.out.println("Welcome to tictactoe lol ");
        for(int x = 0; x < board.length; x++){
            System.out.println(" ");
            for(int y = 0; y < board.length; y++){
        
                System.out.print(board[x][y]);
            }
        }
        boolean wincon = false;
        boolean isxturn = true;
        while(wincon == false){
        if(isxturn == true){
            System.out.println(" ");
            System.out.println("it is x turn");
            System.out.println("where do you want to play your x and y cords (ONE AT A TIME)");
            int xplacecordx = lmaohaha.nextInt();
            int xplacecordy = lmaohaha.nextInt();
            if(board[xplacecordx][xplacecordy] != " _ "){
                System.out.println("SPACE FILED ALREADY");
                for(int x = 0; x < board.length; x++){
                    System.out.println(" ");
                    for(int y = 0; y < board.length; y++){
                
                        System.out.print(board[x][y]);
                        
                    }
                }
        }else{
            
                board[xplacecordx][xplacecordy] = " x ";
                for(int x = 0; x < board.length; x++){
                    System.out.println(" ");
                    for(int y = 0; y < board.length; y++){
                
                        System.out.print(board[x][y]);
                        isxturn = false; 
                    }
                }
            }
            for(int i = 0; i< 3; i++){
                if(board[i][0] == " x " && board[i][1] == " x " && board[i][2] == " x "  ){
                    wincon = true;
                    isxturn = true;
                    System.out.println("YOU WON OMG");

                }
            }
                for(int o = 0; o< 3; o++){
                    if(board[0][o] == " x " && board[1][o] == " x " && board[2][o] == " x "  ){
                        wincon = true;
                        isxturn = true;
                        System.out.println("YOU WON OMG");

                    }
                }
                if(board[0][0] == " x " && board[1][1] == " x " && board[2][2] == " x "){
                    wincon = true;
                    isxturn = true;
                    System.out.println("X WON");
                }else if(board[2][0] == " x " && board[1][1] == " x " && board[0][2] == " x "){

                    wincon = true;
                    isxturn = true;
                    System.out.println("X WON");
                }
                int ryanisbadlol = 0;
                for(int x = 0; x < board.length; x++){
                    System.out.println(" ");
                    for(int y = 0; y < board.length; y++){
                
                        if(board[x][y] != " _ "){
                            
                            ryanisbadlol++;


                        }
                        
                    }

                }
                if(ryanisbadlol == 9){
                    wincon = true;
                    System.out.println("ITS A TIE");

                }
    
            
    
    
            }if(isxturn == false){
                System.out.println(" ");
                System.out.println("it is o turn");
            System.out.println("where do you want to play your x and y cords (0 1 2) (ONE AT A TIME)");
            int oplacecordx = lmaohaha.nextInt();
            int oplacecordy = lmaohaha.nextInt();
            if(board[oplacecordx][oplacecordy] != " _ "){
                    System.out.println("SPACE FILED ALREADY");
                    for(int x = 0; x < board.length; x++){
                        System.out.println(" ");
                        for(int y = 0; y < board.length; y++){
                    
                            System.out.print(board[x][y]);
                            
                        }
                    }
            }else{
                 board[oplacecordx][oplacecordy] = " o ";
                 for(int x = 0; x < board.length; x++){
                    System.out.println(" ");
                    for(int y = 0; y < board.length; y++){
                
                        System.out.print(board[x][y]);
                        isxturn = true;
                    }
                }
             }
            }

                for(int i = 0; i< 3; i++){
                    if(board[i][0] == " o " && board[i][1] == " o " && board[i][2] == " o "  ){
                        wincon = true;
                        System.out.println("O WON");

                    }
                }
                    for(int o = 0; o< 3; o++){
                        if(board[0][o] == " o " && board[1][o] == " o " && board[2][o] == " o "  ){
                            wincon = true;
                            System.out.println("O WON");
    
                        }
                    }
                    if(board[0][0] == " o " && board[1][1] == " o " && board[2][2] == " o "){
                        wincon = true;
                        System.out.println("o WON");
                    }else if(board[2][0] == " o " && board[1][1] == " o " && board[0][2] == " o "){

                        wincon = true;
                        System.out.println("o WON");
                    }
                        int ryanisbadlol = 0;
                    for(int x = 0; x < board.length; x++){
                        System.out.println(" ");
                        for(int y = 0; y < board.length; y++){
                    
                            if(board[x][y] != " _ "){
                                
                                ryanisbadlol++;
    
    
                            }
                            
                        }
    
                    }
                    if(ryanisbadlol == 9){
                        wincon = true;
                        System.out.println("ITS A TIE");
    
                    }
                    


                
            }
        }
}