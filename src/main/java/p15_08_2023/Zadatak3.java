package p15_08_2023;

public class Zadatak3 {
    public static void main(String[] args) {
        // Napisati program koji na ekranu stampa podatke u formatu:
        // [IME I PREZIME]
        // [BROJ TELEFONA], [ULICA I BROJ], [GRAD]
        // [EMAIL]

        String firstName = "Vladimir";
        String lastName = "Bojčić";
        String phoneNumber = "066666666";
        String address = "Negde tamo 1312";
        String city = "Šabac";
        String email = "bojcicv@gmail.com";

        System.out.println("Ime i prezime: " + lastName + " " + firstName);
        System.out.print("Broj telefona: " + phoneNumber);
        System.out.print("Ulica i broj: " + address);
        System.out.println("Grad: " + city);
        System.out.print("E-mail: " + email);
    }
}
