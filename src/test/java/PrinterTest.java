import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before() {
        printer = new Printer(100);
    }

    @Test
    public void hasPaper() {
        assertEquals(100, printer.hasPaper());
    }

    @Test
    public void canPrint() {
        assertEquals(20, printer.print(2, 10));
    }

}
