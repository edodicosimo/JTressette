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
