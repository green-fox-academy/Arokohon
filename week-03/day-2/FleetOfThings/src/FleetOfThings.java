public class FleetOfThings {
    // Create a fleet of things to have this output:
    // 1. [ ] Get milk
    // 2. [ ] Remove the obstacles
    // 3. [x] Stand up
    // 4. [x] Eat lunch
    public static void main(String[] args) {
        Fleet fleet = new Fleet();
        fleet.add(new Thing("Get milk"));
        fleet.add(new Thing("Remove the obstacles"));
        Thing thing3 = new Thing("Stand up");
        thing3.complete();
        fleet.add(thing3);
        Thing thing4 = new Thing("Eat lunch");
        thing4.complete();
        fleet.add(thing4);
        System.out.println(fleet);
    }
}