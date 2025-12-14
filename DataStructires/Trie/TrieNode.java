package DataStructires.Trie;

public class TrieNode {
    TrieNode[] children;
    boolean isEnd;

    TrieNode(){
        this.children = new TrieNode[26];
        this.isEnd=false;
    }
}
