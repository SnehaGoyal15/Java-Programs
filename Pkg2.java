package p2;
import p1.Pkg1;

public class Pkg2
{
    public void test()
    {
        Pkg1 obj = new Pkg1();
        System.out.println("Different package ");
        System.out.println("Private __");
        // System.out.println("Private " + obj.a); // NOT ACCESSIBLE

        // System.out.println("Default " + obj.b); // NOT ACCESSIBLE (different package)

        // System.out.println("Protected " + obj.c); // NOT ACCESSIBLE (needs inheritance)

        System.out.println("Public " + obj.d); // Accessible
    }
}
