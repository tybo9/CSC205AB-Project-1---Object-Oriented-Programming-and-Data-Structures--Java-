public class SegmentPartialTester
{
	public static void main(String[] args)
	{
		//variables
		Point p1, p2;
		Segment s1 = null;
		Segment s2 = null;
		String originals1ToString = "";
		String originals2ToString = "";

		//*********************************************************************************************
		//Disclaimer

		System.out.println("This tester is designed to get started with testing the Segment");
		System.out.println("class.  You especially should make sure that your constructors");
		System.out.println("and toString() works well since the other tests rely on them.");
		System.out.println("Testing is ultimately your responsibility...if any of the tests are");
		System.out.println("erroneous, you should be able to detect that and fix it.   Otherwise,");
		System.out.println("do not use this tester.");
		System.out.println("NOTE: if a test does not work and throws an exception, you can look at");
		System.out.println("the call stack to see where it occurred.  You have to put");
		System.out.println("    ex.printStackTrace();");
		System.out.println("in the test's catch block");
		System.out.println();

		//*********************************************************************************************

		System.out.println("\n------Part1: Testing Segment's constructors and toString()");

		System.out.println("\nTest1.1: Testing new Segment() default constructor, then toString()");
		try   //--------------------------------------------------------
		{
			System.out.print("expected: (1, -3)---------(3, 8)   (or points reversed) \ngot:      ");
			s1 = new Segment();
			System.out.println(s1);
		}
		catch (Throwable ex)
		{
			System.out.println("got:      " + ex);
		}

		System.out.println("\nTest1.2: Testing new Segment(Point, Point) constructor, then toString()");
		try   //--------------------------------------------------------
		{

			System.out.print("expected: (0, 0)---------(3, 4)   (or points reversed) \ngot:      ");
			p1 = new Point(0,0);
			p2 = new Point(3,4);
			s1 = new Segment(p1, p2);
			System.out.println(s1);
		}
		catch (Throwable ex)
		{
			System.out.println("got:      " + ex);
		}

		try   //--------------------------------------------------------
		{
			System.out.println("\nTest1.3: Testing new Segment(Point, Point) constructor, where 2 points are equal");

			System.out.println("expected: java.lang.IllegalArgumentException: your descriptive String here" );
			p1 = new Point(0,0);
			p2 = new Point(0,0);
			s1 = new Segment(p1, p1);
			System.out.println("\ngot:      no exception");
		}
		catch (Throwable ex)
		{
			System.out.println("got:      " + ex);
			//  ex.printStackTrace();    //PUT THIS IN FOR MORE INFO
		}

		try   //--------------------------------------------------------
		{
			System.out.println("\nTest1.4: Testing new Segment(Point, Point) constructor, where the 2 Points are then CHANGED.");

			System.out.print("expected: (3, 5)---------(2, 7)   (or points reversed)");
			p1 = new Point(3,5);
			p2 = new Point(2,7);
			s1 = new Segment(p1, p2);
			p1.setX(-33);
			p2.setX(-77);
			System.out.println("\ngot:      " + s1);
		}
		catch (Throwable ex)
		{
			System.out.println("got:      " + ex);
			ex.printStackTrace();
		}

		try   //--------------------------------------------------------
		{
			System.out.println("\nTest1.5: Testing new Segment(5, 2, 7, 6) constructor, then toString()");

			System.out.print("expected: (5, 2)---------(7, 6)   (or points reversed)\ngot:      ");
			s1 = new Segment(5,2,7,6);
			System.out.println(s1);
		}
		catch (Throwable ex)
		{
			System.out.println("got:      " + ex);
		}

		try   //--------------------------------------------------------
		{
			System.out.println("\nTest1.6: Testing new Segment(3, 4, 3, 4) constructor, where x's are same, y's are same");

			System.out.println("expected: java.lang.IllegalArgumentException: your descriptive String here" );
			s1 = new Segment(3,4,3,4);
			System.out.println("\ngot:      no exception");
		}
		catch (Throwable ex)
		{
			System.out.println("got:      " + ex);
		}

		try   //--------------------------------------------------------
		{
			System.out.println("\nTest1.7: Testing new Segment's copy constructor, where (2, 2)---(7, 8) is received");

			System.out.println("expected: (2, 2)---------(7, 8)" );
			s1 = new Segment(2,2,7,8);
			s2 = new Segment(s1);
			System.out.println("got:      " + s2);
		}
		catch (Throwable ex)
		{
			System.out.println("got:      " + ex);
		}

		try   //--------------------------------------------------------
		{
			System.out.println("\nTest1.8: Same as previous test, but checking that it is a DEEP COPY (assumes translate(x,y) works)");

			System.out.println("expected: (2, 2)---------(7, 8)" );
			s1 = new Segment(2,2,7,8);
			s2 = new Segment(s1);
			s1.translate(5, 5);
			System.out.println("got:      " + s2);
		}
		catch (Throwable ex)
		{
			System.out.println("got:      " + ex);
		}


		//*********************************************************************************************

		System.out.println("\n------ Part2: Testing Segment's length()");

		try   //--------------------------------------------------------
		{
			s1 = new Segment(0,0,3,4);
			originals1ToString = s1.toString();
			System.out.println("\nTest2.1: Testing length() with " + s1);

			System.out.print("expected: 5.0 \ngot:      ");
			double doubleAns = s1.length();
			System.out.println(doubleAns);
		}
		catch (Throwable ex)
		{
			System.out.println("got:      " + ex);
		}
		if (!originals1ToString.equals(s1.toString()))
			System.out.println("***** but the Segment changed during the calculation!!");


		//*********************************************************************************************

		System.out.println("\n------ Part3: Testing Segment's translate(int, int)");

		try   //--------------------------------------------------------
		{
			s1 = new Segment(2,3,6,4);
			System.out.println("\nTest3.1: Testing translate(1, 7) with " + s1);

			System.out.print("expected: (3, 10)---------(7, 11)  (or reversed) \ngot:      ");
			s1.translate(1,7);
			System.out.println(s1);
		}
		catch (Throwable ex)
		{
			System.out.println("got:      " + ex);
		}

		try   //--------------------------------------------------------
		{
			s1 = new Segment(-2,-3,-6,-4);
			System.out.println("\nTest3.2: Testing translate(-1, -7) with " + s1);

			System.out.print("expected: (-3, -10)---------(-7, -11)  (or reversed) \ngot:      ");
			s1.translate(-1,-7);
			System.out.println(s1);
		}
		catch (Throwable ex)
		{
			System.out.println("got:      " + ex);
		}

		try   //--------------------------------------------------------
		{
			s1 = new Segment(2,3,6,4);
			System.out.println("\nTest3.3: Testing translate(0, 0) with " + s1);

			System.out.print("expected: (2, 3)---------(6, 4)  (or reversed) \ngot:      ");
			s1.translate(0,0);
			System.out.println(s1);
		}
		catch (Throwable ex)
		{
			System.out.println("got:      " + ex);
		}

		System.out.println("\n------ Part4: Testing Segment's midpoint()");

		try   //--------------------------------------------------------
		{
			s1 = new Segment(2,2,6,4);
			originals1ToString = s1.toString();
			System.out.println("\nTest4.1: Testing midpoint() with " + s1);

			System.out.print("expected: (4, 3) \ngot:      ");
			Point pointAns = s1.midpoint();
			System.out.println(pointAns);
		}
		catch (Throwable ex)
		{
			System.out.println("got:      " + ex);
		}


		//*********************************************************************************************
		System.out.println("\n------ Part5: Testing Segment's shorten()");

		try   //--------------------------------------------------------
		{
			s1 = new Segment(3,5,7,13);
			System.out.println("\nTest5.1: Testing shorten with " + s1);

			System.out.print("expected: (4, 7)---------(6, 11)   (or points reversed) \ngot:      ");
			s1.shorten();
			System.out.println(s1);
		}
		catch (Throwable ex)
		{
			System.out.println("got:      " + ex);
		}

		//*********************************************************************************************

		System.out.println("\n------ Part6: Testing Segment's equals method");

		try   //--------------------------------------------------------
		{
			s1 = new Segment(1,2,3,4);
			s2 = new Segment(5,6,7,8);
			System.out.println("\nTest6.1: Testing if " + s1 + " is equal to " + s2);

			System.out.print("expected: false\ngot:      ");

			boolean boolAns = s1.equals(s2);
			System.out.println(boolAns);
		}
		catch (Throwable ex)
		{
			System.out.println(ex);
		}

		try   //--------------------------------------------------------
		{
			s1 = new Segment(1,2,3,4);
			s2 = new Segment(1,2,3,4);
			System.out.println("\nTest6.2: Testing if " + s1 + " is equal to " + s2);

			System.out.print("expected: true   \ngot:      ");
			boolean boolAns = s1.equals(s2);
			System.out.println(boolAns);
		}
		catch (Throwable ex)
		{
			System.out.println(ex);
		}

		try   //--------------------------------------------------------
		{
			s1 = new Segment(1,2,3,4);
			System.out.println("\nTest6.3: Testing if a Segment is equal to itself");

			System.out.print("expected: true\ngot:      ");
			boolean boolAns = s1.equals(s1);
			System.out.println(boolAns);
		}
		catch (Throwable ex)
		{
			System.out.println(ex);
		}

		try   //--------------------------------------------------------
		{
			s1 = new Segment(1,2,3,4);
			System.out.println("\nTest6.4: Testing if a Segment is equal to null");

			System.out.print("expected: false\ngot:      ");
			boolean boolAns = s1.equals(null);
			System.out.println(boolAns);
		}
		catch (Throwable ex)
		{
			System.out.println(ex);
		}

		try   //--------------------------------------------------------
		{
			s1 = new Segment(1,2,3,4);
			System.out.println("\nTest6.5: Testing if a Segment is equal to a new Date()");

			System.out.print("expected: false\ngot:      ");
			boolean boolAns = s1.equals(new java.util.Date());
			System.out.println(boolAns);
		}
		catch (Throwable ex)
		{
			System.out.println(ex);
		}

		try   //--------------------------------------------------------
		{
			s1 = new Segment(1,2,3,4);
			s2 = new Segment(3,4,1,2);
			System.out.println("\nTest6.6: Testing if " + s1 + " is equal to " + s2);

			System.out.print("expected: true   \ngot:      ");
			boolean boolAns = s1.equals(s2);
			System.out.println(boolAns);
		}
		catch (Throwable ex)
		{
			System.out.println(ex);
		}

		System.out.println("\n\n");

	}

}
