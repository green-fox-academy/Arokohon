public class Flower extends Plant {

  Flower(String type, String color) {
    this.type = type;
    this.color = color;
    this.waterLevel = 0;
    this.waterUsageEfficiency = 0.75;
    this.minWaterLevel = 5;
  }
}
