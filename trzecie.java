
import java.util.Scanner;

public class trzecie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Podaj Imie i nazwsko: ");
        String imienazw = sc.nextLine();

        String[] tak = imienazw.split(" ");

        System.out.print("Podaj swoj wiek: ");
        int wiek = sc.nextInt();

        System.out.print("Podaj swoja wage: ");
        double waga = sc.nextDouble();

        System.out.print("Podaj swoj wzrost (w cm): ");
        int wzrost = sc.nextInt();

        double BMI = (waga/Math.pow(wzrost, 2))*10000;

        

        System.out.println("");

        System.out.println("Imie: "+ tak[0]);
        System.out.println("Nazwisko: " + tak[1]);
        System.out.println("Wiek: " + wiek);

        System.out.println("Twoje BMI to: "+ BMI);
        System.out.println("");

        if(BMI<16){
            System.out.println("BMI wyglodzenie");
        }else if(BMI>16 && BMI<17){
            System.out.println("BMI wychudzenie");
        }else if(BMI>17&& BMI<18.5){
            System.out.println("BMI niedowaga");
        }else if(BMI>18.5 && BMI<25){
            System.out.println("BMI poprawne");
        }else if(BMI>25 && BMI<40){
            System.out.println("BMI nadwaga");
        }

    }
}
