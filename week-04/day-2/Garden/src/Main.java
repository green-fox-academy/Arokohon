import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {

    ArrayList<Plant> listOfPlants = new ArrayList<>();

    Garden theGarden = new Garden(listOfPlants);

    theGarden.listOfPlants.add(new Flower("Flower", "Blanka's flower"));
    theGarden.listOfPlants.add(new Flower("Flower", "yellow"));
    theGarden.listOfPlants.add(new Flower("Flower", "blue"));
    theGarden.listOfPlants.add(new Tree("Tree", "purple"));
    theGarden.listOfPlants.add(new Tree("Tree", "orange"));

    theGarden.getGardenStatus();
    System.out.println();
    theGarden.wateringPlant(40);
    System.out.println();
    theGarden.getGardenStatus();
    System.out.println();
    theGarden.wateringPlant(70);
    System.out.println();
    theGarden.getGardenStatus();
  }
}
