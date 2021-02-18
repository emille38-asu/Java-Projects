import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.util.Arrays;

public class Play {

  public void playGame() {
    // Tiles house = new Tiles(array list enemies, array list items);
    // house.generateMap();

    // Reading input
    Scanner input = new Scanner(System.in);

    // JFrame myFrame = new JFrame("Sample Frame");
    // myFrame.setSize(300,400);
    // myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    // myFrame.setVisible(true);

    // Print out instructions for the playGame

    System.out.println("Please choose an action: ");
    // Taking input and then splitting it
    String playerAction = input.nextLine();
    // Splitting input into individual words
    String[] actions = playerAction.split(" ");

    // Try
    if (actions[0].equalsIgnoreCase("Go")) {
      // Case/Switch for different room inputs?
      // Depending on the current room, go to the corresponding room
      // Create classes for the rooms?
      if (actions[1].equalsIgnoreCase("East")) // && currentRoom == "Hall")
      {
        System.out.println("You cannot go that way.");
      }
    }

    // Player action Block
    if (actions[0].equalsIgnoreCase("Use")) {
      // Case/Switch for different room inputs?
      // Depending on the current room, go to the corresponding room
      // Create classes for the rooms?
      if (actions[1].equalsIgnoreCase("East")) // && currentRoom == "Hall")
      {
        System.out.println("You cannot go that way.");
      }
    }

    // Player action block
    if (actions[0].equalsIgnoreCase("Attack")) {
      // Case/Switch for different room inputs?
      // Depending on the current room, go to the corresponding room
      // Create classes for the rooms?
      if (actions[1].equalsIgnoreCase("East")) // && currentRoom == "Hall")
      {
        System.out.println("You cannot go that way.");
      }
    }

    // Player action block
    if (actions[0].equalsIgnoreCase("Equip")) {
      // Case/Switch for different room inputs?
      // Depending on the current room, go to the corresponding room
      // Create classes for the rooms?
      if (actions[1].equalsIgnoreCase("East")) // && currentRoom == "Hall")
      {
        System.out.println("You cannot go that way.");
      }
    }

  }

}