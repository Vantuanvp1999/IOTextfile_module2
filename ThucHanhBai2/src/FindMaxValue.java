import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> list) {
        int max = list.get(0);
        for (int j = 1; j < list.size(); j++) {
            if (list.get(j) > max) {
                max = list.get(j);
            }
        }return max;
    }
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> number =readAndWriteFile.readFile("C:\\Users\\ASUS\\Desktop\\number.txt");
        int max = findMax(number);
        readAndWriteFile.WriteFile("C:\\Users\\ASUS\\Desktop\\result.txt", max);

    }
}
