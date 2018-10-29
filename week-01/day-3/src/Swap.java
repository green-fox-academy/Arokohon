public class Swap
{
    public static void main(String[] args)
    {
        int a = 123;
        int b = 526;

        System.out.println(a += (b - (b = a)));
        //System.out.println(a -= (a - (a = b)));
        System.out.println(b);

        System.out.println(a);
    }
}
