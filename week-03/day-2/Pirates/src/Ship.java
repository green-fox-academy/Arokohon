import java.util.ArrayList;

public class Ship {

  ArrayList<Pirate> shipCrew = new ArrayList<>();

  public void fillShip() {
    for (int i = 0; i < 10 + (int)Math.random() * 26; i++) {
      shipCrew.add(new Pirate());
    }
    shipCrew.get((int)Math.random() * shipCrew.size()).isCaptain = true;
  }


  public void getShipStatus(Ship ship) {

  }
}
