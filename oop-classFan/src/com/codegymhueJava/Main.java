package com.codegymhueJava;

public class Main {

    public static void main(String[] args) {
	    Fan toshiba = new Fan();
	    toshiba.setFanSpeed(3);
	    toshiba.setFanColor("red");
	    toshiba.setFanRadius(10d);
	    toshiba.setOnOff(true);
		System.out.print(toshiba.fanInfo() + "\n");

		Fan asanzo = new Fan();
		asanzo.setFanSpeed(3);
		asanzo.setFanColor("Green");
		asanzo.setFanRadius(10d);
		asanzo.setOnOff(false);
		System.out.print(asanzo.fanInfo());





    }


}
