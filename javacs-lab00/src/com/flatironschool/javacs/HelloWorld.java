package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
        // I won't work!
      //return Double.parseDouble(System.getProperty("java.version"));
      System.out.println(System.getProperty("java.version"));
      return new Double(3);
    }

    public static void main(String[] args) {
	    // you can test the output of getVersion() here
      HelloWorld comp = new HelloWorld();
      System.out.printf("%d", comp.getVersion());
    }
}
