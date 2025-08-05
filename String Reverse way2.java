class Main{
    public static void main(String[]args){
        String hello=new String("age of srilakshmi 1000");
        String rev="";
        for(int i=hello.length()-1;i>=0;i--){
            rev=rev+hello.charAt(i);
        }
        System.out.println(rev);
    }
}