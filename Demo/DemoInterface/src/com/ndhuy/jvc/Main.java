package com.ndhuy.jvc;

public class Main {

    public static void main(String[] args) {
	    HinhHoc[] arrHinh = new HinhHoc[5];

	    arrHinh[0] = new HinhChuNhat(4, 5);
	    arrHinh[1] = new HinhVuong(4);
	    arrHinh[2] = new HinhVuong(8);
	    arrHinh[3] = new HinhChuNhat(9, 3);
	    arrHinh[4] = new HinhChuNhat(7,5);

	    for(int i = 0; i < 5; i++){
	    	arrHinh[i].In();
		}
    }
}
