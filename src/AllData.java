import java.sql.*;

public class AllData{
    public boolean insert(Statement st,String query){
        try{
        int t = st.executeUpdate(query);
        if(t == 1) return true;
        }catch(Exception e){
        return false;
    }
    return false;
    }
    public boolean delete(Statement st,String query){
        try{
        int t = st.executeUpdate(query);
        if(t == 1) return true;
        }catch(Exception e){
            return false;
        }
        return false;
    }
    public boolean update(Statement st,String query){
        try{
            int t = st.executeUpdate(query);
            if(t == 1) return true;
            }catch(Exception e){
                return false;
            }
            return false;
    }
    public void viewAll(Statement st) {
        
    }
    public void viewIndividual(Statement st) {
        
    }
    public void viewCondition(Statement st) {
        
    }
    public boolean validate(String query,Statement st) {
        // if name present
        return true;
    }
}