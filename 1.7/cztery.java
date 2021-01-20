import java.util.Scanner;

public class cztery {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj wyraz: ");
        String wyraz = sc.next();
        

        System.out.println("Pierwsza: "+wyraz.substring(0, 1) + " Ostatnia: "+wyraz.substring(wyraz.length()-1));

    }
}
