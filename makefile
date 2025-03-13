Guesser.class: Guesser.java
	javac -g Guesser.java

run: Guesser.class
	java Guesser

clean: 
	rm *class


