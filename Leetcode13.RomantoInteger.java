class Solution {
    public int romanToInt(String s) {
        // HashMap<Character,Integer> hmp = new HashMap<>();
        // hmp.put('I' , 1);
        // hmp.put('V' , 5);
        // hmp.put('X' , 10);
        // hmp.put('L' , 50);
        // hmp.put('C' , 100);
        // hmp.put('D' , 500);
        // hmp.put('M' , 1000);
        int num=0,num1=0;
        switch(s.charAt(s.length()-1)) {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }

        int res= num;
        for(int i=s.length() - 2; i>=0 ; i--)
        {
            char ch= s.charAt(i);
            char next=s.charAt(i+1);
             switch(s.charAt(i)) {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }
             switch(s.charAt(i+1)) {
                case 'I': num1 = 1; break;
                case 'V': num1 = 5; break;
                case 'X': num1 = 10; break;
                case 'L': num1 = 50; break;
                case 'C': num1 = 100; break;
                case 'D': num1 = 500; break;
                case 'M': num1 = 1000; break;
            }
            if(num>= num1)
            {
                res+= num;
            }
            else res= res-num;
        }

    return res;

    }
    }
