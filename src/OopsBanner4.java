public class OopsBanner4 {
    public static void main(String[] args) {
        //UC4:
        String[] lines = {
         String.join(" ","   ***   " , " " , "   ***   " , " " , " *****  " , " " , "   ***** "),
         String.join(" "," **   ** " , " " , " **   ** " , " " , " **   **" , " " , " **      "),
         String.join(" ","**     **" , " " , "**     **" , " " , " **   **" , " " , "**       "),
         String.join(" ","**     **" , " " , "**     **" , " " , " *****  " , " " , "  *****  "),
         String.join(" ","**     **" , " " , "**     **" , " " , " **     " , " " , "      ** "),
         String.join(" "," **   ** " , " " , " **   ** " , " " , " **     " , " " , "**    ** "),
         String.join(" ","   ***   " , " " , "   ***   " , " " , " **     " , " " , " *****   "),
        };

        for (String line : lines) {
            System.out.println(line);
        }
    }
}