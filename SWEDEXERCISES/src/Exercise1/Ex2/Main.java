package Exercise1.Ex2;

public class Main {

    static int ulamfunction(long n)
{
    while(n!=1)
        {
            if((n%2)==0){
                n=n/2;
            } else  {
                n=(n*3)+1;
            }
        }
    return 1;
}

    public static void main(String args[])
    {

    for(long i=1; i<1000000;i++)
        {
        ulamfunction(i);
        }
    System.out.println("Proof successful: All numbers < 1M terminate with 1.");

}

}
