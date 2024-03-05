// Maximum Balanced String Partitions

public class classroom {
    public static int maxBalancedStrings(String str) {
        int n=str.length();

        int lcount=0;
        int rcount=0;
        int ans=0;

        for(int i=0;i<n;i++) {
            char ch=str.charAt(i);
            if(ch=='L') {
                lcount++;
            }
            else {
                rcount++;
            }
            if(lcount==rcount) {
                ans++;

                //lcount=0;
                //rcount=0;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(maxBalancedStrings("LRRRRLLRLLRL"));
    }
}
