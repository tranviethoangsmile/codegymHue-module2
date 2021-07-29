package com.codegymhueJava;

public class Main {

    public static void main(String[] args) {
    	final int SLOW = 1;
    	final int MEDIUM = 2;
    	final int FAST = 3;
	    Fan toshiba = new Fan();
	    toshiba.setFanSpeed(FAST);
	    toshiba.setFanColor("red");
	    toshiba.setFanRadius(10d);
	    toshiba.setOnOff(true);
		System.out.print(toshiba.fanInfo() + "\n");

		Fan asanzo = new Fan();
		asanzo.setFanSpeed(SLOW);
		asanzo.setFanColor("Green");
		asanzo.setFanRadius(10d);
		asanzo.setOnOff(false);
		System.out.print(asanzo.fanInfo());





    }


}
