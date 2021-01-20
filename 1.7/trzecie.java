import java.util.Scanner;

public class trzecie {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Wprowadz zdanie: ");
        String zdanie = sc.nextLine();

        System.out.print(zdanie.toUpperCase());
    }
}
