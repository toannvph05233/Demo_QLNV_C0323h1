package model;

import java.util.Date;

public class PartTime extends NhanVien{
    private int soGio;

    public PartTime() {
    }

    public PartTime(String name, String phone, Date birthDay, int soGio) {
        super(name, phone, birthDay);
        this.soGio = soGio;
    }

    @Override
    public double tinhLuong() {
        return soGio * 30000;
    }

    public int getSoGio() {
        return soGio;
    }

    public void setSoGio(int soGio) {
        this.soGio = soGio;
    }
}
