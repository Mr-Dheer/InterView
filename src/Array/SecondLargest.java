package Array;

public class SecondLargest {
    public static void main(String[] args) {

        int []arr={4,3,5,2,1,6,69,0};

        int max=arr[0],max2=0;

        for (int i = 1; i <arr.length ; i++) {

            if(max<arr[1]){

                max2=max;
                max=arr[i];

            }

        }
        System.out.println(max2);

    }
}
