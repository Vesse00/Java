
import java.util.Scanner;

class drugie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Podaj wyraz: ");
        String wpisz = sc.nextLine();

        int liczba = wpisz.length();
        System.out.println("Tyle ma znakow to co wpisales: "+ liczba);

    }
}
