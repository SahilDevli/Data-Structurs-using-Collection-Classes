public class strings1 {
    public static void main(String[] args) {
        //1.  String str = new String("hello");
        //2.  String str = "hello world";

        String str1 = "  Hello  ";
        String str2 = "World";

        System.out.println("str1 : "+str1);

        // can't use this for loop to iterate over the strings...
        // for(char s : str2){
        //     System.out.print(s);
        // }
        for(int i = 0; i < str2.length(); i++)
            System.out.print(str2.charAt(i));

        // Important Methods in Strings in Java....
        System.out.println("\n'str1.length()' Length of str1 : "+ str1.length());//length()...
        
        System.out.println("\n'(str1.chatAt(2)' Char at index 2 is : " + str1.charAt(2) );//cahrAt(index)...
        
        System.out.println("\n'str1.indexOf(l)' Index of 'l' in str1 : "+ str1.indexOf("l"));//indexOf("str")...
        
        System.out.println("\n'str1.toUpperCase()' Covert Str1 to Upper case : "+ str1.toUpperCase());//toUpperCase()...
        
        System.out.println("\n'str1.trim()' Trim extra space from str1 : "+ str1.trim());//trim()...
        
    }
}