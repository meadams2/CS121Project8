# CS121 Project 8 - Java Guesser

The goal of this project is to recreate the Number Guesser from the beginning of the semester in Java. In this version, there will be a menu that allows you to choose whether to have the human guess or the computer to guess. We expect the following behavior: 

```
0) Exit
1) Human Guesser
2) Computer guesser

Please enter 0-2: 1
human guesser
94
1) Please enter a number: 30
too low...
2) Please enter a number: 99
too high...
3) Please enter a number: 94
got it!

Very good!

0) Exit
1) Human Guesser
2) Computer guesser

Please enter 0-2: 2
computer guesser
1) I guess 50
Too (H)igh, too (L)ow, or (C)orrect? l
2) I guess 75
Too (H)igh, too (L)ow, or (C)orrect? h
3) I guess 62
Too (H)igh, too (L)ow, or (C)orrect? c

0) Exit
1) Human Guesser
2) Computer guesser

Please enter 0-2: 0
```
The main file will simply contain a main function. The main function simply calls the constructor for the Guesser class. The Guesser file will contain a main that dictates the behavior of the program, a menu method, a humanGuesser method, and a computerGuesser method. 

## Guesser Class
### Main

```
Create boolean variable called keepGoing. Initialize to true. keepGoing is sentry for whileLoop.
while keepGoing:
    userResponse = menu()--> Calls menu()
    if userResponse == 0:
          keepGoing = false
    else if userResponse == 1:
          humanGuesser()
    else if userResponse == 2:
          computerGuesser()
```

### Menu
```
Print
"""
       0) Exit
       1) Human Guesser
       2) Computer Guesser
"""
Create scanner called menuInput.
Print "Please enter 0-2: ". Plan for user to be an idiot.
Store input in string variable called userResponse.
Return userResponse.
```
### Human Guesser Method

```
Create a random number from 1-100 using Math.random() from java.util and store in an int called correctNum.
Create a Scanner called guessInput.
Store input in int called userGuess.
Create boolean called keepGoing. keepGoing is the sentry for the while loop.
Create int called turns. Initialize to 0. 
while keepGoing:
    Print "turns + ") Please enter a number: ""
    Store input in int called userGuess.
    if userGuess == correctNum:
          Print "Got it!"
          keepGoing changes to false. 
    else if userGuess < correctNum:
          Print "Too low."  
          turns += 1
    else if userGuess > correctNum:
          print "Too high."
          turns += 1
    if turns >= 7:
          keepGoing changes to false
```
### Computer Guesser Method

```
Create scanner called correctInput.
Create boolean called keepGoing. keepGoing is initialized to true. keepGoing is the sentry for the while loop.
Create int called turns. Initialize to 0.
Create int called maxNumber. Initialize to 100. 
Create int called minNumber. Initialize to 0. 
while keepGoing:
    computerGuess = findMean(maxNumber, minNumber)
    Print (turns + "I guess" + computerGuess)
    Print "Too (H)igh, Too (L)ow, or (C)orrect? "
    Store input in string called userResponse.
    if userResponse == "C":
          keepGoing = false
    else if userResponse == "L":
          minNumber = computerGuess
          turns+=1
    else if userResponse == "H":
          maxNumber = computerGuess
          turns += 1
    if turns >= 7:
          keepGoing = false
```
### findMean(num1, num2)

```
Create integer called sum. sum is num1 + num2.
Create integer called mean. Mean is sum/2. Only return integer.
Return mean.
```
