import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionDemoMysql {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection=null;
		Statement statement=null;
		ResultSet resultSet=null;
		
		try {
//加载mysql jdbc的驱动
			Class.forName("com.mysql.jdbc.Driver");
//(URL,user,password)
			//url:jdbc:mysql//服务器地址/数据库名
			//user：登录用户名
			//password：登录密码
			//****************************************
			//?characterEncoding=utf8&&useSSL=true
			//原因是MySQL在高版本需要指明是否进行SSL连接。
			connection=DriverManager.getConnection(				"jdbc:mysql://localhost:3306/admin?characterEncoding=utf8&&useSSL=true","root","root");
			System.out.println("数据库连接成功！");
			
			statement=connection.createStatement();
			resultSet=statement.executeQuery("select  * from student");			
			while(resultSet.next()){				System.out.println(resultSet.getString(1)+"\t\t"			+resultSet.getString(2)+"\t\t"+resultSet.getString(3)+"\t\t"+resultSet.getString(4));
			}		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
