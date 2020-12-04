import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);

        System.out.print("Enter the fibonacci sequence number= ");
        int lines = inputUser.nextInt();
        fibo(lines);
    }
    static void fibo(int rows){
        int first = 0;
        int second = 1;
        int result = first;

        for (int i = 1; i <= rows; i++){
            result = first + second;
            second = first;
            first = result;
        }
        System.out.println("The fibonacci number [" + rows + "] is \"" + result + "\"");
        int i = 0;
        first = 0;
        second = 1;
        result = first;

        for ( i = 0; i<=rows; i++){
            System.out.print("|");
            int x = Integer.toString(result).length();
            int ilen= Integer.toString(i).length();
            if (x == 2){
                for (int j = 1; j < x; j++){
                    System.out.print(i);
                    if (ilen != x) System.out.print(" ");
                }
            }
            else if (x > 2){
                for (int j = 1; j < x; j++){
                    if (x %2 != 0){
                        if (j == x/2) {
                            System.out.print(i);
                        }else {
                            System.out.print(" ");
                        }
                    }else {
                        if (j == x/2) {
                            System.out.print(i);
                        }else {
                            System.out.print(" ");
                        }
                    }
                }
            }else {
                System.out.print(i);
            }
            if (i == rows) System.out.println("|");
            result = first + second;
            second = first;
            first = result;
        }
        first = 0;
        second = 1;
        result = first;

        for ( i = 0; i<=rows; i++){
            System.out.print("|" + result);
            result = first + second;
            if (i == rows) System.out.println("|");
            second = first;
            first = result;
        }
    }
}
