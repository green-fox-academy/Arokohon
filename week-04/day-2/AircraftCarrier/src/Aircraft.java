public class Aircraft {

  int ammo;
  int maxAmmo;
  int baseDamage;
  String type;
  boolean priority;

  public int fight() {
    int damage = 0;
    damage += this.baseDamage * this.ammo;
    this.ammo = 0;
    return damage;
  }

  public int refill(int ammoForFill) {
    this.ammo += this.maxAmmo - this.ammo;
    ammoForFill -= this.maxAmmo - this.ammo;
    return ammoForFill;
  }

  public String getType() {
    return this.type;
  }

  public String getStatus() {
    return "Type: " + getType()
        + " Ammo: " + this.ammo
        + " Base damage: " + this.baseDamage
        + " Total damage: " + (this.ammo * this.baseDamage);
  }

  public boolean isPriority() {
    return this.priority;
  }
}
