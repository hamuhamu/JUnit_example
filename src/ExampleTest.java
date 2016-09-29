import static org.junit.Assert.assertSame;

import org.junit.Test;

public class ExampleTest {

	@Test
	public void サンプルテスト() {
		String expected = "ABC";
		String actual = "ABC";

		assertSame(expected, actual);
	}
}