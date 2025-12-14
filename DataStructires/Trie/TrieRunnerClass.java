package DataStructires.Trie;

public class TrieRunnerClass {

    public static void main(String[] args) {
        TrieFunction trie = new TrieFunction();
        trie.addWord("string");
        trie.addWord("iswari");
        System.out.println(trie.search("strng"));
        trie.addWord("pupu");
        System.out.println(trie.startWithPrefix("pu"));
    }
}
