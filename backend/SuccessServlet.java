package glut.zongmin.web.servlet;

import glut.zongmin.domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/successServlet")
public class SuccessServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        User user = (User)req.getAttribute("user");//编码
        if(user!=null){
            resp.setContentType("text/html;charset=UTF-8");
            //给页面写一句话
            resp.getWriter().write("登录成功,"+"<span>"+user.getUsername()+"</span>"+"欢迎您！");
        }

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }
}
