class Solution {
    public long countOfSubstrings(String word, int k) {
        return atleast(k,word)-atleast(k+1,word);
    }
    public boolean isConsonant(char ch){
        return (ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u');
    }
    public boolean isVowel(int freq[]){
        return (freq['a'-'a']>0&&freq['e'-'a']>0&&freq['i'-'a']>0&&freq['o'-'a']>0
        &&freq['u'-'a']>0);
    }
    public long atleast(int k,String word){
        long count=0;
        int cursonant=0;
        int freq[]=new int[26];
        int n=word.length();
        int left=0;
        for(int right=0;right<n;right++){
            char ch=word.charAt(right);
            if(isConsonant(ch)){
                cursonant++;
            }
            freq[ch-'a']++;

            while(cursonant>=k&&isVowel(freq)){
                count+=(n-right);
                char c=word.charAt(left);
                if(isConsonant(c)){
                    cursonant--;
                }
                freq[c-'a']--;
                left++;
            }
        }
        return count;

    }
}
