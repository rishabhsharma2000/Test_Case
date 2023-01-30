package Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Functiontesting {

	@Test
	void testPallin() {
		Testclass test = new Testclass();
		boolean result = test.pallindrome(121);
		assertEquals(true,result);

}

}