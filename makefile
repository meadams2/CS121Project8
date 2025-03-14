Guesser.class: Guesser.java
	javac -g Guesser.java

run: Guesser.class
	java Guesser

valgrind: Guesser.class
	valgrind java Guesser
clean: 
	rm *class


