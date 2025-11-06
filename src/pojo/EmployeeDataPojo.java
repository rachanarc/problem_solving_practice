package pojo;

import java.awt.*;

public class EmployeeDataPojo {
    public String name;
    public int age;
    public String address;

    public EmployeeDataPojo(){}
    public EmployeeDataPojo(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "EmployeeData [name=" + name + ", age=" + age + ", address=" + address + "]";
    }


    public static void main(String[] args) {

        EmployeeDataPojo[] employee = new EmployeeDataPojo[10];
        employee[5] = new EmployeeDataPojo("Krishna",5,"Gokul");

        EmployeeDataJavaBean[] e2 = new EmployeeDataJavaBean[10];
        e2[4] = new EmployeeDataJavaBean(); // create the object
        e2[4].setName("Radha");
        e2[4].setAddress("Vrindavan");
        e2[4].setAge(4);

        e2[3] = new EmployeeDataJavaBean(); // create the object
        e2[3].setName("Yashoda");
        e2[3].setAddress("Mathura");
        e2[3].setAge(22);

        System.out.println("Employee 1 : " +employee[5].toString());
        System.out.println("Employee 4 : " +e2[4].toString());
        System.out.println("Employee 2 : " +e2[3].toString());
    }
}
