public class exception {
    public static void main(String[] args) {
        try {
            int myMyInt = Integer.parseInt("1");
            System.out.println("After parsing integer!");
            return;
        }
        catch (NumberFormatException e) {
            System.out.println("Hey, you cant make an int out of string!");
        }

        finally {
            System.out.println("in the finally block");
        }

        System.out.println("End here");
    }

    // private static void getMyInt() {
    //     int myMyInt = Integer.parseInt("fdxgc");
    // }
 }
