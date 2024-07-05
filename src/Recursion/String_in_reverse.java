package Recursion;

public class

String_in_reverse {
    public static void revstr(String str, int idx){
        if (idx==0){
        System.out.println(str.charAt(idx));
        return;
        }
        System.out.print(str.charAt(idx));
        revstr(str,idx-1);
    }

    public static void main(String[] args) {
        String str = "Avi";
        revstr(str,str.length()-1);
    }
}
