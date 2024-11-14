import org.junit.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void testDMainTest(){

        //Creo l'ogggetto Offset da testare
        OffsetDateTime data1 = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime data2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");
        //controlla se data 1 è prima di data 2
        boolean data1isBeforeData2 = data1.isBefore(data2);
        //assertTrue verifica che il risultato del controllo corrisponde al valore atteso
       assertTrue(data1isBeforeData2, "Data 1 viene prima di data 2");
    }

    @Test
    public void MainTest2(){
        //Inizializziamo sempre gli oggetti in test per garantire che ogni test sia indipendente
        //e non dipenda da altre esecuzioni
        OffsetDateTime data1 = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime data2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");
        //eseguiamo il controllo
        boolean data2isAfterData1 = data2.isAfter(data1);
        //Verifica che il risultato corrisponde al valore atteso
        assertTrue(data2isAfterData1);

    }

    @Test
    public void MainTest3(){
        OffsetDateTime data1 = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime data2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");

        boolean data1isEqualToData2 = data1.equals(data2);

        assertFalse(data1isEqualToData2, "Le due date non sono uguali");

    }
    @Test
    public void MainTest4() {
        OffsetDateTime data1 = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime data2 = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        boolean data1IsEqualToData2 = data1.equals(data2);

        // Verifica che le date siano uguali
        assertTrue(data1IsEqualToData2, "Le due date sono uguali");
    }
}