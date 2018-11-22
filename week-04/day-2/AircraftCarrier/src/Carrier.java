import java.util.ArrayList;

public class Carrier {

  ArrayList<Aircraft> listOfPlanes;
  int ammoForFill;
  int health;

  public Carrier(int ammoForFill, int health) {
    listOfPlanes = new ArrayList<>();
    this.ammoForFill = ammoForFill;
    this.health = health;
  }

  public void addAirCraft(Aircraft aircraft){
    listOfPlanes.add(aircraft);
  }

  public void fill() throws Exception {
    if (ammoForFill > 0) {
      for (int i = 0; i < listOfPlanes.size(); i++) {
        if (listOfPlanes.get(i).isPriority()) {
          listOfPlanes.get(i).refill(ammoForFill);
        }
      }
      for (int i = 0; i < listOfPlanes.size(); i++) {
        listOfPlanes.get(i).refill(ammoForFill);
      }
    }
    else {
      throw new Exception("Not enough ammo!");
    }
  }

  public int getTotalDamage() {
    int totalDamage = 0;
    for (int i = 0; i < listOfPlanes.size(); i++) {
      totalDamage += listOfPlanes.get(i).ammo * listOfPlanes.get(i).baseDamage;
    }
    return totalDamage;
  }

  public String getCarrierStatus() {
    if (this.health > 0) {
      return "HP: " + this.health
          + " Aircraft count: " + listOfPlanes.size()
          + " Ammo storage: " + this.ammoForFill
          + " Total damage: " + getTotalDamage();
    }
    return "It's dead Jim... :(";
  }

  public int fight(Carrier enemyCarrier) {
    enemyCarrier.health -= getTotalDamage();
    for (int i = 0; i < listOfPlanes.size(); i++) {
      listOfPlanes.get(i).fight();
    }
    return enemyCarrier.health;
  }
}
