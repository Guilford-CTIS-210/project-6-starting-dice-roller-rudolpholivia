# So this is what we should have done...

Recall that our dice rolling program introduced a bunch of stuff we weren't ready for because of a mix-up with files. Let's fix that by doing the project we should have started with.

In this project, you will use the `for` loop to simulate rolling a group of dice. It would be best if you have read Section 6.3 in *Think Java*, but we will also refer back to input & output from Chapter 3 and random number generators from sever past projects.

## Sample program

Open `Main.java` and run it. It should print 10 lines of text, counting up from 0. Look through the code to see the working parts.
```
for (int i = 0; i < 10; i++) {
    stuff
}
```
This will execute whatever code is in `stuff` 10 times. Generally, you want to use a `for` loop any time you have code that has a fixed number of iterations. Because `i` is used inside the loop, we get a print-out of where we are in the loop at each step.

## Experiment

Change `int i = 0` to another value and run it. Experiment until you think you know what it does.

Change `i < 10` to another value and run it. Experiment until you think you know what it does.

Change these back to 0 and 10 before continuing.

## Random number generator

As this project is supposed to roll some dice, let's start with something straightforward - rolling 3 dice, each with 6 sides.

Add an `import` statement in the appropriate location for the `Random` library. Add a line at the beginning of `main` that declares and instantiates a `Random` object called `rand`.

Modify the text of the print statement to `"Dice roll " + i`. Make sure this runs correctly before preceding. Java should complain that you created `rand` but didn't use it.

Inside your loop, before the print statement, declare an integer variable called `diceRoll`. Use the `nextInt` method from `rand` to get a random value between 1 and 6. Test this. Java should complain that you didn't use `diceRoll`.

Modify your print statement so it prints `diceRoll` instead of `i`. If you want to print `i` as well, that's fine, but make it clear which value is the die number and which is the roll. Test this by running it multiple times. Does it appear to be producing about 1-3 of each value?

## Modifying the size of the dice

Import the appropriate library for user input from the keyboard. Before the `for` loop, declare & instantiate your `Scanner` object, naming it something obvious like `scan`.

Write a print statement that tells the user they are going to be rolling 10 dice and asks how many sides the dice should have. Use the `nextInt` method of `scan` to input an integer called `sides`.

Now modify the code inside the `for` loop, replacing the 6 with `sides`. Test the code by running it and inputting 4 sides, 6 sides, 12 sides. Do the numbers seem appropriate?

## Summing the rolls

After the code where you input `sides` but before the `for` loops, declare an integer named `sum` with a value of 0.

Inside the `for` loop, after the line where `diceRoll` is created, add a line that says
```
sum += diceRoll;
```
Then modify the print statement so it prints something like `"sum of " + i + "d" + sides + " = " + sum`. Test this. Each sum should be larger than the one before it and the difference should never be more than `sides`.

## Varying the number of dice

After the code that reads in `sides`, add a print statement asking the user how many dice they want to roll. Declare and read in an integer named `number`.

Modify your `for` loop by changing `i < 10` to `i < number`. Test this with values for `number` like 2-6 while using the value of 4 for `sides`. 

## Reducing to a single output

Comment out the line in the `for` loop that prints `sum`. 

After the end of the `for` loop, but before the end of `main`, add a line that prints the `number + "d" + sides + "=" + sum`. Test this by running it repeatedly.

As a good test run, 10d6 will have values that vary a lot (from 10 to 60), but is generally pretty close to 35. This is a long-term average, so you need to test it quite a few times to see this trend.

## Close your Scanner

Make sure the last line of `main` is something like `scan.close();` - this closes possible resource leaks.

## Wrapping up

Return to your code and make sure it has output somewhat like the following.

```
This program rolls a number of dice and totals the rolls.
How many sides should the dice have? 6
How many dice do you want to roll? 3
Rolling 3d6 = 12
```

Review your code, inserting comments at each line that's not obvious. You'll need to look back at this program later, so it's a good idea to leave future you some notes.

Now save everything. Go to Source Control. Stage the changes. Enter a message & Commit. Then Sync if asked.

Finally, go to Canvas and tell me you're ready for me to grade the project.
