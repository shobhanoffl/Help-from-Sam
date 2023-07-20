import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        if(target%2!=0){
            /*
            5 - 0 1 2 4 1 - 2
            4 - 0 1 2 4
             */
            System.out.println(2);
        }else{
            System.out.println(1);
        }
    }
}