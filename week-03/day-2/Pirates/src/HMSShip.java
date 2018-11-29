import java.util.ArrayList;

public class HMSShip extends Ship implements DoBattle, Ceremony, Randomize {

  ArrayList<Marine> crewOfShip = new ArrayList<>();

  public void fillShip() {
    for (int i = 0; i < randomNumberForLife(); i++) {
      Marine marine = new Marine();
      crewOfShip.add(marine);
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

  }

  @Override
  public void getStatus() {

  }
}
