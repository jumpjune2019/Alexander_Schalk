public class LabellingPairofDices {

    public static void main(String[] args) {

        // 7x7 2D matrix array 
    	// blank spaces are added to space things out evenly
    	// since tabs aren't helpful enough
        String[][] labels = {
            {
                "",
                "Die 1             ",
                "Die 2             ",
                "Die 3             ",
                "Die 4             ",
                "Die 5             ",
                "Die 6             "
            },
            {
                "Die 1",
                "Snake eyes            ",
                "Australian yo         ",
                "Little Joe From Kokomo",
                "No field five         ",
                "Easy six              ",
                "Six one you're done"
            },
            {
                "Die 2",
                "Ace caught a deuce",
                "Ballerina         ",
                "The fever         ",
                "Jimmie Hicks      ",
                "Benny Blue        ",
                "Easy eight"
            },
            {
                "Die 3",
                "Easy four         ",
                "OJ              ",
                "Brooklyn Forest ",
                "Big Red         ",
                "Eighter from Decatur",
                "Nina from Pasadena"
            },
            {
                "Die 4",
                "Little Phoebe   ",
                "Easy six        ",
                "Skinny McKinney ",
                "Square pair     ",
                "Railroad nine   ",
                "Big one on the end"
            },
            {
                "Die 5",
                "Sixie from Dixie",
                "Skinny Dugan    ",
                "Easy eight      ",
                "Jesse James     ",
                "Puppy Paws      ",
                "Yo"
            },
            {
                "Die 6",
                "The Devil       ",
                "Easy eight      ",
                "Lou Brown       ",
                "Tennessee       ",
                "Six five no jive",
                "Midnight"
            }
        };

        System.out.println("Dice Combinations Label Matrix");
        //nested for loop displays matrix
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(labels[i][j] + "\t");
            }
            System.out.println();
        }
    }
}