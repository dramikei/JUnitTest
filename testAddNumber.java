package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumber {

	@Test
	public void test() {
        jUnitTesting addNum = new jUnitTesting();
        int result = addNum.addNumbers(10, 200);
        assertEquals (210,result);
        result = addNum.addNumbers(200, 200);
        assertEquals (300, result);
    }

}
