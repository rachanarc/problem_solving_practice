package Others;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromCsvFile {
    //Write a function that reads a CSV file and converts it into a list of objects or dictionaries.
    public static void main(String[] args) {
        String path = "/Users/rachana-rc/Downloads/customers-100.csv";
        String line = "";

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            while(true){
                if (!((line=br.readLine())!=null)) break;
                String[] values = line.split(",");
                System.out.println("Name : "+values[3]+"    Phone : "+values[8]);

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
