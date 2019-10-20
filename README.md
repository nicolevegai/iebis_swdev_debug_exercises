# iebis_swdev_debugging
Source code to test debugging

## Instructions
First, **Fork** this project.

There are three exercises splitted in three branches of this repository. You must switch branches to checkout the code of each exercise.
Then, find the bugs that appear in each branch.
Fix the bugs if you can and answer to the questions proposed below.
Commit the code before checking out a different branch to avoid loosing the fixes that you have made to the code.

Once that you are done fixing bugs, **to score you must**:
1. Switch to the master branch.
2. Type below in this README.md file the answer to each question and paste some code that you have used to solve them.
3. Commit the changes
4. Push to your GitHub repository
5. **Finally place a Pull Request so I can see your proposed answers**


## Exercises
### Exercise 1
In this code there is a class called WordAnalyzer that contains several methods that analyzes some characteristics of the word passed as argument when the object WordAnalyzer is created.

For some reason, the methods are not working properly, sometimes they return the correct value and others don't. You need to answer the next questions.

#### Why the method _firstMultipleCharacter_ is returning "c" for the word _comprehensive_, when the correct answer should be "e"?   
The method is returning the value of the first character so we need to add 1 to pos because if not the first letter or the char that is written in: if (find(ch, i) >= 0) firstMultipleCharacter() method is always going to be the value of pos.   

      for (int i = pos + 1; i < word.length(); i++)  
            
Now the method is going to return the first multiple character that for comprenhensive is e.  

#### Why the method _firstRepeatedCharacter_ is throwing an exception?   
We need to add code so when there are no repeated characters the program knows what to do. In this case print [] so the Exception is not sent and returns 0.
 
      if ((i+1) == word.length()){ 
            return 0;
            
#### Why the method _countGroupsRepeatedCharacters_ returns 3 in one case when it should be 4?
As the loop starts in int i=1 it does not check repeated characters in the first two chars. Therefore we have to change the condition to i=0 so it checks the first char.  

    for (int i = 0; i < word.length() - 1; i++)
    
 Now, the program shows a thread Exception so we need to add an if that tells the program what to do if the two first chars are not equal.
 
            if (i != 0) {
               if (word.charAt(i - 1) != word.charAt(i)) // it't the start
                c++;
 

**Strategy**: Place breakpoints before the methods are executed, step into them and see what happens.


### Exercise 2
In this code we are placing mines in a board game where we have several spaces that can be mined. 
The boards can contain _Element_ objects, and since _Space_ and _Mine_ inherits from _Element_, the boards can contain this kind as well.

We have two boards of different size and place a different number of mines on each one. But in the second case it takes longer to place all the mines.

#### Why placing less bombs takes longer in the second case?
#### Knowing that usually there are going to be more bombs than spaces in the final boards, how would you change the method _minningTheBoard_ to be more efficient?

**Strategy**: Understand well what the code does. Use conditionals breakpoints.


### Exercise 3
In this case this code looks really simple. When the "d" reaches the value 1.0, the program should end, but it never does.

#### Why does not appear a message indicating that "d is 1"?
Humans work in Base 10 and Floating point numbers work in Base 2. Many times it is not possible to transform numbers between this two number systems and in this program the if(d != 1.0) is not true because the system keeps on adding decimals and d will never be equal to 1.0 so it will not print "d is 1" 

#### How will you fix it?
To solve This through research i found that Java has Math class called [BigDecimal](https://docs.oracle.com/javase/7/docs/api/java/math/BigDecimal.html) that for this cases when working with floats and to transform base 10 and binary numbers its more precise.

        public static void main(String [] args) {
              BigDecimal d = new BigDecimal(0.0);
              BigDecimal m = new BigDecimal(1.0);

              while (d.equals(m)) {
                  BigDecimal sum = new BigDecimal(0.1);
                  d = d.add(sum);
              }

              System.out.println("d is 1");
          }
