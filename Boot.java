/*
 * Boot class 
 * prints out the left and right boots of the scarecrow using ASCII art
 * @param String, stores direction of the boots
 * @return left and right boots basesd on the direction given
 */
public class Boot {
  
    private String direction;
  
    /* Constructor */
    public Boot(String direction) {
        this.direction = direction.toLowerCase();
    }

    /*
     * prints ASCII Art Boot
     */
    public void display() {
        if (this.direction.equals("left")) {
          System.out.println("|______|");
        } else if (this.direction.equals("right")) {
          System.out.print("\t |______|");
        } else {
          System.out.println("Which boot?");
        }
    }

    /* main method (for testing) */
    public static void main(String[] args) {
        Boot myLeftBoot = new Boot("left");
        Boot myRightBoot = new Boot("right");
        myLeftBoot.display();
        myRightBoot.display();
    }
}
