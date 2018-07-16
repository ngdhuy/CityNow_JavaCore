package com.ndhuy.jvc;

public abstract class Thu {
    private String _ten;

    public Thu(){
        _ten = "";
    }

    public Thu(String ten){
        _ten = ten;
    }

    public void setTen(String ten){
        _ten = ten;
    }

    public String getTen(){
        return _ten;
    }

    public abstract void Keu();
}
