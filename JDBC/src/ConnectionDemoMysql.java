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
//����mysql jdbc������
			Class.forName("com.mysql.jdbc.Driver");
//(URL,user,password)
			//url:jdbc:mysql//��������ַ/���ݿ���
			//user����¼�û���
			//password����¼����
			//****************************************
			//?characterEncoding=utf8&&useSSL=true
			//ԭ����MySQL�ڸ߰汾��Ҫָ���Ƿ����SSL���ӡ�
			connection=DriverManager.getConnection(				"jdbc:mysql://localhost:3306/admin?characterEncoding=utf8&&useSSL=true","root","root");
			System.out.println("���ݿ����ӳɹ���");
			
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
