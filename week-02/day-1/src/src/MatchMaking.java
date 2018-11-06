import java.util.*;

public class MatchMaking {

    public static void main(String[] args) {

        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Claire","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Tom","Todd","Neef","Jeff"));

        System.out.println(makingMatches(girls, boys));
    }

    public static ArrayList makingMatches (ArrayList a, ArrayList b) {

        ArrayList matchedList = new ArrayList();

        if (a.size() >= b.size()) {
            for (int i = 0; i < b.size(); i++) {
                matchedList.add(b.get(i));
                matchedList.add(a.get(i));
            }
        } else if (a.size() <= b.size()) {
            for (int i = 0; i < a.size(); i++) {
                matchedList.add(a.get(i));
                matchedList.add(b.get(i));
            }
        }
        return matchedList;
    }
}
