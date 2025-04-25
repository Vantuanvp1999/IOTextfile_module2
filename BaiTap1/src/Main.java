import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Nhập đường dẫn tin nguồn:");
        String sourcePath = sc.nextLine();
        System.out.println("Nhập đường dẫn tin đích");
        String targetPath = sc.nextLine();

        File sourceFile = new File(sourcePath);
        File targetFile = new File(targetPath);

        if(!sourceFile.exists()){
            System.out.println("Tập tin không tồn tại!");
            return;
        }
        if(!targetFile.exists()){
            System.out.println("Tập tin không tồn tại!");
            return;
        }
        try(FileInputStream source =new FileInputStream(sourceFile);
            FileOutputStream target =new FileOutputStream(targetFile)){
            int byteRead;
            int charCount = 0;
            while((byteRead = source.read()) != -1){
                target.write(byteRead);
                charCount++;
            }
            System.out.println("Đã sao chép thành công ");
            System.out.println("Số ký tự đã sao chép "+charCount);
        }catch (IOException e){
            System.err.println("Xảy ra lỗi khi sao chép tập tin "+e.getMessage());
        }
    }
}