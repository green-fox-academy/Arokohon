public class Person implements Randomize{

  boolean isAlive = true;
  boolean isConcious = true;
  boolean isCaptain = false;

  public void fight(Person opponent) {

    if (this.isConcious && opponent.isConcious) {
      int fightResult = randomNumberForFight();
      switch (fightResult) {
        case 1:
          this.die();
        case 2:
          opponent.die();
        case 3:
          this.ko();
          opponent.ko();
      }
    } else if (!opponent.isConcious) {
      opponent.die();
    }
  }

  public boolean die() {
    return this.isAlive = false;
  }

  public boolean ko() {
    return this.isConcious = false;
  }

  @Override
  public int randomNumberForFight() {
    int number = (1 + (int)(Math.random() * 3));
    return number;
  }

  @Override
  public int randomNumberForLife() {
    int number = (1 + (int)(Math.random() * 5));
    return number;
  }
}
