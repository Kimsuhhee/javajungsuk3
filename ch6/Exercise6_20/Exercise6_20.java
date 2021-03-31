package basic_practiceCH6.Exercise6_20;

import java.util.Arrays;

public class Exercise6_20 {
    public static int [] shuffle(int [] arr){
        for(int i=0;i<arr.length*2;i++){
            int j = (int)(Math.random()*arr.length);
            int k = (int)(Math.random()*arr.length);
            int tmp=arr[j];
            arr[j]=arr[k];
            arr[k]=tmp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int [] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(original));

        int [] result = shuffle(original);
        System.out.println(Arrays.toString(result));
    }
}