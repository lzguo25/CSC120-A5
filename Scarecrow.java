/*
 * Scarecrow class
 * Assignment 5: Bringing it All Together
 * @author Lily Z. Guo + CSC120 (Fall '22))
 * @version 17 October 2022
 * 
 * implements each class together to print out a full scarecrow with a banner and message
 * @param Banner, Pumpkin, Shirt, Pants, Boot, Boot, String
 * @return returns a decorative banner with the message, pumpkin head, shirt, pants, and books created in their respective classes, all assembled together to create a scarecrow through ASCII art.
 */

class Scarecrow {

    /* Parts of the Scarecrow
     * Implements each class
     */
    private Pumpkin head;
    private Shirt body;
    private Pants legs;
    private Boot leftFoot;
    private Boot rightFoot;
    private Banner sign;
    private String message;

    /* Constructor
     * initializes all parts of the scarecrow
    */
    public Scarecrow(Pumpkin h, Shirt b, Pants l, Boot rb, Boot lb, Banner s) {
        head = h;
        body = b;
        legs= l;
        leftFoot= lb;
        rightFoot = rb;
        sign = s;
        
    }

    /* Displays the Scarecrow 
     * calls the .display() method of each part in the correct order to display a scarecrow 
    */
    public void display() {
        sign.display();
        head.display();
        body.display();
        legs.display();
        leftFoot.display();
        rightFoot.display();

        
    }

    /* Main method
     * Displays the scarecrow
    */
    public static void main(String[] args) {

        //Creates a new Scarecrow with a banner that displays a message, a pumpkin, shirt, pants, and left and right boots
        Scarecrow myScarecrow = new Scarecrow(new Pumpkin(), new Shirt(), new Pants(), new Boot("left"), new Boot("right"), new Banner(""));
        
        // If a message was passed in on the command line, extract and store it
        
        //prints out the message if one is provided
        if (args.length > 0) {
            myScarecrow.sign = new Banner(args[0]);
        }
        
        //prints out a default message if no message is provided 
        else{
            myScarecrow.sign = new Banner("IT'S SPOOKY SZN!!! HAPPY FALL!!!");
        }

        //displays the scarecrow
        myScarecrow.display();
    }

}
