import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("C:\\Users\\ASUS\\Desktop\\countries.csv"));
            String line = "";
            while ((line = br.readLine())!=null){
                printCountry(parceCsvLine(line));
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{if (br != null){
                br.close();
            }}
            catch (IOException e){
                e.printStackTrace();
            }
        }
    }
    public static List<String> parceCsvLine(String line) {
        List<String> list = new ArrayList<>();
        if(line != null) {
            String[] split = line.split(",");
            for(int i=0; i<split.length; i++) {
                list.add(split[i]);
            }
        }return list;
    }
    public static void printCountry(List<String> list) {
        System.out.println("Country id: "+list.get(0)+" ,country code: "+list.get(1)+" ,country name: "+list.get(2));
    }
}