class Solution 
{
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        int n=strs.length;
        boolean[] flag=new boolean[strs.length];
        int[][] count=new int[strs.length][26];
        
        for(int i=0;i<n;i++)
        {
            String str=strs[i];
            for(char c:str.toCharArray())
                count[i][c-'a']++;
        }
        
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=0;j<26;j++)
        //         System.out.print(count[i][j]);
        //     System.out.println();
        // }
        
        List<List<String>> list=new ArrayList<>();
        
        for(int i=0;i<n;i++)
        {
             if(flag[i])
                 continue;
             //System.out.println(strs[i]);
            List<String> temp=new ArrayList<>();
            temp.add(strs[i]);
            flag[i]=true;
            for(int j=i+1;j<n;j++)
            {
                boolean happen=true;
                if(flag[j])
                    continue;

                for(int k=0;k<26;k++)
                {
                    if(count[i][k]!=count[j][k])
                    {
                        happen=false;
                        break;
                    }

                }

                if(happen)
                {
                    temp.add(strs[j]);
                    flag[j]=true;
                }
            }
            list.add(temp);
        }
        
        return list;
    }
}