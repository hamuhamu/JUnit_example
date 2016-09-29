import static org.junit.Assert.assertSame;

import org.junit.Test;

public class ExampleTest2 {

	@Test
	public void サンプルテスト() {
		Example example = new Example();
		int expected = 3;
		int actual = example.add(1, 2);

		assertSame(expected, actual);
	}
}