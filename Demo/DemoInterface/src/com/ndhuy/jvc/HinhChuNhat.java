package com.ndhuy.jvc;

public class HinhChuNhat extends HinhHoc implements Hinh {
    public HinhChuNhat(int dai, int rong){
        super(dai, rong);
    }

    public double tinhDienTich() {
        return super.get_Dai() * 1.0 * super.get_Rong();
    }

    @Override
    public double tinhChuVi() {
        return 2.0 * (super.get_Dai() + super.get_Rong());
    }

    @Override
    public void In(){
        System.out.println("-------------------------------");
        System.out.println("Thong tin hinh chu nhat");
        System.out.println("Dien tich: " + tinhDienTich());
        System.out.println("Chu vi: " + tinhChuVi());
    }
}
