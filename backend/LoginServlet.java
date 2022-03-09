package glut.zongmin.web.servlet;

import glut.zongmin.dao.UserDao;
import glut.zongmin.domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1. 设置编码
        req.setCharacterEncoding("UTF-8");
        //2. 获取请求参数
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        //3. 封装User对象
        User loginUser  = new User();
        loginUser.setUsername(username);
        loginUser.setPassword(password);

        //4.login
        UserDao dao = new UserDao();
        User user = dao.login(loginUser);

        if(user == null){
            req.getRequestDispatcher("/faithServlet").forward(req,resp);
        }else {

            req.setAttribute("user",user);
            req.getRequestDispatcher("/successServlet").forward(req,resp);
        }
    }
}
