import java.awt.Desktop;
import java.net.URI;

public class WebPageLoader {
    public static void main(String[] args) {
        // URL của trang web bạn muốn tải
        String url = "https://github.com/sontbui";

        try {
            // Tạo đối tượng Desktop
            Desktop desktop = Desktop.getDesktop();
            int i = 0;

            // Mở trang web trong trình duyệt mặc định của hệ thống
            while(true){
                
                desktop.browse(new URI(url));
                Thread.sleep(1500);
                System.out.println(i++);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
