# TicTacToe

This project is intended to create a TicTacToe game using Java. TicTacToe game is popular worldwide with its simple rule. Two players each choose one of the two symbols (usually "X" and "O") to represent its side in a gameboard made of nine grids. Each round one player put down one's symbol on one of the grid. The game continues until one player wins. A win happens when one player successfully has the same symbol line up horizontally, vertally or on the two diagnoal lines. 

The project is not intended to create a TicTacToe game for human versus computer, but a game for two people to play continously on a screen without the need to write new grids on pieces of paper. 

With that in mind, the following records the process and procedures of how this game come into being on the screen using Java. 

(1) **Design of Game Board**

Since the TicTacToe game board is in the form of a matrix with rows and columns. A 2D array of character is used to design the board so that presnts a grid consisting of nine squares on the screen. Instead of simply an array or arraylist data structure, a 2D array allows to make rows and columns easily.  


(2) **Variables**

Two global variables "player1PosSet" and "player2PosSet" is created to store all the position that players mark on the game board. This two Arraylist variables allows the program to make use of the position to determine winners and potential conflicts when placing marks.


(3) **Methods**

1. _showGameBoard_ - This method is used to print out the game board on the console place before the game start and after each player place their mark. Since the board must be constantly updated so that players know what places has been taken and think of strategy to win the game based on the current game board situation. To make printing the game board as a method allows the main methods to be more clean and organized. 
2. _checkTaken_ - This method allows the program to determine whether the number entered by the player has been taken previously or taken by the other player already. The purpose is to prevent overwriting the marks that already place on the game board so that there is a finite trials to determine if a winner will emerge or not. The checkTaken methods use the global variables to make the decision. 
3. _checkFull_ - This method is used to check if the game board is full or not. The game board consist of only 9 squares, meaning that there is no more available space on the game board after nine tries. This method allows the program to determine when the game ends. 
4. _playerOnePos_ - This methods translates the number that player one enter into the marks on the game board on screen. It use a switch statement to determine the result for the nine cases (1-9). It also allows to check if player One enter a number between one to nine or not. 
5. _playerTwoPos_ - Similar implementation as method "playerOnePos". This method is for player two. 