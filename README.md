CSC205AB
Program 1
In this program, you are to write 3 different classes that should work together as aggregate classes (“has-a” relationship) and using inheritance (“is-a” relationship). It will also use your knowledge of .equals methods, constructors, and deep vs. shallow copies. The classes you should implement are:
1) Point – This will represent a geometric point in a Cartesian plane. It should have the following:
Data:
• that hold the x-value and the y-value. They should be ints and must be private.
Constructors:
• A default constructor that will set the values to (0, 0)
• A parameterized constructor that will receive 2 ints (x then y) and set the data to what is received.
• A copy constructor that will receive a Point and initializes the data (of the new instance being created) to be the same as the Point that was received.
Methods:
• A toString() method that returns a String representing the Point. It should be in the form (x, y).
• A method called distanceTo(Point other) that returns the distance (as a double) to the other Point that is received. (If you want to use it, there is a static method in the Math class called .hypot)
• A method called halfwayTo(Point other) that returns a new Point that is halfway between itself and the other Point that is received.
• A method called translate(int xmove, int ymove) that will return nothing and “translates,” or shifts, the data by the distances passed in. So if a Point has data x=3 and y=5, translate(5,2) will cause it to change its data to x=8 and y=7.
• A method called equals(Object otherObj) which returns true if it is equal to the otherObj. Note that it receives an Object; there is a particular way that this method should be implemented (see notes/demos).
• A method called setX(int newX) which will return nothing and simply sets the X value of the current instance to whatever newX is received. This is so deep/shallow copies can be tested in the Segment class…
• (This class should NOT have a getX() or a getY() method. There will be deductions if you add those methods. The reason for this is that all the functionality that involves x and y should be in the Point class. For example, a Segment instance must implement a length() method; instead of trying to get the x’s and y’s of its endpoints and calculating it, Segment can just ask one endpoint to return the distanceTo the other endpoint. The same idea will be true for much of the other functionality that Segment has to implement. )
2) Segment – this will represent a line segment. You can add other methods if you think they are needed, but at minimum, Segment should have the following:
Data:
• Data to hold both endpoints. They should be stored as Points. There should be no other data.
Constructors:
• A default constructor that will set the endpoints to new Points with values (1, -3) and (3,8)
• A parameterized constructor that accepts (x1, y1, x2, y2) – as ints – and creates and sets the endpoints. But first, check to see if x1 == x2 and y1== y2. This would be a theoretical “Segment” of length 0, so throw a new IllegalArgumentException like this:
throw new IllegalArgumentException(“whatever explanatory String you want”);
• Another parameterized constructor that accepts (Point, Point) and sets both the endpoints to (copies of) the Points that are passed in. You should not set the data to the Points that are received, but rather use Point’s copy constructor to create deep copies of them to use (safer). But the first thing is to check to see if both Points are equal. This would be a theoretical “Segment” of length 0, so throw a new IllegalArgumentException like this:
throw new IllegalArgumentException(“whatever explanatory String you want”);
• A copy constructor that accepts a Segment and initializes the data (of the new Segment being created) to be the same as the Segment that was received. Be sure that it ends up being a deep copy of the Segment that was passed in.
Methods:
• A toString() method that returns a String representing the Segment. It should be in the form:
(x1, y1)---------(x2, y2) //be sure there are 9 dashes between the two Points
• A method called length() which calculates and returns the length of the Segment as a double.
• A method called translate(int xmove, int ymove) that will return nothing and “translates,” or shifts, itself by the distances passed in.
• A method called midpoint() which calculates and returns the midpoint of the Segment as a new Point.
• A method called equals(Object otherObj) which returns true if it is equal to the otherObj. Note that it receives an Object; there is a particular way that this method should be implemented (see notes/demos). Also note that a Segment from (1, 2) to (3, 4) should be equal to a Segment from (3, 4) to (1, 2).
• A method called shorten() which changes the endpoints so that they are both halfway to the midpoint. It should not return anything, but just change its own endpoints. An example is shown below:
endpoint: (12, 16)
midpoint: (6, 8)
(original)
endpoint: (0, 0)
endpoint: (9, 12)
midpoint: (6, 8)
(after shorten())
endpoint: (3, 4)
StyleSegment – this will be a subclass of Segment and will also store what it looks like (“dashed”, “dotted”, or “double”). As such, almost all of its data/methods can be inherited from its parent class (there is only 1 new data, 2 overridden methods, and 1 new method).
Data:
• (are inherited), but add a another String to hold the style (“dashed”, “dotted”, or “double”)
Constructor:
• A default constructor that sets the endpoints to new Points that are (3, -1) and (0, 6) and the style to “dashed”
• A parameterized constructor that accepts (x1, y1, x2, y2, newStyle) – the x’s and y’s are ints and the style is a String. It will create and set the endpoints and also store the style. But first, check to see if x1 == x2 and y1== y2. This would be a theoretical “Segment” of length 0, so throw a new IllegalArgumentException like this:
throw new IllegalArgumentException(“whatever explanatory String you want”);
Also, check to see if the style is one of the 3 Strings listed above. If not, throw a new IllegalArgumentException like this:
throw new IllegalArgumentException(“whatever explanatory String you want”);
Methods:
• Almost every method can be inherited except for the following
• toString(): depending on the type, the String representation will look like this
 (x1, y1)- - - - -(x2, y2) //if it is dashed (5 dashes filled in with 4 spaces –be exact)
 (x1, y1)………(x2, y2) //if it is dotted (9 periods, be exact)
 (x1, y1)=========(x2, y2) //if it is double (9 equal signs, be exact)
• .equals(Object obj) - it will specifically refer to the StyleSegment class so you have to write a separate one. Again, be sure that it receives an Object and is implemented with the steps shown in the .equals demo.
• getStyle() – it will return the style as a String (“dashed”, “dotted”, or “double”).
Comments and formatting: Please use the Java conventions for variable names, indenting, and formatting. Each class should have an opening comment which briefly describes the class and includes your name and class on a separate line. Each method should have a short opening comment which describes it. “Sections” of code or parts that are tricky should have comments. See programs from the book for examples (although I prefer that opening and closing “squigglies” be indented the same).
Testing your program: I will provide partial test drivers that you can use to test the Segment and StyleSegment classes. Each of the “partial testers” has many tests missing, so you should think about the testing process and come up with more tests to run. This will so that you think more deeply about the testing process.
Notes:
 To square a number x, you can either just multiply it times itself (x*x) or use Math.pow(x, 2); In the Math class, there is also a static method that will return the hypotenuse directly (.hypot).
Submitting your program: Be sure that your program compiles. Please submit all 3 classes via Canvas: Point.java, Segment.java, and StyleSegment.java.
