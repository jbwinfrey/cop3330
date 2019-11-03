import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class DuplicateRemover {
    private Set<String> uniqueWords;


    public void remove(String dataFile) throws FileNotFoundException
    {
        String word;
        uniqueWords = new HashSet<String>();
        Scanner s = new Scanner(new File(dataFile));
        while(s.hasNext())
        {
            word = s.next();
            uniqueWords.add(word);
        }
        s.close();


    }

    public void Write(String outputFile) throws IOException {
        File f;
        FileWriter fw = null;

        f = new File(outputFile);


        if(f.exists()) {
            fw=new FileWriter(f,true);
            Iterator itr = uniqueWords.iterator();

            while(itr.hasNext())
            {
                String str=(String)itr.next();
                fw.write(str +" \n");
                System.out.println(str);
            }
            fw.close();
            System.out.println("Done Writing to File");


        }

    }

}