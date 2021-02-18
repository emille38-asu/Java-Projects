public class Player {
  // Declaring instance variables
  private String playerName;
  private int age;
  private String playerClass;
  private String tribe;
  private int hitPoints = 25;
  private int exp;

  // Filling contructor
  public Player(String playerName, int age, String playerClass, String tribe) {
    this.playerName = playerName;
    this.age = age;
    this.playerClass = playerClass;
    this.tribe = tribe;
  }

  // Printing initial statement
  public void printStats() {
    System.out.println("Greetings " + playerName + ", age " + age + ", of the " + playerClass + " class! Pride of the "
        + tribe + " clan!");
    System.out.println("Chapter 1");
  }

}