import java.util.ArrayList;

public class PirateShip extends Ship implements DoBattle, Ceremony, Randomize{

  ArrayList<Pirate> crewOfShip = new ArrayList<>();

  public void fillShip() {
    for (int i = 0; i < randomNumberForLife(); i++) {
      Pirate pirate = new Pirate();
      crewOfShip.add(pirate);
    }
    crewOfShip.get(0).isCaptain = true;
  }

  @Override
  public void ceremony() {

  }

  @Override
  public int randomNumberForFight() {
    return 0;
  }

  @Override
  public int randomNumberForLife() {
    int number = (50 + (int)(Math.random() * 100));
    return number;
  }

  @Override
  public void battle(Ship enemyShip) {
    for (int i = 0; i < crewOfShip.size(); i++)
      if (crewOfShip.get(i).isAlive && crewOfShip.get(i).isConcious) {
        crewOfShip.get(i).fight((Person) enemyShip.crew.get(i));
      }
  }

  @Override
  public void getStatus() {

  }
}
