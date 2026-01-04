package exercises;

import java.util.ArrayList;
import java.util.List;

public class problem4_6 {
    public static int findGoodChip(int[] chips) {
        List<Integer> allIndexes = new ArrayList<>();
        for (int i = 0; i < chips.length; i++) {
            allIndexes.add(i);
        }
        
        return findGoodChipRecursive(chips, allIndexes);
    }

    public static int findGoodChipRecursive(int[] chips, List<Integer> indexes) {
        if (indexes.size() == 1) {
            return indexes.getFirst();
        }

        List<Integer> survivors = new ArrayList<>();

        for (int i = 0; i < indexes.size() - 1; i+=2) {
            int[] pairwiseTest = pairwiseTest(chips[indexes.get(i)], chips[indexes.get(i + 1)]);

            if (pairwiseTest[0] == 0 && pairwiseTest[1] == 0) {
                survivors.add(indexes.get(i));
            }
        }

        if (indexes.size() % 2 == 1) {
            int lastIndex = indexes.get(indexes.size() - 1);
            survivors.add(lastIndex);
        }

        if (survivors.isEmpty()) {
            return indexes.getFirst();
        }

        return findGoodChipRecursive(chips, survivors);
    }

    public static int[] findAllGoodChips(int[] chips) {
        int goodChipIndex = findGoodChip(chips);

        List<Integer> listOfAllGoodChips = new ArrayList<>();
        listOfAllGoodChips.add(goodChipIndex);

        for (int i = 0; i < chips.length; i++) {
            if (i == goodChipIndex) {
                continue;
            }
            int[] pairwiseTest = pairwiseTest(chips[goodChipIndex], chips[i]);

            if (pairwiseTest[0] == 0) {
                listOfAllGoodChips.add(i);
            }
        }

        int[] arrayOfAllGoodChips = listOfAllGoodChips.stream().mapToInt(i -> i).toArray();

        return arrayOfAllGoodChips;
    }

    public static int[] pairwiseTest(int chip1, int chip2){
        int[] result = new int[2];
        
        result[0] = (chip1 == 0) ? chip2 : (int) Math.round(Math.random());
        result[1] = (chip2 == 0) ? chip1 : (int) Math.round(Math.random());

        return result;
    }

    public static void main(String[] args) {
        int[] chips = {1, 0, 0, 0, 1, 1, 0};

        int[] goodChipsIndex = findAllGoodChips(chips);

        for (int chipIndex : goodChipsIndex) {
            System.out.println("Good chip index: " + chipIndex);
        }
    }
}