class Main{
public static void main(String[]args){
char c='S';
int ch='_';
System.out.println(ch);
if(c>='A' && c<='Z'){
System.out.println("Upper");
}
else if(c>='a' && c<='z'){
System.out.println("Lower");
}
else if(c>='0' && c<='9'){
System.out.println("number");
}
else{
System.out.println("special");
}
}
}



