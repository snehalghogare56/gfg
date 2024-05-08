//{ Driver Code Starts
import java.util.*;

class Find_Given_Element_Of_Spiral_Matrix 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();
			int arr[][] = new int[n][m];
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<m; j++ )
				{
					arr[i][j] = sc.nextInt();
				}
			}
			Solution obj = new Solution();
			System.out.println(obj.findK(arr, n, m, k));
		t--;
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    public int findK(int a[][], int n, int m, int k) {
        int[] result = new int[n * m];
        int index = 0;

        int top = 0, bottom = n - 1, left = 0, right = m - 1;

        while (top <= bottom && left <= right) {
            // Traverse the top row
            for (int i = left; i <= right; i++) {
                result[index++] = a[top][i];
            }
            top++;

            // Traverse the rightmost column
            for (int i = top; i <= bottom; i++) {
                result[index++] = a[i][right];
            }
            right--;

            // Traverse the bottom row
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result[index++] = a[bottom][i];
                }
                bottom--;
            }

            // Traverse the leftmost column
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result[index++] = a[i][left];
                }
                left++;
            }
        }

        // The Kth element is at index k - 1 in the result array
        return result[k - 1];
    }
}
