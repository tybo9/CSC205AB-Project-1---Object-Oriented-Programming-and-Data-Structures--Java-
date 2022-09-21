public class StyleSegmentPartialTester
{
	public static void main(String[] args)
	{
		//variables
		Point p1, p2;
		StyleSegment s1, s2;
		Segment os1;
		String originals1ToString;
		String originals2ToString;

		//disclaimer
		System.out.println("***** This is a partial tester for the Style Segment class.  You have your choice of whether or not");
		System.out.println("***** to use it.  You should examine the tests to see if any good test cases are missing.");
		System.out.println("***** Also, a few of the simpler tests have ??? instead of the expected result, so you");
		System.out.println("***** are forced to look at those tests more closely and put in the expected result yourself.");
		System.out.println("***** NOTE: if a test does not work and throws an exception, you can look at the call stack");
		System.out.println("*****     to see where it occurred.  You have to put   ex.printStackTrace();    in the test's catch block");

		System.out.println("\n------ Part1: Testing StyleSegment's constructor and toString()");

		System.out.println("\nTest1.1: Testing new StyleSegment's default constructor, then toString()");
		try
		{
			System.out.print("expected: (3, -1)- - - - -(0, 6)   (or points reversed)\ngot:      ");
			s1 = new StyleSegment();
			System.out.println(s1);
		}
		catch (Throwable ex)
		{
			System.out.println("got:      " + ex);
		}

		System.out.println("\nTest1.2: Testing new StyleSegment(5, 2, 7, 2, \"dashed\") constructor, then toString()");
		try
		{
			System.out.print("expected: (5, 2)- - - - -(7, 2)   (or points reversed)\ngot:      ");
			s1 = new StyleSegment(5,2,7,2,"dashed");
			System.out.println(s1);
		}
		catch (Throwable ex)
		{
			System.out.println("got:      " + ex);
		}

		System.out.println("\nTest1.3: Testing new StyleSegment(5, 2, 7, 2, \"dotted\") constructor, then toString()");
		try
		{
			System.out.print("expected: (5, 2).........(7, 2)   (or points reversed)\ngot:      ");
			s1 = new StyleSegment(5,2,7,2,"dotted");
			System.out.println(s1);
		}
		catch (Throwable ex)
		{
			System.out.println("got:      " + ex);
		}

		System.out.println("\nTest1.4: Testing new StyleSegment(5, 2, 7, 2, \"double\") constructor, then toString()");
		try
		{
			System.out.print("expected: (5, 2)=========(7, 2)   (or points reversed)\ngot:      ");
			s1 = new StyleSegment(5,2,7,2,"double");
			System.out.println(s1);
		}
		catch (Throwable ex)
		{
			System.out.println("got:      " + ex);
		}

		System.out.println("\nTest1.5: Testing new StyleSegment(3, 4, 3, 6, \"dotdash\") constructor, with unknown style");
		try
		{
			System.out.println("expected: java.lang.IllegalArgumentException: your descriptive String here" );
			s1 = new StyleSegment(3,4,3,6,"dotdash");
			System.out.println("\ngot:      no exception");
		}
		catch (Throwable ex)
		{
			System.out.println("got:      " + ex);
		}

		System.out.println("\nTest1.6: Testing new StyleSegment(3, 4, 3, 4, \"dotted\") constructor, where x's are same, y's are same");
		try
		{
			System.out.println("expected: java.lang.IllegalArgumentException: your descriptive String here" );
			s1 = new StyleSegment(3,4,3,4, "dotted");
			System.out.println("\ngot:      no exception");
		}
		catch (Throwable ex)
		{
			System.out.println("got:      " + ex);
		}

		System.out.println("\n------ Part2: Testing StyleSegment's length()");

		s1 = new StyleSegment(3,4,8,4,"dotted");
		originals1ToString = s1.toString();
		System.out.println("\nTest2.1: Testing length() with " + s1);
		try
		{
			System.out.print("expected: ??? \ngot:      ");
			double doubleAns = s1.length();
			System.out.println(doubleAns);
		}
		catch (Throwable ex)
		{
			System.out.println("got:      " + ex);
		}
		if (!originals1ToString.equals(s1.toString()))
			System.out.println("***** but the StyleSegment changed during the calculation!!");

		s1 = new StyleSegment(1,-5,-6,-5,"dotted");
		originals1ToString = s1.toString();
		System.out.println("\nTest2.2: Testing length() with " + s1);
		try
		{
			System.out.print("expected: 7.0 \ngot:      ");
			double doubleAns = s1.length();
			System.out.println(doubleAns);
		}
		catch (Throwable ex)
		{
			System.out.println("got:      " + ex);
		}
		if (!originals1ToString.equals(s1.toString()))
			System.out.println("***** but the StyleSegment changed during the calculation!!");

		System.out.println("\n------ Part3: Testing StyleSegment's translate(int, int)");

		s1 = new StyleSegment(2,4,6,4,"dotted");
		System.out.println("\nTest3.1: Testing translate(1, 7) with " + s1);
		try
		{
			System.out.print("expected: (3, 11).........(7, 11)  (or reversed) \ngot:      ");
			s1.translate(1,7);
			System.out.println(s1);
		}
		catch (Throwable ex)
		{
			System.out.println("got:      " + ex);
		}

		s1 = new StyleSegment(-2,-4,-6,-4,"dotted");
		System.out.println("\nTest3.2: Testing translate(-1, -7) with " + s1);
		try
		{
			System.out.print("expected: ??? \ngot:      ");
			s1.translate(-1,-7);
			System.out.println(s1);
		}
		catch (Throwable ex)
		{
			System.out.println("got:      " + ex);
		}

		s1 = new StyleSegment(2,4,6,4,"dotted");
		System.out.println("\nTest3.3: Testing translate(0, 0) with " + s1);
		try
		{
			System.out.print("expected: (2, 4).........(6, 4)  (or reversed) \ngot:      ");
			s1.translate(0,0);
			System.out.println(s1);
		}
		catch (Throwable ex)
		{
			System.out.println("got:      " + ex);
		}

		System.out.println("\n------ Part4: Testing StyleSegment's midpoint()");

		s1 = new StyleSegment(2,4,6,4,"dotted");
		originals1ToString = s1.toString();
		System.out.println("\nTest4.1: Testing midpoint() with " + s1);
		try
		{
			System.out.print("expected: (4, 4) \ngot:      ");
			Point pointAns = s1.midpoint();
			System.out.println(pointAns);
		}
		catch (Throwable ex)
		{
			System.out.println("got:      " + ex);
		}
		if (!originals1ToString.equals(s1.toString()))
			System.out.println("***** but the StyleSegment changed during the calculation!!");

		s1 = new StyleSegment(2,4,-6,4,"dotted");
		originals1ToString = s1.toString();
		System.out.println("\nTest4.2: Testing midpoint() with " + s1);
		try
		{
			System.out.print("expected: (-2, 4) \ngot:      ");
			Point pointAns = s1.midpoint();
			System.out.println(pointAns);
		}
		catch (Throwable ex)
		{
			System.out.println("got:      " + ex);
		}
		if (!originals1ToString.equals(s1.toString()))
			System.out.println("***** but the StyleSegment changed during the calculation!!");

		s1 = new StyleSegment(2,4,6,4,"dotted");
		originals1ToString = s1.toString();
		System.out.println("\nTest4.3: Testing midpoint() with " + s1);
		try
		{
			System.out.print("expected: (4, 4) \ngot:      ");
			Point pointAns = s1.midpoint();
			System.out.println(pointAns);
		}
		catch (Throwable ex)
		{
			System.out.println("got:      " + ex);
		}
		if (!originals1ToString.equals(s1.toString()))
			System.out.println("***** but the StyleSegment changed during the calculation!!");

		s1 = new StyleSegment(2,-4,-6,-4,"dotted");
		originals1ToString = s1.toString();
		System.out.println("\nTest4.4: Testing midpoint() with " + s1);
		try
		{
			System.out.print("expected: (-2, -4) \ngot:      ");
			Point pointAns = s1.midpoint();
			System.out.println(pointAns);
		}
		catch (Throwable ex)
		{
			System.out.println("got:      " + ex);
		}
		if (!originals1ToString.equals(s1.toString()))
			System.out.println("***** but the StyleSegment changed during the calculation!!");


		System.out.println("\n------ Part5: Testing StyleSegment's shorten()");

		s1 = new StyleSegment(3,5,7,5,"dotted");
		System.out.println("\nTest5.1: Testing shorten with " + s1);
		try
		{
			System.out.print("expected: (4, 5).........(6, 5)   (or points reversed) \ngot:      ");
			s1.shorten();
			System.out.println(s1);
		}
		catch (Throwable ex)
		{
			System.out.println("got:      " + ex);
		}


		System.out.println("\n------ Part6: Testing StyleSegment's equals method");

		s1 = new StyleSegment(1,2,3,2,"dotted");
		s2 = new StyleSegment(5,6,7,6,"dotted");
		System.out.println("\nTest6.1: Testing if " + s1 + " is equal to " + s2);
		try
		{
			System.out.print("expected: false\ngot:      ");

			boolean boolAns = s1.equals(s2);
			System.out.println(boolAns);
		}
		catch (Throwable ex)
		{
			System.out.println(ex);
		}

		s1 = new StyleSegment(1,2,3,2,"dotted");
		s2 = new StyleSegment(1,2,3,2,"dotted");
		System.out.println("\nTest6.2: Testing if " + s1 + " is equal to " + s2);
		try
		{
			System.out.print("expected: ???   \ngot:      ");

			boolean boolAns = s1.equals(s2);
			System.out.println(boolAns);
		}
		catch (Throwable ex)
		{
			System.out.println(ex);
		}

		s1 = new StyleSegment(1,2,3,2,"dotted");
		s2 = new StyleSegment(3,2,1,2,"dotted");
		System.out.println("\nTest6.3: Testing if " + s1 + " is equal to " + s2);
		try
		{
			System.out.print("expected: true   \ngot:      ");

			boolean boolAns = s1.equals(s2);
			System.out.println(boolAns);
		}
		catch (Throwable ex)
		{
			System.out.println(ex);
		}

		s1 = new StyleSegment(1,2,3,2,"dotted");
		s2 = new StyleSegment(1,2,3,2,"dashed");
		System.out.println("\nTest6.4: Testing if " + s1 + " is equal to " + s2);
		try
		{
			System.out.print("expected: false   \ngot:      ");

			boolean boolAns = s1.equals(s2);
			System.out.println(boolAns);
		}
		catch (Throwable ex)
		{
			System.out.println(ex);
		}

		s1 = new StyleSegment(1,2,3,2,"dotted");
		System.out.println("\nTest6.5: Testing if a StyleSegment is equal to itself");
		try
		{
			System.out.print("expected: true\ngot:      ");
			boolean boolAns = s1.equals(s1);
			System.out.println(boolAns);
		}
		catch (Throwable ex)
		{
			System.out.println(ex);
		}

		s1 = new StyleSegment(1,2,3,2,"dotted");
		System.out.println("\nTest6.6: Testing if a StyleSegment is equal to null");
		try
		{
			System.out.print("expected: ???\ngot:      ");
			boolean boolAns = s1.equals(null);
			System.out.println(boolAns);
		}
		catch (Throwable ex)
		{
			System.out.println(ex);
		}

		s1 = new StyleSegment(1,4,3,4,"dotted");
		System.out.println("\nTest6.7: Testing if a StyleSegment is equal to a new java.util.Date()");
		try
		{
			System.out.print("expected: false\ngot:      ");
			boolean boolAns = s1.equals(new java.util.Date());
			System.out.println(boolAns);
		}
		catch (Throwable ex)
		{
			System.out.println(ex);
		}


		s1 = new StyleSegment(1,4,3,4,"dotted");
		os1 = new Segment(1,4,3,4);
		System.out.println("\nTest6.8: Testing if " + s1 + " (a StyleSegment) .equals " + os1 + " (a Segment).  ");
		try
		{
			System.out.print("expected: false   \ngot:      ");

			boolean boolAns = s1.equals(os1);
			System.out.println(boolAns);
		}
		catch (Throwable ex)
		{
			System.out.println(ex);
		}

		s1 = new StyleSegment(1,4,3,4,"dashed");
		os1 = new Segment(1,4,3,4);
		System.out.println("\nTest6.9: Testing if " + os1 + " (a Segment) .equals " + s1 + " (a StyleSegment).  ");
		try
		{
			System.out.print("expected: false   \ngot:      ");

			boolean boolAns = os1.equals(s1);
			System.out.println(boolAns);
		}
		catch (Throwable ex)
		{
			System.out.println(ex);
		}

		System.out.println("\n------ Part7: Testing StyleSegment's getStyle() method");

		s1 = new StyleSegment(1,2,3,2,"dotted");
		System.out.println("\nTest9.1: Testing getStyle() with" + s1);
		try
		{
			System.out.print("expected: ???\ngot:      ");

			String strAns = s1.getStyle();
			System.out.println(strAns);
		}
		catch (Throwable ex)
		{
			System.out.println(ex);
		}


		System.out.println("\n\n");
	}
}
