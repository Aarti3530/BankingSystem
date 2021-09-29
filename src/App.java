import java.sql.*;
import java.util.*;

public class App {
    public void jdbcConnect(String s) {
        String url, user, password;
        System.out.print("Enter password : ");
        Scanner sc = new Scanner(System.in);
        password = sc.next();
        System.out.print("Enter username : ");
        user = sc.next();
        url = "jdbc:mysql://localhost:3306/aarti";
        String query = s;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            Statement st = con.createStatement();
            int t = st.executeUpdate(query);
            System.out.println(t + "kkk");
            st.close();
            con.close();
        } catch (Exception e) {

        }
        sc.close();
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Create Account");
        System.out.println("2.Login User");
        System.out.println("3.Login Admin");
        System.out.print("Enter the corresponding number : ");
        int t = sc.nextInt();
        if (t >= 1 && t <= 3) {
            MainScreen m = new MainScreen();
            if (t == 1)
                m.create();
            else if (t == 2)
                m.login();
            else
                m.admin();
        } else {
            System.out.println("Please Enter valid number !!");
        }
        sc.close();
    }
}
