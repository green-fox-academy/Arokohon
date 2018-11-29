public class Marine extends Person implements Fightable{

  int minWages;
  int actualWage;
  boolean isMutinous;

  public Marine() {
    super();
    this.minWages = 3;
    this.actualWage = 0;
    this.isMutinous = false;
  }

  @Override
  public void fight(Person opponent) {

  }

  public void getWages() {

  }

  public void wereIsMyWagesCaptain() {

  }
}
