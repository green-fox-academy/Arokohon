import java.util.*;

public class SolarSystem {

    public static void main(String[] args) {

        ArrayList<String> planetList = new ArrayList<String>(Arrays.asList("Mercury","Venus","Earth","Mars","Jupiter","Uranus","Neptune"));
        System.out.println(putSaturn(planetList));
    }

    public static List putSaturn (List inputArrayList){

        if (inputArrayList.get(5) != "Saturn"){
            inputArrayList.add(5, "Saturn");
//            inputArrayList.set(5, "Saturn"); set = felülírja, add = beszúrja (mögötte lévő elemeket eltolja).
        }
        return inputArrayList;
    }
}