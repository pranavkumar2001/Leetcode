class Solution 
{
    public List<List<String>> suggestedProducts(String[] pro, String sea) 
    {
        Arrays.sort(pro);
        String[] list=new String[sea.length()];
        List<List<String>> ans=new ArrayList<>();
        for(int i=0;i<sea.length();i++)
        {
            if(i==0)
              list[i]=sea.charAt(i)+"";
            else
              list[i]=list[i-1]+sea.charAt(i)+"";
        }
        // for(String x:list)
        //     System.out.println(x);
        for(String str:list)
        {
            int count=0;
            int n=str.length();
            List<String> temp=new ArrayList<>();
            int j=0;
            while(count<3 && j<pro.length)
            {
                String t="";
                if(pro[j].length()>=n)
                {
                    t=pro[j].substring(0,n);
                    if(t.equals(str))
                    {
                        temp.add(pro[j]);
                        count++;
                    }
                }
                j++;
            }
            System.out.println(temp);
            ans.add(temp);
        }
        return ans;
    }
}