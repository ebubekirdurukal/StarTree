import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.*;

public class MyTest {

    @Test
    public void testConcatenate() {
        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream("abc".getBytes());
        System.setIn(in);
        Main.printSomeTree();


    }
}