public class rabin{
    static int d=256;
    public static void search(String pattern,String text){
        int m=pattern.length();
        int n=text.length();
        int h=1;
        int q=101;
        int p=0;
        int t=0;

        for(int i=0;i<m-1;i++){
            h=(h*d)%q;
        }

        for(int i=0;i<m;i++){
            p=(p*d+pattern.charAt(i))%q;
            t=(t*d+text.charAt(i))%q;
        }

        for(int i=0;i<=n-m;i++){
            if(t==p){
                if(text.substring(i,i+m).equals(pattern)){
                    System.out.println("Pattern found at index "+i);
                }
            }

            if(i<n-m){
                t=(d*(t-text.charAt(i)*h)+text.charAt(i+m))%q;
                if(t<0){
                    t+=q;
                }
            }
        }
    }

    public static void main(String[] args) {
        String text="this is a test text with test cases";
        String pattern="cases";
        search(pattern, text);
    }
}




































'''String matching is one of the most important problems in computer science, with applications
in text editors, search engines, and bioinformatics. The goal is to find whether a given pattern
occurs within a larger text. The Rabin-Karp algorithm is a string searching algorithm that uses
the idea of hashing to achieve efficient matching.

Instead of comparing the pattern with the text character by character, Rabin-Karp converts
both into hash values and compares the hashes. If the hash of the current substring of the text
matches the hash of the pattern, then the algorithm performs a direct character comparison to
confirm the match. This significantly reduces unnecessary comparisons and improves
performance when searching for multiple patterns or working with large texts.

Working principle:
1. Compute the hash value of the pattern and the hash value of the first window
(substring) of the text.
2. Slide the window one character at a time, updating the hash efficiently using a rolling
hash function.
3. If the hash values match, verify by direct comparison to avoid false positives caused by
hash collisions.
4. Repeat until the entire text has been scanned.

Applications:
● Detecting plagiarism by finding similar phrases in large documents.
● Searching keywords in documents, files, or web pages.
● DNA sequence analysis in bioinformatics.
● Spam filtering and intrusion detection systems.

Thus, Rabin-Karp provides a balance between efficiency and correctness by using hashing for
fast detection and verification for accuracy.'''