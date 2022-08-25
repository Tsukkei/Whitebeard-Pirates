public class App {
    public static void main(String[] args) {

        // Creates a new object named "Knight" from Character class
        Character knight = new Character(10, 5, 0, "Chen");
       // Calls the sayMyAttributes method
        knight.sayMyAttributes();

        // Creates a new object named "mage" from Character class
        Character mage = new Character(0, 5, 10, "Akasha");
        // Calls the sayMyAttributes method
        mage.sayMyAttributes();

        // Creates a new object named "thief" from Character class
        Character thief = new Character(5, 10, 0, "Gondar");
        // Calls the sayMyAttributes method
        thief.sayMyAttributes();
       

        // Creates a new object named "Sniper" From Character class
        Character Sniper = new Character(4, 10, 9 , "Izzo");
        // Calls the sayMyAttributes method
        Sniper.sayMyAttributes();

        //Creates a new object named "Doctor" From Character class
        Character Doctor = new Character(9, 5, 9, "Chopper");
        // Calls the sayMyAttributes method
        Doctor.sayMyAttributes();
    }
}
