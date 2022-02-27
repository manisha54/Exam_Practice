package searching;

public class Binary_Search implements Searching, Sorting {

    @Override
    public boolean search(int[] arr, int searchValue) {
        return false;
    }

    @Override
    public int[] sort(int[] arr) {
        int temp;
        boolean swap = true;
        while (swap){
            swap = false;
            for (int i =0; i< arr.length-1; i++){
                if (arr[i] > arr[i+1]){
                    //swapping the element
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    swap= true;

                }

            }
        }
        return arr;


    }
}
