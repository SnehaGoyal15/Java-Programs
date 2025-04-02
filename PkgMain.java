import p1.Pkg1;
import p2.Pkg2;
import p2.Pkg3;
public class PkgMain
{
	public static void main(String args[])
	{
		Pkg1 o1=new Pkg1();
		o1.show();
		
		Pkg2 o2=new Pkg2();
		o2.test();

		Pkg3 o3=new Pkg3();
		o3.test2();
	}
}
