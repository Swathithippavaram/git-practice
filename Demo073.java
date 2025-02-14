public class Demo073 {
 
        public static void main(String[] args) {
          int[] array = {1, 2, 3, 2, 4, 5, 2, 3};
      
          System.out.println("Duplicate elements: ");
          for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
              if (array[i] == array[j]) {
                System.out.println(array[i]);
              }
            }
        }
    }
        
    
    
}
