/*
 * Shirt class 
 * prints out the shirt of the scarecrow using ASCII art
 * @param none
 * @return draws the shirt of the scarecrow using ASCII art
 */
public class Shirt {

    /*
     * prints the ASCII Art Shirt
     */
    public void display() {
        System.out.println("          __,--./|.--,__");
        System.out.println("        .`   \\ \\ / /    `.");
        System.out.println("      .`      \\ | /       `.");
        System.out.println("     /   /     ^|^      \\   \\");
        System.out.println("    /   / |     |o     | \\   \\");
        System.out.println("   /===/  |     |      |  \\===\\");
        System.out.println("  /___/   |     |o     |   \\___\\");
        System.out.println("          |     |      |");
        System.out.println("          |     |o     |");
        System.out.println("          |_____/\\_____|");

    }

    /* main method (for testing) */
    public static void main(String[] args) {
        Shirt myShirt = new Shirt();
        myShirt.display();
    }
}
