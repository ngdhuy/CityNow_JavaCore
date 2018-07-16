package com.ndhuy.jvc;

public class Main {

    private static int anInt;

    public static void main(String[] args) {
	    NhanVien nhanVien_1 = new NhanVien("Nguyen Van A");
	    NhanVien nhanVien_2 = new NhanVien("Le Quoc B");

	    System.out.println("a = " + nhanVien_1);
	    System.out.println("b = " + nhanVien_2);

	    swap_2(nhanVien_1, nhanVien_2);

        System.out.println("a = " + nhanVien_1);
        System.out.println("b = " + nhanVien_2);
    }

    public static  void swap_2(NhanVien a, NhanVien b){
        String temp = a.getHoTen();
        a.setHoTen(b.getHoTen());
        b.setHoTen(temp);
    }
}
