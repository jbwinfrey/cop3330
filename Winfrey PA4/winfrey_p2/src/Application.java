import java.io.IOException;

public class Application {

    public static void main(String[] args) throws IOException {

        DuplicateCounter countDuplicates = new DuplicateCounter();

        countDuplicates.count("problem2.txt");
        countDuplicates.write("unique_word_counts.txt");
    }
}