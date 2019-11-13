
import java.io.FileReader;
import java.io.IOException;
import java.io.File;

public class Week8_Task2 {
    public String NPExTest() {
        try {
            String str = null;
            boolean bool = str.equals("Chung");
        } catch (Exception e) {
            return "Lỗi Null Pointer";
        }
        return "Không có lỗi";
    }

    public String AIOoBExTest() {
        try {
            int[] arr = new int[1];
            arr[1] = 3;
        } catch (Exception e) {
            return "Lỗi Array Index Out of Bounds";
        }
        return "Không có lỗi";
    }

    public String ArithExTest() {
        try {
            int a = 4 / 0;
        } catch (Exception e) {
            return "Lỗi Arithmetic";
        }
        return "Không có lỗi";
    }

    public String FNFExTest() {
        try {
            FileReader file = new FileReader("text.txt");
        } catch (Exception e) {
            return "Lỗi File Not Found";
        }
        return "Không có lỗi";
    }

    public String IOExTest() {
        try {
            FileReader file = new FileReader("text.txt");
        } catch (Exception e) {
            return "Lỗi IO";
        }
        return "Không có lỗi";
    }
}