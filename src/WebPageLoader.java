import java.awt.Desktop;
import java.net.URI;

public class WebPageLoader {
    public static void main(String[] args) throws Throwable {
        // URL của trang web bạn muốn tải
        String url = "https://github.com/sontbui";

        try {
            // Tạo đối tượng Desktop
            Desktop desktop = Desktop.getDesktop();
            // Số lượng view hiện tại - chưa tìm được cách lấy view từ github về nên tự cập nhật trước khi chạy
            int i = 2271;

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
