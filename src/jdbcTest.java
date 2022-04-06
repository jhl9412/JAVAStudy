import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/jdbcTest")
public class jdbcTest extends HttpServlet {
    public void doGet (HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter out = resp.getWriter();

        String uri ="jdbc:mariadb://127.0.0.1:3306/webdev";
        String userid = "webmaster";
        String userpw="1234";
        String query = "select userid, username, age from tbl_test";
        Connection con = null;
        Statement stmt = null;
        ResultSet rs= null;
        try{
            Class.forName("org.mariadb.jdbc.Driver");
            con =DriverManager.getConnection(uri,userid,userpw);
            stmt=con.createStatement();
            rs=stmt.executeQuery(query);

            out.println("<HTML><HEAD><TITLE>JDBC Test</TITLE></HEAD>");
            out.println("<BODY>");
            out.println("<TABLE><TR><TD>아이디</TD><TD>이름</TD><TD>나이</TD></TR>");
            while(rs.next()) {
                out.println("<TR><TD>"+ rs.getString("userid")+"</TD>"
                +"<TD>"+rs.getString("username") +"</TD>"
                +"<TD>"+rs.getString("age") +"/TD></TR>");
            }
        }catch(Exception e){}
        out.println("</TABLE></BODY>");
        if(rs!= null) { try {
            rs.close();
            } catch (SQLException e) {

            e.printStackTrace();
} }
if(stmt!= null) {try {
    stmt.close();
} catch (SQLException e) {
 
    e.printStackTrace();
} }
if(con != null) {try {
    con.close();
} catch (SQLException e) {

    e.printStackTrace();
} }
} //End of doGet
} //End of class jdbcTest