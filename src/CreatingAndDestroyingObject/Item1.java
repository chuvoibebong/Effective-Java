package CreatingAndDestroyingObject;

/*
 * Created on : Thursday 10/1/2020
 * */

public class Item1 {
    private final String name;
    private final String country;
    private final String email;

    private Item1(String name, String country, String email) {
        this.name = name;
        this.country = country;
        this.email = email;
    }

    public static Item1 createNewUser(String name, String country, String email) {
        return new Item1(name, country, email);
    }

    public static void main(String[] args) {
        Item1 user = Item1.createNewUser("Giao", "Vietnam", "chuvoibebong@gmail.com");
        System.out.println(user.country);
        System.out.println(user.name);
        System.out.println(user.email);
    }
}
