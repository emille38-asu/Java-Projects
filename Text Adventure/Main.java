import java.util.Scanner;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Creating a hash map
    Map hall = new HashMap();
    // Map for another room
    Map bedroom = new HashMap();
    // Another room Map
    Map diningRoom = new HashMap();

    // Creating an ArrayList
    ArrayList items = new ArrayList();
    items.add("Axe");
    items.add("Moldy apple");

    // Enemy object inside of an ArrayList
    // Maybe method called generate enemy
    ArrayList zombie = new ArrayList();
    zombie.add(75);
    zombie.add(10);
    zombie.add(12);
    zombie.add(125);
    zombie.add("Zombie");

    ArrayList crow = new ArrayList();
    crow.add(75);
    crow.add(10);
    crow.add(12);
    crow.add(125);
    crow.add("Crow");

    ArrayList slime = new ArrayList();
    slime.add(75);
    slime.add(10);
    slime.add(12);
    slime.add(125);
    slime.add("Slime");

    ArrayList shadow = new ArrayList();
    shadow.add(75);
    shadow.add(10);
    shadow.add(12);
    shadow.add(125);
    shadow.add("Shadow");

    // Enemy crow = new Enemy(50, 10, 13, 100, "Crow");
    // Enemy dog = new Enemy(25, 12, 14, 50, "Dog");
    // ArrayList enemies = new ArrayList();
    // ArrayList of objects
    // enemies.add(crow);
    // enemies.add(zombie);
    // enemies.add(dog);

    Enemy en = new Enemy(zombie);
    // Where the user currently is
    String currentRoom = "Hall";

    // Map a map to a map?...Is it necessary?
    // Mapping Items and room destinations
    hall.put("Hall", 18);
    // If hall.get(user input = "North", go to that room....)
    hall.put("North", "Bedroom");
    hall.put("South", "Dining room");
    hall.put("Item", items);
    System.out.println(hall.get("Item"));

    // The bedroom map
    bedroom.put("South", "Hall");

    // The dining room map
    diningRoom.put("East", "Hall");

    // New map object

    // Tiles house = new Tiles(crow, items)
    Play play = new Play();
    play.playGame();

    // Debugging Tiles class
    // house.printThis();

    // Declaring variables to pass into player
    String name;
    int age;
    String playerName;
    String tribe;

    // Prompting the user to enter input
    System.out.println("Greetings, adventurer!");
    System.out.println("What is your name?");
    name = scanner.nextLine();

    System.out.println("What tribe do you hail from?");
    tribe = scanner.nextLine();

    // Creating the player object
    Player player = new Player(name, 29, "Apple", tribe);

    // Debugging code
    player.printStats();

    // Code some more stuff...like a game
    // Implement a class

    // For Each Loops
    int[] damageLog = { 1, 3, 4, 5, 7, 20, 12, 34, 213, 2134215235, 23, 1, 23, 4, 5, 2, 12, 54, 234, 12, 5346, 43 };
    // For every int inside of damageLog, do something
    for (int s : damageLog) {
      System.out.println(s);
    }

    // Switch statements
    int iVal = 25;

    switch (iVal * 2) {
    case 50:
      System.out.println("Correct");
      break;

    case 78:
      System.out.println("Wha...");
      break;

    default:
      System.out.println("OK");
      break;
    }

  }

}