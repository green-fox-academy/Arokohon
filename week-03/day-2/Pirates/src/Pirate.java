public class Pirate extends Person implements Fightable, Randomize{

  int maxDrinks;
  boolean isConcious;
  int drinkedRums;
  boolean hasParrot;

  public Pirate() {
    super();
    this.maxDrinks = 4;
    this.isConcious = true;
    this.drinkedRums = 0;
    this.hasParrot = false;
  }

  @Override
  public void fight(Person opponent) {

  }

  public int drinkSomeRum() {
    return this.drinkedRums++;
  }

  public void howsItGoingMate() {

    if (this.drinkedRums < this.maxDrinks) {
      for (int i = 0; i < randomNumberForLife(); i++) {
        drinkSomeRum();
        System.out.println("Pour me anudder!");
      }
    } else {
      this.isConcious = false;
      System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
    }
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
