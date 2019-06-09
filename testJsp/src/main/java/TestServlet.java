import com.sun.deploy.net.HttpRequest;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * @Author: zh
 * @Date: 2019/6/2 9:14
 */
@WebServlet(name = "TestServlet",urlPatterns = "/cookie01")
public class TestServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //准备需要解析的数据
        Person person = new Person();
        person.setName("xioayu");
        person.setAddr("wuhan");
        person.setAge("80");

        request.setAttribute("person",person);
        request.getRequestDispatcher("/index.jsp").forward(request,response);





    }

}
