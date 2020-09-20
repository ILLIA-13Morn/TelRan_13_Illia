package de.telran.application;

import de.telran.dao.Schedule;
import de.telran.data.Address;
import de.telran.data.Cinema;
import de.telran.data.Film;
import de.telran.data.Genre;

import java.time.LocalDate;


public class CinemaApp {
    public static void main(String[] args) {
        Cinema cinema1 = new Cinema("Stella");
        Cinema cinema2 = new Cinema("Thalia", new Address("Hauptstrasse", 16 ));


        Address address = new Address("Berlinerstrasse", 10);
        Cinema cinema3 = new Cinema("Astra",address);
        Cinema cinema4 = new Cinema ("Cinemax", new Address("Alexanderplatz", 1));

        cinema1.setAddress(new Address("Wasserturmstrasse", 5));
        System.out.println(cinema1.getAddress());
        cinema1.getAddress().setStreet("Wasserturms");
        cinema1.getAddress().setHouseNumber(7);
        System.out.println(cinema1.getAddress());

        Cinema[] cinemas = {cinema1,cinema2,cinema3,cinema4};
        Cinema[] cinemas1 = {cinema1};
        Cinema[] cinemas2 = {cinema3};
        Cinema[] cinemas3 = {cinema2};
        Cinema[] cinemas4 = {cinema4};

        Film film1 = new Film("Harry Potter", LocalDate.of(2020, 9,18), Genre.ADVENTURE,cinemas);
        Film film2 = new Film("Titanic", LocalDate.of(2020, 9, 20),Genre.DRAMA, cinemas);
        Film film3 = new Film("Hail Ceaser", LocalDate.of(2020, 9,18), Genre.THRILLER, cinemas1);
        Film film4 = new Film("Forssage", LocalDate.of(2020,9,21), Genre.THRILLER, cinemas3);
        Film film5 = new Film("AnimalKingdom", LocalDate.of(2020,9,22), Genre. CRIME, cinemas2);
        Film film6 = new Film("ThePlaceBeyondThePines", LocalDate.of(2020,9,24), Genre. CRIME, cinemas1);
        Film film7 = new Film("KissKissBangBang", LocalDate.of(2020,9,26), Genre. CRIME, cinemas4);

        Schedule schedule = new Schedule(50);
        schedule.addFilm(film1);
        schedule.addFilm(film2);
        schedule.addFilm(film3);
        schedule.addFilm(film4);
        schedule.addFilm(film5);
        schedule.addFilm(film6);
        schedule.addFilm(film7);

        //schedule.displayFilms();
        schedule.displayFilmsByCinema("Cinemax");
        schedule.displayFilmsByDate(LocalDate.of(2020,9,29));
        schedule.dispayFilmByGenre(Genre.COMEDY);

    }
}
