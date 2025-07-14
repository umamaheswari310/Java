class Phone{
static int version=5; 
String company="Realme";
public void incoming()
{
System.out.println("Answer");
}
public void outgoing()
{
System.out.println("call");
}
public static void main(String[]args){
Phone c1=new Phone(); 
System.out.println(c1.version);
System.out.println(c1.company);
c1.incoming();
c1.outgoing();
}
}

