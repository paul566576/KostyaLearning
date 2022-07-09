import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

class Refactorings {

    public static final String TXT = "input.txt";

    public static void main(String[] args) throws IOException {
        ArrayList<String> lines = getStrings(new FileReader(TXT));
        String[] array = lines.toArray(new String[lines.size()]);
        Arrays.sort(array);
        for (String s : array) {
            System.out.println(s);
        }
    }

    private static ArrayList<String> getStrings(FileReader fileReader) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        BufferedReader reader = bufferedReader;
        ArrayList<String> lines = new ArrayList<String>();
        String line;
        while ((line = reader.readLine()) != null) {
            lines.add(line);
        }
        reader.close();
        return null;
        //todo sample for create git commit
    }

}