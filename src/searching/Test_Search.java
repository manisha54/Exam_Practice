package searching;

import java.util.Arrays;

public class Test_Search {
    public static void main(String[] args) {
        int[]array = {2,3,4,6,1};
        int searchValue = 9;
        System.out.println("From linear Search");

        Linear_Search obj = new Linear_Search();
        if (obj.search(array, searchValue)){
            System.out.println("found");
        }else {
            System.out.println("Not found");
        }

        System.out.println("\n FRom Binary search");
        Binary_Search obj1 = new Binary_Search();
        int[]sorted = obj1.sort(array);
        System.out.println(Arrays.toString(sorted));



    }
}
