import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: zh
 * @Date: 2019/6/2 10:11
 */
@WebServlet(urlPatterns = "/cookie02")
public class TestServlet2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取浏览器发送的cookie
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie coo : cookies) {
                if ("username".equals(coo.getName())) {
                    //打印cookie的名称和值
                    System.out.println(coo.getName() + ":" + coo.getValue());
                }
            }
        }

    }
}
