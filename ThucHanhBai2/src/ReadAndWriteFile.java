import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String path) {
        List<Integer> list = new ArrayList<>();
        try{
            File file = new File(path);
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line="";
            while((line=br.readLine())!=null){
                list.add(Integer.parseInt(line));
            }
            br.close();

        }catch (Exception e){
            System.err.println("không tìm thấy file hoặc nội dung có lỗi");
        }
        return list;
    }
    public void WriteFile(String path, int max)  {
        try{
            FileWriter fw = new FileWriter(path);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("giá trị lớn nhất là "+max);
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
