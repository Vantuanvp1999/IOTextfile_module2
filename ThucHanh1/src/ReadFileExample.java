import java.io.*;

public class ReadFileExample {
    public void readFileText(String filePath) {
        try{
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line="";
            int sum = 0;
            while ((line= br.readLine())!=null){
                sum += Integer.parseInt(line);
                System.out.println(line);


            }
            br.close();
            System.out.println(sum );
        } catch (Exception e) {
            System.out.println("File không tìm thấy hoặc nội dung có lỗi! ");
        }
    }
}
