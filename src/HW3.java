public class HW3 {

    public static void main(String[] args) {
        // 3 *) Write a method.
        // Input parameter:
        // A space-delimited string of words consisting of uppercase and lowercase letters.
        // The method should return the same string in which the first letter in each word is capital and the rest are small
        String veges = "   cUCemBer toMatOes PotaTOeS pINe   ";
        System.out.println(editLine(veges));
    }

    private static String editLine(String veges) {
        char[] chArray = veges.trim().toLowerCase().toCharArray();
        for (int i = 0; i < chArray.length; i++) {
            if (chArray[i] == ' ') {
                chArray[i + 1] = Character.toUpperCase(chArray[i + 1]);
            }
            chArray[0] = Character.toUpperCase(chArray[0]);
        }
        veges = String.copyValueOf(chArray);
        return veges;
    }
}


