import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/courses")
public class CoursesServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        String htmlResponse = "<!DOCTYPE html>" +
                "<html lang='en'>" +
                "<head>" +
                "<meta charset='UTF-8'>" +
                "<meta name='viewport' content='width=device-width, initial-scale=1.0'>" +
                "<title>Our Courses - Besant Technologies</title>" +
                "<link rel='stylesheet' href='styles.css'>" +
                "</head>" +
                "<body>" +
                "<header>" +
                "<h1>Besant Technologies</h1>" +
                "<nav>" +
                "<a href='home.html'>Home</a>" +
                "<a href='courses.html' class='active'>Our Courses</a>" +
                "<a href='contact.html'>Contact Us</a>" +
                "</nav>" +
                "</header>" +
                "<main class='page-content'>" +
                "<h2>Our Courses</h2>" +
                "<ul class='course-list'>" +
                "<li><a href='java.html'>Java Programming</a></li>" +
                "<li><a href='web-development.html'>Web Development</a></li>" +
                "<li><a href='data-science.html'>Data Science</a></li>" +
                "<li><a href='machine-learning.html'>Machine Learning</a></li>" +
                "</ul>" +
                "</main>" +
                "<footer>" +
                "<p>&copy; 2024 Besant Technologies</p>" +
                "</footer>" +
                "</body>" +
                "</html>";

        response.getWriter().write(htmlResponse);
    }
}
