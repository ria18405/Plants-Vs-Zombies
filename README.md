# Plants-Vs-Zombies

CSE 201 : Final project of the course **Advanced Programming** 

**Created by [Ria Gupta](https://github.com/ria18405) and [Ruhma Mehek Khan](https://github.com/ruhmamehek)**


This is a JavaFX application for the game - Plants vs Zombies. The objective of the game is to
defend the house from zombies using various plants as defence arsenal through different levels.
If the zombies are able to reach the house, you fail the level and have to play the level again.


**RULES OF THE GAME**

1) The game consists of different levels. In each level, there is a house with a lawn and
zombies have to cross the lawn to reach the house. Refer to the gameplay video [link](https://www.youtube.com/watch?v=RmXB07gB-pc) for
clearer understanding.

2) The player has to put plants in the lawn to prevent the zombies from reaching the house.
Please refer to the list of plants given in the link for their abilities.

3) Once the zombies reach a particular plant, they start eating it which decreases the plant’s
health. Note that the plants can still attack the zombie (based on the plant’s ability) while
it is being eaten.

4) The player has to collect sun tokens as in-game currency to buy plants. This currency
drops down on the lawn every 5 seconds. 

5) Every plant has a waiting time (t seconds). Once you buy the plant, you cannot purchase
the same plant before this waiting time (t) elapses. ‘t’ should be at least 5 seconds.

6) The house is defended by lawnmowers as a last resort in each row of the lawn. The
lawnmower activates and kills all the zombies in that row once they are able to cross the
lawn. The lawnmower can be used only once and is not under the player’s control. Once
the lawnmower is used, that row is defence-less if a zombie reaches the house.

7) The zombies differ in their defence and attack values. Some zombies have higher defence
(health) and attack points than others.

8) Each level has higher difficulty compared to the previous level. This can be achieved by
increasing the number of zombies and varying the defence and attack ability of the
zombies.

9) At the end of each level, a new plant is unlocked which can be used in subsequent levels.
10) The sun-tokens expire at the end of level. The tokens earned in a level cannot be taken
forward to the next level.

11) To save game progress, the game stores the following objects at the time of saving:
a) Level
b) Number of sun tokens
c) Position and health of plants and lawnmowers
d) Position and health of zombies
When the user loads an existing game, it restores the state of the game.

12) The game allows saving and loading multiple states.