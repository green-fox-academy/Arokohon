public class Pirate extends Person implements Fightable {

  int drinks;
  String pet = "";

  Pirate() {
    this.isAlive = true;
    this.isConcious = true;
    this.power = 1 + (int)(Math.random() * 10);
    this.drinks = 0;
    this.isCaptain = false;
    int petChance = 1 + (int)(Math.random() * 10);
    if (petChance >= 9) {
      this.pet = "parrot";
    } else if (petChance <= 2) {
      this.pet = "monkey";
    }
  }

  public void drinkSomeRum() {
    this.drinks = 1 + (int)(Math.random() * 4);
  }

  public void howsItGoindMate() {
    if (!this.isAlive) {
      System.out.println("He's dead.");
    } else if (!this.isConcious) {
      System.out.println("He's unconcious.");
      wakingPirateUp();
    } else if (this.drinks <= 4) {
      System.out.println("Pour me anudder!");
      drinkSomeRum();
    } else {
      System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?!");
      this.isConcious = false;
    }
  }

  public void wakingPirateUp() {
    this.isConcious = true;
  }

  @Override
  public void brawl(Person otherPerson) {
    if (this.power < otherPerson.power) {
      die();
    } else if(this.power == otherPerson.power) {
      this.isConcious = false;
      otherPerson.isConcious = false;
    } else if (this.power > otherPerson.power) {
      otherPerson.isAlive = false;
    }
  }

  @Override
  public void die() {
    this.isAlive = false;
  }
}
