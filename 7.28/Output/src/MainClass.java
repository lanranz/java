class ClassOne
{
    static int i, j = 191919;

//    {
//        --i;
//    }
//
//    {
//        j++;
//    }
}

public class MainClass extends ClassOne
{
//    static
//    {
//        i++;
//    }
//
//    static
//    {
//        --j;
//    }

    public static void main(String[] args)
    {
        System.out.println(i);

        System.out.println(j);
    }
}