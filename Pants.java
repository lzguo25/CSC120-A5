/*
 * Pants class
 * prints out the pants of the scarecrow with ASCII Art
 * @param none
 * @return draws pants of the scarecrow using ASCII art
 */
public class Pants {

    /*
     * prints ASCII Art Pants
     */
    public void display() {
        System.out.println(" \t  |   | \\/  |  |");
        System.out.println(" \t  |__/  ||  \\__|");
        System.out.println(" \t  |     ||     |");
        System.out.println(" \t  |     ||     |");
        System.out.println(" \t  |     ||     |");
        System.out.println(" \t  |     ||     |");
        System.out.println(" \t  |     ||     |");
        System.out.println(" \t  |_____||_____|");
    }

    /* main method (for testing) */
    public static void main(String[] args) {
        Pants myPants = new Pants();
        myPants.display();
    }
}
