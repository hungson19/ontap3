package b2.ra.businessImp;

import b2.ra.business.IEmployee;

import java.util.Scanner;

public class Employee implements IEmployee {
    private String id;
    private String name;
    private int year;
    private float rate;
    private float commission;
    private float salary;
    private boolean status;

    public Employee() {
    }

    public Employee(String id, String name, int year, float rate, float commission, float salary, boolean status) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.rate = rate;
        this.commission = commission;
        this.salary = salary;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public float getCommission() {
        return commission;
    }

    public void setCommission(float commission) {
        this.commission = commission;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public void inputData(Scanner scanner) {
        System.out.print("Nhập mã nhân viên: ");
        this.id = scanner.nextLine();
        System.out.print("Nhập tên nhân viên: ");
        this.name = scanner.nextLine();
        System.out.print("Nhập năm sinh nhân viên: ");
        this.year = scanner.nextInt();
        System.out.print("Nhập hệ số lương nhân viên: ");
        this.rate = scanner.nextFloat();
        System.out.print("Nhập hoa hồng nhân viên hàng tháng: ");
        this.commission = scanner.nextFloat();
        this.salary = calSalary();
        scanner.nextLine();
        System.out.println("Trạng thái sản phẩm :");
        status = Boolean.parseBoolean(scanner.nextLine());
    }

    @Override
    public void displayData() {
        System.out.println("Mã nhân viên: " + this.id);
        System.out.println("Tên nhân viên: " + this.name);
        System.out.println("Năm sinh: " + this.year);
        System.out.println("Hệ số lương: " + this.rate);
        System.out.println("Hoa hồng hàng tháng: " + this.commission);
        System.out.println("Lương hàng tháng: " + this.salary);
        System.out.println("Trạng thái: " + (this.status ? "Đang làm việc" : "Nghỉ việc"));
    }
    public float calSalary() {
        return this.rate * BASIC_SALARY + this.commission;
    }
}
