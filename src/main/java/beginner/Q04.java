package beginner;

public class Q04 {
    //In a String, write all characters before the first 'm' character.
    //Example: Christmas

    public static void main(String[] args) {

        String s = "Christmas"; //example string

        String result = ""; //define an empty string to print the result

        for(int i=0; i<s.length(); i++){ //for loop to go over each char of the String

            String c = s.substring(i,i+1); //use substring() for get each char of the string

            if(c.equals("m")){ //break loop on "m"
                break;
            }

            result = result + c; // add all char until "m"
        }

        System.out.println(result); // print result on console

    }
}
