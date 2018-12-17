package space.sirdir;

import org.junit.Test;

public class WorkWithStringsTest {

    @Test
    public void someTest(){

        WorkWithStrings wws = new WorkWithStrings();
        String aaaa = wws.countCharsInARow("abbacccc");
        System.out.println("text = " + aaaa);
    }

}
