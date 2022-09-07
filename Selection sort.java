package ApnaCollege;

public class Selectionsort {
    public static void Printarray(int array[])
    {
        for (int i = 0 ; i < array.length;i++)
            System.out.println(array[i]+"");
    }

    public static void main(String[] args){
        int array[] = { 7 , 8 , 9, 2, 10 , 4 , 6,};

        //time complexity : O(n^2) its big o of n square
        //selection sort
        //first we implement outer loop till n-1
        for (int i = 0 ; i < array.length-1;i++){
            int smallest = i;
                for (int j = i+1 ; j < array.length ; j++){
                    if (array[smallest] > array[j]){
                        smallest = j;

                    }
            }
                int temp = array[smallest];
                array[smallest] = array[i];
                array[i] = temp;
        }
        Printarray(array);
    }
}
