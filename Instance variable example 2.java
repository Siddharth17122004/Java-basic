public class Main
{
    int instanceVar;
	public static void main(String[] args) {
	    Main obj1= new Main();
	    obj1.instanceVar=10;
	    System.out.println("obj1 instanceVar: "+obj1.instanceVar);
	    Main obj2=new Main();
	    System.out.println("obj2 instanceVar: "+obj2.instanceVar);
		obj2.instanceVar=20;
		System.out.println("obj InstanceVar "+obj2.instanceVar);
	}
}

output:
obj1 instanceVar: 10
obj2 instanceVar: 0
obj InstanceVar 20


public class Main
{
    int instanceVar=5;
	public static void main(String[] args) {
	    Main obj1= new Main();
	    obj1.instanceVar=10;
	    System.out.println("obj1 instanceVar: "+obj1.instanceVar);
	    Main obj2=new Main();
	    System.out.println("obj2 instanceVar: "+obj2.instanceVar);
		obj2.instanceVar=20;
		System.out.println("obj InstanceVar "+obj2.instanceVar);
	}
}
output:
obj1 instanceVar: 10
obj2 instanceVar: 5
obj InstanceVar 20