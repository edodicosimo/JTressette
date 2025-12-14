# JTresette

Final project for the **Metodologie di Programmazione** course.

## Architecture
The project follows the **MVC (Model–View–Controller)** architectural pattern.

## Tech stack
- Java 25
- JavaFX
- Maven
- Git

## Required specifications
1. **User profile management**
   - nickname
   - avatar
   - played, won, and lost matches
   - level (I can increase the level every *N* wins)
2. **Full match management** with a human player against **1, 2, or 3 AI players**
   - AI opponents
   - choice of how many players per match
3. **Audio sample playback** (see Appendix `AudioManager.java`)
4. **Animations and special effects** (even if limited)

## Design patterns
- **Strategy Pattern** for opponent AI behavior
- **Strategy Pattern** for game rules
- **Observer Pattern** for UI updates

## Flow of Actions
The user start a new game selecting the number of players
A deck must be initialized
Player must be inizialited
AIPlayer must be initialized
The Game deal the first hand to the players
TURN:
- The order of play must be decided
    - The order of play may be the order of the players list
    - So the deck must be initialized with the list in order
- game ask first player wich card should he play
- first player decides
    - if he is human must wait for the input
- game add this card to table
    - table must be a map, so that there is a record of whom played what
- all player plays
- The table must be resolved by the game
    - player list order is updated: winning player is the first for next turn
    - winning player gets the card in his pile
- game give each player a card in the list order
- game clear the table
WHEN deck is empty and hands are empty game finish

- How to keep the score?
    - each player has a pile with all the cards he won
    - at endgame the game compute each player score
- How to manage teams?
