public class Employee {

    private int empId;
    private String empName;
    private Double salary;

    @Override
    public boolean equals(Object obj){
        if(this==obj)
            return true;

        if(obj==null||getClass()!=obj.getClass()){
            return false;
        }

        Employee emp=(Employee) obj;
        return this.empId==emp.empId && this.empName==emp.empName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
