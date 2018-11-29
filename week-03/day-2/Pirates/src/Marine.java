public class Marine extends Person implements Randomize{

  int minWages;
  int actualWage;
  boolean isMutinous;

  public Marine() {
    super();
    this.minWages = 2;
    this.actualWage = 0;
    this.isMutinous = false;
  }

  public void getWages() {
    this.actualWage++;
  }

  public void wereIsMyWages() {

    if (this.actualWage < this.minWages) {
      this.beMutinous();
      System.out.println("Hmpf, you are my Captain? NOOOOO!!!!");
    }
  }

  public boolean beMutinous() {
    return this.isMutinous = true;
  }
}
