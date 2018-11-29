public class Pirate extends Person implements Randomize{

  int maxDrinks;
  int drinkedRums;

  public Pirate() {
    super();
    this.maxDrinks = 4;
    this.isConcious = true;
    this.drinkedRums = 0;
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
      this.ko();
      System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
    }
  }
}
