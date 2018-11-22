public class Main {

  public static void main(String[] args) throws Exception{

    Carrier crownOfTerra = new Carrier(2300, 5000);
    Carrier enemyCarrier = new Carrier(2000, 1500);

    F35 plane1 = new F35();
    F35 plane2 = new F35();
    F35 plane3 = new F35();
    F16 plane4 = new F16();

    crownOfTerra.addAirCraft(plane1);
    crownOfTerra.addAirCraft(plane2);
    crownOfTerra.addAirCraft(plane3);
    crownOfTerra.addAirCraft(plane4);

    System.out.println(crownOfTerra.getCarrierStatus());
    System.out.println("Aircrafts:");
    for (int i = 0; i < crownOfTerra.listOfPlanes.size(); i++) {
      System.out.println(crownOfTerra.listOfPlanes.get(i).getStatus());
    }

    crownOfTerra.fill();

    System.out.println(crownOfTerra.getCarrierStatus());
    System.out.println("Aircrafts:");
    for (int i = 0; i < crownOfTerra.listOfPlanes.size(); i++) {
      System.out.println(crownOfTerra.listOfPlanes.get(i).getStatus());
    }
    System.out.println(enemyCarrier.getCarrierStatus());

    crownOfTerra.fight(enemyCarrier);

    System.out.println(enemyCarrier.getCarrierStatus());
    System.out.println(crownOfTerra.getCarrierStatus());
    System.out.println("Aircrafts:");
    for (int i = 0; i < crownOfTerra.listOfPlanes.size(); i++) {
      System.out.println(crownOfTerra.listOfPlanes.get(i).getStatus());
    }

    try {
      crownOfTerra.fill();
    }
    catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
