import static org.junit.Assert.assertSame;

import org.junit.Test;

public class ExampleTest {

	@Test
	public void サンプルテスト() {
		Example example = new Example();
		int expected = 3;
		int actual = example.add(1, 2);

		assertSame(expected, actual);
	}

	@Test(expected = IllegalArgumentException.class)
	public void 引数を負数とした場合に例外が投げられること() {
		Example example = new Example();
		example.add(-1, 2);
	}
}