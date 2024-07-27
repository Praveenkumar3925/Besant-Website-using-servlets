
import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        String htmlResponse = "<!DOCTYPE html>" +
                "<html lang='en'>" +
                "<head>" +
                "<meta charset='UTF-8'>" +
                "<meta name='viewport' content='width=device-width, initial-scale=1.0'>" +
                "<title>Home - Besant Technologies</title>" +
                "<link rel='stylesheet' href='styles.css'>" +
                "</head>" +
                "<body>" +
                "<header>" +
                "<h1>Besant Technologies</h1>" +
                "<nav>" +
                "<a href='home' class='active'>Home</a>" +
                "<a href='courses'>Our Courses</a>" +
                "<a href='contact'>Contact Us</a>" +
                "</nav>" +
                "</header>" +
                "<main class='page-content'>" +
                "<h2>Welcome to Besant Technologies</h2>" +
                "<p>Explore our offerings and find the right course for you!</p>" +
                "</main>" +
                "<footer>" +
                "<p>&copy; 2024 Besant Technologies</p>" +
                "</footer>" +
                "</body>" +
                "</html>";

        response.getWriter().write(htmlResponse);
    }
}
