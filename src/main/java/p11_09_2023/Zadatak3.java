package p11_09_2023;

public class Zadatak3 {
    public static void main(String[] args) {
        Film film = new Film("Hello", 2012);
        Reziser reziser = new Reziser("Bi bi", 44);
        Reziser drugiReziser = new Reziser("ti ti", 55, film);

        reziser.setReziraoFilm(film);
//        drugiReziser.setReziraoFilm(film);

        film.stampaj();
        reziser.stampaj();


    }
}
