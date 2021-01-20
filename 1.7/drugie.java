import java.util.Scanner;

public class drugie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj swoje imie: ");
        String imie = sc.next();

        System.out.print("Podaj swoje nazwisko: ");
        String nazws = sc.next();


        System.out.println("Imie ma: "+imie.length() + "  Nazwisko ma: "+nazws.length());
    }
}
