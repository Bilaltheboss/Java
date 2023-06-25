public class Stringmethod {
    public static void main(String[] args) {
        String Name = "Bilal";
        System.out.println(Name);
        int value = Name.length();
        System.out.println(value);
        String Value = Name.toLowerCase();
        System.out.println(Value);
        // if you want to remove extra spaces from your string you can use trim method
        String friend = "         Zain        ";
        System.out.println(friend.trim());
    }
}
