import java.util.ArrayList;

public class Garden {

  ArrayList<Plant> listOfPlants;

  public Garden(ArrayList<Plant> listOfPlants) {
    this.listOfPlants = listOfPlants;
  }

  public void wateringPlant(double amountOfWater) {
    System.out.println("Watering with " + amountOfWater + " amount of water.");
    ArrayList<Plant> listOfThirstyPlants = new ArrayList<>();
    for (int i = 0; i < listOfPlants.size(); i++) {
      if (listOfPlants.get(i).waterLevel < listOfPlants.get(i).minWaterLevel) {
        listOfThirstyPlants.add(listOfPlants.get(i));
      }
    }
    for (int i = 0; i < listOfThirstyPlants.size(); i++) {
      double watering = amountOfWater / listOfThirstyPlants.size() * listOfThirstyPlants.get(i).waterUsageEfficiency;
      listOfThirstyPlants.get(i).waterLevel += watering;
    }
  }

  public void getGardenStatus() {
    for (int i = 0; i < listOfPlants.size(); i++) {
      if (listOfPlants.get(i).waterLevel < listOfPlants.get(i).minWaterLevel) {
        System.out.println(listOfPlants.get(i).type + " " + listOfPlants.get(i).color + " need water!");
      } else {
        System.out.println(listOfPlants.get(i).type + " " + listOfPlants.get(i).color + " doesn't need water!");
      }
    }
  }
}
