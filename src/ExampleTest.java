import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class ExampleTest {

	@Test
	public void test() {
		String expected = "ABC";
		String actual = "ABC";
		assertSame(expected, actual);
	}
}