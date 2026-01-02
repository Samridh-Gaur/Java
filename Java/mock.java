public class mock 
{
    public static void main(String[] args) 
    {
        int a = 100;
        String org = Integer.toString(a);
        StringBuffer xyz = new StringBuffer();
        String ans = "";

        // StringBuffer ans = new StringBuffer(org);
        // ans.reverse();
        // System.out.println(ans);

        for(int i=org.length()-1;i>=0;i--)
        {
            xyz.append(org.charAt(i));
        }

        System.out.println(xyz);
        // StringBuffer b = new StringBuffer(a);

        // b.reverse();
        // System.out.println(b);


    }
}
