package Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Freqofchar {

	@Test
	void testofFreqChar() {
		Testclass test = new Testclass();
		int output = test.charFrequency("rishabh", 'h');
		assertEquals(2,output );
	}

}
