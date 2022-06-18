class WordFilter 
{
    String[] word;
    Map<String,Integer> map=new HashMap<>();
    
    public WordFilter(String[] words)
    {
        word=words;
    }
    
    public int f(String pre, String suff)
    {
        
        String list=pre+"@"+suff;
        //implemented dp
        if(map.containsKey(list))
            return map.get(list);
        
        int ans=-1;
        
        for(int i=word.length-1;i>=0;i--)
        {
            String str=word[i];
            boolean flag=true;
            
            //if prefix or suffix is longer than str
             if(pre.length()>str.length() || suff.length()>str.length())
                 continue;
        
            //to check prefix
            for(int j=0;j<pre.length();j++)
            {
                if(pre.charAt(j)!=str.charAt(j))
                {
                    flag=false;
                    break;
                }
            }

            //to check suffix 
            for(int j=suff.length()-1,k=str.length()-1;j>=0 && flag;)
            {
                if(suff.charAt(j--)!=str.charAt(k--))
                {
                    flag=false;
                    break;
                }
            }
            
            
             if(flag)
             {
               map.put(list,i);
               return i;
             }

        }
        map.put(list,ans);
        return ans;
    }
}

/**
 * Your WordFilter object will be instantiated and called as such:
 * WordFilter obj = new WordFilter(words);
 * int param_1 = obj.f(prefix,suffix);
 */