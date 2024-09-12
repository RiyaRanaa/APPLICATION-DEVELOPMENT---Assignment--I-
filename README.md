# 7th sem | APPLICATION-DEVELOPMENT-AssignmentI
 Topic: Inheritance &amp; Interfaces in Java

 APPLICATION DEVELOPMENT PROJECTUSINGJAVA
 (CSE4171)
 Assignment- I
 Topic: Inheritance & Interfaces in Java
 ________________________________________________________________________________
 1. Define aclass Employee with two instance variables:
 ● name,salary and age
 and two membermethods:
 ● setData(): set the details of the person.
 ● displayData(): display the details of the person.
 Now, create two objects of class Employee and initialize one object value
 directly (by using the dot(.) operator name: “Joseph”, salary: 65784.50 and
 age: 25 ). Accept your name and age through the keyboard and set them to
 another object using the setData() method.
 Now display both the member variables using the displayData() method.
 Also, check who is older.
 2. In a supermarket each product has minimum details like prodId, price,
 quantity that is used during the biling process. Keeping this in mind
 prepare a class named as Product having the member variables
 ● prodId, price, quantity
 ● astatic variable totalPrice
 Initialize the value of the product through a parameterized constructor. It
 consists of a display() method to display the value of instance variables. A
 person went to the market and purchased 5 different products. Using the
 above mentioned class, display the details of products that the person has
 purchased. Also, determine how much total amount the person will pay for
 the purchase of 5 products.
 1
3. Define a class Deposit. The instance variables of the class Deposit are
 mentioned below.
 Instance Variable
 Principal
 Data Type
 Long
 Time
 Rate
 TotalAmt
 Integer
 Double
 Double
 Initialize the instance variables Principal, Time, rate through constructors.
 Constructors are overloaded with the following prototypes.
 Constructor1: Deposit ( )
 Constructor2: Deposit (long, int, double)
 Constructor3: Deposit (long, int)
 Constructor4: Deposit (long, double)
 Apart from constructors, the other instance methods are (i) display ( ): to
 display the value of instance variables, (ii) calcAmt( ): to calculate the total
 amount. totalAmt = Principal + (Principal * rate * Time)/100;
 4. Define a base class Employee with instance variable name, age. The
 instance variables are initialized through constructors. The prototype of the
 constructor is as below.
 Employee (string, int)
 Define a derived class HR with instance variables Eid, salary. The instance
 variables are initialized through constructors. The prototype of the
 constructor is as below.
 HR(string, int, int, double).
 Another instance method of the HR class is DisplayDetails() to display the
 information of HR details.
 2
5. Create an abstract class Marks with three instance variables (markICP,
 markDSA, and percentage) and an abstract method getPercentage().
 Create two classes: CSE with instance variable algoDesign, and NonCSE
 with instance variable enggMechanics. Both classes inherit the abstract
 class Marks and override the abstract method getPercentage(). The
 constructor of class CSE takes the marks in three subjects (markICP,
 markDSA, and algoDesign) as its parameters, and the constructor of class
 NonCSE takes the marks in three subjects (markICP, markDSA, and
 enggMechanics) as its parameters. Create an object for each of the two
 classes and print the percentage of marks for both students.
 6. Define an interface DetailInfo to declare methods display( ) & count( ).
 Another class Student contains a static data member maxcount, instance
 member name & method setter(String name) to assign the values to the
 instance variable and getter( ) to display the name of a student, count the
 no. of characters present in the name of the student.
 7. Design a package that contains two classes: Student & Test. The Student
 class has data members as name, roll and instance methods inputDetails()
 & showDetails(). Similarly the Test class has data members as mark1,
 mark2 and instance methods inputDetails(), showDetails(), Student is
 extended by Test. Another package carry interface Sports with 2 attributes
 score1, score2. Find grand total mark & score in another class.
 3
