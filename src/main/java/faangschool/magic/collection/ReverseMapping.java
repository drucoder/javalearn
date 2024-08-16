package faangschool.magic.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ReverseMapping {
    public static void main(String[] args) {

        HashMap<String, String> countryCapital = new HashMap<>();
        countryCapital.put("France", "Paris");
        countryCapital.put("England", "London");
        countryCapital.put("Russia", "Moscow");

        System.out.println(countryCapital);

        Map<String, String> capitalCountry = countryCapital
                .entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));

        System.out.println(capitalCountry);
    }
}
