class Solution 
{
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        int n=strs.length;
        //to check if a str is visited or not
        boolean[] flag=new boolean[n];
        
        //to store the freq of each str
        int[][] count=new int[n][26];
        
        
        //storing the freq
        for(int i=0;i<n;i++)
        {
            String str=strs[i];
            for(char c:str.toCharArray())
                count[i][c-'a']++;
        }
        
        List<List<String>> list=new ArrayList<>();
        
        for(int i=0;i<n;i++)
        {
             //if the str is visited continue
             if(flag[i])
                 continue;
            
            List<String> temp=new ArrayList<>();
            temp.add(strs[i]);
            flag[i]=true; //mark str visited
            boolean match=true;
            
            for(int j=i+1;j<n;j++)
            {
                if(flag[j])  //if visited continue
                    continue;

                match=true;
                
                
                //char matching
                for(int k=0;k<26;k++)
                {
                    if(count[i][k]!=count[j][k])
                    {
                        match=false;
                        break;
                    }

                }

                //if match happen add in list 
                if(match)
                {
                    temp.add(strs[j]);
                    flag[j]=true;
                }
            }
            //add temp in list
            list.add(temp);
        }
        
        return list;
    }
}