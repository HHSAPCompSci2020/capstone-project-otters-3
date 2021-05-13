The Death Notice
Authors: Skyla Ma and Andria Xu 
Revision: 5/6/2021


Introduction: 
[In a few paragraphs totaling about ½ page, introduce the high-level concept of your program. What this looks like depends a lot on what type of thing you are making. An introduction for an application will look different than one for a game. In general, your introduction should address questions like these:
What does your program do?
What problem does it solve? Why did you write it?
What is the story?
What are the rules? What is the goal?
Who would want to use your program?
What are the primary features of your program?
* listed below]


The Death Notice is a multiplayer card game. If you draw a deadly card, you lose unless you have a “save” card, in which case it would be automatically played. Every turn, the player draws a card from the standard card deck and has the option to buy cards before they end their turn (some can only be drawn or can only be bought and for more details, refer to the features list). Some cards include one that will allow you to “see the future” and the next cards, one that will save you in hard times, and a “deadly” card that will cause you to die. During each turn, a player can play a number of cards, allowing them to utilize the benefits of each card. The goal of the game is to become the last surviving player or the player with the most points.
This game is for anyone who wants to enjoy a fun game with a group of people, such as friends or family, even if they do not have a deck of cards with them. Anyone who seeks entertainment or wants to relieve themselves of boredom would find pleasure in playing this game as well.


  






Instructions:
[Explain how to use the program. This needs to be specific: 
Which keyboard keys will do what? 
Where will you need to click? 
Will you have menus that need to be navigated? What will they look like? 
Do actions need to be taken in a certain order?]


The goal of this game is to get as many points as possible without dying. Click “begin” and choose the number of players who are playing. Your points will be automatically given to you. The first player starts with 30 points, and each succeeding player starts with one more point than their preceding player in order to compensate for playing after their preceding players. During a player’s turn, they can choose to draw 1, 2, or 3 cards. The cards they draw corresponds to how many points the player gets (J, Q, K are all 10). The player is then given the number of points that is denoted by their card. If a “deadly” card (the 4 As) is ever drawn, the player who draws it automatically dies unless they have a “save” card (represented by a Joker), in which case the “save” card is automatically used.  At any point during their turn before they end their turn or draw a “deadly” card, a player can choose to convert 30 points to a “save” card, which can be used to cancel a “deadly” card drawn later. Allow the next player to go through their turn (as soon as a player draws 3 times or presses the “end turn” button, their turn is over). Continue this process until all the cards in the deck are gone. Whoever of the remaining players have the most points wins. 




Features List (THE ONLY SECTION THAT CANNOT CHANGE LATER):
Must-have Features:
[These are features that we agree you will definitely have by the project due date. A good final project would have all of these completed. At least 5 are required. Each feature should be fully described (at least a few full sentences for each)]
* An instructions page detailing the instructions of the game.
* The user can play the game on a window with interactive graphics.
* There is a shared card deck, which each user can draw from on their turn. When a user draws from the card deck, the next card on the top of the deck is added to the player’s hand and that card is removed from the deck.
*  A deadly card (the 4 “A”s in a deck) causes the player who drew the card to die. When this card is drawn and a “save” card (a Joker) is not present in the player’s hand, the words “You died.” should automatically appear on the player’s screen. 
* If the player plays a certain card (“save” card that can be bought with 30 points), they can use the card to save themselves in the case of drawing a “deadly” card.
* The “multiplayer” feature, with the ability to play with up to 4 players on a shared computer. The computer would be passed around from player to player. 


Want-to-have Features:
[These are features that you would like to have by the project due date, but you’re unsure whether you’ll hit all of them. A good final project would have perhaps half of these completed. At least 5 are required. Again, fully describe each.]
* The cards in the deck will be customized such that it fits the “Suffocating Otter” prompt, instead of just using a standard deck of cards. In other words, the cards will be designed such that the “deadly” card will be a “plastic” card, the “save” card will be a “doctor” card, etc. 
*  A “Would you like to play again?” button after the game ends.
* Instead of doing a multiplayer feature where players play on a shared computer, we could implement it so that players are able to play against each other on different computers.
* Implement the cards from advanced version, which you can buy in the store (each counts as a feature):
   * If the player plays a certain card (“See the Future”), they have the ability to see the next three cards in the deck, allowing them to change their plan for the game accordingly.
   * Whoever gets a flush (5 in a row of numbers) can trash the top card of the draw deck.
   * “Steal” cards are worth 30 points, where you can choose a card to steal from someone else.
   * Whoever gets a house (3 of one number and two of another) can get a “reverse card” to skip their turn and reverse the order in which players play.
   * “Mystery” cards are where you can spend 10 points to get a random card in return.
   * A “shuffle” card, where you can shuffle the draw deck, is worth 10 points. 


Stretch Features:
[These are features that we agree a fully complete version of this program would have, but that you probably will not have time to implement. A good final project does not necessarily need to have any of these completed at all. At least 3 are required. Again, fully describe each.]
* A stretch feature would be a player vs. computer version of the game, where the computer plays by different algorithms depending on whether the player selects “easy”, “medium”, or “hard”. 
* There will be fun facts at the bottom of each card about how pollution and how it affects sea life. You can expand the card such that the card becomes bigger and you can see the fun fact.
* We could implement an easy, medium, and hard version of the game against the computer.




Class List:
[This section lists the Java classes that make up the program and very briefly describes what each represents. It’s totally fine to put this section in list format and not to use full sentences.]
Game (represents the “The Death Notice” game)
CardDeck (represents the card deck which we use to play, includes Card array)
Card (represents each card, abstract class to be extended from)
* subclasses for each card type
DrawingSurface
Main 
Player
GUI Classes
* One for each “page”, or JFrame


Credits:
[Gives credit for project components. This includes both internal credit (your group members) and external credit (other people, websites, libraries). To do this:
* List the group members and describe how each member contributed to the completion of the final program. This could be classes written, art assets created, leadership/organizational skills exercises, or other tasks. Initially, this is how you plan on splitting the work.
* Give credit to all outside resources used. This includes downloaded images or sounds, external java libraries, parent/tutor/student coding help, etc.]


Internal Credits:
* Andria:
   * Helping and checking in with each other
   * Non-Graphical Classes: Player, Game, Main, CardDeck
   * Graphical Classes: StartPage, AddPlayers
* Skyla:
   * Helping and checking in with each other
   * Non-Graphical Classes: Card, SaveCard, PointCard, DeadlyCard
   * Graphical Classes: MainGame, Instructions


External Credits:
* Swing library
* To be determined