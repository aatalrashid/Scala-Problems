# Practice Programming Assignment: Example Assignment

The Assignment
Part 1: Obtain the Project Files
Download the example.zip handout archive file and extract it somewhere on your machine.

Part 2: Using the Scala REPL
During this class we will always launch the Scala REPL (the interactive Scala console) through sbt. This way you don't need to install the Scala distribution on your machine, having sbt is enough. (In case you prefer to have the scala command available on your machine, you can download the Scala distribution from the scala-lang.org website.)

Open the Sbt Tutorial page and follow the first steps until Running the Scala Interpreter. Note that sbt can only be started inside a project directory, so first navigate to the project directory that you created in Part 1.

Enter a few Scala expressions to make sure everything is working as expected.

Part 3: Opening the Project in Intellij
To work on the source code of the project, you have to import it into Intellij. Follow the description on the Tools Setup page and make sure to import the project as a sbt project. Then, have a first look at the source code. In the folder src/main/scala, open the package example and double-click the file Lists.scala.

If you run the tests right away, they will fail. Implement two methods (sum and max).

When working on an assignment, it is important that you don't change any already implemented method, class or object names or types. Doing so will prevent our automated grading tools from working and you have a high risk of not obtaining any points for your solution.

Part 4: Running your Code
Once you start writing some code, you might want to run your code on a few examples to see if it works correctly. We present two possibilities to run the methods you implemented.

Using the Scala REPL
In the sbt console, start the Scala REPL by typing console.


The classes of the assignment are available inside the REPL, so you can for instance import all the methods from object Lists:


Using a Main Object
Another way to run your code is to create a new Main object that can be executed by the Java Virtual Machine.

In eclipse, right-click on the package example in src/main/scala and select “New” - “Scala Object”
Use Main as the object name (any other name would also work)
Confirm by clicking “Finish”
In order to make the object executable it has to extend the type App. Change the object definition to the following:


Now the Main object can be executed. In order to do so in eclipse:

Right-click on the file Main.scala
Select “Run As” - “Scala Application”
You can also run the Main object in the sbt console by simply using the command run.

Part 5: Writing Tests
Throughout the assignments of this course we will require you to write unit tests for the code that you write. Unit tests are the preferred way to test your code because unlike REPL commands, unit tests are saved and can be re-executed as often as required. This is a great way to make sure that nothing breaks when you have go back later to change some code that you wrote earlier on.

We will be using the ScalaTest testing framework to write our unit tests. In eclipse, navigate to the folder src/test/scala and open the file ListsSuite.scala in package example. This file contains a step-by-step tutorial to learn how to write and execute ScalaTest unit tests.
