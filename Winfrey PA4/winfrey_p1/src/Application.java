import java.io.IOException;


public class Application {

    public static void main(String[] args) throws IOException {

        DuplicateRemover removeDuplicates = new DuplicateRemover();

        removeDuplicates.remove("problem1.txt");
        removeDuplicates.Write("unique_words.txt");

    }

}