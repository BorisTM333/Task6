import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Pyta użytkownika o wynik z testu od 0 do 100
        System.out.print("Podaj twój wynik z testu (od 0 do 100): ");
        int wynik = scanner.nextInt();
        
        // Sprawdza czy wynik jest od 90 lub wyższy
        if (wynik >= 90) {
            System.out.println("Ocena: A"); // Ocena A jest od 90 i powyżej
        // Sprawdza czy wynik jest od 80 do 89 
        } else if (wynik >= 80) {
            System.out.println("Ocena: B"); // Ocena B jest od 80 do 89
        // Sprawdza czy wynik jest od 70 do 79    
        } else if (wynik >= 70) {
            System.out.println("Ocena: C"); // Ocena C jest od 70 do 79
        // Sprawdza czy wynik jest od 60 do 69
        } else if (wynik >= 60) {
            System.out.println("Ocena: D"); // Ocena D jest od 60 do 69
        // Jeśli wynik jest poniżej 60
        } else {
            System.out.println("Ocena: F"); // Ocena F jest poniżej 60
        }
        
        scanner.close();
    }
}