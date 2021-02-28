import java.util.Random;

public class HW4 {

    // 4 *) Create a password generator that will generate random passwords according to the following rules:
    // Password consists of 8 characters
    // Only latin capital and small letters, numbers and underscore are allowed in the password
    // The password must contain large, small letters and numbers

    private static final String lover = "abcdefghijklmnopqrstuvwxyz";
    private static final String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String digits = "0123456789_";
    private static final Random random = new Random();

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        permutationOfArray(arr);
        for (int length = 8; length > 0; length--) {
            if (length == arr[0] || length == arr[3] || length == arr[6]) {
                sb.append(lover.charAt(random.nextInt(lover.length())));
            }
            if (length == arr[1] || length == arr[4] || length == arr[7]) {
                sb.append(upper.charAt(random.nextInt(upper.length())));
            }
            if (length == arr[2] || length == arr[5]) {
                sb.append(digits.charAt(random.nextInt(digits.length())));
            }
        }
        String passW = sb.toString();
        System.out.println(passW);
    }

    private static void permutationOfArray(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            int a = arr[index];
            arr[index] = arr[i];
            arr[i] = a;
        }
    }
}

