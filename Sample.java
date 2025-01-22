/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Sample
{
    int x,y;
    public Sample(){
        x=10;
        y=20;
    }
    public Sample(Sample s1){
        x=s1.x;
        y=s1.y;
    }
    public void display(){
        System.out.println(x);
        System.out.println(y);
    }
	public static void main(String[] args) {
		Sample s1=new Sample();
		Sample s2=new Sample(s1);
		s1.display();
	}
}