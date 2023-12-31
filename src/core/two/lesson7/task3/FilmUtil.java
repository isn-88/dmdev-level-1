package core.two.lesson7.task3;

import core.two.lesson7.task3.entity.Film;
import core.two.lesson7.task3.entity.Genre;
import java.util.ArrayList;
import java.util.List;

public final class FilmUtil {

  private FilmUtil() {
  }

  public static List<Film> getAllFilms() {
    List<Film> films = new ArrayList<>();
    films.add(new Film(1, 1999, 12, Genre.DRAMA, 9.1));
    films.add(new Film(2, 1994, 9, Genre.DRAMA, 9.0));
    films.add(new Film(3, 1994, 6, Genre.DRAMA, 9.0));
    films.add(new Film(4, 2011, 9, Genre.DRAMA, 9.0));
    films.add(new Film(5, 1993, 11, Genre.DRAMA, 8.9));
    films.add(new Film(6, 2014, 10, Genre.FANTASY, 8.9));
    films.add(new Film(7, 2003, 12, Genre.FANTASY, 8.9));
    films.add(new Film(8, 1999, 9, Genre.THRILLER, 8.8));
    films.add(new Film(9, 2017, 10, Genre.CARTOON, 8.8));
    films.add(new Film(10, 2001, 7, Genre.CARTOON, 8.8));
    films.add(new Film(11, 1994, 5, Genre.DRAMA, 8.8));
    films.add(new Film(12, 1973, 9, Genre.COMEDY, 8.8));
    films.add(new Film(13, 2001, 12, Genre.FANTASY, 8.8));
    films.add(new Film(14, 2002, 12, Genre.FANTASY, 8.8));
    films.add(new Film(15, 1981, 7, Genre.DETECTIVE, 8.8));
    films.add(new Film(16, 2001, 4, Genre.CARTOON, 8.8));
    films.add(new Film(17, 1980, 2, Genre.DETECTIVE, 8.7));
    films.add(new Film(18, 1994, 6, Genre.CARTOON, 8.7));
    films.add(new Film(19, 1991, 7, Genre.FANTASY, 8.7));
    films.add(new Film(20, 1985, 7, Genre.FANTASY, 8.7));
    return films;
  }
}
