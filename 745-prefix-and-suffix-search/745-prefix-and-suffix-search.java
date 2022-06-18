class WordFilter 
{
    String[] word;
    Map<List<String>,Integer> map=new HashMap<>();
    public WordFilter(String[] words) 
    {
        word=words;
    }
    
    public int f(String pre, String suff)
    {
        List<String> list=new ArrayList<>();
        list.add(pre);list.add(suff);
        if(map.containsKey(list))
            return map.get(list);
        char p=pre.charAt(0),s=suff.charAt(suff.length()-1);
        
        int ans=-1;
        
        for(int i=word.length-1;i>=0;i--)
        {
            String str=word[i];
            
             if(pre.length()>str.length() || suff.length()>str.length())
                 continue;
            
            char st=str.charAt(0);
            char en=str.charAt(str.length()-1);
            boolean flag=true;
        
            for(int j=0;j<pre.length();j++)
            {
                if(pre.charAt(j)!=str.charAt(j))
                {
                    flag=false;
                    break;
                }
            }

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