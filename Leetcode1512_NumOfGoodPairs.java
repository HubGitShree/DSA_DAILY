//best approach
class Solution {
    public int numIdenticalPairs(int[] nums) {
      HashMap< Integer , Integer > hmp = new HashMap<>();
      int ans=0;
      for( int i=0; i < nums.length; i++)
      {
          ans + = hmp.getOrDefault( nums[i] , 0) ;
          hmp.put( nums[i] , hmp.getOrDefault( nums[i] , 0) + 1);
      }
      return ans;
    }
}

// 2nd best
class Solution {
    public int numIdenticalPairs(int[] nums) {
      // non brute forve solution

      //take a Hashmap
      HashMap<Integer, Integer> hmp = new HashMap<>();

      for (int i=0; i<nums.length; i++)
      {
          hmp.put(nums[i] , hmp.getOrDefault(nums[i],0)+1);

      } 
      int sum=0;
      for(Map.Entry<Integer,Integer> e: hmp.entrySet())
      {
          int timesOccurring = e.getValue();
          if(timesOccurring>1)
          {
              sum+= (timesOccurring * (timesOccurring-1) ) / 2;
          }

      }
      return sum;
    }
}

//brute force
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int n=nums.length;
        int i,j,c=0;
        for(i=0;i<n-1;i++)
        {
           for(j=i+1;j<n;j++)
           {
               if(nums[i]==nums[j])
                   c++;
           }
        }
        return c;
        
    }
}
