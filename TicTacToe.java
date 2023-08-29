import java.security.KeyStore;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TicTacToe {

    public static char markOne = 'X';
    public static char markTwo = 'O';

    public static ArrayList<Integer> player1PosSet = new ArrayList<>();
    public static ArrayList<Integer> player2PosSet = new ArrayList<>();


    public static void main(String[] arg){

        char[][] board = {{' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}};

        showGameBoard(board);

        while(!checkFull(board)) {
            //playerOne
            System.out.println("(P1)Enter a number (1-9) to place your mark: ");
            Scanner sc1 = new Scanner(System.in);
            int posOne = Integer.parseInt(sc1.nextLine());

            while(checkTaken(posOne)) {
                System.out.println("The place has been taken! Please choose another position on the board: ");
                posOne = Integer.parseInt(sc1.nextLine());
            }

            player1PosSet.add(posOne);
            playerOnePos(board, posOne);
            if(checkWinner()){  System.out.println("Congrats! You(Player1) Win!"); break;}


            if(checkFull(board)) {break;}

            //playerTwo
            System.out.println("(P2)Enter a number (1-9) to place your mark: ");
            Scanner sc2 = new Scanner(System.in);
            int posTwo = Integer.parseInt(sc2.nextLine());

            while(checkTaken(posTwo)) {
                System.out.println("The place has been taken! Please choose another position on the board: ");
                posTwo = Integer.parseInt(sc2.nextLine());
            }

            player2PosSet.add(posTwo);
            playerTwoPos(board, posTwo);
            if(checkWinner()){ System.out.println("Congrats! You(Player2) Win!"); break;}
        }


        if(!checkWinner()){ System.out.println("It's a tie! Play again!");}


    }


    public static void showGameBoard(char[][] board) {
        for(char[] i: board){
            System.out.println(i);}
    }


    public static Boolean checkTaken(int num) {
        for(int i: player1PosSet){
            if(num == i) { return true;}
        }

        for(int j: player2PosSet){
            if(num == j) { return true;}
        }
        return false;
    }


    public static Boolean checkFull(char[][] board){
        List place = Arrays.asList(board[0][0], board[0][2], board[0][4], board[2][0], board[2][2],board[2][4], board[4][0], board[4][2], board[4][4]);
        int full = 0;
        for(Object i: place) {
            if(i.equals('X') || i.equals('O')) {
                full += 1;
            }
        }

        if(full == 9) { return true;} else { return false;}
    }

    public static void playerOnePos(char[][] board, int position) {
        switch(position) {
            case 1:
                board[0][0] = markOne;
                break;
            case 2:
                board[0][2] = markOne;
                break;
            case 3:
                board[0][4] = markOne;
                break;
            case 4:
                board[2][0] = markOne;
                break;
            case 5:
                board[2][2] = markOne;
                break;
            case 6:
                board[2][4] = markOne;
                break;
            case 7:
                board[4][0] = markOne;
                break;
            case 8:
                board[4][2] = markOne;
                break;
            case 9:
                board[4][4] = markOne;
                break;
            default:
                System.out.println("Please choose a number between 1 and 9!");
        }

        showGameBoard(board);
    }


    public static void playerTwoPos(char[][] board, int position) {
        switch(position) {
            case 1:
                board[0][0] = markTwo;
                break;
            case 2:
                board[0][2] = markTwo;
                break;
            case 3:
                board[0][4] = markTwo;
                break;
            case 4:
                board[2][0] = markTwo;
                break;
            case 5:
                board[2][2] = markTwo;
                break;
            case 6:
                board[2][4] = markTwo;
                break;
            case 7:
                board[4][0] = markTwo;
                break;
            case 8:
                board[4][2] = markTwo;
                break;
            case 9:
                board[4][4] = markTwo;
                break;
            default:
                System.out.println("Please choose a number between 1 and 9!");
        }

        showGameBoard(board);
    }



    public static Boolean checkWinner(){
        List rowOne = Arrays.asList(1, 2, 3);
        List rowTwo = Arrays.asList(4, 5, 6);
        List rowThree = Arrays.asList(7, 8, 9);
        List colOne = Arrays.asList(1, 4, 7);
        List colTwo = Arrays.asList(2, 5, 8);
        List colThree = Arrays.asList(3, 6, 9);
        List diagOne = Arrays.asList(1, 5, 9);
        List diagTwo = Arrays.asList(3, 5, 7);

        ArrayList<List> winning = new ArrayList<>();
        winning.add(rowOne);
        winning.add(rowTwo);
        winning.add(rowThree);
        winning.add(colOne);
        winning.add(colTwo);
        winning.add(colThree);
        winning.add(diagOne);
        winning.add(diagTwo);

        for(List i: winning) {
            if(player1PosSet.containsAll(i)){
                return true;}

            if(player2PosSet.containsAll(i)){
                return true;
            }
        }
        return false;

    }




}
