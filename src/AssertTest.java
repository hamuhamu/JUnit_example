import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class AssertTest {

	@Test
	public void assertThatテスト() {
		Example example = new Example();
		int expected = 3;
		int actual = example.add(1, 2);

		// assert that actual is expected
		// 実測値が期待値であることを表明する
		assertThat(actual, is(expected));
	}
}