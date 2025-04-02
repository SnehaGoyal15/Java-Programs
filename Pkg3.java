package p2;
import p1.Pkg1;

public class Pkg3 extends Pkg1  // Inheriting Pkg1
{
    public void test2()
    {
        System.out.println("Different package subclass");
        System.out.println("Private __");
        // System.out.println("Private " + a); // NOT ACCESSIBLE

        // System.out.println("Default " + b); // NOT ACCESSIBLE (different package)

        System.out.println("Protected " + c); // ACCESSIBLE (inherited)
        System.out.println("Public " + d); // Accessible
    }
}
