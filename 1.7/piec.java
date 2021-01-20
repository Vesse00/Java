import java.util.Scanner;
public class piec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj zdanie lub wyraz: ");
        String zdanie = sc.nextLine();

        for(int i=0; i<zdanie.length(); i++) System.out.println(zdanie.charAt(i));
    }
}