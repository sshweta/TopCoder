import junit.framework.TestCase;


public class SubstituteTest extends TestCase 
{
	public static final String KEY_1 = "TRADINGFEW";
	public static final String KEY_2 = "ABCDEFGHIJ";
	public static final String KEY_3 = "CRYSTALBUM";
	
	public static final String CODE_1 = "LGXWEV";
	public static final String CODE_2 = "XJ";
	public static final String CODE_3 = "MMA";
	
	private Substitute ob = new Substitute();
	public void test1()
	{
		assertEquals(709, ob.getValue(KEY_1, CODE_1));
		assertEquals(0, ob.getValue(KEY_2, CODE_2));
		assertEquals(6, ob.getValue(KEY_3, CODE_3));
	}
	
	public void test2()
	{
		assertEquals(-1, ob.getValue(KEY_1, ""));
		assertEquals(-1, ob.getValue(KEY_1, KEY_2));
		assertEquals(-1, ob.getValue("", CODE_3));
	}
	

}
