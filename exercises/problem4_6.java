package exercises;

public class problem4_6 {
    public static int findGoodChip(int[] chips) {
        if (chips.length == 1) {
            return chips[0];
        }

        int[] moreThanHalfGoodChips = new int[chips.length/2 + 1];
        int index = 0;

        for (int i = 0; i < chips.length - 1; i += 2) {
            int[] pairwiseTest = pairwiseTest(chips[i], chips[i + 1]);

            if (pairwiseTest[0] == 0 && pairwiseTest[1] == 0) {
                moreThanHalfGoodChips[index] = chips[i];
                index ++;
            }
        }

        if (chips.length % 2 == 1) {
            moreThanHalfGoodChips[index] = chips[chips.length - 1];
        }

        int goodChip = findGoodChip(moreThanHalfGoodChips);

        return goodChip;
    }

    public static int[] pairwiseTest(int chip1, int chip2){
        int[] result = new int[2];
        
        if (chip1 == 0) {
            result[0] = chip2;
        } else {
            result[0] = (int) Math.round(Math.random());
        }

        if (chip2 == 0) {
            result[1] = chip1;
        } else {
            result[1] = (int) Math.round(Math.random());
        }

        return result;
    }
}