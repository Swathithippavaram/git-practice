public class Demo074 {
    public static void main(String[] args){
        int[] array = {3,2,5,1};
        for(int i=0;i<array.length;i++){
            for(int j=i+1; j<array.length;j++){
               int temp=0;
                if(array[i] > array[j]){
                    temp = array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            } 
            }
            for(int j=0;j<array.length;j++){
                System.out.println(array[j]);
            }
           
        
            
        }
    }
    

