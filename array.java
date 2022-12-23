class array {

    public static void main(String[] args)
    {
        int ar[] = {-1,4,2, 60,12 };
        int sum = 0;


        for (int i = 0; i < ar.length; i++)
            sum =sum+ ar[i];

        System.out.println("Sum of given array is "
                + sum);
    }
}