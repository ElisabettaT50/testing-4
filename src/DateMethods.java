import java.time.OffsetDateTime;

/*
Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
ottieni l'anno
ottieni il mese
ottieni il giorno
ottieni il giorno della settimana
Stampa i risultati sulla console
Crea dei test per questo esercizio
 */
public class DateMethods {
    public static void main(String[] args) {
        String date = "2023-03-01T13:00:00Z";
        printDateDetails(date);
    }
    public static void printDateDetails(String myDate) {

        OffsetDateTime offsetDateTime = OffsetDateTime.parse(myDate);
        Integer year = offsetDateTime.getYear();
        String month = String.valueOf(offsetDateTime.getMonth());
        Integer day = offsetDateTime.getDayOfMonth();
        String dayOfWeek = String.valueOf(offsetDateTime.getDayOfWeek());
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
        System.out.println(dayOfWeek);

    }
}