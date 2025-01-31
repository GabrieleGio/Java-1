import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalcolatriceTest { //Classe che rappresenta il Test Case della Calcolatrice
@Test
void testSomma() {
Calcolatrice c=new Calcolatrice(); //Il test testSomma utilizza il metodo statico assertEquals
assertEquals(2, c.somma(2, 1) ); // per verificare che il metodo somma restituisca la somma
}
}
