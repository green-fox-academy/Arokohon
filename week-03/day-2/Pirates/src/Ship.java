import java.util.ArrayList;

public abstract class Ship {

  ArrayList<Object> crew;

  public abstract void battle(Ship enemyShip);
  public abstract void getCrew();
}
