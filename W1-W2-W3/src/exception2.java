public class exception2 {
    public static void main(String[] args){
        System.out.println(printANumber());
    }

    private static int printANumber() {
        try {
            return 3;
        }
        catch (Exception e) {
            return 4;
        }
        finally {
            return 5; //this return statement overwrite return statements in TRY and CATCH blocks, most likely finally does not need return statement
        }
    }
}
