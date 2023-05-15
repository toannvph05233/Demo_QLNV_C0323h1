package model;

import java.util.Date;

public class FullTime extends NhanVien{
    private double heSo;

    public FullTime() {
    }

    public FullTime(String name, String phone, Date birthDay, double heSo) {
        super(name, phone, birthDay);
        this.heSo = heSo;
    }

    @Override
    public double tinhLuong() {
        return heSo*3000000;
    }




    public double getHeSo() {
        return heSo;
    }

    public void setHeSo(double heSo) {
        this.heSo = heSo;
    }


}
