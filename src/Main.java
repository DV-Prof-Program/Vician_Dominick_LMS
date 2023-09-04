/**
 * Dominick Vician, CEN-3024C-16046, August 31st, 2023
 * Main Class
 * The Library Management System will be able to take in an external list of all books in the library and allow
 * a user to view and edit the full list.
**/
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        ArrayList bookList = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        loadBookList(bookList);

        for(int i = 0; i < bookList.size(); ++i){
            System.out.println(bookList.get(i));
        }

    }

    /**
     * Method: loadBookList
     * Parameters: Arraylist bookList
     * Return Type: Void
     * This method asks the user for the path to a text file containing the initial list of books, then loads that
     * list into the provided ArrayList. If the user inputs an invalid filepath, they are continually prompted until
     * they do.
    **/
    private static void loadBookList(ArrayList bookList) {
        boolean validInput = false;
        int id;
        String title;
        String author;
        Scanner input = new Scanner(System.in);

        String inputString;
        String filePath;

        System.out.println("Please type the path of the text file you wish to load:");
        Scanner fileRead = null;
        do {

            /*
             * The three commented out print statements are for debugging the cleaning code, as the "Copy as Path" option
             * in Windows adds quotation marks and uses backslashes instead of forward slashes
            */
            inputString = input.nextLine();
            //System.out.println(inputString);
            inputString = inputString.replace("\"", "");
            //System.out.println(inputString);
            inputString = inputString.replace("\\", "/");
            //System.out.println(inputString);
            filePath = inputString.trim();

            try {
                fileRead = new Scanner(new File(filePath)).useDelimiter(System.lineSeparator());
            } catch (FileNotFoundException e) {
                validInput = false;
                System.out.println("Invalid Filepath. Please type the path of the text file you wish to load:");
            }
            while (fileRead.hasNext()) {
                validInput = true;
                bookList.add((fileRead.next()));
            }
        } while (!validInput);
        input.close();
        fileRead.close();
    }
}