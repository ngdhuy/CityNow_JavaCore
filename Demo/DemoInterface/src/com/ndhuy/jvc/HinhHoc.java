package com.ndhuy.jvc;

public abstract class HinhHoc {
    public int get_Dai() {
        return _Dai;
    }

    public void set_Dai(int _Dai) {
        this._Dai = _Dai;
    }

    public int get_Rong() {
        return _Rong;
    }

    public void set_Rong(int _Rong) {
        this._Rong = _Rong;
    }

    private int _Dai;
    private int _Rong;

    public String get_Ten() {
        return _Ten;
    }

    public void set_Ten(String _Ten) {
        this._Ten = _Ten;
    }

    private String _Ten;

    public HinhHoc(){
        _Dai = 0;
        _Rong = 0;
    }

    public HinhHoc(int dai, int rong){
        _Dai = dai;
        _Rong = rong;
    }

    public abstract void In();

    public String InTen(){
        return _Ten;
    }
}
