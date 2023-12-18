import static java.lang.Integer.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        ArrayList<Integer> numbers = new ArrayList<>();
        int count = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < count; i++) {
            numbers.add(Integer.parseInt(bufferedReader.readLine()));
        }

        printAvg(numbers);
        printCenter(numbers);
        printFrequent(numbers);
        printRange(numbers);
    }

    private static void printAvg(final ArrayList<Integer> nums) {
        ArrayList<Integer> numbers = new ArrayList<>(nums);

        double avg = numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);

        System.out.println((int)Math.round(avg));
    }

    private static void printCenter(final ArrayList<Integer> nums) {
        ArrayList<Integer> numbers = new ArrayList<>(nums);

        Collections.sort(numbers);
        int center = numbers.get(numbers.size() / 2);

        System.out.println(center);
    }

    private static void printFrequent(final ArrayList<Integer> nums) {
        ArrayList<Integer> numbers = new ArrayList<>(nums);
        ArrayList<Integer> duplicatedNumbers = new ArrayList<>();
        Map<Integer, Integer> frequentMap = new HashMap<>();
        int max = 0;
        int result = 0;

        for(int number: numbers){
            if(frequentMap.containsKey(number)){
                int count = frequentMap.get(number) + 1;
                frequentMap.put(number, count);
                continue;
            }

            frequentMap.put(number, 1);
        }

        for(Map.Entry<Integer, Integer> entry: frequentMap.entrySet()){
            int num = entry.getValue();

            if(max < num){
                max = num;
                result = entry.getKey();
            }
        }

        for(Map.Entry<Integer, Integer> entry: frequentMap.entrySet()){
            if(max == entry.getValue()){
                duplicatedNumbers.add(entry.getKey());
            }
        }

        if(duplicatedNumbers.size() >= 2) {
            Collections.sort(duplicatedNumbers);
            System.out.println(duplicatedNumbers.get(1));

            return;
        }

        System.out.println(result);
    }


    private static void printRange(final ArrayList<Integer> nums) {
        ArrayList<Integer> numbers = new ArrayList<>(nums);

        int max = numbers.stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElse(0);

        int min = numbers.stream()
                .mapToInt(Integer::intValue)
                .min()
                .orElse(0);

        System.out.println(max - min);
    }
}
