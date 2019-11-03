import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCounter
{
    private Map<String, Integer> wordCounter;

    public DuplicateCounter(){
        wordCounter = new HashMap<String,Integer>();
    }

    public void count(String filename){

        Scanner s = null;
        try {
            s = new Scanner(new File(filename));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            return;
        }

        while(s.hasNext()) {
            String word = s.next().toLowerCase();
            Integer count = wordCounter.get(word);
            if(count == null)
                count = 1;
            else
                count = count + 1;
            wordCounter.put(word, count);
        }
        s.close();
    }

    public void write(String filename){

        try {
            PrintWriter outfile = new PrintWriter(new File(filename));
            for(String str : wordCounter.keySet()) {
                outfile.println(str + " " + wordCounter.get(str));
                System.out.println(str);
            }

            System.out.println("Done Writing to File");
            outfile.close();
        } catch (FileNotFoundException e) {

        }
    }

}