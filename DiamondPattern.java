public class DiamondPattern { //class name
    public void displayDiamond(int rows) {//method name accepts rows as arg
        int spacer = rows - 1;
        for (int i = 0; i < rows; i++) { //parent loop determines rows
            //loop for hypens, come before stars
            for (int j =0; j < spacer; j++) { //hyphen loop
                System.out.print("-");//printing hyphen
            }
            for (int j = 0; j <= i; j++) {//for loop for printing stars, need i+1 stars
                System.out.print("* ");//printing star
            }
            System.out.println(); //need space
            spacer--;//decrement to reduce hyphens
        }
        spacer = 0;
        for (int i = rows; i > 0; i--) { //running loop in reverse to print out pattern in reverse
            for (int j = 0; j < spacer; j++) {//loop for hyphens
                System.out.print("-"); //printing hyphens
            }
            for (int j = 0; j < i; j++) {//loop for stars
                System.out.print("* "); //printing loop for stars
            }
            System.out.println(); //printing new line
            spacer++; //incrementing spacer to increase hyphens

        }
    }
}
