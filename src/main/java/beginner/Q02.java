package beginner;

public class Q02 {
    /*
    Write code to print unique (non-repeating) digits as an integer.
    Example; 223878 ---> 37
     */

    public static void main(String[] args) {
        System.out.println(uniqueDigits(223878));
    }

    private static String uniqueDigits(Integer num) {
        String numStr=String.valueOf(num);
        String numUnique="";
        int i=0;
        while (i<numStr.length()){
            String c = numStr.substring(i,i+1);
            if(numStr.indexOf(c)==numStr.lastIndexOf(c)){
                numUnique = numUnique + c;
            }
            i++;
        }
        return numUnique;
    }

}
