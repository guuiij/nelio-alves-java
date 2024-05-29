package nelioAlves.dataHora.application;

import academy.maratonajava.javacore.Gassociacao.Dominio.Local;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataIntroducao {
    public static void main(String[] args) {
        // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
        DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");


        //Declarando variável tipo LocalDate
        LocalDate d01 = LocalDate.now(); // Instanciar com a data LOCAL
        LocalDateTime d02 = LocalDateTime.now(); // Instanciando COM TEMPO
        Instant d03 = Instant.now(); // Instanciando com o Horário de londres GMT
        LocalDate d04 = LocalDate.parse("2024-06-18");// Pegar texto ISO 8601 e gerar uma Data-Hora
        LocalDateTime d05 = LocalDateTime.parse("2024-06-18T21:14:18");// Pegando Texto com hora e Imprimindo
        Instant d06 = Instant.parse("2024-06-18T21:14:18z"); // Gerar data hora no padrão UTC- pegando texto e exibindo Data-hora)
        Instant d07 = Instant.parse("2024-06-18T21:14:18-03:00"); // Guardar horário equivalente no zulu

        LocalDate d08 = LocalDate.parse("18/06/2024" , fmt01);// Texto no formato customiozado - necessario indicar
        LocalDate d09 = LocalDate.parse("18/06/2024 01:30" , fmt02);// Texto no formato customiozado - necessario indicar

        // Instanciando datar isolada " Dia, mes,ano [horario] -> data hora
        LocalDate d10 = LocalDate.of(2024,6,18);
        LocalDateTime d11 = LocalDateTime.of(2024,6,18, 3, 12);



        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03);
        System.out.println("d04 = " + d04);
        System.out.println("d05 = " + d05);
        System.out.println("d06 = " + d06);
        System.out.println("d07 = " + d07);
        System.out.println("d08 = " + d08);
        System.out.println("d09 = " + d09);
        System.out.println("d10 = " + d10);
        System.out.println("d11 = " + d11);

    }
}
