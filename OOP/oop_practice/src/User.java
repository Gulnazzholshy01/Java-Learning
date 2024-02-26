public class User {
    String _name;
    String _membership;
    int age;
    String check;

    void set_name(String name){
        System.out.println("Logging to log file");
        _name = name;
    }

    String get_name() {
        return _name;
    }

    void set_membership(String membership){
        _membership = membership;
    }

    public enum Membership{
        Bronze, Silver, Gold;
    }


    String get_membership() {
        return _membership;
    }

}
