# TicTacToe

This project is intended to create a TicTacToe game using Java. TicTacToe game is popular worldwide with its simple rule. Two players each choose one of the two marks (usually "X" and "O") to represent its side in a gameboard made of nine grids. Each round one player put down one's marks on one of the grid. The game continues until one player wins. A win happens when one player successfully has the same symbol line up horizontally, vertally or on the two diagnoal lines. 

The project is not intended to create a TicTacToe game for human versus computer, but a game for two people to play continuously on a screen without the need to write new grids on pieces of paper. 

With that in mind, the following records the process and procedures of how this game come into being on the screen using Java. 

Note: In the following description, the word "mark" will be used to represent the noughts and crosses ("X" and "O"). 

(1) Design of Game Board
   - Using a 2D array of char(character) to store the lines that makes up a board. Then use a for-each loop to loop through the array and print out the board on the console. This board create the TicTacToe game board visually on the screen so that players can keep track of the locations they place their marks on. 
   - Each square inside the grid is placed a number(1-9) to keep track of the marks being placed on the game board. This allows the players to enter the number that denotes the position they want their marks to be put on.
     - A switch statement is used to handles the 9 different cases when player enter their number. The corresponding square inside the grid is then marked off using their mark. 
   - ![](out/production/TicTacToe/.idea/number_in_grid.png)


(2) Variables:
   - Two global variables (posOne, posTwo) are created to track the position of the marks that the two players place in the game board. 


(3)  Methods:
   - "checkFull" is a method to check if the game board is all marked off by the two marks ('X' and 'O'). It uses a List object to store all the squares in the game board that can store a number. A for each loop is used to loop through each square to see if it is being marked off. The "full" variable is used to keep track of the number of squares being marked off. If all of the squares are marked off (when full = 9), the function returns true to show that there is no additional place for players to put down their marks and the game ends. 
   - "checkTaken" use to check if the position on the game board has been taken previously or by the other player already. This ensures that there is no overwritten mark on the board. 
   - "playerOne" and "playerTwoPos" are methods used to place the mark of player 1 and player 2 on the game board. The switch statement is place under each of this two methods so that the main method is more organized and concise.  
   - "checkWinner" method use List to store the eight possible ways that a player can win the game. 