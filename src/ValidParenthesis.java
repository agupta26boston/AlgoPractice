public class ValidParenthesis {

    public boolean isValid(String s) {

        if (s.equals(""))
        {
            return true;
        }

        char[] str=s.toCharArray();

        if (str[0]=='(' && str[1]=='}' || str[1]==']')
        {
            return false;
        }
        else if (str[0]=='{' && str[1]==']')
        {
            return false;
        }

        else if (str[0]=='[' && str[1]=='}' || str[1]==')')
        {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {

        ValidParenthesis validParenthesis= new ValidParenthesis();
        validParenthesis.isValid("()");
    }
}
