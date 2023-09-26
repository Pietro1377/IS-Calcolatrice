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
        Assert.assertEquals("somma corretta", 12, calc.somma(11, 1));
    }
    @Test
    public void TestMoltiplicazione() {
        Assert.assertEquals("moltiplicazione corretta", 20, calc.moltiplicazione(10, 2));
    }
}
