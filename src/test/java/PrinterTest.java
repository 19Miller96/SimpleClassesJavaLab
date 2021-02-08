import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before() {
        printer = new Printer(100, 100);
    }

    @Test
    public void hasPaper() {
        assertEquals(100, printer.hasPaper());
    }

    @Test
    public void canPrint() {
        assertEquals(80, printer.print(2, 10));
    }

    @Test
    public void hasToner() {
        assertEquals(100, printer.getToner());
    }

    @Test
    public void printingReducesToner() {
        assertEquals(80, printer.print(2, 10));
    }

}
