class Solution {
    public String decodeAtIndex(String s, int k) {
        //compute the length of the result string by simulation
        long count=0;
        for(char c: s.toCharArray())
        {
            if(Character.isDigit(c))
            {
                count= count * (c - '0');
            }
            else count+=1;

        }
        for(int i=s.length() - 1; i>=0 ; i--)
        {
             k %= count;                                           //use this to avoid lossy conversion errrors. k=k%count gives incompatible types, lossy conversion error.
             if(k==0 && Character.isLetter(s.charAt(i)))
           {
               return String.valueOf(s.charAt(i));
           }
            if(Character.isDigit(s.charAt(i)))
            {
                count=count/(s.charAt(i)-'0');

            }
           else count= count-1;
          
           
        }
        return "";
    }
}
