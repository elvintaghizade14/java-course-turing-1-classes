# Arrays
# The task is

Write a program called "shooting at the square."

#### Technical requirements:
- Given a 5x5 square, where the program randomly sets a target.
- Before the game starts, the text is displayed on the screen: `All set. Get ready to rumble!`
- The whole process of the game is processed in an infinite loop.
- The player is asked to enter a line for fire; the program checks that the  user enter is a number, and this entered number is in the range of playing field lines (1-5). As long as the player makes mistakes, he will be asked to enter the number again.
- The player is asked to enter a shooting bar (must pass the same check). 
- After each shot, the updated game field should be displayed in the console. Cells, where the player has already shot is necessary to note as `* `.
- The game ends when the target is defeated. At the end of the game, display the phrase in console: `You have won!`. The target should be marked as `x `.
- The task must be done using arrays (**DO NOT USE THE INTERFACES** `List`, `Set`, `Map`).

An example of console output:

` 0 | 1 | 2 | 3 | 4 | 5 |`   
` 1 | - | - | - | - | - |`   
` 2 | - | * | * | - | - |`   
` 3 | * | - | - | * | - |`   
` 4 | - | - | - | - | * |`   
` 5 | * | - | * | - | - |`  
  

#### Advanced complexity. Not necessary for the realization:
- Add an "area shooting" feature, so that the target occupies 3 cells (horizontally or vertically) and the affected compartments are marked with `x`.
