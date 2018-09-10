package br.ufg.inf.mf.pratica;

import java.util.Locale;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Nome {

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		Locale locale = new Locale("pt", "BR");
		String dateOfWeek = localDate.format(DateTimeFormatter.ofPattern("EEEE", locale));
		System.out.println(dateOfWeek);
	}
}
