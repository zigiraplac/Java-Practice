public class Methods {
    public static int sum(int[] numbers){
        int total=0;
        for(int num: numbers){
            total+=num;
        }
        return total;
    }
    public static int count(int [] numbers){
        int count=0;
       for (int i = 0; i < numbers.length; i++) {
              count++;  
       }
        return count;
    }
    public static double average (int [] numbers){
        return (double) sum(numbers)/count(numbers);
    }
}
