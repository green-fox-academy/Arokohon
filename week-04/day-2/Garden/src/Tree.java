public class Tree extends Plant {

  Tree(String type, String color) {
    this.type = type;
    this.color = color;
    this.waterLevel = 0;
    this.waterUsageEfficiency = 0.4;
    this.minWaterLevel = 10;
  }
}
