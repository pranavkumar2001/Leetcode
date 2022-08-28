class Solution 
{
    public int romanToInt(String s) 
    {
       Map<Character,Integer> map=new HashMap<>();
       map.put('I',1);
       map.put('V',5);
       map.put('X',10);
       map.put('L',50);
       map.put('C',100);
       map.put('D',500);
       map.put('M',1000);
       int ans=0;
       int i=0;
       for(i=0;i<s.length()-1;i++)
       {
           char a=s.charAt(i);
           char b=s.charAt(i+1);
           if(map.get(a)<map.get(b))
               ans-=map.get(a);
           else
               ans+=map.get(a);
       }
       ans+=map.get(s.charAt(i));
       return ans;
    }
}