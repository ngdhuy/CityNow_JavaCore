package com.ndhuy.jvc;

public class NhanVien {
    private String _hoTen;

    public NhanVien(){
        this._hoTen = "";
    }

    public NhanVien(String hoTen){
        this._hoTen = hoTen;
    }

    public NhanVien(NhanVien nhanVien){
        this._hoTen = nhanVien.getHoTen();
    }

    public String getHoTen(){
        return this._hoTen;
    }

    public void setHoTen(String hoTen){
        this._hoTen = hoTen;
    }

    @Override
    public String toString(){
        return this._hoTen;
    }
}
