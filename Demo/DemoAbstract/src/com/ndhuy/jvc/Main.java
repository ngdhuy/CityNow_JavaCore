package com.ndhuy.jvc;

public class Main {

    public static void main(String[] args) {
	    Thu[] arrThu = new Thu[5];

	    arrThu[0] = new Cop();
	    arrThu[1] = new NguaVang();
        arrThu[2] = new Cop();
        arrThu[3] = new NguaO();
        arrThu[4] = new NguaO();

        for(int i = 0; i < 5; i++){
            arrThu[i].Keu();
        }
    }
}
