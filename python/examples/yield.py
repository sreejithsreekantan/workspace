#!/usr/bin/python

def cube(n):
	print '.', 
	return n**3

def simplifiedGenerator(n):
	generatedResults = []
	currentN = 1
	while currentN <= n:
		generatedResults.append(cube(currentN))
		currentN += 1
	return generatedResults


# This is an example of Lazy evaluation- using Python's Generators
# This code does not run when called initially
# It will only return a "Generator" object
# From that object we can collect the list items, one by one
def generatorUsingYield(n):
	currentN = 1
	while currentN <= n:
		yield cube(currentN)
		currentN += 1		
	


# Using the Simplified Generator Code, we start with numbers x = (1..10) and for each of them, we generate x^3
print "Using the Simplified Generator Code, we start with numbers x = (1..10) and for each of them, we generate x^3"
# Resulting list using simplified generator
print simplifiedGenerator(10)


# Now we use the generator code which uses yield
# After this, only the generator object will be returned
print "Result using the Generator function with Yield"
generatedValues = generatorUsingYield(10)

print "We will traverse through the values from the generator object"
# Now, we actually compute and display the values from the generator object
print [i for i in generatedValues]