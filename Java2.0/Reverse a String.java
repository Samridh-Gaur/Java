public class practice 
{

    void revnum(String a)
    {
        String temp = "";
        for(int j=a.length()-1;j>=0;j--)
        {
            temp = temp +a.charAt(j);
        }
        System.out.println(temp);
    }
    public static void main(String[] args) 
    {
        practice hell = new practice();
        hell.revnum("himmat");
    }
}
