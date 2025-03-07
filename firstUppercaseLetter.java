public class firstUppercaseLetter
{
    public static void main(String [] args)
    {
        String str ="geeksOrgFeeks";
        System.out.println(first(str, 0));
    }
    static char first(String str,int pos)
    {
        if(pos >= str.length())
            return 0;
        if(Character.isUpperCase(str.charAt(pos)))
            return str.charAt(pos);
        else
            return first(str, pos+ 1 );
    }
}