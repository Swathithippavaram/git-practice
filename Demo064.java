import java.util.Arrays;

public class Demo064 {
    public static void main(String[] args){
        int[] array = {10,20,30};
        System.out.println(Arrays.toString(array));

        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;
        for(int i=0;i<array.length;i++){


        System.out.println(array[i]+ " ");
    }
    
}
}