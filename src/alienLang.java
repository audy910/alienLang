public class alienLang
{
    public static void main(String[] args)
    {
        double num = Math.random() * 30;
        for(int i = 0; i < num; i++)
        {
            generateBlurb();
        }
    }

    public static String generateBlurb()
    {
        String output = whoozit();
        double num = Math.random() * 10;
        for(int i = 0; i < num; i++)
        {
            output += whatzit();
        }
        return output;
    }

    public static String whoozit()
    {
        String output = "x";
        double num = Math.random() * 10;
        if(num > 1)
        {
            for (int i = 0; i < num; i++) {
                output += "y";
            }
        }
        else
            output += "0";
        return output;
    }

    public static String whatzit()
    {
        String output = "q";
        double num = Math.random() *10;
        if(num >5)
        {
            output += "z";
        }
        else
            output += "d";
        output += whoozit();
        return output;
    }
}
