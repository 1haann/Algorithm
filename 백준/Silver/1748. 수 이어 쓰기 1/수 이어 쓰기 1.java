import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int length = 10;
        int result = 0 , increment = 1;
        for(int i=1;i<=N;i++){
            if(i==length){
                length *= 10;
                increment ++;
            }
            result += increment;
        }
        System.out.println(result);
    }
}