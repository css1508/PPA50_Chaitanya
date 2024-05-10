class Command
{
    public static void main(String Arg[])
    {
        System.out.println("Number of commands line argument are : "+Arg.length);

        int i = 0;
        for(i = 0; i< Arg.length; i++)
        {
            System.out.println(Arg(i));
        }
    }
}