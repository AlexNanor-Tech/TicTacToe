import java.util.Scanner;
import java.util.Random; 

public class TicTacToe {

    public static void printGameBoard(char gameBoard[][]){
        for(char[] row: gameBoard){
            for(char c: row){
                System.out.print(c);
            }
            System.out.println();
        }

    }

    public static void placePiece(char gameBoard[][], int pos, String user) {
        char  symbol = 'n';
        System.out.println(symbol);
        if(user.equals("player")){
            symbol = 'X';
        } else if(user.equals("cpu")){
            symbol = '0';
        }
        switch (pos) { // If pos, place on board.
            case 1:
                gameBoard[0][0] = symbol;
                break;
            case 2:
                switch (pos) { // If pos, place on board.
                    case 1:
                        gameBoard[0][0] = symbol;
                        break;
                    case 2:
                        gameBoard[0][2] = symbol;
                        break;
                    case 3:
                        gameBoard[0][2] = symbol;
                        break;
                    case 4:
                        gameBoard[0][4] = symbol;
                        break;
                    case 5:
                        gameBoard[2][0] = symbol;
                        break;
                    case 6:
                        gameBoard[2][2] = symbol;
                        break;
                    case 7:
                        gameBoard[2][4] = symbol;
                        break;
                    case 8:
                        gameBoard[4][0] = symbol;
                        break;
                    case 9:
                        gameBoard[4][2] = symbol;
                        break;
                    default:
                        break;
                }

        }


    }

    public static void main(String[] args){
        char[][] gameBoard = {{' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}

        };

        printGameBoard(gameBoard);
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your placement (1-9): ");
        int  pos = scan.nextInt();

        System.out.println(pos);

//        changing a place is simply changing a grid position to an x or an o:
//        remember, in a 2D array we get rc (row, column)
        placePiece(gameBoard, pos, "player");
        Random rand = new Random();
        placePiece(gameBoard, pos, "cpu");
        placePiece(gameBoard, pos, "player");
        placePiece(gameBoard, pos, "cpu");
        placePiece(gameBoard, pos, "player");
        printGameBoard(gameBoard);



    }


};