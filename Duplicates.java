class RemoveDuplicates{
public static void main(String[] args) {
String RemoveDuplicates=new String("Java Programming");
String result = "";
for (int i = 0; i < RemoveDuplicates.length(); i++) {0;16
char ch = RemoveDuplicates.charAt(i);
if (result.indexOf(ch) == -1) {
result += ch;
}
}
System.out.println("Original String: " + input);
System.out.println("After removing duplicates: " + result);
}
}