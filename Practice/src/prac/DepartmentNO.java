package prac;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//CRUD Applications
public class DepartmentNO {
	public DepartmentNO() throws Exception{
		
	}
	Connection conn= DBUtil.getDBConnection();;
	public int addDept(Department dept) { 
		try {
			String insertQuery="insert dept values(?,?,?)";
			PreparedStatement print=conn.prepareStatement(insertQuery); 
			print.setInt(1,dept.getDno());
			print.setString(2,dept.getDname());
			print.setString(3,dept.getLoc());
			int cnt=0;
			cnt=print.executeUpdate();
			
			return cnt;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
			}
	
	public int updateDept(Department dept) {
		int cnt=0;
		try {
			String updateQuery="update dept set dept_name=? , dept_loc=? where dept_no=?";
			PreparedStatement print=conn.prepareStatement(updateQuery); 
			print.setString(1,dept.getDname());
			print.setString(2,dept.getLoc());
			print.setInt(3,dept.getDno());
			cnt=print.executeUpdate();
			return cnt;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}
	public Department selectDept(int deptNo) throws SQLException {
		String selectQuery="select * from dept where dept_no=?";
		PreparedStatement print=conn.prepareStatement(selectQuery);
		print.setInt(1,deptNo);
		ResultSet rs=print.executeQuery();
		while(rs.next()) {
			int dno=rs.getInt("dept_no");
			String dname=rs.getString("dept_name");
			String dloc=rs.getString(3);
			Department dep=new Department();
			dep.setDno(dno);
			dep.setDname(dname);
			dep.setLoc(dloc);
			return dep;
		}
		return null;
	}
	public int deleteDept(int deptNo) throws SQLException {
		String deleteQuery="delete from dept where dept_no=?";
		PreparedStatement print=conn.prepareStatement(deleteQuery); 
		print.setInt(1,deptNo);
		int cnt=print.executeUpdate();
		return 0;
	}
	public ArrayList<Department> selectAll() throws SQLException {
		String selectAllQuery="select * from dept";
		PreparedStatement print=conn.prepareStatement(selectAllQuery);
		ResultSet rs=print.executeQuery();
		ArrayList<Department> dept_list=new ArrayList();
		while(rs.next()) {
			int dno=rs.getInt("dept_no");
			String dname=rs.getString("dept_name");
			String dloc=rs.getString(3);
			Department dep=new Department();
			dep.setDno(dno);
			dep.setDname(dname);
			dep.setLoc(dloc);
			System.err.println(dep);
			dept_list.add(dep);
			return dept_list;
		}
		return null;
	}
}
