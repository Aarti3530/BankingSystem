import java.util.*;

class MainScreen {
    String admin_name = "admin";
    String password = "admin";

    public void admin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Admin name : ");
        String name = sc.next();
        System.out.print("Enter Admin password : ");
        String pass = sc.next();
        sc.close();
        if (name.equals(admin_name) && pass.equals(password)) {
            // view database
            App a = new App();
            a.jdbcConnect("");
        }
    }

    public boolean create() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your full name : ");
        String name = sc.nextLine();
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        System.out.print("Enter address : ");
        String add = sc.next();
        System.out.print("Enter initial amount to deposit : ");
        float initial = sc.nextFloat();
        System.out.print("Enter your phone number :");
        String num = sc.next();
        App a = new App();
        String s = "'" + name + "','" + age + "','" + add + "','" + initial + "','" + num + "'";
        String query = "insert into admin (FullName, Age, Address, Amount, Phone) values (" + s + ");";
        a.jdbcConnect(query);
        System.out.println("CONGRATES!!! YOUR ACCOUNT IS CREATED SUCCESSFULLY...");
        // add new data to database. sc.close();
        sc.close();
        return true;
    }

    public void login() {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String id = sc.nextLine();
        // if database find this data it shows details.
        // add condition.
    }
}
