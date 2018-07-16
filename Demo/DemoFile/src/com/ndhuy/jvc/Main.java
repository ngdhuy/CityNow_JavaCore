package com.ndhuy.jvc;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {
	    File f = new File(".");
        if(f.isDirectory() || f.isFile()){
            File[] arrFile = f.listFiles();
            for (File fileItem : arrFile) {
                System.out.println(fileItem.getPath());
            }
        }

        byte[] arrByte = Files.readAllBytes(Paths.get(".\\Data\\input.txt"));
        String s = new String(arrByte, StandardCharsets.UTF_8);
        System.out.println(s);
    }
}
