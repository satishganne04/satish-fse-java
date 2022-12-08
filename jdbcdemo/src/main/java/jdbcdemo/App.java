package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import jdbcdemo.entity.Company;


public class App{

    private final String url = "jdbc:postgresql://localhost:5432/demodb";
    private final String user = "user";
    private final String password = "DataGuard432$";

    /**
     * Connect to the PostgreSQL database
     *
     * @return a Connection object
     */
    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }
    public Company searchCompany(int id) {
    	return this.getAllCompanyDetails().stream().filter(c->c.getId()==id).collect(Collectors.toList()).get(0);
    }
    public Company updateCompany(int id,Company company) {
    	
    		Connection con = this.connect();
    		String updateSql = "update Company set Name=?,Age=?,Address=?,Salary=? where id=?";
    		
    		try(con) {
				PreparedStatement pstmt = con.prepareStatement(updateSql );
				pstmt.setString(1, company.getName());
				pstmt.setInt(2, company.getAge());
				pstmt.setString(3, company.getAddress());
				pstmt.setDouble(4,company.getSalary());
				pstmt.setInt(5, id);
				int rowsUpdated = pstmt.executeUpdate();
				if(rowsUpdated>0) {
					company.setId(id);
					return company;
				}
			} catch (SQLException e) {
				System.out.println("Exception occurs in deleting Company");
			}
    		
    	return null;
    }
    public boolean deleteCompany(int companyId) {
    	Connection con = this.connect();
    	String deleteSql = "delete from Company where id=?";
		try (con){
			PreparedStatement pstmt = con.prepareStatement(deleteSql );
			pstmt.setInt(1, companyId);
			int rowsDeleted  = pstmt.executeUpdate();
			if(rowsDeleted>0) {
				return true;
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
    	return false;
    }
    
    /**
     * Reads all the company data from db
     * @return
     */
    public List<Company> getAllCompanyDetails(){
    	Connection con = this.connect();
    	List<Company> companyList = new ArrayList<>();
    	try (con){
    	PreparedStatement pstmt = con.prepareStatement("select * from Company");
    	ResultSet rs = pstmt.executeQuery();
    	while(rs.next()) {
    		int id = rs.getInt("ID");
    		String name = rs.getString("Name");
    		int age = rs.getInt("Age");
    		String address = rs.getString(4);
    		double sal = rs.getDouble(5);
    		Company c = new Company();
    		c.setId(id);
    		c.setName(name);
    		c.setAddress(address);
    		c.setSalary(sal);
    		c.setAge(age);
    		companyList.add(c);
    	}
    	}catch(Exception e) {
    		System.out.println("Exception occurs: "+e.getMessage());
    	}
    	return companyList;
    }
    /**
     * This method is used to save a Company Object
     * @param company Company
     * @return A Company Object that is saved in DB
     */
    public int addCompanyDetails(Company company) {
    	Connection con = this.connect();
    	int rowsInserted = 0;
    	try(con){
    	/*Statement stmt = con.createStatement();
    	String insertSqlQuery="INSERT INTO COMPANY(ID,NAME,AGE,ADDRESS,SALARY) "
    			+ "values("+company.getId()+",'"+company.getName()+"',"
    			+company.getAge()+",'"+company.getAddress()+"',"+company.getSalary()+")";
    			
    	rowsInserted = stmt.executeUpdate(insertSqlQuery);
    	*/
    	String insertSqlQuery="INSERT INTO COMPANY(ID,NAME,AGE,ADDRESS,SALARY) "
        			+ "values(?,?,?,?,?)";	
    		
    	PreparedStatement pstmt  = con.prepareStatement(insertSqlQuery);
    	pstmt.setInt(1,company.getId());
    	pstmt.setString(2,company.getName());
    	pstmt.setInt(3,company.getAge());
    	pstmt.setString(4,company.getAddress());
    	pstmt.setDouble(5, company.getSalary());
    	rowsInserted = pstmt.executeUpdate();
    	
    	if(rowsInserted>0) {
    		System.out.println("The Company details inserted successfully");
    	}
    	}catch(SQLException ex) {
    		System.out.println("Error occured with cause : "+ex.getMessage());
    	}
    	return rowsInserted;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        App app = new App();
        /*Company company2 = new Company(6,"C-6",50,"Banglore",50000.0);
        Company company3 = new Company(7,"C-7",40,"Hyderabad",60000.0);
        Company company4 = new Company(8,"C-8",30,"Pune",40000.0);
        Company company5 = new Company(9,"C-9",60,"Chennai",30000.0);
        System.out.println(app.addCompanyDetails(company2) +" no of record added");
        System.out.println(app.addCompanyDetails(company3) +" no of record added");
        System.out.println(app.addCompanyDetails(company4) +" no of record added");
        System.out.println(app.addCompanyDetails(company5) +" no of record added");*/
        app.getAllCompanyDetails().stream().map(c->c.getName().toUpperCase()).forEach(System.out::println);
        
       /* if(app.deleteCompany(8)) {
        	System.out.println("Company Deleted Successfully!");
        }else {
        	System.out.println("Not Deleted");
        }*/
        Company microsoft = new Company(7,"Microsoft",40,"Hyderabad",90000.0);
        
        System.out.println(app.searchCompany(6));
        Company updated = app.updateCompany(6, microsoft);
        System.out.println(updated);
        app.getAllCompanyDetails().stream().map(c->c.getName().toUpperCase()).forEach(System.out::println);
    }
}
