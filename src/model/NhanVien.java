package model;

import java.util.Date;

public abstract class NhanVien {
    private static int count = 0;
    private int id;
    private String name;
    private String phone;
    private Date birthDay;

    public NhanVien() {
        this.id = ++count;
    }

    public NhanVien(String name, String phone, Date birthDay) {
        this.id = ++count;
        this.name = name;
        this.phone = phone;
        this.birthDay = birthDay;
    }

    public abstract double tinhLuong();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }
}
