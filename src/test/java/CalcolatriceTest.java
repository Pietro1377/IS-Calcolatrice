import com.is.calcolatrice.Calcolatrice;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalcolatriceTest {
    Calcolatrice calc;

    @Before
    public final void setUp() {
        calc= new Calcolatrice();
    }

    @Test
    public void TestSomma() {
        Assert.assertEquals("Somma corretta", 12, calc.somma(11, 1));
    }
    @Test
    public void TestMoltiplicazione() {
        Assert.assertEquals("Moltiplicazione corretta", 20, calc.moltiplicazione(10, 2));
    }
    @Test
    public void TestSottrazione() {
        Assert.assertEquals("Sottrazione corretta", 10, calc.sottrazione(11, 1));
    }
    @Test
    public void TestDivisione() {
        Assert.assertEquals("Divisione corretta", 5, calc.divisione(10, 2), 0);
    }
    @Test
    public void TestDivisionePerZero() {
        Assert.assertEquals("Divisione per zero corretta", 0, calc.divisione(10, 0), 0);
    }
}
