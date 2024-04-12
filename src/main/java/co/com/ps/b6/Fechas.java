package co.com.ps.b6;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
public class Fechas {
    public static void main(String[] args) {
        Date date=new Date();
        System.out.println(date);

        LocalDate fechaActual=LocalDate.now();

        System.out.println(LocalDate.now());
        System.out.println(LocalDateTime.now());

        LocalDate fechaNacimiento=LocalDate.of(1990,8,27);
        System.out.println(fechaNacimiento);

        int anio=fechaActual.getYear();
        int mes=fechaActual.getMonthValue();
        int dia=fechaActual.getDayOfMonth();

        fechaActual.plusDays(1);
        fechaActual.minusDays(1);

        boolean esIgual=fechaActual.equals(fechaNacimiento);
        boolean esAntes=fechaActual.isBefore(fechaNacimiento);
        boolean esDespues=fechaActual.isAfter(fechaNacimiento);

        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
    }
}
