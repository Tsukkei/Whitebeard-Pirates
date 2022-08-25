public class Character {
    // Attributes
    int strength;
    int agility;
    int intelligence;
    String name;

    // Method
    public void sayMyAttributes() {

      System.out.println("My name is " + name + "\n" + "My strength is " + strength + "\n" + "My agility is " + agility + "\n" + "My intelligence is " + intelligence + "\n"); 
    }

    
    // Constructor
    public Character(int str, int agi, int intel, String characterName) {
        strength = str;
        agility = agi;
        intelligence = intel;
        name = characterName;

        

    }
}
