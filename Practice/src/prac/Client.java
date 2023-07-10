package prac;

import java.util.List;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws Exception {
		Scanner in=new Scanner(System.in);
		boolean flag=true;
		 DepartmentNO DO=new DepartmentNO();
		while(flag) {
			printMenu();
			int option=in.nextInt();
			switch(option) {
			case 0: flag=false;
			        System.out.println("Exit succesfully ");
					break;
			case 1: {
				    System.out.println("Enter did ");
				    int did=in.nextInt();
				    System.out.println("Enter dname ");
				    String dname=in.next();
				    System.out.println("Enter dlocation ");
				    String location=in.next();
				    Department dept=new Department();
				    dept.setDno(did);
				    dept.setDname(dname);
				    dept.setLoc(location);
				    System.out.println(DO.addDept(dept));
				    System.out.println("Added Succesfully ");
				    break;
			}
			case 2: {
				System.out.println("Enter did to update");
			    int did=in.nextInt();
			    System.out.println("Enter dname ");
			    String dname=in.next();
			    System.out.println("Enter dlocation ");
			    String location=in.next();
			    Department dept=new Department();
			    dept.setDno(did);
			    dept.setDname(dname);
			    dept.setLoc(location);
			    System.out.println(DO.updateDept(dept));
			    System.out.println("updated Succesfully ");
			    break;
			}
			case 3: {
				System.out.println("DEL");
				 System.out.println("Enter did to delete ");
				int dno=in.nextInt();
				DO.deleteDept(dno);
				System.out.println("DELETED Succesfully ");
			    break;
			}
			case 4: {
				 System.out.println("Enter did to retrieve ");
					int dno=in.nextInt();
					Department dep=DO.selectDept(dno);
					System.out.println(dep);
			    break;
			}	
			case 5:{
				List<Department> ls=DO.selectAll();
				for(Department dep:ls) {
					System.out.println(dep);
				}
				break;
			}
		    default:
		    	System.err.println("ENTER VALID OPTION ");
			}
		}
	}
	static void printMenu() {
		System.out.println("----Welcome to Dept----");
		System.out.println("1- ADD ");
		System.out.println("2- UPDATE ");
		System.out.println("3- DELETE ");
		System.out.println("4- SELECT ");
		System.out.println("5- SELECT ALL");
		System.out.println("0 EXIT--> ");
	}
}
