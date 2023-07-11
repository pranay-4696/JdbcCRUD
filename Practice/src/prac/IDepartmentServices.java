package prac;

import java.util.ArrayList;

public interface IDepartmentServices {
	public int addDept(Department dept);
	public int updateDept(Department dept);
	public int deleteDept(int deptNo);
	public Department selectDept(int deptNo);
	public ArrayList<Department> selectAll();
}
