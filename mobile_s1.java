class Phone{
int version=5;// if it is static no need to create object 
String company="Realme";
public static String incoming()
{
return "Answer";
}
public static String outgoing()
{
return "Call";
}
public static void main(String[]args){
Phone c1=new Phone(); // object creation
System.out.println(c1.version);
System.out.println(c1.company);
System.out.println(c1.incoming());
System.out.println(outgoing());
}
}

// even though it is static we can access it by using object but it is not mandatory