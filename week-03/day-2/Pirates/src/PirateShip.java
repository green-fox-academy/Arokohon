import java.util.ArrayList;

public class PirateShip extends Ship implements Ceremony, DoBattle, Randomize {

  ArrayList<Pirate> crewOfShip;

  public PirateShip() {
    super();
    this.crewOfShip = new ArrayList<>();
  }

  public void fillShip() {
    for (int i = 0; i < randomNumberForLife(); i++) {
      Pirate pirate = new Pirate();
      this.crewOfShip.add(pirate);
    }
    this.crewOfShip.get(0).isCaptain = true;
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

//  Not finished, have to refacturing - maybe OutOfBounds Error (j) + don't see, if
// enemy isAlive, or isConcious!!!
  @Override
  public void attackingHMSShip(HMSShip enemyShip) {
    for (int i = 0; i < crewOfShip.size(); i++) {
      while (!crewOfShip.get(i).isAlive || !crewOfShip.get(i).isConcious) {
        for (int j = 0; j < enemyShip.crewOfShip.size(); j++) {
          crewOfShip.get(i).fight(enemyShip.crewOfShip.get(j));
        }
      }
    }
  }

  @Override
  public String getStatus() {

    for (int i = 0; i < this.crewOfShip.size(); i++) {
      int alivePirates = 0;
      if (crewOfShip.get(i).isAlive) {
        alivePirates++;
      }
    }
    return "the captain had " + this.crewOfShip.get(0).drinkedRums;
  }


  @Override
  public void attackingPirateShip(PirateShip ship) {
  }
}
