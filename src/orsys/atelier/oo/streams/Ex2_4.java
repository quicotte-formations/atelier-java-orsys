package orsys.atelier.oo.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Ex2_4 {

	public static void main(String[] args) {
		ArrayList<Film> films = new ArrayList();
		
		films.add( new Film("pulp fiction", "policier", "tarantino", 2000) );
		films.add( new Film("dracula", "horreur", "coppola", 2001) );
		films.add( new Film("apocalypse now", "action", "coppola", 1967) );
		films.add( new Film("cendillon", "enfant", "walt disney", 1954) );
		films.add( new Film("jackie brown", "policier", "tarantino", 1997) );
		
		ArrayList<String> titres = (ArrayList<String>) films.stream()
				.filter( film -> film.getGenre().equals("policier") )
				.filter( film -> film.getRealisateur().equals("tarantino") )
				.sorted(Comparator.comparing(Film::getTitre))
				.map( film -> film.getTitre() )
				.collect(Collectors.toList());
		System.out.println(titres);
	}
}
