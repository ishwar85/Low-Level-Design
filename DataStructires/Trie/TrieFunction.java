package DataStructires.Trie;

public class TrieFunction {

    TrieNode root;
    TrieFunction(){
        this.root = new TrieNode();
    }

    public void addWord(String word) {
        if(word.isEmpty()){
            root.isEnd = true;
            return;
        }
        TrieNode curr = root;
        for(char ch:word.toCharArray()){
            int idx = ch-'a';
            if(curr.children[idx]==null){
                curr.children[idx] = new TrieNode();
            }
            curr = curr.children[idx];
        }
        curr.isEnd=true;
    }

    public boolean search(String word) {
        if(word.isEmpty()){
            return root.isEnd;
        }

        TrieNode curr = root;
        for(char ch:word.toCharArray()){
            int idx = ch-'a';
            if(curr.children[idx]==null){
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.isEnd;
    }

    /*
    if we want to search based on string with * pattern like ba*d * can be anything
    then our search function will modify like bwlo
     */
    public boolean searchWithStat(String word) {
        return dfs(word,0,root);
    }
    private boolean dfs(String word, int idx, TrieNode curr){

        if(idx == word.length())return curr.isEnd;

        char ch = word.charAt(idx);
        if(ch!='*'){
            int index = ch-'a';
            if(curr.children[index]==null) return false;
            return dfs(word,idx+1,curr.children[index]);
        }
        for(TrieNode t : curr.children){
            if(dfs(word,idx+1,t)){
                return true;
            }
        }
        return false;
    }


    public boolean startWithPrefix(String word) {

        TrieNode curr = root;
        for(char ch:word.toCharArray()){
            int idx = ch-'a';
            if(curr.children[idx]==null){
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }
}
