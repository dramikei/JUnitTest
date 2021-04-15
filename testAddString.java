package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddString {

	@Test
	public void test() {
        jUnitTesting addString = new jUnitTesting();
        String result = addString.addStrings("Konnichiwa","Kirito");
        assertEquals("KonnichiwaKirito",result);
        result = addString.addStrings("Namaste","Sahaj");
        assertEquals("NamasteSahaj",result);
        result = addString.addStrings("Hello ","ppl");
        assertEquals("helloppl",result);
    }

}
