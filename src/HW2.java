public class HW2 {

    public static void main(String[] args) {
        // 2) Output all numbers from 1 to 99 in 1 line separated by a space with the following changes:
        // - if the number is a multiple of 3 then output Hello instead ;
        // - if the number is a multiple of 5 then output World instead ;
        // - if the number is a multiple of both 3 and 5 then print HelloWorld instead .
        for (int i = 1; i < 101; i++) {
            if (i % 15 == 0) {
                System.out.print("HelloWorld ");
                continue;
            }
            if (i % 3 == 0) {
                System.out.print("Hello ");
                continue;
            }
            if (i % 5 == 0) {
                System.out.print("World ");
                continue;
            }
            System.out.print(i + " ");
        }
    }
}

