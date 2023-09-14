package practice.gfg;
import java.util.*;
import java.io.*;
import java.lang.*;





    //{ Driver Code Starts
//Initial Template for Java



    public class GFG{
        public static void main(String[] args) throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int test = Integer.parseInt(br.readLine());
            while(test-- > 0) {
                int N = Integer.parseInt(br.readLine());
                int [] arr = new int[N];
                String [] str = br.readLine().trim().split(" ");
                for(int i= 0; i < N; i++)
                    arr[i] = Integer.parseInt(str[i]);
                Solution obj = new Solution();
                System.out.println(obj.no_of_subarrays(N, arr));
            }
        }
    }
// } Driver Code Ends


//User function Template for Java

    class Solution{
        int count =0;
        long no_of_subarrays(int N, int [] arr) {
            //Write your code here
            for(int i = 0; i < arr.length ; i++){
                if(arr[i] == 0){
                    count ++;
                }
            }
            int sum =0;
            for(int i =1; i <= count; i ++){
                sum = sum + i;
            }
            return sum;
        }

    }
