// Java program to ReverseString using ByteArray.
 
// Class of ReverseString
class main {
    public static void main(String[] args)
    {
        reverse("ola");
    }


    public static String reverse(String s) {   
        return reverseAux(s, "");
    }

    public static String reverseAux(String s, String reverse) {
        if(s.isEmpty()){
            return s;
        }else{
            return reverse(s.substring(1)) + s.charAt(0);
        }
    }

}