package Latihans.UAS_Diskrit_2024_2025;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class soal3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int position = 1;
        int count = 1;
        System.out.println("Game starts, Position: " + position);
        while (true) {
            int acak = rand.nextInt(1, 7);
            position += acak;
            System.out.println("Roll #" + count + " : " + acak + ", Position: " + (position - acak) + " ---> " + position);
            if (position > 50) {
                System.out.println("Over Rolled, roll again");
                count++;
                position -= acak;
                continue;
            }
            if (position == 50) {
                break;
            }
            count++;
            if (position == 23) {
                System.out.println("Ladder! Moving to 33");
                position = 33;
                continue;
            }
            if (position == 7) {
                System.out.println("Ladder! Moving to 14");
                position = 14;
                continue;
            }
            if (position == 28) {
                System.out.println("Ladder! Moving to 42");
                position = 42;
                continue;
            }
            if (position == 39) {
                System.out.println("Snake! Moving to 22");
                position = 22;
                continue;
            }
            if (position == 44) {
                System.out.println("Snake! Moving to 31");
                position = 31;
                continue;
            }
            if (position == 47) {
                System.out.println("Snake! Moving to 35");
                position = 35;
            }
        }
        System.out.println("finished!!");
        System.out.println("it took " + count + " rolls to finish");
    }
}

class lowest_rollcount {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> stor = new ArrayList<>();
        for (int A = 0; A < 100; A++) {
            int position = 1;
            int count = 1;
            while (true) {
                int acak = rand.nextInt(1, 7);
                position += acak;
                if (position > 50) {
                    count++;
                    position -= acak;
                    continue;
                }
                if (position == 50) {
                    break;
                }
                count++;
                if (position == 23) {
                    position = 33;
                    continue;
                }
                if (position == 7) {
                    position = 14;
                    continue;
                }
                if (position == 28) {
                    position = 42;
                    continue;
                }
                if (position == 39) {
                    position = 22;
                    continue;
                }
                if (position == 44) {
                    position = 31;
                    continue;
                }
                if (position == 47) {
                    position = 35;
                }
            }
            stor.add(count);
        }
        Collections.sort(stor);
        System.out.println("lowest possible roll is : " + stor.getFirst());
    }
}
/*
Snake and Ladder Game Simulation 35 points)
Create a program that simulates a snake and ladder game with the following
specifications:
Game Rules:
- The game board has 50 tiles (1 to 50) in a row
- Player starts at position 1
- Ladders:
* Tile 23 → 33
* Tile 7 → 14
* Tile 28 → 42
- Snakes:
* Tile 39 → 22
* Tile 44 → 31
* Tile 47 → 35
The program should simulate a player's journey from start (tile 1) to finish (tile 50) using
random dice rolls (1-6).

Input:
No input required. The program runs automatically.

Output:
For each turn, the program should display:
- Current dice roll
- Current position
- Whether a snake or ladder was encountered
- New position (if changed by snake or ladder)
After it finishes, print out how many rolls have been done

Example Output:
“Game starts, Position: 1”
"Roll: 5, Position: 6"
"Roll: 1, Position: 7"
"Ladder! Moving to 14"
"Roll: 5, Position: 19"
[Continue until reaching tile 50]
“Roll: 3, Position: 50”
“Finished!”
“It took 35 rolls to finish”
 */
