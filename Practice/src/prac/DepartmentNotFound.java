package prac;
public class DepartmentNotFound extends Exception {
    public DepartmentNotFound() {
        super("Department not found.");
    }

    public DepartmentNotFound(String message) {
        super(message);
    }
}
