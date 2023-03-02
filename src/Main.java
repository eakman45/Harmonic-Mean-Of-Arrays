import java.util.Random;

public class Main {
    static double harmonicMean(int[] arr){
        double sum=0.0;
        for (double i=0;i<arr.length;i++){
            sum += 1.0/arr[(int) i];
        }
        return arr.length/sum;
    }
    public static void main(String[] args) {
        Random rand = new Random();
        int[] myArr = new int[10];

        for(int i = 0; i < myArr.length;i++){
            int number = rand.nextInt(1,10);
            myArr[i]=number;
        }
        System.out.println("Our array contains : ");
        for(int i = 0; i< myArr.length;i++){
            System.out.print("["+myArr[i]+"]");
        }
        System.out.print("\nHarmonic Mean Of Our Array is = ");
        System.out.print(harmonicMean(myArr));


    }
}
