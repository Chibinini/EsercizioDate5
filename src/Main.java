import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {

        //creo due oggetti OffsetDateTime
        OffsetDateTime data1 = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime data2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");

        System.out.println("Data1: " + data1);
        System.out.println("Data2: " + data2);

        //Li confronto usando un boolean  è prima?
        boolean isData1BeforeData2 = data1.isBefore(data2);
        //Stampo il risultato
        System.out.println("La prima data è precedente alla seconda " + isData1BeforeData2);
        //Li confronto usando un boolean  è dopo?
        boolean isData2AfterData1 = data2.isAfter(data1);
        //Stampo il risultato
        System.out.println("La seconda data è successiva alla prima? " + isData2AfterData1);
        //Li confronto usando un boolean  l'orario è uguale'?
        boolean dataUguale = data1.toLocalTime().equals(data2.toLocalTime());
        System.out.println("L'orario delle due date è uguale ? " + dataUguale);

    }
}


//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//Crea un secondo oggetto data da questa stringa 2024-03-01T13:00:00Z
//Verificare che la prima data è precedente alla seconda
//Verificare che la seconda data è successiva alla prima
//Verificare che le due date sono uguali ad ora
//Stampa il risultato