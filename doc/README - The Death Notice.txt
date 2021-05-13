﻿The Death Notice
Authors: Skyla Ma and Andria Xu 
Revision: 5/13/2021


Introduction: 
[In a few paragraphs totaling about ½ page, introduce the high-level concept of your program. What this looks like depends a lot on what type of thing you are making. An introduction for an application will look different than one for a game. In general, your introduction should address questions like these:
What does your program do?
What problem does it solve? Why did you write it?
What is the story?
What are the rules? What is the goal?
Who would want to use your program?
What are the primary features of your program?
* listed below]


“The Death Notice” is a multiplayer card game. If you draw a “death” card, you lose unless you have a “saving” card, in which case it would be automatically played. Every turn, the player draws a card from the card deck and has the option to buy a “saving” card before they end their turn (for more details, refer to the features list). During each turn, a player can draw 1, 2, or 3 cards, and the cards they draw corresponds to how many points the player gets (J, Q, K are all 10).The goal of the game is to become the last surviving player or the player with the most points. In the case of a tie, whichever player reached that particular point value first wins.
This game is for anyone who wants to enjoy a fun game with a group of people, such as friends or family, even if they do not have a deck of cards with them. Anyone who seeks entertainment or wants to relieve themselves of boredom would find pleasure in playing this game as well.
  






Instructions:
[Explain how to use the program. This needs to be specific: 
Which keyboard keys will do what? 
Where will you need to click? 
Will you have menus that need to be navigated? What will they look like? 
Do actions need to be taken in a certain order?]


The goal of this game is to get as many points as possible without dying. Click “begin”. Then add 2-4 player names by clicking “save” after typing each name and “done” once you have finished entering and saving all the names. This will bring you to the screen with the main game. The first player starts with 30 points, and each succeeding player starts with one more point than their preceding player in order to compensate for playing after their preceding players. During a player’s turn, they can choose to draw 1, 2, or 3 cards by first clicking on the deck to reveal the card, then clicking on “Take Card”. The cards they draw correspond to how many points the player gets (J, Q, K are all 10). The player is then given the number of points that is denoted by their card. If a “death” card (the As, 4-8 of them) is ever drawn, the player who draws it automatically dies unless they have a “saving” card (represented by a star next to the player on the scoreboard), in which case the “saving” card is automatically used.  There will also be a special “saving” card (or Joker) in the deck that is worth 2 of them. At any point during their turn before they end their turn or draw a “death” card, a player can choose to convert a certain number of points to a “saving” card, which can be used to cancel a “death” card drawn later. Allow the next player to go through their turn (as soon as a player presses the “end turn” button, their turn is over). Continue this process until all the cards in the deck are gone. Whoever of the remaining players has the most points wins. 




Features List (THE ONLY SECTION THAT CANNOT CHANGE LATER):
Must-have Features:
[These are features that we agree you will definitely have by the project due date. A good final project would have all of these completed. At least 5 are required. Each feature should be fully described (at least a few full sentences for each)]
* An instructions page detailing the instructions of the game.
* The user can play the game on a window with interactive graphics.
* There is a shared card deck, which each user can draw from on their turn. When a user draws from the card deck, the next card on the top of the deck is added to the player’s hand and that card is removed from the deck.
*  A death card (the “A”s in a deck, 4-8 of them) causes the player who drew the card to die. When this card is drawn and a “saving” card (a Joker) is not present in the player’s hand, a message saying that the player is dead should automatically appear on the player’s screen. 
* If the player plays a certain card (“saving” card that can be bought with a certain number of points), they can use the card to save themselves in the case of drawing a “death” card.
* The “multiplayer” feature, with the ability to play with up to 4 players on a shared computer. The computer would be passed around from player to player. 


Want-to-have Features:
[These are features that you would like to have by the project due date, but you’re unsure whether you’ll hit all of them. A good final project would have perhaps half of these completed. At least 5 are required. Again, fully describe each.]
* The cards in the deck will be customized such that it fits the “Suffocating Otter” prompt, instead of just using a standard deck of cards. In other words, the cards will be designed such that the “death” card will be a “plastic” card, the “saving” card will be a “doctor” card, etc. 
*  A “Would you like to play again?” button after the game ends.
* Instead of doing a multiplayer feature where players play on a shared computer, we could implement it so that players are able to play against each other on different computers (firebase).
* Sound/Music for messages, such as when a player loses or wins.
* The cost of a “Saving” card adapts with the situation (ex: inflation).
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
* PointCard extends Card (represents a standard card that gives you points)
* SavingCard extends Card (represents a saving card you can use to save yourself)
* DeathCard extends Card (represents a death card that will kill you)
Main 
Player (represents a player in the game)
PricingModel (the pricing model that determines the price for a saving card)
GUI Classes:
* StartPage (the start page to begin the game)
* AddPlayers (the page to addplayers)
* MainGame (the page of the game)
* Messages (the messages that pop up)
* Instructions (the instructions page)
* EndingPage (the ending page with the standings)


Credits:
[Gives credit for project components. This includes both internal credit (your group members) and external credit (other people, websites, libraries). To do this:
* List the group members and describe how each member contributed to the completion of the final program. This could be classes written, art assets created, leadership/organizational skills exercises, or other tasks. Initially, this is how you plan on splitting the work.
* Give credit to all outside resources used. This includes downloaded images or sounds, external java libraries, parent/tutor/student coding help, etc.]


Internal Credits:
* Andria:
   * Helping and checking in with each other
   * Firebase
   * Sound/Audio
   * GUI: StartPage, AddPlayers, EndingPage
   * Design Enhancement
* Skyla:
   * Helping and checking in with each other
   * Back-End Classes
   * GUI: MainGame, Instructions
   * Design Enhancement


External Credits:
* Swing library
* https://stackabuse.com/sorting-algorithms-in-java/ 
* Card Images: https://opengameart.org 
* JaysEasierSound demo
* Firebase demo
* “Sale” Image: https://icon-icons.com/icon/black-friday-cheap-discount-price-reduced-sale-tag/111190