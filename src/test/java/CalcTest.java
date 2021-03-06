/* CalcTest.java */
import static org.junit.Assert.*;
import org.junit.Test;

public class CalcTest {
	@Test
	public void testAdd() {
		Calc c = new Calc();
		assertEquals(30, c.add(10, 20));
	}
	@Test
	public void testSub() {
		Calc c = new Calc();
		assertEquals(-10, c.sub(10, 20));
	}
	@Test
	public void testMul() {
		Calc c = new Calc();
		assertEquals(200, c.mul(10, 20));
	}
	@Test
	public void testDiv() {
		Calc c = new Calc();
		assertEquals(4, c.div(20, 5));
	}
}
