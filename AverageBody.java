public class AverageBody{
    public static void main(String[] args) {
        int [] numbers = {10,20,30,40,50};
        double avg= Methods.average(numbers);
        int total= Methods.sum(numbers);
        int count= Methods.count(numbers);
        System.out.println("The sum is: "+ total);
        System.out.println("The count is: "+ count);
        System.out.println("The average is: "+ avg);
    }
}