class  Narrowing1
{
	public static void main(String[] args) 
	{
		double d = 121.564535464565;
		
		byte b = (byte) d;
		short s = (short) d;
		int i = (int) d;
		char ch = (char) d;
		float f = (float) d;
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(ch);
		System.out.println(f);
	}
}
