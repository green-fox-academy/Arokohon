import java.util.HashMap;

public class MatReview {

    public static void main(String[] args) {

        String Whatever = "egy, kettő, három, négy öt hat";
        System.out.println(Whatever.length());
        System.out.println(Whatever.substring(6, 10));
        System.out.println(Whatever.replace("kettő", "TipTop"));
        System.out.println(Whatever.charAt(2));

        String firstString = "al" + "ma";
        System.out.println(firstString == "alma");

        String SecondString = "kör";
        SecondString += "te";
        System.out.println(SecondString.equals("körte"));

        String thirdString = "apple";
        String fourthString = "honey";
        System.out.println(thirdString.compareTo(fourthString));

        String fifthString = "greenfox";
        System.out.println(fifthString.toUpperCase());

        String subWhatever = Whatever.substring(0, 10);
        System.out.println(Whatever.contains("d"));
        System.out.println(Whatever.endsWith("k"));

        String [] WhateverSplit = Whatever.split("e");
        for (String what: WhateverSplit){
            System.out.println(what);
        }

        HashMap<Integer, String> daysOfTheWeek = new HashMap<>();
        daysOfTheWeek.put(1, "Monday");
        daysOfTheWeek.put(2, "Tuesday");
        daysOfTheWeek.put(3, "Wednesday");
        daysOfTheWeek.put(4, "Thursday");
        daysOfTheWeek.put(5, "Friday");

        System.out.println(daysOfTheWeek.get(4));

        HashMap<String, String> engHunDic = new HashMap<>();
        engHunDic.put("apple", "alma");
        engHunDic.put("dog", "kutya");
        engHunDic.put("cat", "macska");

        System.out.println(engHunDic.get("apple"));

        for (String key: engHunDic.keySet()){
            System.out.println(key);
        }

    }
}
