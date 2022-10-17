/*
 * Banner class
 * prints out a banner that contains a messsage using ASCII art
 * @param string to receive message
 * @return ASCII art that prints out banner. The banner will resize based on the size of the message provided
 */
public class Banner {
    
    /* Message to print on Banner */
    private String message;
   

    /* Constructor */
    public Banner(String m) {
        this.message = m;
    }

    /*
     * Prints out a decorative banner that resizes based on the message length
     */
    public void display() {
        System.out.println("    ************************** "); //decorative banner
        System.out.println(" *** ~~~~~~~~~~~~~~~~~~~~~~~~ ***"); //decorative banner
        System.out.print(""); //decorative banner
        for (int i=30; message.length()<i; i=i-2){ //determines length of message and helps resize the banner
            System.out.print("*");
        }
        System.out.print(" " + message + " "); //prints out the message
        for (int i=30; message.length()<i; i=i-2){ //determines length of message and helps resize the banner
            System.out.print("*"); 
        }
        System.out.println("");
        System.out.println(" *** ~~~~~~~~~~~~~~~~~~~~~~~~ ***"); //decorative banner
        System.out.println("    ************************** "); //decorative banner
        System.out.println("\t \t  *****"); //decorative banner
        System.out.println("\t \t   ***");  //decorative banner     
        }

    /* main method (used for testing) */
    public static void main(String[] args) {
        Banner myBanner = new Banner("Hello world");
        myBanner.display();
    }
}


