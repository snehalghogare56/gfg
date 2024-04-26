Find minimum and maximum element in an array

  //{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Pair  
{  
    long first, second;  
    public Pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Solution obj = new Solution();
            Pair product = obj.getMinMax(a, n); 
            System.out.println(product.first+" "+product.second);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java

/*
 class Pair  
{  
    long first, second;  
    public Pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
} 

Java users need to return result in Pair class
For Example -> return new Pair(minimum,maximum)
*/
class Solution 
{
    static Pair getMinMax(long a[],  long n)  
    {
         long largest = Long.MIN_VALUE;
         long smallest = Long.MAX_VALUE;
        //Write your code here
        for(int i = 0; i < n; i++){
            if(a[i] > largest){
                largest = a[i];
            }
            if(a[i] < smallest){
                smallest = a[i];
            }
        }
        return new  Pair(smallest, largest);
    }
}


import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // Number of test cases
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            int array[] = new int[N];

            // Read array elements and find largest and smallest values
            int largest = Integer.MIN_VALUE;
            int smallest = Integer.MAX_VALUE;
            for (int i = 0; i < array.length; i++) {
                array[i] = sc.nextInt();
                if (largest < array[i]) {
                    largest = array[i];
                }
                if (smallest > array[i]) {
                    smallest = array[i];
                }
            }

            // Print largest and smallest values for each test case
            System.out.println(largest + " " + smallest);
        }
    }
}

