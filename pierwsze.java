package java.Java;

import java.util.Scanner;

class pierwsze{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("Podaj halo: ");

            String wpisz = sc.next();
            final String haslo = "dwatrzy";

            if(wpisz.equals(haslo)){
                System.out.println("Wpisane haslo jest prawidlowe");
            }else{
                System.out.println("Wpisane haslo jest nie prawidlowe");
            }
    }
}