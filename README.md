# Answers

As mentioned in the assignment the complete answers were prepared within 1.5 hours for
Question A, B, and D. (Question C is not available)

The answers for the BONUS questions are prepared by taking extra time.
this answers can be utilized to further evaluation of the skills need by
the interviewer if needed.


# Building and Running the project

This is a Maven project and it could be compiled by regular Maven commands. 
The main method is in Solution.java file.




# Answer - Question A

### A. Let’s start with the basics

##### 1. Can you implement the sing() method for the bird?
	Please find the implementation for this in the code.

	a. How did you unit test it? 
		Used JUnit to write unit test classes.
		
	b. How did you optimize the code for maintainability?
		Encapsulated the behaviors that changes.
		programmed to interfaces.
	    Used composition rather than using inheritance to reduce impacts on code changes.

##### 2. Now, we have 2 special kinds of birds: the Duck and the Chicken... Can you implement them to make their own special sound?
	Please find the implementation for this in the code.

	a. A duck says: “Quack, quack”
		Encapsulated the behavior of Duck sound in QuackImpl class that implements the Sing interface.

	b. A duck can swim
		Encapsulated the behavior of Duck swim in SwimImpl class that implements the Swim interface.

	c. A chicken says: “Cluck, cluck”
		Encapsulated the behavior of chicken sound in CluckImpl class that implements the Sing interface.

	d. A chicken cannot fly (assumption: its wings are clipped but ignore that)
		Encapsulated the behavior of chicken fly in NoFlyImpl class that implements the Fly interface.

