import java.util.Scanner;
public class Armstrong {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = sc.nextInt();
        int temp = 0;
        temp = a;
       int sum = 0;
       int remainder = 0;
        while(temp !=0){
            remainder = temp % 10;
            sum += Math.pow(remainder,3);
            temp /= 10;
        }
        if(sum == a){
            System.out.println(a + "is an armstrong number");
        }
        else{
            System.out.println(a + "is not an armstrong number");
        }

    }
}
