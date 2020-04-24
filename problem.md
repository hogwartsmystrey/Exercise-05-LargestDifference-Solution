## Problem Statement: Largest Difference##

**Write a program to read an integer array and find the index of larger number of the two adjacent numbers with largest difference.
Print the index of the larger number.**

**This exercise contains a class LargestDifference with the following static method**

    public static int findLargestDifference(int[] numbers)
        
    - Method should take integer array as input and return an integer with the index of 
      the larger number with the largest difference.

    - Rules: 
        - Difference is obtained by subtracting smaller number from larger number
        - If the largest difference is same for multiple adjacent numbers, then the 
          index of the largest numbers of the larger number should be returned. See 
          Sample for example
        - If the largest difference is same fora multiple adjacent numbers, and the 
          larger numbers are also same, then the index of the first larger number should 
          be returned
    
    *Note: If the input array is null or empty, method should return -1* 

**Do the following in the main method **

1. Accept inputs from the console
2. The first input is integer(n) denoting the count of integers, followed by  'n' integers
3. The integers should be stored in an array and passed to the method
4. The output should be displayed as per the format given in example section 


## Example ##
    Sample Input:
    5 15 9 2 10 6                    //  largest diff. of two adjacent numbers is 10 - 2 = 8, larger number is 10, index = 3 
    Expected Output:
                     3
   --------------------------------------------------------
                     Sample Input:
                     4 3 6 5 8    
    Expected Output:
    3

## Instructions
- Avoid printing unnecessary values other than expected output as given in sample
- Take care of whitespace/trailing whitespace
- Do not change the provided class/method names unless instructed
- Follow best practices while coding