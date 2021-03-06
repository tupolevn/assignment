# Answers

**Personal information**
Name: Nimshard Anfar
Email: nimshard@gmail.com


As mentioned in the assignment the complete answers were prepared within 1.5 hours for
Question A, B, and D. (Question C is not available)

**BONUS questions**
The answers for the BONUS questions are prepared by taking extra time.
this answers can be utilized to further evaluation of the skills need by
the interviewer if needed.

BONUS questions 2 is a SpringBoot application.
Main method is in,
*com.assignment.rest.api.SpringBootMain*


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

##### 3. Now how would you model a rooster?
	Please find the implementation for this in the code.

	a. A rooster says: “Cock-a-doodle-doo”
		Encapsulated the behavior of Rooster sound in RoosterSoundImpl class that implements the Sing interface.

	b. How is the rooster related to the chicken?
		Rooster is also a kind of chicken that sings differently.

	c. Can you think of other ways to model a rooster without using inheritance?
		Yes. We can model  rooster by composition. A rooster object that contains a holds object.
		Since we have programed to interfaces and encapsulated the frequently changing behaviors, we can 
		assign the new behavior RoosterSoundImpl to sing behavior.

##### 4.	Can you model a parrot? We are specifically interested in three parrots, one that lived in a house 
with dogs one in a house with cats, the other lived on a farm next to the rooster.

	Please find the implementation for this in the code.

	a. A parrot living with dogs says: “Woof, woof”
		Assigned  DogSoundImpl to sing behavior to parrot object. now we get a parrot that sounds like a dog.

	b. A parrot living with cats says: “Meow”
		Assigned CatSoundImpl to sing behavior to parrot object. now we get a parrot that sounds like a cat.

	c. A parrot living near the rooster says: “Cock-a-doodle-doo”
		Assigned CatSoundImpl to sing behavior to parrot object. now we get a parrot that sounds like a Rooster.

	d. How do you keep the parrot maintainable? What if we need another parrot
		lives near a Duck? Or near a phone that rings frequently?
		We can add any number of behaviors to for parrot to sound like other animals. 
		All we have to do is implement new behaviors using sing interface and assign them to parrot objects.

# Answer - Question B

### B. Model fish as well as other swimming animals

##### 1. In addition to the birds, can you model a fish?
	a. Fishes don’t sing
	b. Fishes don’t walk
	c. Fishes can swim

	Please find the implementation for this in the code.

##### 2. Can you specialize the fish as a Shark and as a Clownfish?
	a. Sharks are large and grey
	b. Clownfish are small and colourful (orange)
	c. Clownfish make jokes
	d. Sharks eat other fish

	Please find the implementation for this in the code.

##### 3. Dolphins are not exactly fish, yet, they are good swimmers
	a. Can you model a dolphin that swims without inheriting from a fish class?
		Please find the implementation for this in the code.

	b. How do you avoid duplicating code or introducing unneeded overhead?
		Since behaviors are modeled separately, we can easily associate swim behavior to Dolphin
		objects without duplicating code.

# Answer - Question D

### D. Model animals that change their behavior over time

##### 1. Can you model a butterfly?
	a. A butterfly can fly
	b. A butterfly does not make a sound

	Please find the implementation for this in the code.

##### 2. Can you optimize your model to account for the metamorphosis from caterpillar to
butterfly?
	a. A caterpillar cannot fly
	b. A caterpillar can walk (crawl)

	Yes. This is behavior change at run time, a form of polymorphism.
    Walk, Fly and Sing behaviors associated to a Butterfly. The relevant behaviors for a caterpillar
	is assigned to the butterfly object by pushing objects that implement the respective interfaces.
	When me call growUp() method, it will assign the respective behaviors for butterfly.