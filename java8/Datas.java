package java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;


public class Datas {
	
	public static void main(String[] args) {
		LocalDate hoje  = LocalDate.now();
		System.out.println(hoje);
		
		LocalDate olimpiadasRio = LocalDate.of(2021, Month.JUNE, 5);
		
		System.out.println(olimpiadasRio.getYear()+ " - "+ hoje.getYear());
		
		int anos = olimpiadasRio.getYear() - hoje.getYear();
		System.out.println(anos);
		
		Period periodo = Period.between(hoje, olimpiadasRio);
		
		System.out.println(periodo.getYears());
		System.out.println(periodo.getMonths());
		System.out.println(periodo.getDays());
		
		System.out.println(hoje.plusYears(1));
		System.out.println(hoje.plusMonths(4));
		System.out.println(hoje.plusDays(2));
		
		olimpiadasRio.plusYears(4);
		System.out.println(olimpiadasRio);
		
		LocalDate proximoOlimpiada = olimpiadasRio.plusYears(4);
		System.out.println(proximoOlimpiada);
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String valorFormatado = proximoOlimpiada.format(formatador);
		System.out.println(valorFormatado);

		LocalDateTime agora = LocalDateTime.now();
		DateTimeFormatter fomatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:MM:ss");
		
		String hojeformatado = agora.format(fomatadorComHoras);
		System.out.println(hojeformatado);
		
		YearMonth anoEMes = YearMonth.of(2015, Month.JANUARY);
		LocalTime intervalo = LocalTime.of(12, 30);
		
		System.out.println(intervalo);

		
	}

}
