public class constructor extends c1
{ 
	constructor(int i)
	{
		super(i);
	}
	
  /*  constructor(double w, double h, double d, int num) 
    { 
        width = w; 
        height = h; 
        depth = d; 
        boxNo = num; 
    } */
    public static void main(String[] args) 
    { 
    	System.out.println("-----------");
    	//constructor c1= new constructor();
        //System.out.println(c1.height);
        c1 c2= new c1(10);
        
        System.out.println(c2.boxNo);
    } 
}
class c1
{
	 double width, height, depth; 
	  int boxNo;  
	  
	 
    c1(int num) 
    { 
       // this();
        boxNo = num;
    }
}