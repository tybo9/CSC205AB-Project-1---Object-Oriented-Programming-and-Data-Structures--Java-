public class PointPartialTester
{
	public static void main(String[] args)
	{
		//variables
		Point p1, p2;

		//disclaimer
		System.out.println("***** This is a partial tester for the Point class.  You have your choice of whether or not");
		System.out.println("***** to use it.  You should examine the tests to see if any good test cases are missing.");
		System.out.println("***** Also, a few of the simpler tests have ??? instead of the expected result, so you");
		System.out.println("***** are forced to look at those tests more closely and put in the expected result yourself.");
		System.out.println("***** NOTE: if a test does not work and throws an exception, you can look at the call stack");
		System.out.println("*****     to see where it occurred.  You have to put   ex.printStackTrace();    in the test's catch block");

		//create and test Points
		System.out.println("\n------ Part1: Testing Point's constructors and toString()");

		System.out.println("\nTest1.1: Testing default constructor, then toString()");
		try
		{
			System.out.print("expected: (0, 0) \ngot:      ");
			p1 = new Point();
			System.out.println(p1);
		}
		catch (Throwable ex)
		{
			System.out.println("got:      " + ex);
		}

		System.out.println("\nTest1.2: Testing Point(3, 4) parameterized constructor, then toString()");
		try
		{
			System.out.print("expected: (3, 4) \ngot:      ");
			p1 = new Point(3, 4);
			System.out.println(p1);
		}
		catch (Throwable ex)
		{
			System.out.println("got:      " + ex);
		}

		System.out.println("\nTest1.3: Testing Point's copy constructor, passing in new Point(-6, 9).");
		try
		{
			System.out.print("expected: (-6, 9) \ngot:      ");
			p1 = new Point(-6, 9);
			p2 = new Point(p1);
			System.out.println(p2);
		}
		catch (Throwable ex)
		{
			System.out.println("got:      " + ex);
		}

		System.out.println("\n------ Part2: Testing Point's distanceTo method");

		System.out.println("\nTest2.1: Testing (1, 1)'s distanceTo(new Point(-3, 6))");
		try
		{
			System.out.print("expected: ???\ngot:      ");
			p1 = new Point(1,1);
			p2 = new Point(-3,6);
			double doubleAns = p1.distanceTo(p2);
			System.out.println(doubleAns);
		}
		catch (Throwable ex)
		{
			System.out.println("got:      " + ex);
		}

		System.out.println("\nTest2.2: Testing (1, -1)'s distanceTo(new Point(1, -1))");
		try
		{
			System.out.print("expected: 0.0\ngot:      ");
			p1 = new Point(1,-1);
			p2 = new Point(1,-1);
			double doubleAns = p1.distanceTo(p2);
			System.out.println(doubleAns);
		}
		catch (Throwable ex)
		{
			System.out.println("got:      " + ex);
		}

		System.out.println("\n------ Part3: Testing Point's halfwayTo method");

		p1 = new Point(2,4);
		p2 = new Point(8,12);
		System.out.println("\nTest3.1: Testing " + p1 + "'s halfwayTo" + p2);
		try
		{
			System.out.print("expected: (5, 8) \ngot:      ");
			Point pointAns = p1.halfwayTo(p2);
			System.out.println(pointAns);
		}
		catch (Throwable ex)
		{
			System.out.println("got:      " + ex);
		}

		p1 = new Point(2,4);
		p2 = new Point(-8,12);
		System.out.println("\nTest3.2: Testing " + p1 + "'s halfwayTo" + p2);
		try
		{
			System.out.print("expected: (-3, 8) \ngot:      ");
			Point pointAns = p1.halfwayTo(p2);
			System.out.println(pointAns);
		}
		catch (Throwable ex)
		{
			System.out.println("got:      " + ex);
		}

		System.out.println("\n------ Part4: Testing Point's translate method");

		System.out.println("\nTest4.1: Testing (1, 2)'s translate(4, -8)");
		try
		{
			System.out.print("expected: (5, -6)\ngot:      ");
			p1 = new Point(1, 2);
			p1.translate(4, -8);
			System.out.println(p1);
		}
		catch (Throwable ex)
		{
			System.out.println("got:      " + ex);
		}

		System.out.println("\nTest4.2: Testing (1, 2)'s translate(0, 0)");
		try
		{
			System.out.print("expected: ???\ngot:      ");
			p1 = new Point(1, 2);
			p1.translate(0, 0);
			System.out.println(p1);
		}
		catch (Throwable ex)
		{
			System.out.println("got:      " + ex);
		}

		System.out.println("\n------ Part5: Testing Point's setX method");

		System.out.println("\nTest5.1: Testing (1, 2)'s setX(99)");
		try
		{
			System.out.print("expected: (99, 2)\ngot:      ");
			p1 = new Point(1, 2);
			p1.setX(99);
			System.out.println(p1);
		}
		catch (Throwable ex)
		{
			System.out.println("got:      " + ex);
		}

		System.out.println("\n------ Part6: Testing Point's equals method");

		System.out.println("\nTest6.1: Testing if (1, 2) is equal to (3, 4)");
		try
		{
			System.out.print("expected: false\ngot:      ");
			p1 = new Point(1, 2);
			p2 = new Point(3, 4);
			boolean boolAns = p1.equals(p2);
			System.out.println(boolAns);
		}
		catch (Throwable ex)
		{
			System.out.println("got:      " + ex);
		}

		System.out.println("\nTest6.2: Testing if (1, 2) is equal to a new Point(1, 3)");
		try
		{
			System.out.print("expected: false\ngot:      ");
			p1 = new Point(1, 2);
			p2 = new Point(1, 3);
			boolean boolAns = p1.equals(p2);
			System.out.println(boolAns);
		}
		catch (Throwable ex)
		{
			System.out.println("got:      " + ex);
		}

		System.out.println("\nTest6.3: Testing if (1, 2) is equal to a new Point(3, 2)");
		try
		{
			System.out.print("expected: false\ngot:      ");
			p1 = new Point(1, 2);
			p2 = new Point(3, 2);
			boolean boolAns = p1.equals(p2);
			System.out.println(boolAns);
		}
		catch (Throwable ex)
		{
			System.out.println("got:      " + ex);
		}

		System.out.println("\nTest6.4: Testing if (1, 2) is equal to a new Point(2, 1)");
		try
		{
			System.out.print("expected: false\ngot:      ");
			p1 = new Point(1, 2);
			p2 = new Point(2, 1);
			boolean boolAns = p1.equals(p2);
			System.out.println(boolAns);
		}
		catch (Throwable ex)
		{
			System.out.println("got:      " + ex);
		}

		System.out.println("\nTest6.5: Testing if (1, 2) is equal to a new Point(1, 2)");
		try
		{
			System.out.print("expected: true\ngot:      ");
			p1 = new Point(1, 2);
			p2 = new Point(1, 2);
			boolean boolAns = p1.equals(p2);
			System.out.println(boolAns);
		}
		catch (Throwable ex)
		{
			System.out.println("got:      " + ex);
		}

		System.out.println("\nTest6.6: Testing if a Point is equal to itself");
		try
		{
			System.out.print("expected: true\ngot:      ");
			p1 = new Point(1, 2);
			boolean boolAns = p1.equals(p1);
			System.out.println(boolAns);
		}
		catch (Throwable ex)
		{
			System.out.println("got:      " + ex);
		}

		System.out.println("\nTest6.7: Testing if a Point is equal to null");
		try
		{
			System.out.print("expected: false\ngot:      ");
			p1 = new Point(1, 2);
			boolean boolAns = p1.equals(null);
			System.out.println(boolAns);
		}
		catch (Throwable ex)
		{
			System.out.println("got:      " + ex);
		}

		System.out.println("\nTest6.8: Testing if a Point is equal to a new Date()");
		try
		{
			System.out.print("expected: ???\ngot:      ");
			p1 = new Point(1, 2);
			boolean boolAns = p1.equals(new java.util.Date());
			System.out.println(boolAns);
		}
		catch (Throwable ex)
		{
			System.out.println("got:      " + ex);
		}
	}
}
