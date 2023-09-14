package practice.array;

public class KadensAlgorithm {
    public static void main(String[] args) {
        int arr[] = {1,-2,3,-4,6,4,-1,3,-7};
        int maxi = arr[0];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            maxi = Math.max(sum,maxi);

            if(sum<0){
                sum = 0;
            }
        }
        System.out.println(maxi);
    }
}
