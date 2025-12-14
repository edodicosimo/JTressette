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
- **Observer Pattern** for UI updates

## Flow of Actions
The user start a new game selecting the number of players
A deck must be initialized
Player must be inizialited
AIPlayer must be initialized
Each player drae the first Hand (10 cards)
TURN:
- The order of play must be decided
- Starting player play a card, then each player does 
- The table must be resolved
- Winning player is the first for next turn
- each player draws a card
WHEN deck is empty and hands are empty game finish
