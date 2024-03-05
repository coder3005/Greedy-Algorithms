//lexicographically smallest string (like dictionary)

public class classroom {
    public static String smallestString(int n, int k) {
        StringBuilder sb=new StringBuilder();

        int total_chars=n;
        int csum=k;
        while(total_chars>0) {
            //is it possible to fill 'a' here
            if((total_chars-1)*26>=(csum-1)) {
                sb.append('a');
                csum--;
            }
            else {
                int position=csum%26;
                if(position==0) {
                    sb.append('z');
                    csum-=26;
                }
                else {
                    sb.append((char)(position-1 + 'a'));
                    csum-=position;
                }
            }
            total_chars--;
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(smallestString(5, 101)); //n represent no. of characters and k represent sum of characters
    }
}
