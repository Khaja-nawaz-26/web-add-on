package lap;



public class laptop {

	String name;
    int size;
	laptop(String name,int size)
	   {
	      // System.out.print("executed");
	       this.name=name;
	       this.size=size;
	   }
	laptop(laptop another)
   {
       this.name=another.name;
       this.size=another.size;
   }
   public  void display()
   {
       System.out.println("name="+" "+name+"    ram="+" "+size);
   }
}
