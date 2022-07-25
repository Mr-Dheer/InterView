package Array;

public class max {
    public static void main(String[] args) {

        int [] arr={4,3,5,2,1,6};

        int max = arr[0],min=arr[0];

        for (int i = 1; i <arr.length ; i++) {

            if(max<arr[i]) max=arr[i];
            if (min>arr[i]) min =arr[i];
        }
        System.out.println(max+"yes"+min);

    }
}
