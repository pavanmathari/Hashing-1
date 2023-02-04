class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String[] sa=s.split(" ");
        HashMap<Character, String> hm=new HashMap<>();
        if(sa.length!=pattern.length()) return false;

        for(int i=0;i<pattern.length();i++)
        {
            char c=pattern.charAt(i);
            if (hm.containsKey(c))
            {
                if(hm.get(c).equals(sa[i])!=true) return false;

            }
            else{
                if(hm.containsValue(sa[i])) return false;
                    hm.put(c, sa[i]);
            }
        }return true;

    }
}