package generate;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static utils.Contants.*;

class GenerateSteps {

    private static List<String> results = new ArrayList<>();

    private static String regex = "\\[*]*,*";

    private GenerateSteps() {

    }

    public static String generateStepOne(int length) {
        results.clear();
        IntStream.rangeClosed(1, length).forEach(i -> generateOutput(i, false));
        return results.toString().replaceAll(regex, "");
    }

    public static String generateStepTwo(int length) {
        results.clear();
        IntStream.rangeClosed(1, length).forEach(i -> generateOutput(i, true));
        return results.toString().replaceAll(regex, "");
    }

    public static <T> List<T> generateStepThree(int length) {
        results.clear();
        IntStream.rangeClosed(1, length).forEach(i -> generateOutput(i, true));

        var map = results.stream().filter(r -> !r.chars().allMatch(Character::isDigit))
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        map.put(INTEGERS, results.stream().filter(r -> r.chars().allMatch(Character::isDigit)).count());

        return (List<T>) List.of(
                results.toString().replaceAll("\\[*]*,*", ""),
                new TreeMap<String, Long>(map)
        );
    }

    private static void generateOutput(int i, boolean validateGood) {
        if (validateGood && String.valueOf(i).contains("3")) {
            results.add(GOOD);
        } else {
            switch (i % 15) {
                case 0:
                    results.add(CMASSYSTEMS);
                    break;
                case 3:
                case 6:
                case 9:
                case 12:
                    results.add(CMAS);
                    break;
                case 5:
                case 10:
                    results.add(SYSTEMS);
                    break;
                default:
                    results.add(String.valueOf(i));
            }
        }
    }
}
