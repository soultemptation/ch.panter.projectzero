package ch.zhaw.junitdemo;

import junit.framework.Assert;
import org.junit.*;

public class MdpJunitDemoImplTest {

	private MdpJunitDemoImpl instance;

	@Before
	public void setUp() {
		instance = new MdpJunitDemoImpl();
	}

	@Test
	public void isEmpty() {
		Assert.assertTrue(instance.isEmpty(null));
		Assert.assertTrue(instance.isEmpty(""));
		Assert.assertFalse(instance.isEmpty("a"));
	}

	@Test
	public void capitalize() {
		Assert.assertEquals("Hello", instance.capitalize("hello"));
		Assert.assertEquals("Hello", instance.capitalize("HELLO"));
		Assert.assertEquals("123abc", instance.capitalize("123ABC"));
	}

	@Test(expected=NullPointerException.class)
	public void reverseThrowsNullPointerExceptionIfParameterIsNull () {
		instance.reverse(null);
	}

	@Test
	public void reverse() {
		Assert.assertEquals("zsH tseT", instance.reverse("Test Hsz"));
	}

	@Test
	public void join() {
		Assert.assertEquals("a b c", instance.join("a", "b", "c"));
		Assert.assertEquals("a b c", instance.join("a", "b", "c", " "));
		Assert.assertEquals("a b c", instance.join(" ", "a", "b", "c"));
		Assert.assertEquals("a b c", instance.join(" ", "a", "b", "c", " "));
	}
}
