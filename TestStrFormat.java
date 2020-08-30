package com.test.path;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URISyntaxException;
import java.nio.charset.Charset;

import javax.script.ScriptException;

public class TestStrFormat {
	
	
	public static void main(String[] args) throws ScriptException, URISyntaxException, FileNotFoundException, IOException {
		 File f = new File("D:\\12\\1\\a.txt");
		 Charset encoding = Charset.defaultCharset();
        
         
         try (InputStream in = new FileInputStream(f);
                 Reader reader = new InputStreamReader(in, encoding);
                 // buffer for efficiency
                 Reader buffer = new BufferedReader(reader)) {
        	  	 int r;
        	    while ((r = reader.read()) != -1) {
                  char ch = (char) r;
                  System.out.print(ch);
               }
            }
	}

}
