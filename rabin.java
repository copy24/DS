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
