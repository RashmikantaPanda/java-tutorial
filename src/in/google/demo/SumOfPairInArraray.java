package in.google.demo;

import static java.util.Arrays.sort;

public class SumOfPairInArraray {

    static void findPair(int nums[], int n, int target)
    {
        sort(nums);
        for (int i = 0; i < n; i++)
            System.out.println(nums[i]+" ");
        int low = 0;
        int high = n - 1;
        int flag=0;


        while (low < high)
        {
            if (nums[low] + nums[high] == target)
            {

                System.out.println("Pair found( "+nums[low]+" , "+nums[high]+" )");
                flag++;

            }
            if((nums[low] + nums[high]) < target)
            {
                low++;
            }
            else
            {
                high--;
            }

        }
        if(flag==0)
        {
            System.out.println("Pair Not Found");
        }




    }

    public static void  main(String args[])
    {
        int nums[] = {10,90,50,70,30,45,60,20,65};
        int target =100;
        int n = nums.length;
        findPair(nums, n, target);
    }


}
