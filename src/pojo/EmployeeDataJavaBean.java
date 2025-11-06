package pojo;

public class EmployeeDataJavaBean {
    //private fields
    private String name;
    private int age;
    private String address;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if(age>0){
            this.age = age;
        }
        else{
            try {
                throw new Exception("age cannot be 0");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "EmployeeData [name=" + name + ", age=" + age + ", address=" + address + "]";
    }

    //no-arg constructor
    public EmployeeDataJavaBean(){

    }
    public EmployeeDataJavaBean(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public static void main(String[] args) {
        EmployeeDataJavaBean[] employee = new EmployeeDataJavaBean[10];
        employee[0]= new EmployeeDataJavaBean("Krishna", 2, "Gokul");

        employee[2] = new EmployeeDataJavaBean();
        employee[2].name = "Radha";
        employee[2].age = 1;
        employee[2].address = "Vrindavan";

        System.out.println("First empployee : "+employee[0].toString());
    }
}
