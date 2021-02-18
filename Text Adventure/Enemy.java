import java.util.ArrayList;

public class Enemy {
  // Declare instance variables
  private int health;
  private int speed;
  private int strength;
  private int expOnKill;
  private String name;
  // Make an arrayList from the

  // Create new monsters
  public Enemy(ArrayList list) {
    this.health = (Integer) list.get(0);
    this.speed = (Integer) list.get(1);
    this.strength = (Integer) list.get(2);
    this.expOnKill = (Integer) list.get(3);
    this.name = (String) list.get(4);
  }

}