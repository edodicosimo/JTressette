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
#### Phase: Initialization
A deck must be initialized
2 teams must be initialized
Player must be inizialited
AIPlayer must be initialized
Each player must be assigned to a team
The Game deal the first hand to the players
#### Phase: Turn
- [ ] The order of play must be decided
    - [ ] The order of play may be the order of the players list
    - [ ] So the game  must be initialized with the player list in order
- [ ] game ask first player which card he plays
- [ ] first player decides
    - [ ]  if he is human must wait for the input (**Phase: Wait for human play**)
- [ ] game has to check if the move is legal
- [ ]  game add this card to table
    - [ ]  table must be a LinkedHashMap, so that there is a record of whom played what and of the playing order 
- [ ]  all player plays
- [ ]  The table must be resolved by the game
    - [ ]  player list order is updated: winning player is the first for next turn
    - [ ]  winning player puts the card in his teams's pile
- [ ]  game give each player a card in the list order
- [ ]  game clear the table

---

#### How to keep the score?
- [ ]  each player has a pile with all the cards he won
- [ ]  at endgame the game compute each player score
####  How to manage teams?
- [ ] add team class
    - [ ] Must be hashable
- [ ] each player has a team
- [ ] when he wins a table he puts his card in his teams pile
#### Phase: EndGame
WHEN deck is empty and hands are empty game finish
Game count team's score
