public class Array {
    public static void main(String[] args) {
        /*
         We have 3 ways to initialise an array

         1. int [] marks = {100,200,300};
         2. int [] marks;
            marks = new int [10];
         3. int [] marks = new int [10];
         */

        int [] nums = new int [5];
        nums[0] = 100;
        nums[1] = 200;
        nums[2] = 300;
        nums[3] = 400;
        nums[4] = 500;

        System.out.println("Array Length is " + nums.length);
    }
}
