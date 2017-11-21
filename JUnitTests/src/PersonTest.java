import static org.junit.jupiter.api.Assertions.*;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class PersonTest {
	Person p= new Person(2);
	@BeforeClass
	void testPerson() {
		
		fail("Cannot initialize object of class Person");
		assertNull(p);
	}

	@Test
	void testIsAdult() {
		// Young
		//assertEquals(false, new Person(2).isAdult());
		assertFalse(p.isAdult());
		// Adult
		//assertEquals(true, new Person(18).isAdult());
		assertTrue(new Person(18).isAdult());
		//fail("isAdult()");
	}
	
	@Test
	void testSmile() {
		
	}

}
