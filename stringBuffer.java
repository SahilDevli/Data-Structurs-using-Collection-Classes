// string Buffer class is used in multi Threading environments .
// and provide simplyfied memmber function that makes operations easy to exicute...

public class stringBuffer{
    public static void main(String[] args){

        // construnction of StringBuffer class...

        StringBuffer sb = new StringBuffer("hello world");

        
        
        // method in StringBuffer class...

        System.out.println("sb.toString() : "+sb.toString());

        System.out.println("sb.length() : "+sb.length());

        System.out.println("sb.charAt(0) : "+sb.charAt(0));

        System.out.println("sb.append(\" Append method\") : "+sb.append(" Append method"));

        System.out.println("sb.insert(5,\" insert method\") : "+sb.insert(5," insert method"));

        System.out.println("sb.replace(6,19,\"replace method\") : "+sb.replace(6,19,"replace method"));

        System.out.println("sb.delete(6,21) : "+sb.delete(6,21));

        System.out.println("sb.reverse() : "+sb.reverse());


        // covert to string in order to use default String methods...
        String str1 = sb.toString();
        System.out.println(str1.toLowerCase());

        sb.replace(0, sb.length(), str1);
        System.out.println("'sb' after replace with string str1: "+sb);
        System.out.println("'sb' after replace with string str1 and reversed: "+sb.reverse());
    }
}