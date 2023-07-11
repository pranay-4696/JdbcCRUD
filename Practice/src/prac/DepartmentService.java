package prac;

import java.sql.SQLException;
import java.util.ArrayList;

public class DepartmentService implements IDepartmentServices{
	DepartmentService() throws Exception{}
	DepartmentNO dao=new DepartmentNO();
	@Override
	public int addDept(Department dept) {
		
		return dao.addDept(dept);
	}

	@Override
	public int updateDept(Department dept) {
		
		return dao.updateDept(dept);
	}

	@Override
	public int deleteDept(int deptNo) {
		
		try {
			return dao.deleteDept(deptNo);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return deptNo;
	}

	@Override
	public Department selectDept(int deptNo) {
		try {
			return dao.selectDept(deptNo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ArrayList<Department> selectAll() {
		try {
			return dao.selectAll();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public static boolean dataValidate(Department dept) {
		if(dept.getDno()>9)
			return true;
		return false;
		
	}
}
